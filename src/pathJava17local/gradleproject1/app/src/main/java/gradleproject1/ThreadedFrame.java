/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gradleproject1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Администратор
 */
public interface ThreadedFrame {
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

                JPanel progressPane = new JPanel(new GridBagLayout());
                JProgressBar progressBar = new JProgressBar(0, 100);
                progressPane.add(progressBar);

                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.add(progressPane);
                frame.setSize(200, 200);
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
