/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gradleI001MBSFDRF;

import javax.swing.JProgressBar;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTree;
import javax.swing.border.Border;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.TableModel;
import java.awt.Component;
import java.util.TreeMap;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.filechooser.FileSystemView;
import javax.swing.JProgressBar;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.awt.Dimension;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.SwingWorker;
import javax.swing.table.TableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.io.Serializable;
import java.io.Serializable;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeConstants;

/**
 *
 * @author ¿‰ÏËÌËÒÚ‡ÚÓ
 */
public interface GiveGUICreatedElementInterface {

    /**
     *
     * @author wladimirowichbiaran
     */
    public class NcSwPanelCenter {

        /**
         * Used in
         * <ul>
         * <li>{@link ru.newcontrol.ncfv.NcSwingIndexManagerApp#createGui() }
         * </ul>
         *
         * @return
         */
        protected static JPanel getPanel(NcSwGUIComponentStatus lComp) {
            JPanel centerPanel = new JPanel();
            String componentPath = NcSwGUIComponentRouter.pathMainFramePanelCenter();
            lComp.putComponents(componentPath, centerPanel);
            Border centerBorder = BorderFactory.createTitledBorder("CENTER panel");
            centerPanel.setBorder(centerBorder);
            centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));

            TableModel ncTableModel = new NcSIMASearchResultTableModel(new ArrayList<String>(), new ArrayList<String>());

            JTable ncTable = new JTable(ncTableModel);
            componentPath = NcSwGUIComponentRouter.pathMainFramePanelCenterTable();
            lComp.putComponents(componentPath, ncTable);

            JScrollPane ncScrollTable = new JScrollPane(ncTable);

            centerPanel.add(ncScrollTable);

            ncScrollTable.revalidate();

