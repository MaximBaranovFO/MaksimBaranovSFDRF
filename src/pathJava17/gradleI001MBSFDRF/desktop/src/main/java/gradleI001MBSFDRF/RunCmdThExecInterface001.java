/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gradleI001MBSFDRF;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

/**
 *
 * @author Àäìèíèñòðàòîð
 */
public interface RunCmdThExecInterface001 {

    public class ThreadsPerExecutorService // (Mit noch fehlender Synchronisation, siehe unten)
    {

        public static void mainWhoRunThForCmd() {
            ExeOutputFrame runCmdWithResultIntoFrame = new ExeOutputFrame();

            runCmdWithResultIntoFrame.mainOutExecIntoFrame();

            ExecutorService threadPool = Executors.newFixedThreadPool(3);
            threadPool.execute(new MainRunnable2(1));
            threadPool.execute(new MainRunnable2(2));
            threadPool.execute(new MainRunnable2(3));
            threadPool.shutdown();
        }
    }

    class MainRunnable2 implements Runnable {

        static int zaehler = 0;
        int meineThreadNum;

        MainRunnable2(int meineThreadNum) {
            this.meineThreadNum = meineThreadNum;
        }

        @Override
        public void run() {
            while (zaehler < 1000) {
                System.out.println("Thread " + meineThreadNum + ": " + ++zaehler);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException ex) {/*ok*/
                }
            }
        }
    }

    public class ExeOutputFrame extends JFrame {

        public ExeOutputFrame() {
            Runtime runtime;
            Process process;
            BufferedReader stdout;
            String output;
            JTextArea displayOutput;
            StringBuffer allOutput;

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// Setup the JFrame
// Use BorderLayout
            getContentPane().setLayout(new BorderLayout());

// Create the TextArea which will display the EXE’s output
            displayOutput = new JTextArea(10, 60);

// Place the TextArea on the JFrame
            getContentPane().add(new JScrollPane(displayOutput), BorderLayout.SOUTH);

// Size the JFrame
            pack();

// Show the JFrame
            setVisible(true);

// Now we will run the EXE and display the output
// Need a place to house the collected output
            allOutput = new StringBuffer();

// Access the runtime environment so we can run the EXE
            runtime = Runtime.getRuntime();

// We can encounter checked exceptions, so we need a try block
            try {

// Run the EXE, retain the reference to the process that is started
                process = runtime.exec("tracert");

// Get the standard output from the EXE
                stdout = new BufferedReader(new InputStreamReader(process.
                        getInputStream()));

// As long as we don’t get a null value, keep reading from the stream
                while ((output = stdout.readLine()) != null) {
// Append the collected input into the message buffer
                    allOutput.append(output);
// If we gont one or more characters then we need a newline
// since we are reading a line at a time
                    if (output.length() > 0) {
                        allOutput.append('n');
                    }

// Place the collected text into the TextArea
                    displayOutput.setText(allOutput.toString());

// Set the caret in the TextArea to the end of the current text
// so that the most recent output is visible
                    displayOutput.setCaretPosition(allOutput.length());
                }
            } catch (Throwable throwable) {
// Report the error
                allOutput.append(
                        "nError while running command. Exception Class/Message: "
                        + throwable.getClass().getName() + "/" + throwable.getMessage()
                        + "n" + throwable.getStackTrace().toString());
            }
        }

        /**
         * Run the program
         *
         * @param args String[]
         */
        public static void mainOutExecIntoFrame() {
            new ExeOutputFrame();
        }
    }

    public class ReaderJobFromQueueForWorkerLine {

        ReaderJobFromQueueForWorkerLine() {
            boolean isRun = Boolean.TRUE;
            long runAt = System.currentTimeMillis();
        }
    }

}
