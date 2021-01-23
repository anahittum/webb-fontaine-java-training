package javafileioexercises;

import java.io.File;

public class FileSize {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Anahit Tumanyan\\Desktop\\File\\newdoc.doc");
        if (file.exists()){
            System.out.println(bytes(file));
            System.out.println(kiloBytes(file));
            System.out.println(megaBytes(file));
        }
    }

    private static String bytes(File file) {
        return (double) file.length() + " bytes";
    }
    private static String megaBytes(File file) {
        return (double) file.length() / (1024 * 1024) + " mb";
    }
    private static String kiloBytes(File file) {
        return (double) file.length()/1024 + " kb";
    }
}
