package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        Backup.copy("./files");
        Prefix.write("./files", "pre1");
    }
}