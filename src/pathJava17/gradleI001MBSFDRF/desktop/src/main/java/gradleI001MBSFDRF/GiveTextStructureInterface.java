/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gradleI001MBSFDRF;

import java.io.Serializable;

public interface GiveTextStructureInterface {

    public class GetStructureDirListToFileAttr implements Serializable {

        /**
         * dirListID - identification descriptor (ID) of records in file
         */
        public long dirListID;
        /**
         *
         */
        public long diskID;
        /**
         *
         */
        public long diskSnLong;
        /**
         *
         */
        public long diskTotalSpace;
        /**
         *
         */
        public String diskProgramAlias;
        /**
         *
         */
        public int diskProgramAliasHash;
        /**
         * diskSnHex - Disk serial number in the heximal format
         */
        public String diskSnHex;
        /**
         * diskSnHexHash - Disk serial number in the heximal format, hashCode
         */
        public int diskSnHexHash;
        /**
         * distLetter - Disk letter
         */
        public char diskLetter;
        /**
         * path - File Path with out Disk Letter
         */
        public String path;
        /**
         * pathHash - File Path with out Disk Letter hashCode()
         */
        public int pathHash;
        /**
         * fileLength - File.length()
         */
        public long fileLength;
        /**
         * fileCanRead - File.canRead()
         */
        public boolean fileCanRead;
        /**
         * fileCanWrite - File.canWrite()
         */
        public boolean fileCanWrite;
        /**
         * fileCanExecute - File.canExecute()
         */
        public boolean fileCanExecute;
        /**
         * fileIsHidden - File.isHidden()
         */
        public boolean fileIsHidden;
        /**
         * fileLastModified - File.lastModified()
         */
        public long fileLastModified;
        /**
         * fileIsDirectory - File.isDirectory()
         */
        public boolean fileIsDirectory;
        /**
         * fileIsFile - File.isFile()
         */
        public boolean fileIsFile;

        /**
         *
         */
        public long recordTime;

        /**
         *
         */
        public boolean deletedRec;

        /**
         *
         */
        public long changedRecordID;
        /**
         *
         */
        public int recordHash;

        /**
         *
         * @param dirListID
         * @param diskTotalSpace
         * @param diskSnHex
         * @param path
         * @param fileCanExecute
         * @param fileLastModified
         * @param fileIsFile
         * @param deletedRec
         * @param changedRecordID
         */
        public GetStructureDirListToFileAttr() {
            this.dirListID = -777;
            this.diskID = -777;
            this.diskSnLong = -777;
            this.diskTotalSpace = -777;
            this.diskProgramAlias = "";
            this.diskProgramAliasHash = -777;
            this.diskSnHex = "";
            this.diskSnHexHash = -777;
            this.diskLetter = '#';
            this.path = "";
            this.pathHash = -777;
            this.fileLength = -777;
            this.fileCanRead = false;
            this.fileCanWrite = false;
            this.fileCanExecute = false;
            this.fileIsHidden = false;
            this.fileLastModified = -777;
            this.fileIsDirectory = false;
            this.fileIsFile = false;
            long sysNowTime = System.nanoTime();
            this.recordTime = sysNowTime;
            this.deletedRec = false;
            this.changedRecordID = -777;
            this.recordHash = (""
                    + this.dirListID
                    + this.diskID
                    + this.diskSnLong
                    + this.diskTotalSpace
                    + this.diskProgramAlias
                    + this.diskProgramAlias.hashCode()
                    + this.diskSnHex
                    + this.diskSnHex.hashCode()
                    + this.diskLetter
                    + this.path
                    + this.path.hashCode()
                    + this.fileLength
                    + this.fileCanRead
                    + this.fileCanWrite
                    + this.fileCanExecute
                    + this.fileIsHidden
                    + this.fileLastModified
                    + this.fileIsDirectory
                    + this.fileIsFile
                    + sysNowTime
                    + this.deletedRec
                    + this.changedRecordID).hashCode();
        }