            NcLogLogicGUI.NcSwPanelCenterGetPanel();
            return centerPanel;
        }

    }

    /**
     *
     * @author wladimirowichbiaran
     */
    public class NcSwPanelLineEnd {

        /**
         * Used in
         * <ul>
         * <li>{@link ru.newcontrol.ncfv.NcSwingIndexManagerApp#createGui() }
         * </ul>
         *
         * @return
         */
        protected static JPanel getPanel(NcSwGUIComponentStatus lComp) {
            JPanel lineEndPanel = getPanelTreeShowStack(lComp);
            return lineEndPanel;
        }

        private static JPanel getPanelTreeShowStack(NcSwGUIComponentStatus lComp) {
            JTree treeStack = NcSwGUITreeShowStack.getTreeShowStack(lComp);

            JScrollPane scrollTreeStackPane = new JScrollPane(treeStack);
            JPanel panelTreeStackPane = new JPanel();
            panelTreeStackPane.add(scrollTreeStackPane);
            String componentPath = NcSwGUIComponentRouter.pathMainFramePanelLineEndTabbedPaneStackScrollPane();
            //***lComp.putComponents(componentPath, scrollTreeStackPane);
            lComp.putComponents(componentPath, scrollTreeStackPane);

            JPanel panel = new JPanel();

            Border eastBorder = BorderFactory.createTitledBorder("EAST panel");

            Dimension dimMin = new Dimension(50, 70);
            panel.setMinimumSize(dimMin);
            Dimension dimMax = new Dimension(250, 700);
            panel.setMaximumSize(dimMax);
            Dimension dimPreff = new Dimension(250, 407);
            panel.setPreferredSize(dimPreff);
            panel.setBorder(eastBorder);

            JPanel panelForTabbed = new JPanel();

            JTabbedPane tabbedPane = new JTabbedPane();
            //***tabbedPane.addTab("Stack", scrollTreeStackPane);
            tabbedPane.addTab("Stack", panelTreeStackPane);

            JTree treeWork = NcSwGUITreeShowWork.showWork(lComp);
            JScrollPane scrollTreeWorkPane = new JScrollPane(treeWork);
            JPanel panelTreeWorkPane = new JPanel();
            panelTreeWorkPane.add(scrollTreeWorkPane);
            tabbedPane.addTab("Work", panelTreeWorkPane);
            componentPath = NcSwGUIComponentRouter.pathMainFramePanelLineEndTabbedPaneWorkScrollPane();
            lComp.putComponents(componentPath, scrollTreeWorkPane);

            JTree treeOutput = NcSwGUITreeShowOutput.showOutput(lComp);
            JScrollPane scrollTreeOutputPane = new JScrollPane(treeOutput);
            JPanel panelTreeOutputPane = new JPanel();
            panelTreeOutputPane.add(scrollTreeOutputPane);
            tabbedPane.addTab("Output", panelTreeOutputPane);
            componentPath = NcSwGUIComponentRouter.pathMainFramePanelLineEndTabbedPaneOutputScrollPane();
            lComp.putComponents(componentPath, scrollTreeOutputPane);

            panelForTabbed.add(tabbedPane);
            panel.add(panelForTabbed);

            Dimension preferredSize = scrollTreeStackPane.getPreferredSize();
            Dimension widePreffSize = new Dimension(230,
                    ((int) preferredSize.getHeight()) - 30);
            scrollTreeStackPane.setPreferredSize(widePreffSize);
            componentPath = NcSwGUIComponentRouter.pathMainFramePanelLineEnd();
            lComp.putComponents(componentPath, panel);

            return panel;
        }

        private static JPanel getSearchKeyWordManagePanel(NcSwGUIComponentStatus lComp) {
            String[] forTextToolTip = {
                "For search with keyword, input it and press \"+\" Button",
                "For search with out keyword, input it and press \"+\" Button",
                "Help about keyword in Search",
                "Help about keyword out of Search",};
            String[] forComponentText = {
                "How to use",};

            Dimension textFiledForSearchDimension = new Dimension(100, 20);

            JPanel eastPanel = new JPanel();
            String componentPath = NcSwGUIComponentRouter.pathMainFramePanelLineEnd();
            lComp.putComponents(componentPath, eastPanel);
            Border eastBorder = BorderFactory.createTitledBorder("EAST panel");
            eastPanel.setBorder(eastBorder);
            eastPanel.setLayout(new BoxLayout(eastPanel, BoxLayout.PAGE_AXIS));

            eastPanel.setAlignmentX(JComponent.TOP_ALIGNMENT);
            eastPanel.setAlignmentY(JComponent.CENTER_ALIGNMENT);

            JButton ncHowToInSearch = FuncCreateComponentForGUIInterface.CreatorJButtons001.getJButtonImpl();

            /**
             * NcSwGUIComponent.createButton( forComponentText[0], null,
             * forTextToolTip[2]);
             */
            eastPanel.add(ncHowToInSearch);

            JPanel textInSearchPanel = FuncCreateComponentForGUIInterface.CreatorJPanel001.getJPanelImpl();

            /**
             * NcSwGUIComponent.getTextFieldForSearchPanel(
             * textFiledForSearchDimension, forTextToolTip[0]);
             * eastPanel.add(textInSearchPanel);
             */
            eastPanel.add(getAndOrButtonPanel());

            JList wiSearch = FuncCreateComponentForGUIInterface.CreatorJList001.getJListImpl();

            /**
             * NcSwGUIComponent.createJListWordInSearch();
             */
            JScrollPane wiScroll = new JScrollPane(wiSearch);
            wiScroll.setPreferredSize(new Dimension(100, 100));

            eastPanel.add(wiScroll);

            JPanel buttonPanel1 = getAddDelButtonPanel();
            eastPanel.add(buttonPanel1);

            JSeparator ncSeparator = new JSeparator(JSeparator.HORIZONTAL);
            eastPanel.add(ncSeparator);

            eastPanel.add(FuncCreateComponentForGUIInterface.CreatorJButtons001.getJButtonImpl());

            /**
             * NcSwGUIComponent.createButton( forComponentText[0], null,
             * forTextToolTip[3]));
             */
            JPanel textOutSearchPanel = FuncCreateComponentForGUIInterface.CreatorJPanel001.getJPanelImpl();

            /**
             * NcSwGUIComponent.getTextFieldForSearchPanel(
             * textFiledForSearchDimension, forTextToolTip[1]);
             */
            eastPanel.add(textOutSearchPanel);

            eastPanel.add(getAndOrButtonPanel());

            JList wniSearch = FuncCreateComponentForGUIInterface.CreatorJList001.getJListImpl();

            /**
             * NcSwGUIComponent.createJListWordNotInSearch();
             */
            JScrollPane wniScroll = new JScrollPane(wniSearch);
            wniScroll.setPreferredSize(new Dimension(100, 100));

            eastPanel.add(wniScroll);

            JPanel buttonPanel2 = getAddDelButtonPanel();
            eastPanel.add(buttonPanel2);
            toLALRgetPanel();
            return eastPanel;
        }

        /**
         * Used in
         * <ul>
         * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineEnd#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * </ul>
         *
         * @return
         */
        private static JPanel getAndOrButtonPanel() {
            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
            buttonPanel.add(FuncCreateComponentForGUIInterface.CreatorJButtons001.getJButtonImpl());
            /**
             * NcSwGUIComponent.createButton("&&", null, ""));
             */

            buttonPanel.add(FuncCreateComponentForGUIInterface.CreatorJButtons001.getJButtonImpl());
            /**
             * NcSwGUIComponent.createButton("||", null, ""));
             */

            return buttonPanel;
        }

        /**
         * Used in
         * <ul>
         * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineEnd#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * </ul>
         *
         * @return
         */
        private static JPanel getAddDelButtonPanel() {
            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
            buttonPanel.add(FuncCreateComponentForGUIInterface.CreatorJButtons001.getJButtonImpl());

            /**
             * NcSwGUIComponent.createButton("+", null, ""));
             */
            buttonPanel.add(FuncCreateComponentForGUIInterface.CreatorJButtons001.getJButtonImpl());

            /**
             * NcSwGUIComponent.createButton("-", null, ""));
             */
            return buttonPanel;
        }

        /**
         * Used in
         * <ul>
         * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineEnd#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * </ul>
         * LogAppLogicRecord (LALR) - toLALR(class MethodName) make record in
         * log file
         *
         * @return
         */
        private static void toLALRgetPanel() {
            if (NcfvRunVariables.isLALRNcSwPanelLineEndgetPanel()) {
                String strLogMsg = GiveGUIbyTextSizeInterface.TextLogMsgField.INFO.getStr()
                        + GiveGUIbyTextSizeInterface.TextLogMsgField.APP_LOGIC_NOW.getStr()
                        + NcStrLogLogicVar.LA_JPANEL_LINEEND.getStr()
                        + GiveGUIbyTextSizeInterface.TextLogMsgField.APP_LOGIC_NEXT_WAY_VAR.getStr()
                        + NcStrLogLogicVar.LA_JPANEL_CENTER.getStr();
                NcAppHelper.outMessage(strLogMsg);
            }
        }
    }

    /**
     *
     * @author wladimirowichbiaran
     */
    public class NcSwPanelLineStart {

        /**
         * Used in
         * <ul>
         * <li>{@link ru.newcontrol.ncfv.NcSwingIndexManagerApp#createGui() }
         * </ul>
         *
         * @return
         */
        protected static JPanel getPanel(NcSwGUIComponentStatus lComp) {
            JPanel westPanel = new JPanel();
            String componentPath = NcSwGUIComponentRouter.pathMainFramePanelLineStart();
            lComp.putComponents(componentPath, westPanel);
            Border westBorder = BorderFactory.createTitledBorder("WEST panel");
            westPanel.setBorder(westBorder);
            westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.PAGE_AXIS));

            ArrayList<JButton> ncAllDisk = NcSwGUIComponent.getRootButtons(lComp);

            for (JButton itemDisk : ncAllDisk) {
                westPanel.add(itemDisk);
                toLALRgetPanel();
            }
            return westPanel;
        }

        /**
         * Used in
         * <ul>
         * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineStart#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * </ul>
         * LogAppLogicRecord (LALR) - toLALR(class MethodName) make record in
         * log file
         */
        private static void toLALRgetPanel() {
            boolean returnedIsPanelGet = NcfvRunVariables.isLALRNcSwPanelLineStartgetPanel();
            if (returnedIsPanelGet) {
                String strLogMsg = GiveGUIbyTextSizeInterface.TextLogMsgField.INFO.getStr()
                        + GiveGUIbyTextSizeInterface.TextLogMsgField.APP_LOGIC_NOW.getStr()
                        + NcStrLogLogicVar.LA_PANEL_LINESTART.getStr()
                        + GiveGUIbyTextSizeInterface.TextLogMsgField.APP_LOGIC_NEXT_WAY_VAR.getStr()
                        + NcStrLogLogicVar.LA_JPANEL_LINEEND.getStr();
                NcAppHelper.outMessage(strLogMsg);
            }
        }
    }

    /**
     *
     * @author wladimirowichbiaran
     */
    public class NcSwPanelPageEnd {

        /**
         * Used in
         * <ul>
         * <li>{@link ru.newcontrol.ncfv.NcSwingIndexManagerApp#createGui() }
         * </ul>
         *
         * @return
         */
        protected static JPanel getPanel(NcSwGUIComponentStatus lComp) {
            JPanel southPanel = new JPanel();
            String componentPath = NcSwGUIComponentRouter.pathMainFramePanelPageEnd();
            lComp.putComponents(componentPath, southPanel);
            Border southBorder = BorderFactory.createTitledBorder("SOUTH panel");
            southPanel.setBorder(southBorder);

            southPanel.add(
                    NcSwStatusPanel.addProgressBar(lComp)
            );
            JButton buttonGetStack = NcSwGUIComponent.createButton("Show", null, "Show now StackTrace");
            componentPath = NcSwGUIComponentRouter.pathMainFramePanelPageEndButtonGetStack();
            lComp.putComponents(componentPath, buttonGetStack);

            buttonGetStack.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    NcSwStatusPanel.indicationStartProgressBar(lComp);
                    NcThWorkerUpGUITreeState.stateTreeAddChildren(lComp);
                    NcSwStatusPanel.indicationStopProgressBar(lComp);
                }
            });
            southPanel.add(buttonGetStack);
            toLALRgetPanel();
            return southPanel;
        }

        /**
         * Used in
         * <ul>
         * <li>{@link ru.newcontrol.ncfv.NcSwPanelPageEnd#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * </ul>
         * LogAppLogicRecord (LALR) - toLALR(class MethodName) make record in
         * log file
         */
        private static void toLALRgetPanel() {
            boolean returnedIsPanelGet = NcfvRunVariables.isLALRNcSwPanelLineStartgetPanel();
            if (returnedIsPanelGet) {
                String strLogMsg = GiveGUIbyTextSizeInterface.TextLogMsgField.INFO.getStr()
                        + GiveGUIbyTextSizeInterface.TextLogMsgField.APP_LOGIC_NOW.getStr()
                        + NcStrLogLogicVar.LA_JPANEL_PAGEEND.getStr()
                        + GiveGUIbyTextSizeInterface.TextLogMsgField.APP_LOGIC_NEXT_WAY_VAR.getStr()
                        + NcStrLogLogicVar.LA_PANEL_LINESTART.getStr();
                NcAppHelper.outMessage(strLogMsg);
            }
        }
    }

    /**
     *
     * @author wladimirowichbiaran
     */
    public class NcSwPanelPageStart {

        /**
         * Used in
         * <ul>
         * <li>{@link ru.newcontrol.ncfv.NcSwingIndexManagerApp#createGui() }
         * </ul>
         *
         * @return
         */
        protected static JPanel getPanel(NcSwGUIComponentStatus lComp) {
            JPanel northPanel = new JPanel();
            String componentPath = NcSwGUIComponentRouter.pathMainFramePanelPageStart();
            lComp.putComponents(componentPath, northPanel);
            Border northBorder = BorderFactory.createTitledBorder(
                    NcStrGUILabel.PARAMETERS_FOR_SEARCH.getStr());
            northPanel.setBorder(northBorder);
            northPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

            JTextField addNorthWordSearch = new JTextField();
            componentPath = NcSwGUIComponentRouter.pathMainFramePanelPageStartTextFieldSearch();
            lComp.putComponents(componentPath, addNorthWordSearch);

            addNorthWordSearch.setPreferredSize(new Dimension(300, 20));

            northPanel.add(addNorthWordSearch);
            JButton btnSearch = NcSwGUIComponent.createButton("Search", null, "");
            componentPath = NcSwGUIComponentRouter.pathMainFramePanelPageStartButtonSearch();
            lComp.putComponents(componentPath, btnSearch);

            btnSearch.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    //NcSwStatusPanel.indicationStartProgressBar(lComp);
                    String strSearch = addNorthWordSearch.getText();
                    //NcSwThreadManager.setToViewSearchedResult(lComp, strSearch);
                    NcThWorkerUpGUIKeyWordSearch.searchKeyWordGetResult(lComp);

                    //NcSwStatusPanel.indicationStopProgressBar(lComp);
                }
            });

            northPanel.add(btnSearch);
            toLALRgetPanel();
            return northPanel;
        }

        /**
         * Used in
         * <ul>
         * <li>{@link ru.newcontrol.ncfv.NcSwPanelPageStart#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * </ul>
         * LogAppLogicRecord (LALR) - toLALR(class MethodName) make record in
         * log file
         */
        private static void toLALRgetPanel() {
            if (NcfvRunVariables.isLALRNcSwPanelPageStartgetPanel()) {
                String strLogMsg = GiveGUIbyTextSizeInterface.TextLogMsgField.INFO.getStr()
                        + GiveGUIbyTextSizeInterface.TextLogMsgField.APP_LOGIC_NOW.getStr()
                        + NcStrLogLogicVar.LA_JPANEL_PAGESTART.getStr()
                        + GiveGUIbyTextSizeInterface.TextLogMsgField.APP_LOGIC_NEXT_WAY_VAR.getStr()
                        + NcStrLogLogicVar.LA_JPANEL_PAGEEND.getStr();
                NcAppHelper.outMessage(strLogMsg);
            }
        }
    }

    /**
     *
     * @author wladimirowichbiaran
     */
    public class GUIStatusPanel {

        /**
         *
         * @param lComp
         * @return
         */
        protected static JProgressBar addProgressBar(NcSwGUIComponentStatus lComp) {
            String componentPath
                    = NcSwGUIComponentRouter.pathMainFramePanelPageEndProgressBar();
            JProgressBar progressBar = NcSwGUIComponent.getProgressBar();
            lComp.putComponents(componentPath,
                    progressBar);
            return progressBar;
        }

        /**
         *
         * @param lComp
         */
        protected static void indicationStartProgressBar(NcSwGUIComponentStatus lComp) {
            String componentPath
                    = NcSwGUIComponentRouter.pathMainFramePanelPageEndProgressBar();
            JProgressBar progressBar = (JProgressBar) lComp.getComponentByPath(componentPath);
            progressBar.setIndeterminate(true);
        }

        /**
         *
         * @param lComp
         */
        protected static void indicationStopProgressBar(NcSwGUIComponentStatus lComp) {
            String componentPath
                    = NcSwGUIComponentRouter.pathMainFramePanelPageEndProgressBar();
            JProgressBar progressBar
                    = (JProgressBar) lComp.getComponentByPath(componentPath);
            progressBar.setIndeterminate(false);
        }

    }

    /**
     *
     * @author wladimirowichbiaran
     */
    public class NcSwGUIComponentStatus {

        private TreeMap<Integer, Component> modalLogView;

        /**
         * Used in
         * <ul>
         * <li>{@link ru.newcontrol.ncfv.NcSwModalLogViewer#getDialogLogViewer(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * <li>
         * <li>{@link ru.newcontrol.ncfv.NcSwingIndexManagerApp#createGui() }
         * </ul>
         */
        protected NcSwGUIComponentStatus() {
            modalLogView = new TreeMap<Integer, Component>();
        }

        /**
         * Not used
         *
         * @return
         */
        protected TreeMap<Integer, Component> getComponentsList() {
            return modalLogView;
        }

        /**
         * Used in
         * <ul>
         * <li>{@link ru.newcontrol.ncfv.NcSwMenuItems#getEnvironmentViewer(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * <li>{@link ru.newcontrol.ncfv.NcSwMenuItems#getPropertiesViewer(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * <li>
         * <li>{@link ru.newcontrol.ncfv.NcSwModalLogViewer#getDialogLogViewer(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * <li>{@link ru.newcontrol.ncfv.NcSwModalLogViewer#getButtonUpdate(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * <li>
         * <li>{@link ru.newcontrol.ncfv.NcSwThreadManager#setToViewSearchedResult(ru.newcontrol.ncfv.NcSwGUIComponentStatus, java.lang.String)
         * }
         * </ul>
         *
         * @param typeToGet
         * @return
         */
        protected Component getComponentByPath(String typeToGet) {
            return modalLogView.get(typeToGet.hashCode());
        }

        /**
         * Used in
         * <ul>
         * <li>{@link ru.newcontrol.ncfv.NcSwModalLogViewer#getDialogLogViewer(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * <li>{@link ru.newcontrol.ncfv.NcSwModalLogViewer#getPanelCenter(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * <li>{@link ru.newcontrol.ncfv.NcSwModalLogViewer#getScrolledTree(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * <li>
         * <li>{@link ru.newcontrol.ncfv.NcSwPanelCenter#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * <li>
         * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineEnd#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * <li>
         * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineStart#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * <li>
         * <li>{@link ru.newcontrol.ncfv.NcSwPanelPageEnd#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * <li>
         * <li>{@link ru.newcontrol.ncfv.NcSwPanelPageStart#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * <li>
         * <li>{@link ru.newcontrol.ncfv.NcSwingIndexManagerApp#createGui() }
         * </ul>
         *
         * @param typeToAdd
         * @param compToAdd
         */
        protected void putComponents(String typeToAdd, Component compToAdd) {
            if (modalLogView == null) {
                modalLogView = new TreeMap<Integer, Component>();
            }
            Component toUnset = modalLogView.get(typeToAdd.hashCode());
            toUnset = null;
            modalLogView.put(typeToAdd.hashCode(), compToAdd);
        }

    }

    /**
     *
     * @author wladimirowichbiaran
     */
    public class NcSwGUIComponentRouter {

        /**
         *
         * @return
         */
        protected static String pathMainFrame() {
            return GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SMAIN.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJFRAME.getStr();
        }

        /**
         *
         * @return
         */
        protected static String pathMainFramePanel() {
            return GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SMAIN.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJFRAME.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJPANEL.getStr();
        }

        /**
         *
         * @return
         */
        protected static String pathMainFramePanelLineStart() {
            return GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SMAIN.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJFRAME.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJPANEL.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SLINESTART.getStr();
        }

        /**
         *
         * @return
         */
        protected static String pathMainFramePanelLineEnd() {
            return GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SMAIN.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJFRAME.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJPANEL.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SLINEEND.getStr();
        }

        /**
         *
         * @return
         */
        protected static String pathMainFramePanelLineEndTabbedPane() {
            return pathMainFramePanelLineEnd()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJTABBEDPANE.getStr();
        }

        /**
         *
         * @return
         */
        protected static String pathMainFramePanelLineEndTabbedPaneStack() {
            return pathMainFramePanelLineEndTabbedPane()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SSTACK.getStr();
        }

        /**
         *
         * @return
         */
        protected static String pathMainFramePanelLineEndTabbedPaneWork() {
            return pathMainFramePanelLineEndTabbedPane()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SWORK.getStr();
        }

        /**
         *
         * @return
         */
        protected static String pathMainFramePanelLineEndTabbedPaneOutput() {
            return pathMainFramePanelLineEndTabbedPane()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SOUTPUT.getStr();
        }

        /**
         *
         * @return
         */
        protected static String pathMainFramePanelLineEndTabbedPaneStackScrollPane() {
            return pathMainFramePanelLineEndTabbedPaneStack()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJSCROLLPANE.getStr();
        }

        /**
         *
         * @return
         */
        protected static String pathMainFramePanelLineEndTabbedPaneWorkScrollPane() {
            return pathMainFramePanelLineEndTabbedPaneWork()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJSCROLLPANE.getStr();
        }

        /**
         *
         * @return
         */
        protected static String pathMainFramePanelLineEndTabbedPaneOutputScrollPane() {
            return pathMainFramePanelLineEndTabbedPaneOutput()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJSCROLLPANE.getStr();
        }

        /**
         *
         * @return
         */
        protected static String pathMainFramePanelLineEndTabbedPaneStackScrollPaneTreeShowStack() {
            return pathMainFramePanelLineEndTabbedPaneStackScrollPane()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJTREE.getStr();
        }

        /**
         *
         * @return
         */
        protected static String pathMainFramePanelLineEndTabbedPaneWorkScrollPaneTreeShowWork() {
            return pathMainFramePanelLineEndTabbedPaneWorkScrollPane()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJTREE.getStr();
        }

        /**
         *
         * @return
         */
        protected static String pathMainFramePanelLineEndTabbedPaneOutputScrollPaneTreeShowOutput() {
            return pathMainFramePanelLineEndTabbedPaneOutputScrollPane()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJTREE.getStr();
        }

        /**
         *
         * @return
         */
        protected static String pathMainFramePanelPageStart() {
            return GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SMAIN.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJFRAME.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJPANEL.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SPAGESTART.getStr();
        }

        /**
         *
         * @return
         */
        protected static String pathMainFramePanelPageStartTextFieldSearch() {
            return GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SMAIN.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJFRAME.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJPANEL.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SPAGESTART.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.STEXTFIELD.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SSEARCH.getStr();
        }

        /**
         *
         * @return
         */
        protected static String pathMainFramePanelPageStartButtonSearch() {
            return GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SMAIN.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJFRAME.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJPANEL.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SPAGESTART.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJBUTTON.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SSEARCH.getStr();
        }

        /**
         *
         * @return
         */
        protected static String pathMainFramePanelPageEnd() {
            return GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SMAIN.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJFRAME.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJPANEL.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SPAGEEND.getStr();
        }

        /**
         *
         * @return
         */
        protected static String pathMainFramePanelPageEndButtonGetStack() {
            return GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SMAIN.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJFRAME.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJPANEL.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SPAGEEND.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJBUTTON.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SSTACK.getStr();
        }

        /**
         *
         * @return
         */
        protected static String pathMainFramePanelPageEndProgressBar() {
            String componentPath = GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SMAIN.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJFRAME.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJPANEL.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SPAGEEND.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJPROGRESSBAR.getStr();
            return componentPath;
        }

        /**
         *
         * @return
         */
        protected static String pathMainFramePanelPageEndButton() {
            String componentPath = GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SMAIN.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJFRAME.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJPANEL.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SPAGEEND.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJBUTTON.getStr();
            return componentPath;
        }

        /**
         *
         * @return
         */
        protected static String pathMainFramePanelCenter() {
            return GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SMAIN.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJFRAME.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJPANEL.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SCENTER.getStr();
        }

        /**
         *
         * @return
         */
        protected static String pathMainFramePanelCenterTable() {
            return GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SMAIN.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJFRAME.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJPANEL.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SCENTER.getStr()
                    + GiveGUIbyTextSizeInterface.TextTypesOfElementForPath.SJTABLE.getStr();
        }
    }

    /**
     *
     * @author wladimirowichbiaran
     */
    public class NcSwStatusPanel {

        /**
         *
         * @param lComp
         * @return
         */
        protected static JProgressBar addProgressBar(NcSwGUIComponentStatus lComp) {
            String componentPath
                    = NcSwGUIComponentRouter.pathMainFramePanelPageEndProgressBar();
            JProgressBar progressBar = NcSwGUIComponent.getProgressBar();
            lComp.putComponents(componentPath,
                    progressBar);
            return progressBar;
        }

        /**
         *
         * @param lComp
         */
        protected static void indicationStartProgressBar(NcSwGUIComponentStatus lComp) {
            String componentPath
                    = NcSwGUIComponentRouter.pathMainFramePanelPageEndProgressBar();
            JProgressBar progressBar = (JProgressBar) lComp.getComponentByPath(componentPath);
            progressBar.setIndeterminate(true);
        }

        /**
         *
         * @param lComp
         */
        protected static void indicationStopProgressBar(NcSwGUIComponentStatus lComp) {
            String componentPath
                    = NcSwGUIComponentRouter.pathMainFramePanelPageEndProgressBar();
            JProgressBar progressBar
                    = (JProgressBar) lComp.getComponentByPath(componentPath);
            progressBar.setIndeterminate(false);
        }

    }

    /**
     *
     * @author ¿‰ÏËÌËÒÚ‡ÚÓ
     */
    public class NcSIMASearchResultTableModel implements TableModel {

        private Set<TableModelListener> listeners = new HashSet<TableModelListener>();
        private TreeMap<Long, GiveTextStructureInterface.GetStructureDirListToFileAttr> ncDirectoryListReader;

        /**
         * Not used
         */
        private NcSIMASearchResultTableModel() {
            ncDirectoryListReader = NcSrchGetResult.makeSearchByKeyFromFile();
        }

        /**
         * Used in
         * <ul>
         * <li>{@link ru.newcontrol.ncfv.NcSwThreadManager#setToViewSearchedResult(ru.newcontrol.ncfv.NcSwGUIComponentStatus, java.lang.String)
         * }
         * </ul>
         */
        protected NcSIMASearchResultTableModel(String strSearchInput) {
            ncDirectoryListReader = NcSrchGetResult.makeSearchByKeyFromInput(strSearchInput);
        }

        protected NcSIMASearchResultTableModel(TreeMap<Long, GiveTextStructureInterface.GetStructureDirListToFileAttr> ncInFuncData) {
            ncDirectoryListReader = ncInFuncData;
        }

        /**
         * Used in
         * <ul>
         * <li>{@link ru.newcontrol.ncfv.NcSwPanelCenter#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * </ul>
         *
         * @param strKeyWordInSearch
         * @param strKeyWordOutSearch
         */
        protected NcSIMASearchResultTableModel(ArrayList<String> strKeyWordInSearch, ArrayList<String> strKeyWordOutSearch) {
            NcSearchInIndex ncSearchInIndex = new NcSearchInIndex();
            ncDirectoryListReader = NcSrchGetResult.makeSearchByKeyFromFile();
        }

        /**
         * Not used
         *
         * @return
         */
        @Override
        public int getRowCount() {
            return ncDirectoryListReader.size();
        }

        /**
         * Not used
         *
         * @return
         */
        @Override
        public int getColumnCount() {
            return 16;
        }

        /**
         * Not used
         *
         * @param columnIndex
         * @return
         */
        @Override
        public String getColumnName(int columnIndex) {
            switch (columnIndex) {
                case 0:
                    return "ID";
                case 1:
                    return "Disk S/N";
                case 2:
                    return "Disk S/N (hash)";
                case 3:
                    return "Disk letter";
                case 4:
                    return "Path";
                case 5:
                    return "Path (hash)";
                case 6:
                    return "Path with out Disk letter";
                case 7:
                    return "Path woDL (hash)";
                case 8:
                    return "Length";
                case 9:
                    return "R";
                case 10:
                    return "W";
                case 11:
                    return "X";
                case 12:
                    return "H";
                case 13:
                    return "lmDate";
                case 14:
                    return "D";
                case 15:
                    return "F";

            }
            return "";
        }

        /**
         * Not used
         *
         * @param columnIndex
         * @return
         */
        @Override
        public Class<?> getColumnClass(int columnIndex) {
            return String.class;
        }

        /**
         * Not used
         *
         * @param rowIndex
         * @param columnIndex
         * @return
         */
        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }

        /**
         * Not used
         *
         * @param rowIndex
         * @param columnIndex
         * @return
         */
        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            boolean returnNulls = true;
            GiveTextStructureInterface.GetStructureDirListToFileAttr rowForOutPut = null;
            //rowForOutPut = ncDirectoryListReader.entrySet().;
            long rowCounter = 0;

            for (Map.Entry<Long, GiveTextStructureInterface.GetStructureDirListToFileAttr> itemClean : ncDirectoryListReader.entrySet()) {
                if (rowIndex == rowCounter) {
                    rowForOutPut = itemClean.getValue();
                }

                rowCounter++;
            }
            if (rowForOutPut != null) {
                switch (columnIndex) {
                    case 0:
                        return rowForOutPut.dirListID;
                    case 1:
                        return rowForOutPut.diskSnHex;
                    case 2:
                        return rowForOutPut.diskSnHexHash;
                    case 3:
                        return rowForOutPut.diskLetter;
                    case 4:
                        if (NcAppHelper.isWindows()) {
                            return rowForOutPut.diskLetter + ":\\" + rowForOutPut.path;
                        } else {
                            return rowForOutPut.path;
                        }

                    case 5:
                        if (NcAppHelper.isWindows()) {
                            return (rowForOutPut.diskLetter + ":\\" + rowForOutPut.path).hashCode();
                        } else {
                            return (rowForOutPut.path).hashCode();
                        }
                    case 6:
                        return rowForOutPut.path;
                    case 7:
                        return rowForOutPut.pathHash;
                    case 8:
                        return rowForOutPut.fileLength;
                    case 9:
                        return rowForOutPut.fileCanRead;
                    case 10:
                        return rowForOutPut.fileCanWrite;
                    case 11:
                        return rowForOutPut.fileCanExecute;
                    case 12:
                        return rowForOutPut.fileIsHidden;
                    case 13:
                        return rowForOutPut.fileLastModified;
                    case 14:
                        return rowForOutPut.fileIsDirectory;
                    case 15:
                        return rowForOutPut.fileIsFile;

                }
                return "";

            }

            return new Object();
        }

        /**
         * Not used
         *
         * @param aValue
         * @param rowIndex
         * @param columnIndex
         */
        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

        }

        /**
         * Not used
         *
         * @param l
         */
        @Override
        public void addTableModelListener(TableModelListener l) {
            listeners.add(l);
        }

        /**
         * Not used
         *
         * @param l
         */
        @Override
        public void removeTableModelListener(TableModelListener l) {
            listeners.remove(l);
        }

    }

    /**
     *
     * @author wladimirowichbiaran
     */
    public class NcSwGUITreeShowStack {

        protected static JTree getTreeShowStack(NcSwGUIComponentStatus lComp) {
            DefaultMutableTreeNode treeTop
                    = new DefaultMutableTreeNode("Stack contained:");
            JTree treeNodes = new JTree(treeTop);
            String pathComponent
                    = NcSwGUIComponentRouter.pathMainFramePanelLineEndTabbedPaneStackScrollPaneTreeShowStack();
            lComp.putComponents(pathComponent, treeNodes);
            return treeNodes;
        }
    }

    /**
     *
     * @author wladimirowichbiaran
     */
    public class NcSwGUITreeShowOutput {

        protected static JTree showOutput(NcSwGUIComponentStatus lComp) {
            DefaultMutableTreeNode treeTop
                    = new DefaultMutableTreeNode("Output contained:");
            JTree treeNodes = new JTree(treeTop);
            String pathComponent
                    = NcSwGUIComponentRouter.pathMainFramePanelLineEndTabbedPaneOutputScrollPaneTreeShowOutput();
            lComp.putComponents(pathComponent, treeNodes);
            return treeNodes;
        }

    }

    /**
     *
     * @author wladimirowichbiaran
     */
    public class NcSwGUITreeShowWork {

        protected static JTree showWork(NcSwGUIComponentStatus lComp) {
            DefaultMutableTreeNode treeTop
                    = new DefaultMutableTreeNode("Work contained:");
            JTree treeNodes = new JTree(treeTop);
            String pathComponent
                    = NcSwGUIComponentRouter.pathMainFramePanelLineEndTabbedPaneWorkScrollPaneTreeShowWork();
            lComp.putComponents(pathComponent, treeNodes);
            return treeNodes;
        }

    }

    public class NcLogLogicGUI {

        NcLogLogicGUI() {
        }

        protected static void NcSwPanelCenterGetPanel() {
        }
    }

    public class NcfvRunVariables {

        protected static boolean isLALRNcSwPanelLineEndgetPanel() {
            return Boolean.FALSE;
        }
    }

    /**
     *
     * @author –ê–¥–º–∏–Ω–∏—Å—Ç—Ä–∞—Ç–æ—Ä
     */
    public class NcAppHelper {

        /**
         *
         */
        protected static void outPutToConsoleDiskInfo() {
            TreeMap<Long, NcDiskInfo> sysDisk = NcParamJournalDisk.getFromJournalDiskOrCreateIt();
            if (!sysDisk.isEmpty()) {
                outMessageToConsole("If your need to write alias parameter into Configuration file");
                outMessageToConsole("write it in this example format:");
                String[] strForDisk = {"USB",
                    "Black",
                    "Document",
                    "Flash",
                    "Storage",
                    "HDD",
                    "Network",
                    "System",
                    "Bootable",
                    "Silver",
                    "Grey",
                    "Old",
                    "New",
                    "FromWorker"};
                String strFirst = "";
                int i = 0;
                for (Map.Entry<Long, NcDiskInfo> itemDisk : sysDisk.entrySet()) {
                    if (i == 0) {
                        strFirst = strForDisk[(int) Math.round(Math.random() * 12)]
                                + strForDisk[(int) Math.round(Math.random() * 12)]
                                + strForDisk[(int) Math.round(Math.random() * 12)]
                                + strForDisk[(int) Math.round(Math.random() * 12)]
                                + strForDisk[(int) Math.round(Math.random() * 12)];
                        outMessageToConsole("alias_" + itemDisk.getValue().diskID + "="
                                + strFirst);
                    } else {
                        outMessageToConsole("alias_" + itemDisk.getValue().diskID + "="
                                + strForDisk[(int) Math.round(Math.random() * 12)]
                                + strForDisk[(int) Math.round(Math.random() * 12)]
                                + strForDisk[(int) Math.round(Math.random() * 12)]
                                + strForDisk[(int) Math.round(Math.random() * 12)]
                                + strForDisk[(int) Math.round(Math.random() * 12)]);
                    }
                    outMessageToConsole("Disk name and letter: " + itemDisk.getValue().strFileStore);
                    outMessageToConsole("Disk name: " + itemDisk.getValue().strFileStoreName);
                    if (isWindows()) {
                        outMessageToConsole("Serial number: " + itemDisk.getValue().strHexSerialNumber);
                    }
                    outMessageToConsole("File system: " + itemDisk.getValue().diskFStype);
                    outMessageToConsole("Total space in bytes: " + Long.toString(itemDisk.getValue().totalSpace));
                    outMessageToConsole("Total space in Kb: " + Long.toString(Math.round(itemDisk.getValue().totalSpace / 1024)));
                    outMessageToConsole("Total space in Mb: " + Long.toString(Math.round(itemDisk.getValue().totalSpace / (1024 * 1024))));
                    outMessageToConsole(" ");
                    i++;
                }

                outMessageToConsole("where " + sysDisk.firstEntry().getValue().diskID + " is diskID and " + strFirst);
                outMessageToConsole("is User alias label returned in search results");

            } else {
                outMessageToConsole("Information about disks is Empty, contact your system Administrator");
                System.exit(0);
            }
        }

        /**
         *
         * @param pathErr
         */
        protected static void appExitWithMessageFSAccess(String pathErr) {
            outMessage(GiveGUIbyTextSizeInterface.TextLogMsgField.ERROR_CRITICAL.getStr()
                    + "For run application in the path: " + pathErr
                    + "\n application must have permission on read, write on the file system"
                    + "\n for use functions of this application your must have run it in the"
                    + "\n system administrator privilegies, this application, read files on"
                    + "\n your file system, create some files in your file system, for more"
                    + "\n information about use this application read manual or contact to"
                    + "\n your system administrator");
            System.exit(0);
        }

        protected static void appExitWithMessage(String strErrMessage) {
            NcAppHelper.outMessage(GiveGUIbyTextSizeInterface.TextLogMsgField.ERROR_CRITICAL.getStr() + strErrMessage);
            System.exit(0);
        }

        /**
         *
         */
        protected static void getNcSysProperties() {
            Properties sProp = System.getProperties();
            Set<String> strPropName = sProp.stringPropertyNames();
            Map<String, String> sEnv = System.getenv();
            outMessageToConsole("");
            outMessageToConsole("");
            outMessageToConsole("System.getProperties");
            outMessageToConsole("");
            for (String itemPorperties : strPropName) {
                outMessageToConsole("Property name: \t" + itemPorperties);
                outMessageToConsole("Property value: \t" + sProp.getProperty(itemPorperties));
            }
            outMessageToConsole("");
            outMessageToConsole("");
            outMessageToConsole("System.getenv");
            outMessageToConsole("");
            for (Map.Entry<String, String> itemEnv : sEnv.entrySet()) {
                outMessageToConsole("Key of environment: \t" + itemEnv.getKey());
                outMessageToConsole("Value of environment: \t" + itemEnv.getValue());
            }

            File[] fileRoots = File.listRoots();
            outMessageToConsole("");
            outMessageToConsole("");
            outMessageToConsole("File.listRoots");
            outMessageToConsole("");
            for (File itemFile : fileRoots) {
                try {
                    outMessageToConsole("getAbsolutePath: " + NcIdxFileManager.getStrCanPathFromFile(itemFile));
                    outMessageToConsole("getCanonicalPath: " + itemFile.getCanonicalPath());
                    outMessageToConsole("toString: " + itemFile.toString());

                    outMessageToConsole("getName: " + itemFile.getName());
                    outMessageToConsole("getFreeSpace: " + itemFile.getFreeSpace());
                    outMessageToConsole("getUsableSpace: " + itemFile.getUsableSpace());
                    outMessageToConsole("getTotalSpace: " + itemFile.getTotalSpace());
                } catch (IOException ex) {
                    Logger.getLogger(NcPreRunFileViewer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            FileSystem fs = FileSystems.getDefault();
            outMessageToConsole("");
            outMessageToConsole("");
            outMessageToConsole("FileSystems.getDefault.getFileStores");
            outMessageToConsole("");
            for (FileStore store : fs.getFileStores()) {
                outMessageToConsole("FileStore: " + store.toString());
                outMessageToConsole("name: " + store.name());

                outMessageToConsole("type: " + store.type());
                outMessageToConsole("isReadOnly: " + store.isReadOnly());

                try {
                    outMessageToConsole("getTotalSpace: " + store.getTotalSpace());
                    outMessageToConsole("getUsableSpace: " + store.getUsableSpace());
                    outMessageToConsole("getUnallocatedSpace: " + store.getUnallocatedSpace());
                } catch (IOException ex) {
                    Logger.getLogger(NcPreRunFileViewer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            outMessageToConsole("");
            outMessageToConsole("");
            outMessageToConsole("FileSystems.getDefault.getRootDirectories");
            outMessageToConsole("");
            for (Path storePath : fs.getRootDirectories()) {
                outMessageToConsole("getNameCount: " + storePath.getNameCount());
                outMessageToConsole("Path.toString: " + storePath.toString());
                outMessageToConsole("getFileSystem.toString: " + storePath.getFileSystem().toString());
            }
            outMessageToConsole("");
            outMessageToConsole("");
            outMessageToConsole("NcDiskUtils.getDiskInfo");
            outMessageToConsole("");
            TreeMap<Long, NcDiskInfo> sysDisk = NcParamJournalDisk.getFromJournalDiskOrCreateIt();
            for (Map.Entry<Long, NcDiskInfo> itemDisk : sysDisk.entrySet()) {
                NcAppHelper.outMessageToConsole("");
                NcAppHelper.outMessageToConsole("diskID: \t" + Long.toString(itemDisk.getValue().diskID));
                NcAppHelper.outMessageToConsole("humanAlias: \t" + itemDisk.getValue().humanAlias);
                NcAppHelper.outMessageToConsole("programAlias: \t" + itemDisk.getValue().programAlias);
                NcAppHelper.outMessageToConsole("strFileStore: \t" + itemDisk.getValue().strFileStore);
                NcAppHelper.outMessageToConsole("strFileStoreName: \t" + itemDisk.getValue().strFileStoreName);
                NcAppHelper.outMessageToConsole("DiskLetter: \t" + itemDisk.getValue().diskLetter);
                NcAppHelper.outMessageToConsole("longSerialNumber: \t" + Long.toString(itemDisk.getValue().longSerialNumber));
                NcAppHelper.outMessageToConsole("strHexSerialNumber: \t" + itemDisk.getValue().strHexSerialNumber);
                NcAppHelper.outMessageToConsole("DiskFStype: \t" + itemDisk.getValue().diskFStype);
                NcAppHelper.outMessageToConsole("isReadonly: \t" + itemDisk.getValue().isReadonly);
                NcAppHelper.outMessageToConsole("availSpace: \t" + Long.toString(itemDisk.getValue().availSpace));
                NcAppHelper.outMessageToConsole("totalSpace: \t" + Long.toString(itemDisk.getValue().totalSpace));
                NcAppHelper.outMessageToConsole("unAllocatedSpace: \t" + Long.toString(itemDisk.getValue().unAllocatedSpace));
                NcAppHelper.outMessageToConsole("usedSpace: \t" + Long.toString(itemDisk.getValue().usedSpace));
            }

        }

        /**
         *
         * @param strMessage
         */
        protected static void outMessage(String strMessage) {
            if (NcfvRunVariables.getStage()) {
                if (!NcfvRunVariables.isNoOutToConsole()) {
                    if (NcfvRunVariables.getWithTrace()) {
                        String strNowTime = java.time.LocalDateTime.now().toString();
                        outMessageToConsole("at " + strNowTime + "\n");
                        Thread t = Thread.currentThread();
                        StackTraceElement[] nowT = t.getStackTrace();
                        int idx = 0;
                        for (StackTraceElement itemT : nowT) {
                            if (idx > 1 || NcfvRunVariables.getTraceWithPrintFunc()) {
                                String strOutFile = "";
                                if (NcfvRunVariables.getIncludeFile()) {
                                    strOutFile = itemT.getFileName() + "\t";
                                }
                                String strOut
                                        = "\t" + itemT.getClassName()
                                        + "." + itemT.getMethodName()
                                        + "\t[" + itemT.getLineNumber() + "]"
                                        + (itemT.isNativeMethod() ? "-native" : "");
                                outMessageToConsole(strOutFile + strOut);
                            }
                            idx++;
                        }
                    }
                    outMessageToConsole(strMessage);
                }
                outMessageToAppLogFile(strMessage);
            }
        }

        protected static void logException(String strClassName, Exception ex) {
            NcAppHelper.outMessage(GiveGUIbyTextSizeInterface.TextLogMsgField.ERROR.getStr()
                    + GiveGUIbyTextSizeInterface.TextLogMsgField.CLASSNAME.getStr()
                    + strClassName
                    + GiveGUIbyTextSizeInterface.TextLogMsgField.EXCEPTION_MSG.getStr()
                    + ex.getMessage());
        }

        protected static String exceptionToString(Class<?> exceptionClass,
                Class<?> srcClass,
                String descrStr) {
            String strForReturn = "";
            strForReturn = AppMsgEnFiledForLog.EX_CLASS
                    + exceptionClass.getCanonicalName()
                    + AppMsgEnFiledForLog.EX_SRC_CLASS
                    + srcClass.getCanonicalName()
                    + AppMsgEnFiledForLog.EX_DESCR
                    + descrStr;
            return strForReturn;
        }

        /**
         *
         * @param strMessage
         */
        protected static void outMessageToConsole(String strMessage) {
            System.out.println(strMessage);
        }

        /**
         *
         * @param strMessage
         */
        protected static void outMessageToAppLogFile(String strMessage) {
            if (NcfvRunVariables.isOutToLogFile()) {

                String strNowTime = GiveGUIbyTextSizeInterface.TextLogMsgField.TIME.getStr()
                        + java.time.LocalDateTime.now().toString();
                String strTimeAndMsg = strNowTime
                        + GiveGUIbyTextSizeInterface.TextLogMsgField.MSG.getStr() + strMessage;
                String strTrace = "";
                if (NcfvRunVariables.isOutToLogFileWithTrace()) {
                    TreeMap<Long, String> strForLog = new TreeMap<Long, String>();
                    Thread t = Thread.currentThread();

                    StackTraceElement[] nowT = t.getStackTrace();
                    long idx = 0;
                    strForLog.put(idx, strTimeAndMsg);
                    idx++;
                    String strThread = GiveGUIbyTextSizeInterface.TextLogMsgField.THREAD.getStr()
                            + GiveGUIbyTextSizeInterface.TextLogMsgField.COUNT.getStr()
                            + Thread.activeCount()
                            + GiveGUIbyTextSizeInterface.TextLogMsgField.THREAD_GROUP_NAME.getStr()
                            + t.getThreadGroup().getName()
                            + GiveGUIbyTextSizeInterface.TextLogMsgField.ACTIVE.getStr()
                            + GiveGUIbyTextSizeInterface.TextLogMsgField.COUNT.getStr()
                            + t.getThreadGroup().activeCount()
                            + GiveGUIbyTextSizeInterface.TextLogMsgField.ACTIVE.getStr()
                            + GiveGUIbyTextSizeInterface.TextLogMsgField.GROUP.getStr()
                            + GiveGUIbyTextSizeInterface.TextLogMsgField.COUNT.getStr()
                            + t.getThreadGroup().activeGroupCount();
                    strForLog.put(idx, strThread);
                    idx++;
                    String strLoader = GiveGUIbyTextSizeInterface.TextLogMsgField.CLASSLOADER.getStr()
                            + GiveGUIbyTextSizeInterface.TextLogMsgField.CANONICALNAME.getStr()
                            + t.getContextClassLoader().getClass().getCanonicalName();
                    strForLog.put(idx, strLoader);
                    idx++;
                    strForLog.put(idx, GiveGUIbyTextSizeInterface.TextLogMsgField.THREAD.getStr()
                            + GiveGUIbyTextSizeInterface.TextLogMsgField.TOSTRING.getStr()
                            + t.toString());
                    idx++;
                    strForLog.put(idx, GiveGUIbyTextSizeInterface.TextLogMsgField.THREAD.getStr()
                            + GiveGUIbyTextSizeInterface.TextLogMsgField.NAME.getStr()
                            + t.getName());
                    idx++;
                    strForLog.put(idx, GiveGUIbyTextSizeInterface.TextLogMsgField.THREAD.getStr()
                            + GiveGUIbyTextSizeInterface.TextLogMsgField.CANONICALNAME.getStr()
                            + t.getClass().getCanonicalName());
                    idx++;
                    strForLog.put(idx, GiveGUIbyTextSizeInterface.TextLogMsgField.THREAD.getStr()
                            + GiveGUIbyTextSizeInterface.TextLogMsgField.ID.getStr() + t.getId());
                    idx++;
                    strForLog.put(idx, GiveGUIbyTextSizeInterface.TextLogMsgField.THREAD.getStr()
                            + GiveGUIbyTextSizeInterface.TextLogMsgField.STATE.getStr()
                            + GiveGUIbyTextSizeInterface.TextLogMsgField.NAME.getStr() + t.getState().name());
                    idx++;
                    int stackIdx = 0;
                    for (StackTraceElement itemT : nowT) {
                        if (stackIdx > 1
                                || NcfvRunVariables.isOutToLogFileTraceWithPrintFunc()) {

                            String strOutFile = "";
                            if (NcfvRunVariables.isOutToLogFileIncludeFile()) {

                                strOutFile = GiveGUIbyTextSizeInterface.TextLogMsgField.FILENAME.getStr()
                                        + itemT.getFileName();
                            }
                            String strOut
                                    = GiveGUIbyTextSizeInterface.TextLogMsgField.CLASSNAME.getStr()
                                    + itemT.getClassName()
                                    + GiveGUIbyTextSizeInterface.TextLogMsgField.METHODNAME.getStr()
                                    + itemT.getMethodName()
                                    + GiveGUIbyTextSizeInterface.TextLogMsgField.LINENUM.getStr()
                                    + itemT.getLineNumber()
                                    + (itemT.isNativeMethod()
                                    ? GiveGUIbyTextSizeInterface.TextLogMsgField.NATIVE.getStr() : "");

                            strTrace = GiveGUIbyTextSizeInterface.TextLogMsgField.ELEMENTNUM.getStr()
                                    + stackIdx + strOutFile + strOut;
                            stackIdx++;
                        }
                        if (strTrace.length() > 0) {

                            strForLog.put(idx, strTrace);
                        }
                        strTrace = "";
                        idx++;
                    }

                    NcLogFileManager.putToLog(strForLog);
                } else {
                    NcLogFileManager.putToLogStr(strTimeAndMsg);
                }
            }
        }

        /**
         * Find disk with maximum avalable space and not ReadOnly for make index
         * work directory
         *
         * @return index of record in class NcDiskInfo
         */
        protected static FuncFSInterface.FileSystemAboutFromOS getNcDiskInfoForMaxFreeSpace() {

            FuncFSInterface.FileSystemAboutFromOS ncDisk = new FuncFSInterface.FileSystemAboutFromOS();
            long tmpFreeSpace = 0;
            TreeMap<Long, FuncFSInterface.FileSystemAboutFromOS> sysDisk = FuncFSInterface.OSParamJournalDisk.getFromJournalDiskOrCreateIt();
            if (!sysDisk.isEmpty()) {
                for (Map.Entry<Long, FuncFSInterface.FileSystemAboutFromOS> nccd : sysDisk.entrySet()) {
                    if (!nccd.getValue().isReadonly) {
                        if (tmpFreeSpace < nccd.getValue().availSpace) {
                            tmpFreeSpace = nccd.getValue().availSpace;
                            ncDisk = nccd.getValue();
                        }
                    }
                }
                return ncDisk;
            }
            return ncDisk;
        }

        /**
         *
         * @return
         */
        protected static boolean isWindows() {
            return FuncFSInterface.WhatSayOSAboutOS.isWindows();
        }

        /**
         *
         * @return
         */
        protected static boolean isMac() {
            return FuncFSInterface.WhatSayOSAboutOS.isMac();
        }

        /**
         *
         * @return
         */
        protected static boolean isUnix() {
            FuncFSInterface.WhatSayOSAboutOS.isUnix();
        }

        /**
         *
         * @param bytes
         * @return
         */
        protected static String toHex(byte[] bytes) {
            return DatatypeConverter.printHexBinary(bytes);
        }

        protected static void strArrToConsoleOutPut(String[] strArrForOutPut) {
            for (int i = 0; i < strArrForOutPut.length; i++) {
                NcAppHelper.outMessage(
                        GiveGUIbyTextSizeInterface.TextLogMsgField.INFO.getStr()
                        + i + "\t" + strArrForOutPut[i]);
            }
        }

        protected static String getThreadInfoToString(Thread forStrBuild) {
            ThreadGroup threadGroup = forStrBuild.getThreadGroup();
            String nameThreadGroup = threadGroup.getName();
            int activeCountThreadGroup = threadGroup.activeCount();
            int activeGroupCount = threadGroup.activeGroupCount();
            Class<?> aClass = forStrBuild.getClass();
            return GiveGUIbyTextSizeInterface.TextLogMsgField.INFO.getStr()
                    + GiveGUIbyTextSizeInterface.TextLogMsgField.THREAD_GROUP_NAME.getStr()
                    + nameThreadGroup
                    + GiveGUIbyTextSizeInterface.TextLogMsgField.ACTIVE.getStr()
                    + GiveGUIbyTextSizeInterface.TextLogMsgField.COUNT.getStr()
                    + String.valueOf(activeCountThreadGroup)
                    + GiveGUIbyTextSizeInterface.TextLogMsgField.ACTIVE.getStr()
                    + GiveGUIbyTextSizeInterface.TextLogMsgField.GROUP.getStr()
                    + GiveGUIbyTextSizeInterface.TextLogMsgField.COUNT.getStr()
                    + String.valueOf(activeGroupCount)
                    + GiveGUIbyTextSizeInterface.TextLogMsgField.THREAD.getStr()
                    + GiveGUIbyTextSizeInterface.TextLogMsgField.ID.getStr()
                    + String.valueOf(forStrBuild.getId())
                    + GiveGUIbyTextSizeInterface.TextLogMsgField.PRIORITY.getStr()
                    + String.valueOf(forStrBuild.getPriority())
                    + GiveGUIbyTextSizeInterface.TextLogMsgField.NAME.getStr()
                    + forStrBuild.getName()
                    + GiveGUIbyTextSizeInterface.TextLogMsgField.CANONICALNAME.getStr()
                    + aClass.getCanonicalName()
                    + GiveGUIbyTextSizeInterface.TextLogMsgField.GENERICSTRING.getStr()
                    + aClass.toGenericString();
        }

        protected static String getClassInfoToString(Class<?> forStrBuild) {
            return GiveGUIbyTextSizeInterface.TextLogMsgField.INFO.getStr()
                    + GiveGUIbyTextSizeInterface.TextLogMsgField.CLASSNAME.getStr()
                    + forStrBuild.getName()
                    + GiveGUIbyTextSizeInterface.TextLogMsgField.TYPENAME.getStr()
                    + forStrBuild.getTypeName()
                    + GiveGUIbyTextSizeInterface.TextLogMsgField.CANONICALNAME.getStr()
                    + forStrBuild.getCanonicalName()
                    + GiveGUIbyTextSizeInterface.TextLogMsgField.GENERICSTRING.getStr()
                    + forStrBuild.toGenericString();
        }

        protected static void outCreateObjectMessage(String strMsg, Class<?> forStrBuild) {
            String classInfoToString = NcAppHelper.getClassInfoToString(forStrBuild);
            NcAppHelper.outMessage(GiveGUIbyTextSizeInterface.TextLogMsgField.INFO.getStr()
                    + GiveGUIbyTextSizeInterface.TextLogMsgField.CREATE.getStr()
                    + strMsg
                    + classInfoToString);
        }

        /**
         *
         * @param msgForOut
         * @param appConstantsParam
         */
        protected static void outToConsoleIfDevAndParamTrue(String msgForOut, Boolean appConstantsParam) {
            if ((AppConstants.LOG_LEVEL_CURRENT > AppConstants.LOG_LEVEL_DEBUG) && appConstantsParam) {
                System.out.println(msgForOut);
            }
        }
    }

    public class NcfvRunVariables {

        NcfvRunVariables() {
        }

        protected static boolean isLALRNcSwPanelLineStartgetPanel() {
            return Boolean.FALSE;
        }

        protected static boolean isLALRNcSwPanelLineEndgetPanel() {
            return Boolean.FALSE;
        }
    }

    public class NcThWorkerUpGUITreeState {

        NcThWorkerUpGUITreeState() {
        }

        protected static void stateTreeAddChildren(NcSwGUIComponentStatus lComp) {
        }
    }

    /**
     *
     * @author wladimirowichbiaran
     */
    public class NcThWorkerUpGUIKeyWordSearch {

        protected static void searchKeyWordGetResult(NcSwGUIComponentStatus lComp) {

            String strPathTable
                    = NcSwGUIComponentRouter.pathMainFramePanelCenterTable();
            JTable tableShowSearchResult = (JTable) lComp.getComponentByPath(strPathTable);

            tableShowSearchResult.setEnabled(false);
            TableModel modelShowStack = tableShowSearchResult.getModel();
            String componentPath = NcSwGUIComponentRouter.pathMainFramePanelPageStartTextFieldSearch();
            JTextField textField = (JTextField) lComp.getComponentByPath(componentPath);
            String strSrch = textField.getText();

            componentPath = NcSwGUIComponentRouter.pathMainFramePanelPageStartButtonSearch();
            JButton buttonSearch = (JButton) lComp.getComponentByPath(componentPath);
            buttonSearch.setEnabled(false);

            componentPath = NcSwGUIComponentRouter.pathMainFramePanelPageEndProgressBar();
            JProgressBar progressBar = (JProgressBar) lComp.getComponentByPath(componentPath);
            progressBar.setIndeterminate(true);

            componentPath = NcSwGUIComponentRouter.pathMainFramePanelCenter();
            JPanel panelLineEnd = (JPanel) lComp.getComponentByPath(componentPath);
            panelLineEnd.repaint();

            TreeMap<Long, GiveTextStructureInterface.GetStructureDirListToFileAttr> makeSearchResult
                    = new TreeMap<Long, GiveTextStructureInterface.GetStructureDirListToFileAttr>();

            SwingWorker<Void, TreeMap<Long, GiveTextStructureInterface.GetStructureDirListToFileAttr>> underGroundWorker
                    = new SwingWorker<Void, TreeMap<Long, GiveTextStructureInterface.GetStructureDirListToFileAttr>>() {

                @Override
                protected Void doInBackground() {
                    TreeMap<Long, GiveTextStructureInterface.GetStructureDirListToFileAttr> makeSearchByKeyFromInput
                            = NcSrchGetResult.class.makeSearchByKeyFromInput(strSrch);
                    publish(makeSearchByKeyFromInput);
                    return null;
                }

                @Override
                protected void process(List<TreeMap<Long, GiveTextStructureInterface.GetStructureDirListToFileAttr>> chunks) {
                    for (TreeMap<Long, GiveTextStructureInterface.GetStructureDirListToFileAttr> item : chunks) {
                        makeSearchResult.putAll(item);
                    }

                }

                @Override
                protected void done() {
                    progressBar.setIndeterminate(false);
                    TableModel locNewTableModel = new NcSIMASearchResultTableModel(makeSearchResult);
                    tableShowSearchResult.setModel(locNewTableModel);
                    tableShowSearchResult.setEnabled(true);
                    buttonSearch.setEnabled(true);
                    String componentPath = NcSwGUIComponentRouter.pathMainFramePanelCenter();
                    JPanel panelCenter = (JPanel) lComp.getComponentByPath(componentPath);
                    panelCenter.repaint();

                }

            };
            underGroundWorker.execute();
        }
    }

    /**
     *
     * @author wladimirowichbiaran
     */
    public class NcSrchGetResult {

        /**
         * Used in
         * <ul>
         * <li>{@link ru.newcontrol.ncfv.Ncfv#main(java.lang.String[]) }
         * </ul>
         *
         * @param strInputedKeyWord
         */
        protected static void outToConsoleSearchByKeyFromInput(String strInputedKeyWord) {
            TreeMap<Long, GiveTextStructureInterface.GetStructureDirListToFileAttr> searchedData;
            searchedData = makeSearchByKeyFromInput(strInputedKeyWord);
            for (Map.Entry<Long, GiveTextStructureInterface.GetStructureDirListToFileAttr> itemReaded : searchedData.entrySet()) {
                NcAppHelper.outMessageToConsole(itemReaded.getValue().path);
            }
        }

        /**
         * Used in
         * <ul>
         * <li>{@link ru.newcontrol.ncfv.NcSIMASearchResultTableModel#NcSIMASearchResultTableModel(java.lang.String)
         * }
         * <li>
         * <li>{@link ru.newcontrol.ncfv.NcSrchGetResult#outToConsoleSearchByKeyFromInput(java.lang.String)
         * }
         * </ul>
         *
         * @param strForSearch
         * @return
         */
        protected static TreeMap<Long, GiveTextStructureInterface.GetStructureDirListToFileAttr> makeSearchByKeyFromInput(String strForSearch) {
            TreeMap<Long, GiveTextStructureInterface.GetStructureWordToFile> strHexForInVar = new TreeMap<Long, GiveTextStructureInterface.GetStructureWordToFile>();
            TreeMap<Long, GiveTextStructureInterface.GetStructureWordToFile> strDistInResult = new TreeMap<Long, GiveTextStructureInterface.GetStructureWordToFile>();

            strHexForInVar.putAll(NcSrchKeyWordInput.getDirListRecordByKeyWord(strForSearch));
            strDistInResult = NcSrchFileDataCompare.getDistictIDs(strHexForInVar);

            TreeMap<Long, GiveTextStructureInterface.GetStructureDirListToFileAttr> readedData = new TreeMap<Long, GiveTextStructureInterface.GetStructureDirListToFileAttr>();

            readedData.putAll(NcIdxDirListManager.getByListIDs(strDistInResult));

            return readedData;
        }

        /**
         * Used in
         * <ul>
         * <li>{@link ru.newcontrol.ncfv.Ncfv#main(java.lang.String[]) }
         * </ul>
         */
        protected static void outToConsoleSearchByKeyFromFile() {
            TreeMap<Long, GiveTextStructureInterface.GetStructureDirListToFileAttr> searchedData;
            searchedData = makeSearchByKeyFromFile();
            for (Map.Entry<Long, GiveTextStructureInterface.GetStructureDirListToFileAttr> itemReaded : searchedData.entrySet()) {
                NcAppHelper.outMessageToConsole(itemReaded.getValue().path);
            }
        }

        /**
         * Used in
         * <ul>
         * <li>{@link ru.newcontrol.ncfv.NcSIMASearchResultTableModel#NcSIMASearchResultTableModel()
         * }
         * <li>{@link ru.newcontrol.ncfv.NcSIMASearchResultTableModel#NcSIMASearchResultTableModel(java.util.ArrayList, java.util.ArrayList)
         * }
         * <li>
         * <li>{@link ru.newcontrol.ncfv.NcSrchGetResult#outToConsoleSearchByKeyFromFile()
         * }
         * </ul>
         * Get KeyWordIn(Out)Search from file and output serch results
         *
         * @return
         */
        protected static TreeMap<Long, GiveTextStructureInterface.GetStructureDirListToFileAttr> makeSearchByKeyFromFile() {
            TreeMap<Long, GiveTextStructureInterface.GetStructureWordToFile> strHexForInVar = new TreeMap<Long, GiveTextStructureInterface.GetStructureWordToFile>();
            TreeMap<Long, GiveTextStructureInterface.GetStructureWordToFile> strHexForOutVar = new TreeMap<Long, GiveTextStructureInterface.GetStructureWordToFile>();
            TreeMap<Long, GiveTextStructureInterface.GetStructureWordToFile> strDistInResult = new TreeMap<Long, GiveTextStructureInterface.GetStructureWordToFile>();
            TreeMap<Long, GiveTextStructureInterface.GetStructureWordToFile> strDistOutResult = new TreeMap<Long, GiveTextStructureInterface.GetStructureWordToFile>();

            ArrayList<String> arrKeyWordInSearch = NcEtcKeyWordListManager.getKeyWordInSearchFromFile();
            for (String strItemIn : arrKeyWordInSearch) {
                strHexForInVar.putAll(NcSrchKeyWordInput.getDirListRecordByKeyWord(strItemIn));
            }

            strDistInResult = NcSrchFileDataCompare.getDistictIDs(strHexForInVar);

            ArrayList<String> arrKeyWordOutSearch = NcEtcKeyWordListManager.getKeyWordOutSearchFromFile();
            for (String strItemOut : arrKeyWordOutSearch) {
                strHexForOutVar.putAll(NcSrchKeyWordInput.getDirListRecordByKeyWord(strItemOut));
            }

            strDistOutResult = NcSrchFileDataCompare.getDistictIDs(strHexForOutVar);

            TreeMap<Long, GiveTextStructureInterface.GetStructureWordToFile> CleanResult = NcSrchFileDataCompare.getIdInWithoutOfOutSearchResult(strDistInResult, strDistOutResult);

            TreeMap<Long, GiveTextStructureInterface.GetStructureDirListToFileAttr> readedData = new TreeMap<Long, GiveTextStructureInterface.GetStructureDirListToFileAttr>();

            readedData.putAll(NcIdxDirListManager.getByListIDs(CleanResult));

            return readedData;
        }

        /**
         * Not used
         *
         * @param strHexForInVar
         */
        private static void outToConsoleSearchedIDs(TreeMap<Long, GiveTextStructureInterface.GetStructureWordToFile> strHexForInVar) {
            for (Map.Entry<Long, GiveTextStructureInterface.GetStructureWordToFile> itemID : strHexForInVar.entrySet()) {
                NcAppHelper.outMessageToConsole("id: " + itemID.getValue().dirListID);
            }

        }

        /**
         * Not used
         *
         * @param strHexForInVar
         * @param strHexForOutVar
         */
        private static void outSearchResult(TreeMap<Long, GiveTextStructureInterface.GetStructureWordToFile> strHexForInVar, TreeMap<Long, GiveTextStructureInterface.GetStructureWordToFile> strHexForOutVar) {
            TreeMap<Long, GiveTextStructureInterface.GetStructureWordToFile> CleanResult = NcSrchFileDataCompare.getIdInWithoutOfOutSearchResult(strHexForInVar, strHexForOutVar);
            NcAppHelper.outMessage(
                    GiveGUIbyTextSizeInterface.TextLogMsgField.INFO.getStr()
                    + GiveGUIbyTextSizeInterface.TextPathElement.CLEAN_RESULT.getStr()
                    + GiveGUIbyTextSizeInterface.TextServiceMsg.COUNT_OF_SEARCHED_RECORDS.getStr() + CleanResult.size());
        }
    }

    public class NcIdxDirListManager {

        NcIdxDirListManager() {
        }

        protected static TreeMap<Long, GiveTextStructureInterface.GetStructureDirListToFileAttr> getByListIDs(TreeMap<Long, GiveTextStructureInterface.GetStructureWordToFile> CleanResult) {
            return new TreeMap<Long, GiveTextStructureInterface.GetStructureDirListToFileAttr>();
        }

    }

    public class NcSrchFileDataCompare {

        NcSrchFileDataCompare() {
        }

        protected static TreeMap<Long, GiveTextStructureInterface.GetStructureWordToFile> getDistictIDs(TreeMap<Long, GiveTextStructureInterface.GetStructureWordToFile> strHexForOutVar) {
            return new TreeMap<Long, GiveTextStructureInterface.GetStructureWordToFile>();
        }

        protected static TreeMap<Long, GiveTextStructureInterface.GetStructureWordToFile> getIdInWithoutOfOutSearchResult(TreeMap<Long, GiveTextStructureInterface.GetStructureWordToFile> strHexForInVar, TreeMap<Long, GiveTextStructureInterface.GetStructureWordToFile> strHexForOutVar) {
            return new TreeMap<Long, GiveTextStructureInterface.GetStructureWordToFile>();
        }

    }

}
