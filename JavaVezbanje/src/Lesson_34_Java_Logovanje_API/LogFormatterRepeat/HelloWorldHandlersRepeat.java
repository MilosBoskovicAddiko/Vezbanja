package Lesson_34_Java_Logovanje_API.LogFormatterRepeat;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorldHandlersRepeat {

    private static Logger logger = Logger.getLogger(HelloWorldHandlersRepeat.class.getName());

    public static void main(String[] args) {
        FileHandler fileHandler;
        try {
            fileHandler = new FileHandler("helloWorldLogger.log");
            fileHandler.setLevel(Level.ALL);
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        logger.fine("Hello from FINE world");
        logger.info("Hello from INFO world");
        try {
            logger.info("Try to devide with 0");
            int res =  25/0;
        } catch (ArithmeticException e) {
            logger.severe("Divided by 0");
        }
    }
}
