package gradleI001MBSFDRF;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import net.java.html.boot.BrowserBuilder;

class DesktopMain {

    public static void main(String[] args) {
        
        //Additions for more of use by functional
        runCmdShell();
        //Created system build
        BrowserBuilder.newBrowser().loadPage("pages/index.html")
                .loadFinished(Demo::onPageLoad)
                .showAndWait();
        
        System.exit(0);
    }
    
    private static void runCmdShell(){
        try {
            RunCmdThExecInterface003.SomeLockableThreadsPerExecutorService.mainWhoRunThForCmd();
	} catch (Exception e) {
		e.printStackTrace();
	} catch (InternalError e) {
		e.printStackTrace();
	}


    }
}
