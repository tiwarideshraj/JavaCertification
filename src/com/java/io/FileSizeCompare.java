package com.java.io;

import java.io.File;
import java.util.Comparator;

public class FileSizeCompare implements Comparator<File>{

    @Override
    public int compare(File o1, File o2) {
        if (o1.length() > o2.length())
            return 1;
        else if (o1.length() == o2.length())
            return 0;
        else
            return -1;
    }
}
