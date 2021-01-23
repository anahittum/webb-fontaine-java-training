package javafileioexercises;

import java.io.File;
import java.io.IOException;

public class ListOfFiles {
    public static void main(String[] args) throws IOException {
        File directoryFile = new File("C:\\Users\\Anahit\\Desktop\\File");
        File[] fileList = directoryFile.listFiles();
        assert fileList != null;
        for (File file : fileList) {
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("Size :" + file.getTotalSpace());
            System.out.println(" ");
        }
    }
}