package gr.aueb.cf.ch14_classes.challenges;

/**
 * Singleton class that logs messages to a file.
 */
public class Logger {

    private static final long CURRENT_TIME_MILLIS = System.currentTimeMillis();

    void logMessage(String message) {
        // Log the message to a file
        System.err.println("Error." + " " +CURRENT_TIME_MILLIS);
    }
}
