package Step8.lesson4;

import java.util.ArrayList;
import java.util.List;

public class Logger {

    private static Logger instance;
    private List<String> logs;

    // Private constructor
    private Logger() {
        logs = new ArrayList<>();
    }

    // Singleton method
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Add log
    public void log(String message) {
        logs.add(message);
    }

    // Print logs
    public void printLogs() {
        for (String log : logs) {
            System.out.println(log);
        }
    }
}