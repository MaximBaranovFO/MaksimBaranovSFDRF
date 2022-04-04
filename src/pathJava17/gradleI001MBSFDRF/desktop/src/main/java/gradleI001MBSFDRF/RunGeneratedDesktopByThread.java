/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gradleI001MBSFDRF;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import net.java.html.boot.BrowserBuilder;

/**
 *
 * @author Администратор
 */
public interface RunGeneratedDesktopByThread {
    
    
    public class whatDoSomeCreatedWorkers{
        
        private ConcurrentSkipListMap<Long, BrowserBuilder> listExecResultsTemporary = null;
        private Boolean isListExecResultsSet = Boolean.FALSE;
        public static Boolean hereIsCreated = Boolean.FALSE;
    
        whatDoSomeCreatedWorkers(){
            listExecResultsTemporary = new ConcurrentSkipListMap<Long, BrowserBuilder>();
            isListExecResultsSet = Boolean.TRUE;
            hereIsCreated = Boolean.TRUE;
        }
        private ConcurrentSkipListMap<Long, BrowserBuilder> getList(){
            return listExecResultsTemporary.clone();
        }
        public Boolean isHimHasList(){
            if ( listExecResultsTemporary != null )
                return Boolean.TRUE;
            return Boolean.FALSE;
        }
        public Integer whatCountOfWorkerProcess(){
            if ( listExecResultsTemporary == null )
                return 0;
            return listExecResultsTemporary.size();
        }
        public void addWorkerProcessInList(ConcurrentSkipListMap<Long, BrowserBuilder> outputListOfWorkerProcess){
            if ( listExecResultsTemporary != null )
                if ( outputListOfWorkerProcess != null )
                    do {
                        listExecResultsTemporary.put(outputListOfWorkerProcess.firstKey(),outputListOfWorkerProcess.remove(outputListOfWorkerProcess.firstKey()));
                    } while(outputListOfWorkerProcess.isEmpty());
        }
    }
    
    public class RunGeneratedDesktopThreadedProgress {
        private ConcurrentSkipListMap<Long, BrowserBuilder> execResultsTemporary;
        private whatDoSomeCreatedWorkers oneOfPointsOfWorkersList;
    
    RunGeneratedDesktopThreadedProgress(){
        super();
        execResultsTemporary = new ConcurrentSkipListMap();
        oneOfPointsOfWorkersList = new whatDoSomeCreatedWorkers();
    }
    protected void runGeneratedDesktop(){
        long currentTimeMillis = System.currentTimeMillis();
        String valueOfCurrentTime = String.valueOf(currentTimeMillis);
        
            //Created system build, changed
            BrowserBuilder loadFinished = BrowserBuilder.newBrowser().loadPage("pages/index.html")
                    .loadFinished(Demo::onPageLoad);
            
            if( execResultsTemporary != null) {
                try {
                        
                    if( loadFinished != null)
                        execResultsTemporary.put(System.currentTimeMillis(), loadFinished);
                } catch (java.lang.NullPointerException ex) {
                    System.out.println(ex.getMessage());
                    ex.printStackTrace();
                }
            } else {
                execResultsTemporary = new ConcurrentSkipListMap();
                execResultsTemporary.put(System.currentTimeMillis(), loadFinished);
                oneOfPointsOfWorkersList.addWorkerProcessInList(execResultsTemporary.clone());
            }
            
            ThreadedProgress.mainRunThreadedFrame();
            
        loadFinished.showAndWait();
        System.exit(0);
    }
    }
    public class ThreadedProgress {

    public static void mainRunThreadedFrame() {
        new ThreadedProgress();
    }

    public ThreadedProgress() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                } catch (InstantiationException ex) {
                } catch (IllegalAccessException ex) {
                } catch (UnsupportedLookAndFeelException ex) {
                }

                GridBagLayout layOutBag = new GridBagLayout();
                
                
                
                JPanel progressPane = new JPanel(layOutBag);
                progressPane.setLayout(layOutBag);
                
                GridBagConstraints consBag = new GridBagConstraints();
                JProgressBar progressBar = new JProgressBar(0, 100);
                progressBar.setAlignmentX(Component.LEFT_ALIGNMENT);
                progressBar.setAlignmentY(Component.TOP_ALIGNMENT);
                consBag.anchor = GridBagConstraints.PAGE_END;
                progressPane.add(progressBar, consBag);
                
                layOutBag.addLayoutComponent("ProgressBar_001", progressBar);
                
                //001 add Button in from internet form
                JButton someButton = new JButton();
                someButton.setText("Run Worker");
                RunThreadRunnableAdapter.ConcurrentSkipListMapReader adapterChangeGUI = 
                        new RunThreadRunnableAdapter.ConcurrentSkipListMapReader();
                someButton = adapterChangeGUI.statusOfButton(someButton);
                
                consBag.anchor = GridBagConstraints.PAGE_START;
                progressPane.add(someButton, consBag);
                someButton.setAlignmentX(Component.LEFT_ALIGNMENT);
                someButton.setAlignmentY(Component.BOTTOM_ALIGNMENT);
                layOutBag.addLayoutComponent("Button_001", someButton);
                
                Component[] components = progressPane.getComponents();
                progressPane.doLayout();

                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.add(progressPane);
                frame.setSize(320, 240);
                frame.setMinimumSize(new Dimension(320, 240));
                frame.setPreferredSize(new Dimension(800, 600));
                frame.repaint();
                frame.revalidate();
                frame.pack();
        
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

                new Thread(new MainThread(progressBar)).start();

            }

        });
    }

    public interface CallBack {
        public void done(Runnable runnable);
    }

    public static class MainThread implements CallBack, Runnable {

        public static final Object UPDATE_LOCK = new Object();
        public static final Object WAIT_LOCK = new Object();
        private List<Runnable> running = new ArrayList<>(25);
        private List<Runnable> completed = new ArrayList<>(25);
        private final JProgressBar progressBar;

        public MainThread(JProgressBar progressBar) {
            this.progressBar = progressBar;
        }

        @Override
        public void done(Runnable runnable) {
            synchronized (UPDATE_LOCK) {
                running.remove(runnable);
                completed.add(runnable);
            }
            int count = running.size() + completed.size();
            updateProgress(completed.size(), count);
            synchronized (WAIT_LOCK) {
                WAIT_LOCK.notify();
            }
        }

        protected void updateProgress(final int value, final int count) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    int progress = Math.round(((float) value / (float) count) * 100f);
                    progressBar.setValue(progress);
                }
            });
        }

        @Override
        public void run() {
            for (int index = 0; index < 5; index++) {
                ChildSpawn spawn = new ChildSpawn(this);
                running.add(spawn);
            }
            for (Runnable runnable : running) {
                new Thread(runnable).start();
            }

            while (running.size() > 0) {
                synchronized (WAIT_LOCK) {
                    try {
                        WAIT_LOCK.wait();
                    } catch (InterruptedException ex) {
                    }
                }
            }
            System.out.println("I'm all done");
        }
    }

    public static class ChildSpawn implements Runnable {

        private CallBack callBack;

        public ChildSpawn(CallBack callBack) {
            this.callBack = callBack;
        }

        @Override
        public void run() {
            try {
                Thread.sleep((long)Math.round(Math.random() * 5000));
            } catch (InterruptedException ex) {
            }

            callBack.done(this);            
        }

    }

}
}
