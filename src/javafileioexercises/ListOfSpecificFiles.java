package javafileioexercises;

import java.io.File;
import java.io.FilenameFilter;

public class ListOfSpecificFiles {
    public static void main(String[] args) {
        File directoryFile = new File("C:\\Users\\Anahit Tumanyan\\Desktop\\newdoc.doc");
        FilenameFilter pptFilter;
        pptFilter = (directoryFile1, name) -> name.endsWith(".jpg");
        String[] filesNameFilter = directoryFile.list(pptFilter);
        assert filesNameFilter != null;
        for (String file : filesNameFilter) {
            System.out.println(file);
        }
    }
}
