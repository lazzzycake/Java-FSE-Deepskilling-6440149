

public class LoggerTest {
    public static void main(String[] args) {
        // Get the singleton instance
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log message.");

        // Get the instance again
        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log message.");

        // Check if both references are the same
        System.out.println("Are both logger instances the same? " + (logger1 == logger2));
    }
  
}
