package gradleI001MBSFDRF;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import net.java.html.boot.BrowserBuilder;

class DesktopMain {

    public static void main(String[] args) {
        
        //
        BrowserBuilder.newBrowser().loadPage("pages/index.html")
                .loadFinished(Demo::onPageLoad)
                .showAndWait();
        runCmdShell();
        System.exit(0);
    }
    
    private static void runCmdShell(){
        try {

		// -- Linux --
		
		// Run a shell command
		// Process process = Runtime.getRuntime().exec("ls /home/mkyong/");

		// Run a shell script
		// Process process = Runtime.getRuntime().exec("path/to/hello.sh");

		// -- Windows --
		
		// Run a command
		//Process process = Runtime.getRuntime().exec("cmd /c dir C:\\Users\\mkyong");

		//Run a bat file
                
                RunCmdThExecInterface001.ThreadsPerExecutorService.mainWhoRunThForCmd();
                
                RunCmdThExecInterface002.ExeOutputFrameAnotherVersion002.mainOutExecIntoFrame();
                
		Process process = Runtime.getRuntime().exec(
				"cmd /c c:\\_bmv\\17JavaLearn\\MaksimBaranovSFDRF\\src\\pathCmd\\cmd3.bat", null, new File("C:\\Users\\mkyong\\"));

		StringBuilder output = new StringBuilder();

		BufferedReader reader = new BufferedReader(
				new InputStreamReader(process.getInputStream()));

		String line;
		while ((line = reader.readLine()) != null) {
			output.append(line + "\n");
		}

		int exitVal = process.waitFor();
		if (exitVal == 0) {
			System.out.println("Success!");
			System.out.println(output);
			System.exit(0);
		} else {
			//abnormal...
		}

	} catch (IOException e) {
		e.printStackTrace();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}


    }
}
