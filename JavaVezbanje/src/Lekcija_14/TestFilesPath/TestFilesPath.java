package Lekcija_14.TestFilesPath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class TestFilesPath {

    public static void main(String[] args) {
        //Ocitavanje putanje datoteke states.txt.txt locirane u direktorijumu iz koga je startovan ovaj program\

        Path sourceFilePath = Paths.get("states.txt");
        // Kopiranje izvorne datoteke na navedeno odrediste
        Path destFilePath = Paths.get("states.bak");
        if (Files.exists(sourceFilePath)) {
            System.out.println("The file " + sourceFilePath + " exists");
            System.out.println("The absolute path is " + sourceFilePath.toAbsolutePath());
        }

        try {
            // Proverava velicine datoteke (u bajtovima)
            System.out.println("It's size is " + Files.size(sourceFilePath));
            // Kopiranje sadrzavaja dadoteke states.txt.txt u datoteku states.txt.bak
            Files.copy(sourceFilePath,destFilePath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Copy completed. The backup file is at " + destFilePath.toAbsolutePath());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
