package Lesson_34_Java_Logovanje_API.HelloWorldGlobalLogger;

import java.io.IOException;
import java.util.logging.Logger;

public class HelloWorldGlobalLogger {
    private static Logger logger = Logger.getLogger(HelloWorldGlobalLogger.class.getPackage().getName());

    public static void main(String[] args) throws IOException {
        logger.fine("Hello FINE world");
        logger.info("Hello INFO world");
        logger.severe("Hello SEVERE world");
        logger.info("Trying to divide by zero");
        try {
            int res = 25/0;
        } catch (ArithmeticException ae) {
            logger.severe("Division By zero");
        }
    }
}
