package com.java.io;

import java.io.*;

public class InutStreamReader {
    public static void main(String[] args) throws IOException {

        //read by character
        File file = new File("C:\\Users\\Deshraj.tiwari\\Downloads/example2/example3/abc.txt");
        InputStream inputStream;
        /*try {
            inputStream = new InputStream(file);
            int i = 0;
            while (i= inputStream.read() !=-1){
                char c = (char) i;
                System.out.println(c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }*/

        // read by buffer size
try {
    FileReader fileReader = new FileReader("C:\\Users\\Deshraj.tiwari\\Downloads/example2/example3/abc.txt");
    char array [] = new char[10];
    while (fileReader.read(array) !=-1)
    System.out.println(array);
  }
  catch (IOException e){
   e.printStackTrace();
  }

// read by line
  try {
    FileReader fileReader = new FileReader("C:\\Users\\Deshraj.tiwari\\Downloads/example2/example3/abc.txt");
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    String s = bufferedReader.readLine();
    System.out.println(s+" by line");
  }catch (IOException e){
    e.printStackTrace();
  }

    }
}
