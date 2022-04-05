/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gradleI001MBSFDRF;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Администратор
 */
public interface GiveGUIbyTextSizeInterface {

    public class GiveGUIComponentWithSomeResultsOfData {

        private static final long ncForGB = 1024 * 1024 * 1024;

        /**
         * Used in
         * <ul>
         * <li>{@link ru.newcontrol.ncfv.NcSwPanelPageEnd#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * </ul>
         *
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
         * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineEnd#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * </ul>
         *
         * @param textSize
         * @param strToolTip
         * @return
         */
        protected static JPanel getTextFieldForSearchPanel(Dimension textSize, String strToolTip) {
            JPanel textFieldForSearchPanel = new JPanel();
            textFieldForSearchPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

            JTextField textWordForSearch = new JTextField();
            textWordForSearch.setPreferredSize(textSize);
            textWordForSearch.setToolTipText(strToolTip);

            textFieldForSearchPanel.add(textWordForSearch);
            return textFieldForSearchPanel;
        }

        protected static ArrayList<JButton> getRootButtons(GiveGUICreatedElementInterface.NcSwGUIComponentStatus lComp) {
            ArrayList<JButton> toReturn = new ArrayList<JButton>();

            FileSystemView fileSystemView;
            fileSystemView = FileSystemView.getFileSystemView();
            //File[] ncDisks = fileSystemView.getRoots();
            File[] ncDisks = File.listRoots();

            for (File itemDisk : ncDisks) {

                Icon itemIcon = fileSystemView.getSystemIcon(itemDisk);
                String strSysTypeDescription = fileSystemView.getSystemTypeDescription(itemDisk);
                if ("".equals(strSysTypeDescription) || (strSysTypeDescription == null)) {
                    if (!GiveGUICreatedElementInterface.NcAppHelper.isWindows()) {
                        strSysTypeDescription = "Root";
                    }
                }
                /**
                 * Part of detect disk types, names for buttons
                 *
                 */

                String itemDisplayName
                        = /*NcIdxFileManager.getStrCanPathFromFile(itemDisk)*/ " NeedDev - "
                        + strSysTypeDescription;

                /**
                 * if (NcIdxFileManager.getStrCanPathFromFile(itemDisk).length()
                 * > 2) { itemDisplayName =
                 * NcIdxFileManager.getStrCanPathFromFile(itemDisk).substring(0,
                 * 2) + " - " + strSysTypeDescription; }
                 */
                long ncDriveFreeGb = itemDisk.getFreeSpace() / ncForGB;
                long ncDriveTotalGb = itemDisk.getTotalSpace() / ncForGB;

                String itemToolTipText
                        = "Free: " + ncDriveFreeGb
                        + " Gb Total: " + ncDriveTotalGb + " Gb";

                if (ncDriveTotalGb != 0) {
                    double ncDriveFreePercent = (((double) itemDisk.getFreeSpace() / itemDisk.getTotalSpace()) * 100);
                    String strPercent = Double.toString(ncDriveFreePercent).substring(0, 5);
                    itemToolTipText = "Free: " + strPercent
                            + " % " + itemToolTipText;
                }

                String strDescr = fileSystemView.getSystemDisplayName(itemDisk);
                if (strDescr.length() > 0) {
                    itemToolTipText = strDescr + " " + itemToolTipText;
                }

                JButton ncButton = createButton(itemDisplayName, itemIcon, itemToolTipText);
                ncButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        try {
                            //NcThScanListAttr.fsScanListAttr(ncButton, lComp, itemDisk.toPath());
                            //NcThWorkerGUIDirListScan.scanDirToIdxDirList(lComp, itemDisk.toPath());

                            ncButton.setText("NeedDev_Click");
                        } catch (Exception ex) {
                            GiveGUICreatedElementInterface.NcAppHelper.logException(GiveGUIComponentWithSomeResultsOfData.class.getCanonicalName(), ex);
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
         * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineEnd#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineEnd#getAndOrButtonPanel()
         * }
         * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineEnd#getAddDelButtonPanel()
         * }
         * <li>
         * <li>{@link ru.newcontrol.ncfv.NcSwPanelPageStart#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * </ul>
         *
         * @param ncName
         * @param ncIcon
         * @param ncToolTipText
         * @return
         */
        protected static JButton createButton(String ncName, Icon ncIcon, String ncToolTipText) {
            JButton ncButton = new JButton(ncName);
            if (ncIcon != null) {
                ncButton.setIcon(ncIcon);
            }
            ncButton.setToolTipText(ncToolTipText);
            return ncButton;
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
        protected static JList createJListWordInSearch() {
            DefaultListModel listWordInSearch = new DefaultListModel();
            ArrayList<String> arrKeyIn
                    = new ArrayList<String>();
            arrKeyIn.add("Need some search result insert here in next develop iterations");
            if (arrKeyIn.size() == 0) {
                listWordInSearch.addElement("* None *");
            } else {
                for (String itemKey : arrKeyIn) {
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
         * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineEnd#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * </ul>
         *
         * @return
         */
        protected static JList createJListWordNotInSearch() {
            DefaultListModel listWordNotInSearch = new DefaultListModel();

            ArrayList<String> arrKeyOut
                    = new ArrayList<String>();
            arrKeyOut.add("Need some search result insert here in next develop iterations");
            if (arrKeyOut.size() == 0) {
                listWordNotInSearch.addElement("* None *");
            } else {
                for (String itemKey : arrKeyOut) {
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
         *
         * @param ncJList
         * @return
         */
        private static JList addJListElement(JList ncJList) {
            return ncJList;
        }

        /**
         * Used in
         * <ul>
         * <li>{@link ru.newcontrol.ncfv.NcSwStatusPanel#addProgressBar(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * </ul>
         *
         * @return
         */
        protected static JProgressBar getProgressBar() {
            JProgressBar progressBar = new JProgressBar();
            progressBar.setIndeterminate(false);
            progressBar.setVisible(true);
            return progressBar;
        }
    }

    public enum TextPathElement {
        IDX("[INDEX]"),
        ID("[IDENTIFICATION_NUMBER]"),
        INDEX_PATH("[indexPath]"),
        KEYWORD_OUT_SEARCH("[keywordOutSearch]"),
        KEYWORD_IN_SEARCH("[keywordInSearch]"),
        DIR_OUT_INDEX("[dirOutIndex]"),
        DIR_IN_INDEX("[dirInIndex]"),
        DISK_USER_ALIAS_SIZE("[diskUserAlias.size]"),
        STR_HEX_MD5("[strHexMD5]"),
        STR_HEX_SHA1("[strHexSHA1]"),
        STR_HEX_SHA256("[strHexSHA256]"),
        STR_HEX_SHA512("[strHexSHA512]"),
        TM_INDEX_SUBDIRS("[tmIndexSubDirs.size]"),
        RECORD_TIME("[recordTime]"),
        NCPARAMFV("[NcParamFv]"),
        STR_DEFAULT("[strDefault]"),
        STR_INPUT("[strInput]"),
        STR_GENERATE_ERROR_VAL("[strGenerateErrorVal]"),
        TMP_IDS_FILE("[TmpIDsFile]"),
        FILE_FOR_CHECK("[fileForCheck]"),
        DISK_ID("[diskID]"),
        HUMAN_ALIAS("[humanAlias]"),
        PROGRAM_ALIAS("[programAlias]"),
        STR_FILE_STORE("[strFileStore]"),
        DISK_LETTER("[diskLetter]"),
        LONG_SERIAL_NUMBER("[longSerialNumber]"),
        STR_HEX_SERIAL_NUMBER("[strHexSerialNumber]"),
        DISK_FS_TYPE("[diskFStype]"),
        IS_READ_ONLY("[isReadonly]"),
        AVAIL_SPACE("[availSpace]"),
        TOTAL_SPACE("[totalSpace]"),
        UN_ALLOCATED_SPACE("[unAllocatedSpace]"),
        USED_SPACE("[usedSpace]"),
        STR_CFG_PATH("[strCfgPath]"),
        CLEAN_RESULT("[CleanResult]");
        private String strMsg;

        TextPathElement(String strMsg) {
            this.strMsg = strMsg;
        }

        /**
         * Used in
         * <ul>
         * <li>{@link ru.newcontrol.ncfv.NcParamFvManager#ncParamFvDataOutPut(ru.newcontrol.ncfv.NcParamFv)
         * }
         * <li>
         * <li>{@link ru.newcontrol.ncfv.NcPathFromUserChecker#strInputPathFormatFilter(java.lang.String, java.lang.String)
         * }
         * <li>{@link ru.newcontrol.ncfv.NcPathFromUserChecker#strInputPathFormatFilterForDefault(java.lang.String)
         * }
         * <li>
         * <li>{@link ru.newcontrol.ncfv.NcPreIdxWork#checkTmpIDsData() }
         * <li>
         * <li>{@link ru.newcontrol.ncfv.NcSrchGetResult#outSearchResult(java.util.TreeMap, java.util.TreeMap)
         * }
         * </ul>
         *
         * @return
         */
        protected String getStr() {
            return strMsg;
        }
    }

    public enum TextTypesOfElementForPath {
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

        TextTypesOfElementForPath(String strMsg) {
            this.strMsg = strMsg;
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
         * <li>
         * <li>{@link ru.newcontrol.ncfv.NcSwPanelCenter#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineEnd#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * <li>{@link ru.newcontrol.ncfv.NcSwPanelLineStart#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * <li>{@link ru.newcontrol.ncfv.NcSwPanelPageEnd#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * <li>{@link ru.newcontrol.ncfv.NcSwPanelPageStart#getPanel(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * <li>
         * <li>{@link ru.newcontrol.ncfv.NcSwThreadManager#setToViewSearchedResult(ru.newcontrol.ncfv.NcSwGUIComponentStatus, java.lang.String)
         * }
         * <li>
         * <li>{@link ru.newcontrol.ncfv.NcSwingIndexManagerApp#createGui() }
         * </ul>
         *
         * @return
         */
        protected String getStr() {
            return strMsg;
        }
    }

    public enum LabelTextForButtonEtc {
        TITLE_APP("Search in index"),
        TITLE_MODAL_LOG_VIEW("Log view"),
        TITLE_MODAL_ENV_VIEW("System environment"),
        TITLE_MODAL_PROP_VIEW("System properties"),
        UPDATE("Update"),
        SEARCH("Search"),
        STORAGEWORD("Storage Word"),
        DIRECTORYLIST("Directory list"),
        LOG_VIEW("Log View"),
        ENV_VIEW("Environment View"),
        PROPERTIES_VIEW("Properties View"),
        PARAMETERS_FOR_SEARCH("Parameters for search"),
        SETTINGS("Settings"),
        CHECK_SUBDIR("Check SubDir"),
        DIR_IN_INDEX("Dir in index"),
        DIR_OUT_INDEX("Dir out index"),
        APP_EXIT("Exit"),
        ABOUT("About");
        private String strMsg;

        LabelTextForButtonEtc(String strMsg) {
            this.strMsg = strMsg;
        }

        /**
         * Used in
         * <ul>
         * <li>{@link ru.newcontrol.ncfv.NcSwMenuItems#getLogFileReader(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * <li>{@link ru.newcontrol.ncfv.NcSwMenuItems#getEnvironmentViewer(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * <li>{@link ru.newcontrol.ncfv.NcSwMenuItems#getPropertiesViewer(ru.newcontrol.ncfv.NcSwGUIComponentStatus)
         * }
         * <li>{@link ru.newcontrol.ncfv.NcSwMenuItems#getEtcEditor() }
         * <li>{@link ru.newcontrol.ncfv.NcSwMenuItems#getSubDirChecker() }
         * <li>{@link ru.newcontrol.ncfv.NcSwMenuItems#getAppExit() }
         * <li>{@link ru.newcontrol.ncfv.NcSwMenuItems#getDirInEditor() }
         * <li>{@link ru.newcontrol.ncfv.NcSwMenuItems#getDirOutEditor() }
         * <li>{@link ru.newcontrol.ncfv.NcSwMenuItems#getAbout() }
         * <li>
         * <li>{@link ru.newcontrol.ncfv.NcSwingIndexManagerApp#createGui() }
         * </ul>
         *
         * @return
         */
        protected String getStr() {
            return strMsg;
        }
    }

    public enum TextForLogMessages {
        LA_SET_VISIBLE_GUI("[LA_GUI_SET_VISIBLE_GUI]"),
        LA_GUI_WAIT_FOR_USER_INPUT("[LA_GUI_WAIT_FOR_USER_INPUT]"),
        LA_JPANEL_CENTER("[LA_GUI_JPANEL_CENTER]"),
        LA_JPANEL_PAGESTART("[LA_GUI_JPANEL_PAGESTART]"),
        LA_JPANEL_PAGEEND("[LA_GUI_JPANEL_PAGEEND]"),
        LA_JPANEL_LINESTART("[LA_GUI_JPANEL_LINESTART]"),
        LA_JPANEL_LINEEND("[LA_GUI_JPANEL_LINEEND]"),
        LA_PANEL_LINESTART("[LA_GUI_JPANEL_LINESTART]"),
        LA_JMENU("[LA_GUI_JMENU]"),
        LA_JMENUBAR("[LA_GUI_JMENUBAR]"),
        LA_CFG_WORK_GET_CURRENT("[LA_CFG_WORK_GET_CURRENT]"),
        LA_CFG_WORK_READ_FROM_FILE("[LA_CFG_WORK_READ_FROM_FILE]"),
        LA_CFG_WORK_GENERATE_ZERO("[LA_CFG_WORK_GENERATE_ZERO]"),
        LA_CFG_WORK_VALIDATE_APPLY("[LA_CFG_WORK_VALIDATE_APPLY]"),
        LA_CHECK("[LA_CFG_WORK_CFG]"),
        LA_CHECK_SUB_DIR("[LA_CFG_CHECK_SUB_DIRS]");

        private String strMsg;

        TextForLogMessages(String strMsg) {
            this.strMsg = strMsg;
        }

        protected String getStr() {
            return strMsg;
        }
    }

    public enum TextLogMsgField {
        APP_LOGIC_NOW("[APPNOW]"),
        APP_LOGIC_NEXT_WAY_VAR("[APPNEXTWAYVAR]"),
        EXCEPTION_MSG("[EXCEPTION_MSG]"),
        ERROR("[ERROR]"),
        ERROR_CRITICAL("[ERROR][CRITICAL]"),
        WARNING("[WARNING]"),
        INFO("[INFO]"),
        INFO_LOGIC_POSITION("[INFOLOGICPOSITION]"),
        MSG_ERROR("[MSG][ERROR]"),
        MSG_ERROR_CRITICAL("[MSG][ERROR][CRITICAL]"),
        MSG_WARNING("[MSG][WARNING]"),
        MSG_INFO("[MSG][INFO]"),
        VARVAL("[VARVAL]"),
        VALUE("[VALUE]"),
        VARNAME("[VARNAME]"),
        CHECK_RESULT("[CHECK_RESULT]"),
        TO_RETURN("[TO_RETURN]"),
        DISCARDED("[DISCARDED]"),
        IN_SET_DEFAULT_ERROR_GENERATE_ERROR_VAL("[INSETDEFAULTERRORGENERATEERRORVALUE]"),
        DELIMITER("[]"),
        TIME("[TIME]"),
        ACTIVE("[ACTIVE]"),
        GROUP("[GROUP]"),
        THREAD("[THREAD]"),
        THREAD_GROUP("[THREADGROUP]"),
        THREAD_GROUP_NAME("[THREADGROUPNAME]"),
        COUNT("[COUNT]"),
        CREATE("[CREATE]"),
        CLASSLOADER("[CLASSLOADER]"),
        TOSTRING("[TOSTRING]"),
        NAME("[NAME]"),
        CANONICALNAME("[CANONICALNAME]"),
        GENERICSTRING("[GENERICSTRING]"),
        ID("[ID]"),
        IS("[IS]"),
        DAEMON("[DAEMON]"),
        DESTROYED("[DESTROYED]"),
        STATE("[STATE]"),
        START("[START]"),
        FINISH("[FINISH]"),
        STACK("[STACK]"),
        TRACE("[TRACE]"),
        FILENAME("[FILENAME]"),
        CLASSNAME("[CLASSNAME]"),
        METHODNAME("[METHODNAME]"),
        METHOD("[METHOD]"),
        PARAMETER("[PARAMETER]"),
        FIELD("[FIELD]"),
        TYPE("[TYPE]"),
        TYPENAME("[TYPENAME]"),
        LINENUM("[LINENUM]"),
        NATIVE("[NATIVE]"),
        ELEMENTNUM("[ELEMENTNUM]"),
        ELEMENT("[ELEMENT]"),
        NUM("[NUM]"),
        MSG("[MSG]"),
        MAX("[MAX]"),
        PRIORITY("[PRIORITY]");
        private String strMsg;

        TextLogMsgField(String strMsg) {
            this.strMsg = strMsg;
        }

        protected String getStr() {
            return strMsg;
        }
    }

    public enum TextServiceMsg {
        ERROR_FILE_NOT_EXIST("notExistFileError"),
        ERROR_FILE_NOT_CANONICAL_PATH("Can not File.getCanonicalPath() for: "),
        ERROR_NOT_CREATE("Can not create: "),
        NOT_EXIST_OR_WRONG("not exist or wrong"),
        NOT_WRITE_INTO_FILE("Can not write into file: "),
        READED_DATA_IS_EMPTY("readed data is Empty"),
        PATH_INDEX_DIRECTORY("Path of index directory: "),
        PATH_WORK_FILE("Path of work file: "),
        PATH_SUBDIR("Path of subDir: "),
        EXIST("Exist: "),
        CANREAD("canRead: "),
        CANWRITE("canWrite: "),
        NEWLINE("\n"),
        TAB("\t"),
        SPACE(" "),
        COLON(":"),
        HASH_CALC("Calculated hash: "),
        HASH_RECORD("in record hash: "),
        RESULT("result: "),
        HASH_RECORD_IS("RecordHash is: "),
        WORK_CFG_HASH("Work config hash: "),
        FOR_WRITE("for write: "),
        FROM_READ("from read: "),
        STRING_EQUAL("String equal"),
        PATH_INPUT("Path input: "),
        PATH_DEFAULT("Path default: "),
        PATH_CONTINUE_NOT_VALID("Path continue not valid"),
        PATH_START_NOT_VALID("Path start not valid"),
        PATH_FOR_NOT_WINDOWS_SYSTEM("Path for not windows system"),
        DEFAULT_STAGE("default stage"),
        COUNT_OF_SEARCHED_RECORDS("Count of searched records: "),
        FUNCTIONAL_NOT_RELEASED("Functional not released "),
        NOT_IN_SEARCH_COUNT("Not in search: ");

        private String strMsg;

        TextServiceMsg(String strMsg) {
            this.strMsg = strMsg;
        }

        /**
         * Used in
         * <ul>
         * <li>{@link ru.newcontrol.ncfv.NcManageCfg#mcCreateWorkDir(ru.newcontrol.ncfv.NcDiskInfo)
         * }
         * <li>{@link ru.newcontrol.ncfv.NcManageCfg#mcCheckAndCreateFolderStructure()
         * }
         * <li>
         * <li>{@link ru.newcontrol.ncfv.NcParamCfgToDiskReleaser#getWorkFileParams(java.lang.String)
         * }
         * <li>{@link ru.newcontrol.ncfv.NcParamCfgToDiskReleaser#getIdxDirStructure(java.lang.String)
         * }
         * <li>
         * <li>{@link ru.newcontrol.ncfv.NcParamFvManager#isNcParamFvDataHashTrue(ru.newcontrol.ncfv.NcParamFv)
         * }
         * <li>{@link ru.newcontrol.ncfv.NcParamFvManager#ncParamFvDataOutPut(ru.newcontrol.ncfv.NcParamFv)
         * }
         * <li>{@link ru.newcontrol.ncfv.NcParamFvManager#checkToWrite(ru.newcontrol.ncfv.NcParamFv)
         * }
         * <li>{@link ru.newcontrol.ncfv.NcParamFvManager#checkFromRead(ru.newcontrol.ncfv.NcParamFv)
         * }
         * <li>
         * <li>{@link ru.newcontrol.ncfv.NcPathFromUserChecker#strInputPathFormatFilter(java.lang.String, java.lang.String)
         * }
         * <li>{@link ru.newcontrol.ncfv.NcPathFromUserChecker#strInputPathFormatFilterForDefault(java.lang.String)
         * }
         * <li>
         * <li>{@link ru.newcontrol.ncfv.NcPreIdxWork#checkTmpIDsData() }
         * <li>
         * <li>{@link ru.newcontrol.ncfv.NcSrchGetResult#outSearchResult(java.util.TreeMap, java.util.TreeMap)
         * }
         * <li>
         * <li>{@link ru.newcontrol.ncfv.NcSrchKeyWordInput#getIdDataForSplittedKeyWord(java.util.ArrayList)
         * }
         * </ul>
         *
         * @return
         */
        protected String getStr() {
            return strMsg;
        }
    }
}
