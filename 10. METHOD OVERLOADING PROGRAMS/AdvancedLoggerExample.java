public class AdvancedLoggerExample {

    void log(String message) {
        System.out.println("[INFO]: " + message);
    }

    void log(String message, String level) {
        System.out.println("[" + level.toUpperCase() + "]: " + message);
    }

    void log(String message, String level, boolean timestamp) {
        String time = timestamp ? "[" + java.time.LocalDateTime.now() + "] " : "";
        System.out.println(time + "[" + level.toUpperCase() + "]: " + message);
    }

    public static void main(String[] args) {
        AdvancedLoggerExample logger = new AdvancedLoggerExample();
        logger.log("System started");
        logger.log("Low disk space", "warning");
        logger.log("Fatal error occurred", "error", true);
    }
}