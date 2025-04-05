class Logger {

    void log(String message) {
        System.out.println("[INFO]: " + message);
    }

    void log(String message, int code) {
        System.out.println("[INFO][" + code + "]: " + message);
    }

    void log(String message, boolean error) {
        if (error) {
            System.out.println("[ERROR]: " + message);
        } else {
            log(message);
        }
    }
}

public class LoggerOverloadingExample {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.log("System running");
        logger.log("Minor issue detected", 101);
        logger.log("Critical failure", true);
    }
}