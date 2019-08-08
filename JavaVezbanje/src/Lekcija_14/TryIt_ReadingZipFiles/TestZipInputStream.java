package Lekcija_14.TryIt_ReadingZipFiles;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class TestZipInputStream {
    // Iz nekog razloga ne radi
    public static void main(String[] args) {

        ZipEntry ze = null;

        try (FileInputStream myFile = new FileInputStream("JavaVezbanje.rar");
        BufferedInputStream buff = new BufferedInputStream(myFile);
        ZipInputStream zipFile = new ZipInputStream(buff)) {

            while ((ze = zipFile.getNextEntry()) != null) {
                System.out.println("Name of file: " + ze.getName());
                zipFile.closeEntry();
            }

        } catch (IOException ioe) {
            System.out.println("Could not read file: " + ioe.toString());
        }
    }
}
