package javafileioexercises;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfLines {
    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("C:\\Users\\Anahit Tumanyan\\Desktop\\newdoc.doc");

        BufferedReader reader = new BufferedReader(new InputStreamReader(file));
        int count = 0;
        while ((reader.readLine()) != null) {
            count++;
        }
    }

}
