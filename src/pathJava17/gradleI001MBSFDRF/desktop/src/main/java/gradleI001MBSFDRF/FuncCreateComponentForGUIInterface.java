/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gradleI001MBSFDRF;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 *
 * @author Администратор
 */
public interface FuncCreateComponentForGUIInterface {

    public class CreatorJButtons001 {

        CreatorJButtons001() {
        }

        protected static JButton getJButtonImpl() {
            long currentTimeMillis = System.currentTimeMillis();
            /**
             * @todo Action, Icon
             */
            return new JButton(String.valueOf(currentTimeMillis));
        }
    }

    public class CreatorJPanel001 {

        CreatorJPanel001() {
        }

        protected static JPanel getJPanelImpl() {
            /**
             * Creates a new JPanel with a double buffer and a flow layout.
             */
            return new JPanel();
        }
    }

    public class CreatorJList001 {

        CreatorJList001() {
        }

        protected static JList getJListImpl() {
            return new JList();
        }
    }
}
