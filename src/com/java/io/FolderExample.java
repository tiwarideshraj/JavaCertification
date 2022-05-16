package com.java.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FolderExample {

    public static void main(String[] args) {

        // find the directory and get the available item
        System.out.println("All files");
        File file = new File("C:\\Users\\Deshraj.tiwari\\Downloads");
        String [] allItems = file.list();
        for (String item : allItems){
            System.out.println(item);
        }

        // find all folder from directory
        System.out.println("  ");
        System.out.println("All files");
        File [] allFolder = file.listFiles();
        for (File item : allFolder){
            if (item.isDirectory())
            System.out.println(item.getName());
        }

        // find all file from directory
        System.out.println("  ");
        System.out.println("All files");
        File [] allFiles = file.listFiles();
        for (File item : allFiles){
            if (!item.isDirectory())
            System.out.println(item.getName());
        }

        //find or filter the files and their path
        System.out.println("  ");
        System.out.println("All files");
        FilenameFilter filenameFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith("pdf") || name.endsWith("doc"))
                    return true;
                return false;
            }
        };
        File [] pdfFile = file.listFiles(filenameFilter);
        for (File ifPdfFile : pdfFile){
            System.out.println(ifPdfFile.getName()+ " - " +ifPdfFile.getAbsolutePath());
        }
    }

}
