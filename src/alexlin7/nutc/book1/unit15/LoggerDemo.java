package alexlin7.nutc.book1.unit15;

import java.util.logging.*;

public class LoggerDemo {
    public static void main(String[] args) {
        var logger = Logger.getLogger(LoggerDemo.class.getName());

        //Level from java.util.logging
        logger.log(Level.WARNING, "WARNING 訊息");
        logger.log(Level.INFO, "INFO 訊息");
        logger.log(Level.CONFIG, "CONFIG 訊息");
        logger.log(Level.FINE, "FINE 訊息");
    }
}
