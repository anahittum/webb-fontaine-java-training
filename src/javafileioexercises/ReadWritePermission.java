package javafileioexercises;

import java.io.File;

public class ReadWritePermission {
    public static void main(String[] args) {
        final File tempFile = new File("C:\\Users\\Anahit Tumanyan\\Desktop\\File\\newdoc.doc");
        if (tempFile.canRead()){
            System.out.println("File is Readable");
        }else{
            System.out.println("File is not readable");
        }
        if (tempFile.canWrite()){
            System.out.println("File is Writable");
        }else{
            System.out.println("File is not writable");
        }
    }
}