        /**
         *
         * @param dirListID
         * @param diskID
         * @param diskSnLong
         * @param diskTotalSpace
         * @param diskProgramAlias
         * @param diskSnHex
         * @param diskLetter
         * @param path
         * @param fileLength
         * @param fileCanRead
         * @param fileCanWrite
         * @param fileCanExecute
         * @param fileIsHidden
         * @param fileLastModified
         * @param fileIsDirectory
         * @param fileIsFile
         * @param deletedRec
         * @param changedRecordID
         */
        public GetStructureDirListToFileAttr(long dirListID,
                long diskID,
                long diskSnLong,
                long diskTotalSpace,
                String diskProgramAlias,
                String diskSnHex,
                char diskLetter,
                String path,
                long fileLength,
                boolean fileCanRead,
                boolean fileCanWrite,
                boolean fileCanExecute,
                boolean fileIsHidden,
                long fileLastModified,
                boolean fileIsDirectory,
                boolean fileIsFile,
                boolean deletedRec,
                long changedRecordID) {
            this.dirListID = dirListID;
            this.diskID = diskID;
            this.diskSnLong = diskSnLong;
            this.diskTotalSpace = diskTotalSpace;
            this.diskProgramAlias = diskProgramAlias;
            this.diskProgramAliasHash = diskProgramAlias.hashCode();
            this.diskSnHex = diskSnHex;
            this.diskSnHexHash = diskSnHex.hashCode();
            this.diskLetter = diskLetter;
            this.path = path;
            this.pathHash = path.hashCode();
            this.fileLength = fileLength;
            this.fileCanRead = fileCanRead;
            this.fileCanWrite = fileCanWrite;
            this.fileCanExecute = fileCanExecute;
            this.fileIsHidden = fileIsHidden;
            this.fileLastModified = fileLastModified;
            this.fileIsDirectory = fileIsDirectory;
            this.fileIsFile = fileIsFile;
            long sysNowTime = System.nanoTime();
            this.recordTime = sysNowTime;
            this.deletedRec = deletedRec;
            this.changedRecordID = changedRecordID;
            this.recordHash = (""
                    + dirListID
                    + diskID
                    + diskSnLong
                    + diskTotalSpace
                    + diskProgramAlias
                    + diskProgramAlias.hashCode()
                    + diskSnHex
                    + diskSnHex.hashCode()
                    + diskLetter
                    + path
                    + path.hashCode()
                    + fileLength
                    + fileCanRead
                    + fileCanWrite
                    + fileCanExecute
                    + fileIsHidden
                    + fileLastModified
                    + fileIsDirectory
                    + fileIsFile
                    + sysNowTime
                    + deletedRec
                    + changedRecordID).hashCode();
        }
    }

    public class GetStructureWordToFile implements Serializable {

        /**
         * recordID - (record id) number of record in file
         */
        public long recordID;
        /**
         * dirListID - (directory id) number of record in diretcory list files
         */
        public long dirListID;

        /**
         *
         */
        public String word;
        /**
         * wordHash - (hash) subStringHashCode (String.hashCode())
         */
        public int wordHash;
        /**
         * pathPosition - (position) subString position in source str
         */
        public int pathPosition;
        /**
         * wordLength - (length) subString length
         */
        public int wordLength;

        /**
         *
         */
        public long recordTime;

        /**
         *
         */
        public int recordHash;

        /**
         *
         * @param recordID
         * @param dirListID
         * @param pathPosition
         * @param wordLength
         */
        public GetStructureWordToFile() {
            this.recordID = -777;
            this.dirListID = -777;
            this.word = "";
            this.wordHash = -777;
            this.pathPosition = -777;
            this.wordLength = -777;
            long nowSysTime = System.nanoTime();
            this.recordTime = nowSysTime;
            this.recordHash = (""
                    + this.recordID
                    + this.dirListID
                    + this.word
                    + this.wordHash
                    + this.pathPosition
                    + this.wordLength
                    + nowSysTime).hashCode();
        }

        /**
         *
         * @param recordID
         * @param dirListID
         * @param word
         * @param pathPosition
         * @param wordLength
         */
        public GetStructureWordToFile(long recordID, long dirListID, String word, int pathPosition, int wordLength) {
            this.recordID = recordID;
            this.dirListID = dirListID;
            this.word = word;
            this.wordHash = word.hashCode();
            this.pathPosition = pathPosition;
            this.wordLength = wordLength;
            long nowSysTime = System.nanoTime();
            this.recordTime = nowSysTime;
            this.recordHash = (""
                    + this.recordID
                    + this.dirListID
                    + this.word
                    + this.wordHash
                    + this.pathPosition
                    + this.wordLength
                    + nowSysTime).hashCode();
        }

    }

}
