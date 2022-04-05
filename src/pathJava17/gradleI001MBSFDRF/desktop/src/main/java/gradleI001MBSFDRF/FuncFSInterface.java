/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gradleI001MBSFDRF;

/**
 *
 * @author Администратор
 */
public interface FuncFSInterface {

    public class FileSystemAboutFromOS {

        protected long availSpace;
        protected boolean isReadonly;

        FileSystemAboutFromOS() {

        }
    }

    /**
     * FuncFSInterface.WhatSayOSAboutOS.isWindows()
     * FuncFSInterface.WhatSayOSAboutOS.isMac()
     * FuncFSInterface.WhatSayOSAboutOS.isUnix()
     */
    public class WhatSayOSAboutOS {

        /**
         *
         * @return
         */
        protected static boolean isWindows() {
            String os = System.getProperty("os.name").toLowerCase();
            return (os.indexOf("win") >= 0);
        }

        /**
         *
         * @return
         */
        protected static boolean isMac() {
            String os = System.getProperty("os.name").toLowerCase();
            return (os.indexOf("mac") >= 0);
        }

        /**
         *
         * @return
         */
        protected static boolean isUnix() {
            String os = System.getProperty("os.name").toLowerCase();
            return (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0);
        }
    }

    public class OSParamJournalDisk {

        protected static FileSystemAboutFromOS getFromJournalDiskOrCreateIt() {
            return new FileSystemAboutFromOS();
        }
    }
}
