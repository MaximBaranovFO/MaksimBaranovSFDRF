/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gradleI001MBSFDRF;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Администратор
 */
public interface RunCmdThExecInterface003 {
    
        public class SomeLockableThreadsPerExecutorService   // (Mit noch fehlender Synchronisation, siehe unten)
{
            private static int countNewElement = 0;
            private ForRunThreadsMaker.PausableThreadPoolExecutor nowElementVal = null;
   
   public static void mainWhoRunThForCmd()
   {
       ForRunThreadsMaker.PausableThreadPoolExecutor newElementPausableThreadPool = ForRunThreadsMaker.PausableThreadPoolExecutor.getNewElement(5);
       countNewElement = 1;
       if( countNewElement > 1 ){
           newElementPausableThreadPool.beforeExecute(new Thread(), new ElementsRunInThisVal());
           //countNewElement = 0;
       }
       if( countNewElement > 1 )
           RunCmdThExecInterface001.ThreadsPerExecutorService.mainWhoRunThForCmd();
       if( countNewElement > 1 )
           RunCmdThExecInterface002.ExeOutputFrameAnotherVersion002.mainOutExecIntoFrame();
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
};
        class ElementsRunInThisVal implements Runnable{

        @Override
        public void run() {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            try {
                SomeLockableThreadsPerExecutorService.runCmdShell();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
        
        }
}
