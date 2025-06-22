public class Main {

    
    static class Logger {

        
        private static Logger instance;

        
        private Logger() {
            System.out.println("Logger instance created");
        }

        // Public method to get the singleton instance
        public static Logger getInstance() {
            if (instance == null) {
                instance = new Logger();
            }
            return instance;
        }

        // Sample logging method
        public void log(String message) {
            System.out.println("Log: " + message);
        }
    }

    // Main method to test Singleton
    public static void main(String[] args) {
        
        Logger logger1 = Logger.getInstance();
        logger1.log("First message");

    
        Logger logger2 = Logger.getInstance();
        logger2.log("Second message");

        // Verify that both references point to the same object
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 refer to the same instance.");
        } else {
            System.out.println("Different instances exist. Singleton failed.");
        }
    }
}
