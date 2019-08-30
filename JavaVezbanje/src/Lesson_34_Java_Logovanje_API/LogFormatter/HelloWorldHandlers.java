package Lesson_34_Java_Logovanje_API.LogFormatter;

import java.io.IOException;
import java.util.logging.*;

public class HelloWorldHandlers {
    private static Logger logger = Logger.getLogger(HelloWorldHandlers.class.getName());

    public static void main(String[] args) {
        FileHandler fileHandler;
        try {
            fileHandler = new FileHandler("logs/helloWorld.log");
            fileHandler.setLevel(Level.FINE);
            ConsoleHandler consoleHandler = new ConsoleHandler();
            consoleHandler.setFormatter(new MyFormatter());
            logger.addHandler(fileHandler);
            logger.addHandler(consoleHandler);
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


