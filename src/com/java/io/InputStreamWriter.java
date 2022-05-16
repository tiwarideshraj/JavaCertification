package com.java.io;

import java.io.*;

public class InputStreamWriter {
    public static void main(String[] args) throws IOException {
     InputStreamWriter inputStreamWriter = new InputStreamWriter();
     inputStreamWriter.fileConverter("C:\\Users\\Deshraj.tiwari\\Downloads/example2/example3/abc.txt",
             "C:\\Users\\Deshraj.tiwari\\Downloads/example2/example3/def.txt","dd-mm-yyyy");
    }

    public void fileConverter(String inputPath , String outputPath,String newDataFormat){
        File inputFile = new File(inputPath);
        File outputFile = new File(outputPath);
        BufferedReader bufferedReader=null;
        FileWriter fileWriter=null;
try {
     bufferedReader = new BufferedReader(new FileReader(inputFile));
     fileWriter= new FileWriter(outputFile);
     String line;
     while ((line = bufferedReader.readLine()) !=null){
     fileWriter.write(line);
     fileWriter.write(System.lineSeparator());
     }
}catch (IOException e){
    e.printStackTrace();
}
finally {
    try {
        fileWriter.flush();
        fileWriter.close();
        bufferedReader.close();
    }catch (IOException e){
        e.printStackTrace();
    }

}
    }
    }
