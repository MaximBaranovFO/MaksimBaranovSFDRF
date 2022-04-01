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
        
        //Created system build into Interface
        RunGeneratedDesktopByThread.RunGeneratedDesktopThreadedProgress runInLocalGeneratedDesktopThreadedProgress = new RunGeneratedDesktopByThread.RunGeneratedDesktopThreadedProgress();
        runInLocalGeneratedDesktopThreadedProgress.runGeneratedDesktop();
        
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
