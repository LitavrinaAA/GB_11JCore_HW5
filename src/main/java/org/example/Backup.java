package org.example;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * копирует файлы из текущей папки в папку "./backup"
 */
public class Backup {
    public static void copy(String source) throws IOException {
        String backup = "././backup";
        File folderSource = new File(source);
        File folderTarget = new File(backup);
        if (Files.notExists(folderTarget.toPath())) {
            Path path = Files.createDirectories(Paths.get(backup));
            System.out.printf("Директория %s создана\n", path.toString());
        }
        try {
            FileUtils.copyDirectory(folderSource, folderTarget);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
