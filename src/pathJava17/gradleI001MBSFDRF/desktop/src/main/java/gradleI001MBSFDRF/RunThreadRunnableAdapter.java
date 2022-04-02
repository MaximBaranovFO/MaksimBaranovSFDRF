/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gradleI001MBSFDRF;

import java.util.concurrent.ConcurrentSkipListMap;
import javax.swing.JButton;

/**
 *
 * @author Администратор
 */
public interface RunThreadRunnableAdapter {
    public class ConcurrentSkipListMapReader{
        private Boolean inProcess = Boolean.FALSE;
        //First record when start adapter
        private ConcurrentSkipListMap<Long, String> inProcessAtTimeWithCanonicalName;
        ConcurrentSkipListMapReader(){
            inProcessAtTimeWithCanonicalName = new ConcurrentSkipListMap<Long, String>();
            inProcessAtTimeWithCanonicalName.put(System.currentTimeMillis(), ConcurrentSkipListMapReader.class.getCanonicalName());
        }
        public JButton statusOfButton(JButton inputedButton){
            JButton changedButton = new JButton();
            inProcess = Boolean.TRUE;
            new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    changedButton.setText(String.valueOf(System.currentTimeMillis())
                            .concat(" _ ")
                            .concat(inputedButton.getText())
                    );
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    ex.printStackTrace();
                }
            }
            }
            ).start();
            inProcess = Boolean.FALSE;
            return changedButton;
        }
    }
}
