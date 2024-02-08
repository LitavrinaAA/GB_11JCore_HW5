package org.example;

import java.io.File;

public class Prefix {
    public static   void write(String source, String prefix) {
        File[] files = new File(source).listFiles();
        for(File file : files){
            if(file.isFile()){
                String originalname = file.getName();
                File newfile  = new File(source + prefix + " " + originalname);
                boolean success = file.renameTo(newfile);
                if (!success) {
                    System.err.println("FAILED to rename "+file.getName());
                } else {
                    System.out.println(newfile.getName());
                }
            }
        }

    }
}
