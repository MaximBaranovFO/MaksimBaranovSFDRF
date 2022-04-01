/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gradleI001MBSFDRF;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

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
       fromThreadRunJavaFXwindow();
       
   }
   private static void fromThreadRunJavaFXwindow(){
       Thread whoRunThat = new Thread(){
        @Override
        public void run(){
            runJavaFXwindow();
            
            
            
            ForRunThreadsMaker.PausableThreadPoolExecutor newElementPausableThreadPool = ForRunThreadsMaker.PausableThreadPoolExecutor.getNewElement(5);
       countNewElement = 3;
       if( countNewElement > 1 ){
           newElementPausableThreadPool.beforeExecute(new Thread(), new ElementsRunInThisVal());
           //countNewElement = 0;
       }
       if( countNewElement > 1 )
           RunCmdThExecInterface001.ThreadsPerExecutorService.mainWhoRunThForCmd();
       if( countNewElement > 1 )
           RunCmdThExecInterface002.ExeOutputFrameAnotherVersion002.mainOutExecIntoFrame();
        };
       };
   }
   private static void runJavaFXwindow(){
       CompanyOfWindow fxApp = new CompanyOfWindow();
       String[] valInto = {"", ""};
       fxApp.mainCompanyOfWindow(valInto);
       //fxApp.stop();
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
        public class User{
            private String nameUser = new String("");
            private Integer ageUser = 0;
            private Integer moneyCountUser = 0;
            private Boolean isExist;
            
        User(String nameUserInputed, 
                Integer ageUserInputed,
                Integer moneyCountUser, 
                Boolean isExist){
        }
        }
        public class CompanyOfWindow extends Application {
public void start(Stage primaryStage) throws Exception {
users.add(new User("Alice", 20, 150, false));
users.add(new User("Bob", 34, 300, true));
users.add(new User("Peter", 18, 100, false));
users.add(new User("Kate", 38, 300, true));
users.add(new User("Steve", 31, 250, true));
users.add(new User("Alan", 62, 500, true));
users.add(new User("Julia", 33, 320, true));
users.add(new User("Patric", 37, 300, true));
users.add(new User("Alexander", 34, 280, true));
users.add(new User("George", 28, 180, true));
users.add(new User("Mary", 22, 190, false));
userBox.getItems().addAll(users);
root.getChildren().add(strings);
strings.setPadding(new Insets(10, 30, 10, 30));
strings.setSpacing(20);
strings.getChildren().add(new Text("Select the user"));
strings.getChildren().add(buttonBox);
buttonBox.setSpacing(10);
buttonBox.getChildren().add(userBox);
Scene scene = new Scene(root, WIDTH, HEIGHT);
primaryStage.setTitle("Company");
primaryStage.setScene(scene);
primaryStage.show();
}
public static void mainCompanyOfWindow(String[] args) {
launch(args);
}
Group root = new Group();
VBox strings = new VBox();
HBox buttonBox = new HBox();
ComboBox<User> userBox = new ComboBox<>();
final private int WIDTH = 1000;
final private int HEIGHT = 600;
private ArrayList<User> users = new ArrayList<>();
}
}
