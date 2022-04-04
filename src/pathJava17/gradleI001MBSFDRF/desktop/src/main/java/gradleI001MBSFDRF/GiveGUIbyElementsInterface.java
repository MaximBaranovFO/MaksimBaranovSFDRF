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
/**
 *
 * @author Администратор
 */
public interface GiveGUIbyElementsInterface {









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
     * @return
     */
    protected static JPanel getPanel(NcSwGUIComponentStatus lComp){
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
     * @return
     */
    protected static JPanel getPanel(NcSwGUIComponentStatus lComp){
        JPanel lineEndPanel = getPanelTreeShowStack(lComp);
        return lineEndPanel;
    }
    
    private static JPanel getPanelTreeShowStack(NcSwGUIComponentStatus lComp){
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
    
    private static JPanel getSearchKeyWordManagePanel(NcSwGUIComponentStatus lComp){
        String[] forTextToolTip = {
            "For search with keyword, input it and press \"+\" Button",
            "For search with out keyword, input it and press \"+\" Button",
            "Help about keyword in Search",
            "Help about keyword out of Search",
        };
        String[] forComponentText = {
            "How to use",
        };
    
        Dimension textFiledForSearchDimension = new Dimension(100, 20);        
        
        JPanel eastPanel = new JPanel();
        String componentPath = NcSwGUIComponentRouter.pathMainFramePanelLineEnd();
        lComp.putComponents(componentPath, eastPanel);
        Border eastBorder = BorderFactory.createTitledBorder("EAST panel");
        eastPanel.setBorder(eastBorder);
        eastPanel.setLayout(new BoxLayout(eastPanel, BoxLayout.PAGE_AXIS));
        
        eastPanel.setAlignmentX(JComponent.TOP_ALIGNMENT);
        eastPanel.setAlignmentY(JComponent.CENTER_ALIGNMENT);
        
        JButton ncHowToInSearch = NcSwGUIComponent.createButton(
                forComponentText[0],null,forTextToolTip[2]);
        
        eastPanel.add(ncHowToInSearch);
        
        JPanel textInSearchPanel = NcSwGUIComponent.getTextFieldForSearchPanel(
                textFiledForSearchDimension, forTextToolTip[0]);
        eastPanel.add(textInSearchPanel);
        
        eastPanel.add(getAndOrButtonPanel());
        
        JList wiSearch = NcSwGUIComponent.createJListWordInSearch();
        JScrollPane wiScroll = new JScrollPane(wiSearch);
        wiScroll.setPreferredSize(new Dimension(100, 100));
        
        eastPanel.add(wiScroll);
        
        JPanel buttonPanel1 = getAddDelButtonPanel();
        eastPanel.add(buttonPanel1);
        
        JSeparator ncSeparator = new JSeparator(JSeparator.HORIZONTAL);
        eastPanel.add(ncSeparator);
        
        eastPanel.add(NcSwGUIComponent.createButton(
                forComponentText[0],null,forTextToolTip[3]));
        
        JPanel textOutSearchPanel = NcSwGUIComponent.getTextFieldForSearchPanel(
                textFiledForSearchDimension, forTextToolTip[1]);
        eastPanel.add(textOutSearchPanel);
        
        eastPanel.add(getAndOrButtonPanel());
        
        JList wniSearch = NcSwGUIComponent.createJListWordNotInSearch();
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
     * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineEnd#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * </ul>
     * @return
     */
    private static JPanel getAndOrButtonPanel(){
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.add(NcSwGUIComponent.createButton("&&",null,""));
        buttonPanel.add(NcSwGUIComponent.createButton("||",null,""));
        return buttonPanel;
    }    

    /**
     * Used in
     * <ul>
     * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineEnd#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * </ul>
     * @return
     */
    private static JPanel getAddDelButtonPanel(){
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.add(NcSwGUIComponent.createButton("+",null,""));
        buttonPanel.add(NcSwGUIComponent.createButton("-",null,""));
        return buttonPanel;
    }
    /**
     * Used in
     * <ul>
     * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineEnd#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * </ul>
     * LogAppLogicRecord (LALR) - toLALR(class MethodName)
     * make record in log file
     * @return
     */
    private static void toLALRgetPanel(){
        if( NcfvRunVariables.isLALRNcSwPanelLineEndgetPanel() ){
            String strLogMsg = NcStrLogMsgField.INFO.getStr()
                + NcStrLogMsgField.APP_LOGIC_NOW.getStr()
                + NcStrLogLogicVar.LA_JPANEL_LINEEND.getStr()
                + NcStrLogMsgField.APP_LOGIC_NEXT_WAY_VAR.getStr()
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
     * @return
     */
    protected static JPanel getPanel(NcSwGUIComponentStatus lComp){
        JPanel westPanel = new JPanel();
        String componentPath = NcSwGUIComponentRouter.pathMainFramePanelLineStart();
        lComp.putComponents(componentPath, westPanel);
        Border westBorder = BorderFactory.createTitledBorder("WEST panel");
        westPanel.setBorder(westBorder);
        westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.PAGE_AXIS));
        
        ArrayList<JButton> ncAllDisk = NcSwGUIComponent.getRootButtons(lComp);

        for(JButton itemDisk : ncAllDisk){
            westPanel.add(itemDisk);
            toLALRgetPanel();
        }
        return westPanel;
    }
    /**
     * Used in
     * <ul>
     * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineStart#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * </ul>
     * LogAppLogicRecord (LALR) - toLALR(class MethodName)
     * make record in log file
     */
    private static void toLALRgetPanel(){
        if( NcfvRunVariables.isLALRNcSwPanelLineStartgetPanel() ){
            String strLogMsg = NcStrLogMsgField.INFO.getStr()
                + NcStrLogMsgField.APP_LOGIC_NOW.getStr()
                + NcStrLogLogicVar.LA_PANEL_LINESTART.getStr()
                + NcStrLogMsgField.APP_LOGIC_NEXT_WAY_VAR.getStr()
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
     * @return
     */
    protected static JPanel getPanel(NcSwGUIComponentStatus lComp){
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
        
        buttonGetStack.addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent e){
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
     * <li>{@link ru.newcontrol.ncfv.NcSwPanelPageEnd#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * </ul>
     * LogAppLogicRecord (LALR) - toLALR(class MethodName)
     * make record in log file
     */
    private static void toLALRgetPanel(){
        if( NcfvRunVariables.isLALRNcSwPanelPageEndgetPanel() ){
            String strLogMsg = NcStrLogMsgField.INFO.getStr()
                + NcStrLogMsgField.APP_LOGIC_NOW.getStr()
                + NcStrLogLogicVar.LA_JPANEL_PAGEEND.getStr()
                + NcStrLogMsgField.APP_LOGIC_NEXT_WAY_VAR.getStr()
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
     * @return
     */
    protected static JPanel getPanel(NcSwGUIComponentStatus lComp){
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
        JButton btnSearch = NcSwGUIComponent.createButton("Search",null,"");
        componentPath = NcSwGUIComponentRouter.pathMainFramePanelPageStartButtonSearch();
        lComp.putComponents(componentPath, btnSearch);
        
        btnSearch.addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent e){
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
     * <li>{@link ru.newcontrol.ncfv.NcSwPanelPageStart#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * </ul>
     * LogAppLogicRecord (LALR) - toLALR(class MethodName)
     * make record in log file
     */
    private static void toLALRgetPanel(){
        if( NcfvRunVariables.isLALRNcSwPanelPageStartgetPanel() ){
            String strLogMsg = NcStrLogMsgField.INFO.getStr()
                + NcStrLogMsgField.APP_LOGIC_NOW.getStr()
                + NcStrLogLogicVar.LA_JPANEL_PAGESTART.getStr()
                + NcStrLogMsgField.APP_LOGIC_NEXT_WAY_VAR.getStr()
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
    protected static JProgressBar addProgressBar(NcSwGUIComponentStatus lComp){
        String componentPath = 
                NcSwGUIComponentRouter.pathMainFramePanelPageEndProgressBar();
        JProgressBar progressBar = NcSwGUIComponent.getProgressBar();
        lComp.putComponents(componentPath,
            progressBar);
        return progressBar;
    }
    /**
     * 
     * @param lComp 
     */
    protected static void indicationStartProgressBar(NcSwGUIComponentStatus lComp){
        String componentPath = 
                NcSwGUIComponentRouter.pathMainFramePanelPageEndProgressBar();
        JProgressBar progressBar = (JProgressBar) lComp.getComponentByPath(componentPath);
        progressBar.setIndeterminate(true);
    }
    /**
     * 
     * @param lComp 
     */
    protected static void indicationStopProgressBar(NcSwGUIComponentStatus lComp){
        String componentPath = 
                NcSwGUIComponentRouter.pathMainFramePanelPageEndProgressBar();
        JProgressBar progressBar = 
                (JProgressBar) lComp.getComponentByPath(componentPath);
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
     * <li>{@link ru.newcontrol.ncfv.NcSwModalLogViewer#getDialogLogViewer(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * <li>
     * <li>{@link ru.newcontrol.ncfv.NcSwingIndexManagerApp#createGui() }
     * </ul>
     */
    protected NcSwGUIComponentStatus(){
        modalLogView = new TreeMap<Integer, Component>();
    }
    /**
     * Not used
     * @return 
     */
    protected TreeMap<Integer, Component> getComponentsList(){
        return modalLogView;
    }
    /**
     * Used in
     * <ul>
     * <li>{@link ru.newcontrol.ncfv.NcSwMenuItems#getEnvironmentViewer(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * <li>{@link ru.newcontrol.ncfv.NcSwMenuItems#getPropertiesViewer(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * <li>
     * <li>{@link ru.newcontrol.ncfv.NcSwModalLogViewer#getDialogLogViewer(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * <li>{@link ru.newcontrol.ncfv.NcSwModalLogViewer#getButtonUpdate(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * <li>
     * <li>{@link ru.newcontrol.ncfv.NcSwThreadManager#setToViewSearchedResult(ru.newcontrol.ncfv.NcSwGUIComponentStatus, java.lang.String) }
     * </ul>
     * @param typeToGet
     * @return 
     */
    protected Component getComponentByPath(String typeToGet){
        return modalLogView.get(typeToGet.hashCode());
    }
    /**
     * Used in
     * <ul>
     * <li>{@link ru.newcontrol.ncfv.NcSwModalLogViewer#getDialogLogViewer(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * <li>{@link ru.newcontrol.ncfv.NcSwModalLogViewer#getPanelCenter(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * <li>{@link ru.newcontrol.ncfv.NcSwModalLogViewer#getScrolledTree(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * <li>
     * <li>{@link ru.newcontrol.ncfv.NcSwPanelCenter#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * <li>
     * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineEnd#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * <li>
     * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineStart#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * <li>
     * <li>{@link ru.newcontrol.ncfv.NcSwPanelPageEnd#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * <li>
     * <li>{@link ru.newcontrol.ncfv.NcSwPanelPageStart#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * <li>
     * <li>{@link ru.newcontrol.ncfv.NcSwingIndexManagerApp#createGui() }
     * </ul>
     * @param typeToAdd
     * @param compToAdd 
     */
    protected void putComponents(String typeToAdd, Component compToAdd){
        if( modalLogView == null ){
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
    protected static String pathMainFrame(){
        return NcStrGUIComponent.SMAIN.getStr()
                + NcStrGUIComponent.SJFRAME.getStr();
    }
    /**
     * 
     * @return 
     */
    protected static String pathMainFramePanel(){
        return NcStrGUIComponent.SMAIN.getStr()
                + NcStrGUIComponent.SJFRAME.getStr()
                + NcStrGUIComponent.SJPANEL.getStr();
    }
    /**
     * 
     * @return 
     */
    protected static String pathMainFramePanelLineStart(){
        return NcStrGUIComponent.SMAIN.getStr()
                + NcStrGUIComponent.SJFRAME.getStr()
                + NcStrGUIComponent.SJPANEL.getStr()
                + NcStrGUIComponent.SLINESTART.getStr();
    }
    /**
     * 
     * @return 
     */
    protected static String pathMainFramePanelLineEnd(){
        return NcStrGUIComponent.SMAIN.getStr()
                + NcStrGUIComponent.SJFRAME.getStr()
                + NcStrGUIComponent.SJPANEL.getStr()
                + NcStrGUIComponent.SLINEEND.getStr();
    }
    /**
     * 
     * @return 
     */
    protected static String pathMainFramePanelLineEndTabbedPane(){
        return pathMainFramePanelLineEnd()
            + NcStrGUIComponent.SJTABBEDPANE.getStr();
    }
    /**
     * 
     * @return 
     */
    protected static String pathMainFramePanelLineEndTabbedPaneStack(){
        return pathMainFramePanelLineEndTabbedPane()
            + NcStrGUIComponent.SSTACK.getStr();
    }
    /**
     * 
     * @return 
     */
    protected static String pathMainFramePanelLineEndTabbedPaneWork(){
        return pathMainFramePanelLineEndTabbedPane()
            + NcStrGUIComponent.SWORK.getStr();
    }
    /**
     * 
     * @return 
     */
    protected static String pathMainFramePanelLineEndTabbedPaneOutput(){
        return pathMainFramePanelLineEndTabbedPane()
            + NcStrGUIComponent.SOUTPUT.getStr();
    }
    /**
     * 
     * @return 
     */
    protected static String pathMainFramePanelLineEndTabbedPaneStackScrollPane(){
        return pathMainFramePanelLineEndTabbedPaneStack()
                + NcStrGUIComponent.SJSCROLLPANE.getStr();
    }
    /**
     * 
     * @return 
     */
    protected static String pathMainFramePanelLineEndTabbedPaneWorkScrollPane(){
        return pathMainFramePanelLineEndTabbedPaneWork()
                + NcStrGUIComponent.SJSCROLLPANE.getStr();
    }
    /**
     * 
     * @return 
     */
    protected static String pathMainFramePanelLineEndTabbedPaneOutputScrollPane(){
        return pathMainFramePanelLineEndTabbedPaneOutput()
                + NcStrGUIComponent.SJSCROLLPANE.getStr();
    }
    /**
     * 
     * @return 
     */
    protected static String pathMainFramePanelLineEndTabbedPaneStackScrollPaneTreeShowStack(){
        return pathMainFramePanelLineEndTabbedPaneStackScrollPane()
                + NcStrGUIComponent.SJTREE.getStr();
    }
    /**
     * 
     * @return 
     */
    protected static String pathMainFramePanelLineEndTabbedPaneWorkScrollPaneTreeShowWork(){
        return pathMainFramePanelLineEndTabbedPaneWorkScrollPane()
                + NcStrGUIComponent.SJTREE.getStr();
    }
    /**
     * 
     * @return 
     */
    protected static String pathMainFramePanelLineEndTabbedPaneOutputScrollPaneTreeShowOutput(){
        return pathMainFramePanelLineEndTabbedPaneOutputScrollPane()
                + NcStrGUIComponent.SJTREE.getStr();
    }
    /**
     * 
     * @return 
     */
    protected static String pathMainFramePanelPageStart(){
        return NcStrGUIComponent.SMAIN.getStr()
                + NcStrGUIComponent.SJFRAME.getStr()
                + NcStrGUIComponent.SJPANEL.getStr()
                + NcStrGUIComponent.SPAGESTART.getStr();
    }
    /**
     * 
     * @return 
     */
    protected static String pathMainFramePanelPageStartTextFieldSearch(){
        return NcStrGUIComponent.SMAIN.getStr()
                + NcStrGUIComponent.SJFRAME.getStr()
                + NcStrGUIComponent.SJPANEL.getStr()
                + NcStrGUIComponent.SPAGESTART.getStr()
                + NcStrGUIComponent.STEXTFIELD.getStr()
                + NcStrGUIComponent.SSEARCH.getStr();
    }
    /**
     * 
     * @return 
     */
    protected static String pathMainFramePanelPageStartButtonSearch(){
        return NcStrGUIComponent.SMAIN.getStr()
                + NcStrGUIComponent.SJFRAME.getStr()
                + NcStrGUIComponent.SJPANEL.getStr()
                + NcStrGUIComponent.SPAGESTART.getStr()
                + NcStrGUIComponent.SJBUTTON.getStr()
                + NcStrGUIComponent.SSEARCH.getStr();
    }
    /**
     * 
     * @return 
     */
    protected static String pathMainFramePanelPageEnd(){
        return NcStrGUIComponent.SMAIN.getStr()
                + NcStrGUIComponent.SJFRAME.getStr()
                + NcStrGUIComponent.SJPANEL.getStr()
                + NcStrGUIComponent.SPAGEEND.getStr();
    }
    /**
     * 
     * @return 
     */
    protected static String pathMainFramePanelPageEndButtonGetStack(){
        return NcStrGUIComponent.SMAIN.getStr()
                + NcStrGUIComponent.SJFRAME.getStr()
                + NcStrGUIComponent.SJPANEL.getStr()
                + NcStrGUIComponent.SPAGEEND.getStr()
                + NcStrGUIComponent.SJBUTTON.getStr()
                + NcStrGUIComponent.SSTACK.getStr();
    }
    /**
     * 
     * @return 
     */
    protected static String pathMainFramePanelPageEndProgressBar(){
        String componentPath = NcStrGUIComponent.SMAIN.getStr()
            + NcStrGUIComponent.SJFRAME.getStr()
            + NcStrGUIComponent.SJPANEL.getStr()
            + NcStrGUIComponent.SPAGEEND.getStr()
            + NcStrGUIComponent.SJPROGRESSBAR.getStr();
        return componentPath;
    }
    /**
     * 
     * @return 
     */
    protected static String pathMainFramePanelPageEndButton(){
        String componentPath = NcStrGUIComponent.SMAIN.getStr()
            + NcStrGUIComponent.SJFRAME.getStr()
            + NcStrGUIComponent.SJPANEL.getStr()
            + NcStrGUIComponent.SPAGEEND.getStr()
            + NcStrGUIComponent.SJBUTTON.getStr();
        return componentPath;
    }
    /**
     * 
     * @return 
     */
    protected static String pathMainFramePanelCenter(){
        return NcStrGUIComponent.SMAIN.getStr()
                + NcStrGUIComponent.SJFRAME.getStr()
                + NcStrGUIComponent.SJPANEL.getStr()
                + NcStrGUIComponent.SCENTER.getStr();
    }
    /**
     * 
     * @return 
     */
    protected static String pathMainFramePanelCenterTable(){
        return NcStrGUIComponent.SMAIN.getStr()
            + NcStrGUIComponent.SJFRAME.getStr()
            + NcStrGUIComponent.SJPANEL.getStr()
            + NcStrGUIComponent.SCENTER.getStr()
            + NcStrGUIComponent.SJTABLE.getStr();
    }
}
/**
 *
 * @author wladimirowichbiaran
 */
public enum NcStrGUIComponent {
    SMAIN("MAIN"),
    SMODAL("MODAL"),
    SENVIRONMENT("ENVIRONMENT"),
    SPROPERTIES("PROPERTIES"),
    SLOGVIEW("LOGVIEW"),
    
    SCENTER("CENTER"),
    SPAGESTART("PAGESTART"),
    SPAGEEND("PAGEEND"),
    SLINESTART("LINESTART"),
    SLINEEND("LINEEND"),
    
    SJCOMPONENT("JCOMPONENT"),
    SJSCROLLPANE("JSCROLLPANE"),
    SJFRAME("JFRAME"),
    SJDIALOG("JDIALOG"),
    
    SJMENUBAR("JMENUBAR"),
    SJMENU("JMENU"),
    SJMENUITEM("JMENUITEM"),
    
    SJPANEL("JPANEL"),
    SJTREE("JTREE"),
    SJTABLE("JTABLE"),
    SJTABBEDPANE("JTABBEDPANE"),
    
    
    STEXTFIELD("TEXTFIELD"),
    SJLABEL("JLABEL"),
    SJBUTTON("JBUTTON"),
    SJPROGRESSBAR("JPROGRESSBAR"),
    
    SSEARCH("SEARCH"),
    SSTACK("STACK"),
    SWORK("WORK"),
    SOUTPUT("OUTPUT"),
    SMANAGE("MANAGE"),
    SDIRECTORY("DIRECTORY");
    
    /**
     * Constructor
     */
    private String strMsg;
    NcStrGUIComponent(String strMsg){
        this.strMsg = strMsg;
    }
    /**
     * Used in
     * <ul>
     * <li>{@link ru.newcontrol.ncfv.NcSwMenuItems#getEnvironmentViewer(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * <li>{@link ru.newcontrol.ncfv.NcSwMenuItems#getPropertiesViewer(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * <li>
     * <li>{@link ru.newcontrol.ncfv.NcSwModalLogViewer#getDialogLogViewer(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * <li>
     * <li>{@link ru.newcontrol.ncfv.NcSwPanelCenter#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineEnd#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineStart#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * <li>{@link ru.newcontrol.ncfv.NcSwPanelPageEnd#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * <li>{@link ru.newcontrol.ncfv.NcSwPanelPageStart#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * <li>
     * <li>{@link ru.newcontrol.ncfv.NcSwThreadManager#setToViewSearchedResult(ru.newcontrol.ncfv.NcSwGUIComponentStatus, java.lang.String) }
     * <li>
     * <li>{@link ru.newcontrol.ncfv.NcSwingIndexManagerApp#createGui() }
     * </ul>
     * @return 
     */
    protected String getStr(){
        return strMsg;
    }
}



/**
 *
 * @author wladimirowichbiaran
 */
public class NcSwGUIComponent {
    private static final long ncForGB = 1024*1024*1024;
    /**
     * Used in
     * <ul>
     * <li>{@link ru.newcontrol.ncfv.NcSwPanelPageEnd#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * </ul>
     * @return
     */
    protected static JLabel createEmptyLabel() {
        JLabel label = new JLabel();
        label.setPreferredSize(new Dimension(100, 30));
        return label;
    }
    /**
     * Used in
     * <ul>
     * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineEnd#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * </ul>
     * @param textSize
     * @param strToolTip
     * @return
     */
    protected static JPanel getTextFieldForSearchPanel(Dimension textSize, String strToolTip){
        JPanel textFieldForSearchPanel = new JPanel();
        textFieldForSearchPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JTextField textWordForSearch = new JTextField();
        textWordForSearch.setPreferredSize(textSize);
        textWordForSearch.setToolTipText(strToolTip);
        
        textFieldForSearchPanel.add(textWordForSearch);
        return textFieldForSearchPanel;
    }
    /**
     * Used in
     * <ul>
     * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineStart#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * </ul>
     * @return
     */
    protected static ArrayList<JButton> getRootButtons(NcSwGUIComponentStatus lComp){
        ArrayList<JButton> toReturn = new ArrayList<JButton>();
        
        FileSystemView fileSystemView;
        fileSystemView = FileSystemView.getFileSystemView();
        //File[] ncDisks = fileSystemView.getRoots();
        File[] ncDisks = File.listRoots();
        
        
        for(File itemDisk : ncDisks){
            
            Icon itemIcon = fileSystemView.getSystemIcon(itemDisk);
            String strSysTypeDescription = fileSystemView.getSystemTypeDescription(itemDisk);
            if( "".equals(strSysTypeDescription) || (strSysTypeDescription == null) ){
                if( !NcAppHelper.isWindows() ){
                    strSysTypeDescription = "Root";
                }
            }
            String itemDisplayName = NcIdxFileManager.getStrCanPathFromFile(itemDisk) + " - " +
                    strSysTypeDescription;
            
            if( NcIdxFileManager.getStrCanPathFromFile(itemDisk).length() > 2 ){
                itemDisplayName = NcIdxFileManager.getStrCanPathFromFile(itemDisk).substring(0, 2) + " - " +
                    strSysTypeDescription;
            }
            long ncDriveFreeGb = itemDisk.getFreeSpace()/ncForGB;
            long ncDriveTotalGb = itemDisk.getTotalSpace()/ncForGB;
            
            String itemToolTipText = 
                    "Free: " + ncDriveFreeGb +
                    " Gb Total: " + ncDriveTotalGb + " Gb";
            
            if(ncDriveTotalGb != 0){
                double ncDriveFreePercent = (((double) itemDisk.getFreeSpace() / itemDisk.getTotalSpace()) * 100);
                String strPercent= Double.toString(ncDriveFreePercent).substring(0, 5);
                itemToolTipText = "Free: " + strPercent +
                    " % " + itemToolTipText;
            }
            
            String strDescr = fileSystemView.getSystemDisplayName(itemDisk);
            if(strDescr.length() > 0 ){
                itemToolTipText = strDescr + " " + itemToolTipText;
            }
            
            JButton ncButton = createButton(itemDisplayName, itemIcon, itemToolTipText);
            ncButton.addActionListener(new ActionListener(){
                public void  actionPerformed(ActionEvent e){
                        try {
                            NcThScanListAttr.fsScanListAttr(ncButton, lComp, itemDisk.toPath());
                            //NcThWorkerGUIDirListScan.scanDirToIdxDirList(lComp, itemDisk.toPath());
                        } catch (Exception ex) {
                            NcAppHelper.logException(NcSwGUIComponent.class.getCanonicalName(), ex);
                        }
                    }
                }
            );
            
           
            toReturn.add(ncButton);
        }

        
        return toReturn;
    }

    /**
     * Used in
     * <ul>
     * <li>{@link ru.newcontrol.ncfv.NcSwGUIComponent#getRootButtons() }
     * <li>
     * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineEnd#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineEnd#getAndOrButtonPanel() }
     * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineEnd#getAddDelButtonPanel() }
     * <li>
     * <li>{@link ru.newcontrol.ncfv.NcSwPanelPageStart#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * </ul>
     * @param ncName
     * @param ncIcon
     * @param ncToolTipText
     * @return
     */
    protected static JButton createButton(String ncName, Icon ncIcon, String ncToolTipText) {
        JButton ncButton = new JButton(ncName);
        if(ncIcon != null){
            ncButton.setIcon(ncIcon);
        }
        ncButton.setToolTipText(ncToolTipText);
        return ncButton;
    }

    /**
     * Used in
     * <ul>
     * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineEnd#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * </ul>
     * @return
     */
    protected static JList createJListWordInSearch(){
        DefaultListModel listWordInSearch = new DefaultListModel();
        ArrayList<String> arrKeyIn = 
                NcEtcKeyWordListManager.getKeyWordInSearchFromFile();
        if( arrKeyIn.size() == 0 ){
            listWordInSearch.addElement("* None *");
        }
        else{
            for(String itemKey : arrKeyIn){
                listWordInSearch.addElement(itemKey);
            }
        }
        
        JList ncList = new JList(listWordInSearch);
        ncList.setVisibleRowCount(7);
        ncList.setFocusable(false);
        return ncList;
    }

    /**
     * Used in
     * <ul>
     * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineEnd#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * </ul>
     * @return
     */
    protected static JList createJListWordNotInSearch(){
        DefaultListModel listWordNotInSearch = new DefaultListModel();
        
        ArrayList<String> arrKeyOut = 
                NcEtcKeyWordListManager.getKeyWordOutSearchFromFile();
        if( arrKeyOut.size() == 0 ){
            listWordNotInSearch.addElement("* None *");
        }
        else{
            for(String itemKey : arrKeyOut){
                listWordNotInSearch.addElement(itemKey);
            }
        }
        JList ncList = new JList(listWordNotInSearch);
        ncList.setVisibleRowCount(7);
        ncList.setFocusable(false);
        return ncList;
    }

    /**
     * Not used
     * @param ncJList
     * @return
     */
    private static JList addJListElement(JList ncJList){
        return ncJList;
    }
    /**
     * Used in
     * <ul>
     * <li>{@link ru.newcontrol.ncfv.NcSwStatusPanel#addProgressBar(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * </ul>
     * @return 
     */
    protected static JProgressBar getProgressBar(){
        JProgressBar progressBar = new JProgressBar();
        progressBar.setIndeterminate(false);
        progressBar.setVisible(true);
        return progressBar;
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
    protected static JProgressBar addProgressBar(NcSwGUIComponentStatus lComp){
        String componentPath = 
                NcSwGUIComponentRouter.pathMainFramePanelPageEndProgressBar();
        JProgressBar progressBar = NcSwGUIComponent.getProgressBar();
        lComp.putComponents(componentPath,
            progressBar);
        return progressBar;
    }
    /**
     * 
     * @param lComp 
     */
    protected static void indicationStartProgressBar(NcSwGUIComponentStatus lComp){
        String componentPath = 
                NcSwGUIComponentRouter.pathMainFramePanelPageEndProgressBar();
        JProgressBar progressBar = (JProgressBar) lComp.getComponentByPath(componentPath);
        progressBar.setIndeterminate(true);
    }
    /**
     * 
     * @param lComp 
     */
    protected static void indicationStopProgressBar(NcSwGUIComponentStatus lComp){
        String componentPath = 
                NcSwGUIComponentRouter.pathMainFramePanelPageEndProgressBar();
        JProgressBar progressBar = 
                (JProgressBar) lComp.getComponentByPath(componentPath);
        progressBar.setIndeterminate(false);
    }
    
}



/**
 *
 * @author Администратор
 */

public class NcSIMASearchResultTableModel implements TableModel {
    private Set<TableModelListener> listeners = new HashSet<TableModelListener>();
    private TreeMap<Long, NcDcIdxDirListToFileAttr> ncDirectoryListReader;

    /**
     * Not used
     */
    private NcSIMASearchResultTableModel() {
        ncDirectoryListReader = NcSrchGetResult.makeSearchByKeyFromFile();
    }
    
    /**
     * Used in
     * <ul>
     * <li>{@link ru.newcontrol.ncfv.NcSwThreadManager#setToViewSearchedResult(ru.newcontrol.ncfv.NcSwGUIComponentStatus, java.lang.String) }
     * </ul>
     */
    protected NcSIMASearchResultTableModel(String strSearchInput) {
        ncDirectoryListReader = NcSrchGetResult.makeSearchByKeyFromInput(strSearchInput);
    }
    protected NcSIMASearchResultTableModel(TreeMap<Long, NcDcIdxDirListToFileAttr> ncInFuncData) {
        ncDirectoryListReader = ncInFuncData;
    }
    /**
     * Used in
     * <ul>
     * <li>{@link ru.newcontrol.ncfv.NcSwPanelCenter#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus) }
     * </ul>
     * @param strKeyWordInSearch
     * @param strKeyWordOutSearch
     */
    protected NcSIMASearchResultTableModel(ArrayList<String> strKeyWordInSearch,ArrayList<String>  strKeyWordOutSearch) {
        NcSearchInIndex ncSearchInIndex = new NcSearchInIndex();
        ncDirectoryListReader = NcSrchGetResult.makeSearchByKeyFromFile();
    }
    
    /**
     * Not used
     * @return 
     */
    @Override
    public int getRowCount() {
        return ncDirectoryListReader.size();
    }
    /**
     * Not used
     * @return 
     */
    @Override
    public int getColumnCount() {
        return 16;
    }
    /**
     * Not used
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
     * @param columnIndex
     * @return 
     */
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }
    /**
     * Not used
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
     * @param rowIndex
     * @param columnIndex
     * @return 
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        boolean returnNulls = true;
        NcDcIdxDirListToFileAttr rowForOutPut = null;
        //rowForOutPut = ncDirectoryListReader.entrySet().;
        long rowCounter = 0;
        
        for(Map.Entry<Long, NcDcIdxDirListToFileAttr> itemClean : ncDirectoryListReader.entrySet()){
            if(rowIndex == rowCounter){
                rowForOutPut = itemClean.getValue();
            }
            
            rowCounter++;
        }
        if(rowForOutPut != null){
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
                if( NcAppHelper.isWindows() ){
                    return rowForOutPut.diskLetter + ":\\" + rowForOutPut.path;
                }
                else{
                    return rowForOutPut.path;
                }
                
            case 5:
                if( NcAppHelper.isWindows() ){
                    return (rowForOutPut.diskLetter + ":\\" + rowForOutPut.path).hashCode();
                }
                else{
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
     * @param aValue
     * @param rowIndex
     * @param columnIndex 
     */
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        
    }
    /**
     * Not used
     * @param l 
     */
    @Override
    public void addTableModelListener(TableModelListener l) {
        listeners.add(l);
    }
    /**
     * Not used
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
    protected static JTree getTreeShowStack(NcSwGUIComponentStatus lComp){
        DefaultMutableTreeNode treeTop = 
                new DefaultMutableTreeNode("Stack contained:");
        JTree treeNodes = new JTree(treeTop);
        String pathComponent = 
                NcSwGUIComponentRouter.pathMainFramePanelLineEndTabbedPaneStackScrollPaneTreeShowStack();
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
        DefaultMutableTreeNode treeTop = 
                new DefaultMutableTreeNode("Output contained:");
        JTree treeNodes = new JTree(treeTop);
        String pathComponent = 
                NcSwGUIComponentRouter.pathMainFramePanelLineEndTabbedPaneOutputScrollPaneTreeShowOutput();
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
        DefaultMutableTreeNode treeTop = 
                new DefaultMutableTreeNode("Work contained:");
        JTree treeNodes = new JTree(treeTop);
        String pathComponent = 
                NcSwGUIComponentRouter.pathMainFramePanelLineEndTabbedPaneWorkScrollPaneTreeShowWork();
        lComp.putComponents(pathComponent, treeNodes);
        return treeNodes;
    }
    
}
public class NcSrchGetResult{
    NcSrchGetResult(){}
}
public class NcLogLogicGUI{
    NcLogLogicGUI(){}
    protected static void NcSwPanelCenterGetPanel(){}
}

public class NcfvRunVariables{ 
    protected static Boolean isLALRNcSwPanelLineEndgetPanel(){return Boolean.FALSE}
}

public enum NcStrLogMsgField{
    NUM("[NUM]"),
    MSG("[MSG]"),
    MAX("[MAX]"),
    PRIORITY("[PRIORITY]");
    private String strMsg;
    NcStrLogMsgField(String strMsg){
        this.strMsg = strMsg;
    }
    protected String getStr(){
        return strMsg;
    }
}

public enum NcStrLogLogicVar{
    NUM("[NUM]"),
    MSG("[MSG]"),
    MAX("[MAX]"),
    PRIORITY("[PRIORITY]");
    private String strMsg;
    NcStrLogLogicVar(String strMsg){
        this.strMsg = strMsg;
    }
    protected String getStr(){
        return strMsg;
    }
}

public class NcAppHelper{
    NcAppHelper(){}
    protected static String outMessage(String strLogMsg){return " ";}
}

public class NcfvRunVariables{
    protected static Boolean isLALRNcSwPanelLineEndgetPanel(){
        return Boolean.FALSE
                }
}
public class NcThWorkerUpGUITreeState{
    protected static stateTreeAddChildren(NcSwGUIComponentStatus lComp){}
}

}
