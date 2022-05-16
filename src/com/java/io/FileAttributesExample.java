package com.java.io;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class FileAttributesExample {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Deshraj.tiwari\\Downloads");
        File [] listfile = file.listFiles();
        for (File f : listfile){
            if (f.isFile()){
                long size = f.length();
                long sizeInKb = size/10024;
               // System.out.println(f.getName()+" size in KB "+sizeInKb);

                long lastModified = f.lastModified();
                Date lastModifiedDate = new Date(lastModified);
                SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
                //System.out.println(simpleDateFormat.format(lastModifiedDate));
            }
        }
            System.out.println(" ");
            System.out.println("ordered by date");
        Arrays.sort(listfile ,new LastMdifiedTimeComparator());
        for (File f : listfile){
            long lastModified = f.lastModified();
            Date lastModifiedDate = new Date(lastModified);
            SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
            System.out.println(f.getName()+"  "+simpleDateFormat.format(lastModifiedDate));
        }

             System.out.println(" ");
             System.out.println("ordered by size");
        Arrays.sort(listfile ,new FileSizeCompare());
        for (File f : listfile){
            long lastModified = f.lastModified();
            Date lastModifiedDate = new Date(lastModified);
            SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
            System.out.println(f.getName()+" "+f.length()/1024);
        }
        System.out.println(" ");
        System.out.println("today's modified");
        FileFilter lastModifiedFileFilter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                Calendar c = Calendar.getInstance();
                        c.set(Calendar.HOUR,0);
                c.set(Calendar.MINUTE,0);
                Date bignigDay = c.getTime();
                if (file.lastModified() > bignigDay.getTime())
                    return  true;
                return false;
            }
        };
        File [] todayMdifiesFiles = file.listFiles(lastModifiedFileFilter);
        for (File f : todayMdifiesFiles){
            long lastModified = f.lastModified();
            Date lastModifiedDate = new Date(lastModified);
            SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
            System.out.println(f.getName()+"  "+simpleDateFormat.format(lastModifiedDate));
        }
    }
}
