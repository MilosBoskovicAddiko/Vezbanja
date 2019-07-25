package Lekcija_11.MailmanPropertiesLoadingIntoProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MailmanPropertiesLoadingIntoProperties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        FileInputStream in = null;
        try {
            in = new FileInputStream("C:\\Users\\Milos Boskovic\\Documents\\Vezbanja\\JavaVezbanje\\src\\Lekcija_11\\MailmanPropertiesLoadingIntoProperties\\mailman.properties");
            properties.load(in);
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.getMessage();
            }
        }

        String from = properties.getProperty("from");
        String mailServer = properties.getProperty("SmtpServer");
        String to = properties.getProperty("to");

        System.out.println("From: " + from);
        System.out.println("SmtpServer: " + mailServer);
        System.out.println("To: " + to);

    }
}
