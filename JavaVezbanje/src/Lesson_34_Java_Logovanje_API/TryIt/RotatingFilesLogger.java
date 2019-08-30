package Lesson_34_Java_Logovanje_API.TryIt;

import Lesson_34_Java_Logovanje_API.LogFormatter.MyFormatter;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RotatingFilesLogger {
    private static Logger logger = Logger.getLogger(RotatingFilesLogger.class.getName());

    public static void main(String[] args) {
        FileHandler fileHandler;
        try {
            fileHandler = new FileHandler("logs/rotatingFilesLogger.log",1000,3,true);
            fileHandler.setLevel(Level.FINE);
            ConsoleHandler consoleHandler = new ConsoleHandler();
            consoleHandler.setFormatter(new MyFormatter());
            logger.addHandler(fileHandler);

        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        logger.fine("Hello from fine world");
        logger.info("Trying to divide by zero");
        try {
            int result = 21/0;
        } catch (Exception e) {
            logger.severe("Division by zero");
        }
    }
}


