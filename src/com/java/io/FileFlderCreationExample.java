package com.java.io;

import java.io.File;
import java.io.IOException;

public class FileFlderCreationExample {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Deshraj.tiwari\\Downloads");
        if (file.exists()){
            System.out.println("document is here ");
        }else {
            System.out.println("this file not exist here .");
        }
        if (file.isDirectory()){
            System.out.println("this is a diractory");
        }
        if (file.canWrite()){
            System.out.println("we can write here ");
        }

        if (file.exists() && file.isDirectory() && file.canWrite()){

            File file1 = new File("C:\\Users\\Deshraj.tiwari\\Downloads\\example");
            if (!file1.exists());
            file1.mkdir();

            //nested diractory creation is not allowed
           // file1 = new File(file.getAbsolutePath()+"/example2/example3");
            file1 = new File(file.getAbsolutePath()+"/example1");
            if (!file1.exists())
                file1.mkdir();

            file1 = new File(file.getAbsolutePath()+"/example2");
            if (!file1.exists()) {
                boolean isCreatecd = file1.mkdir();
                if (isCreatecd) {
                    System.out.println("folder2 is created");
                } else {
                    System.out.println("folder2 is all ready exist");
                }
            }
                file1 = new File(file1.getAbsolutePath()+"/example3");
                if (!file1.exists()) {
                    boolean isCreatecd1 = file1.mkdir();
                    if (isCreatecd1) {
                        System.out.println("folder3 is created");
                    } else {
                        System.out.println("folder3 is all ready exist");
                    }
                }
                    File createFile = new File(file1.getCanonicalPath()+"/abc.txt");
                    try {
                        boolean isCreate = createFile.createNewFile();
                        if (isCreate){
                            System.out.println("file has been created");
                        }else {
                            System.out.println("file creation failed");
                        }
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }
    }
