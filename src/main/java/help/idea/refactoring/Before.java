package help.idea.refactoring;

import java.util.List;

public class Before {
    private void logMessage(String prefix, String name, int logLevel, Throwable exception){
        // исходный вариант
        /*
        if (prefix != null) {
            doLog(logLevel, prefix + ":" + name, exception.getMessage(), exception.getCause(),
                    exception.getStackTrace());
        } else {
            doLog(logLevel, name, exception.getMessage(), exception.getCause(), exception.getStackTrace());
        }
        */

        /*
        String title;
        if (prefix != null) {
            title = prefix + ":" + name;
        } else {
            title = name;
        }
        doLog(logLevel, title, exception.getMessage(), exception.getCause(), exception.getStackTrace());
        */

        /*
        String title;
        if (prefix != null) {
            title = prefix + ":" + name;
        } else {
            title = name;
        }
        doLog(logLevel, title, exception.getMessage(), exception.getCause(), exception.getStackTrace());
        */

        String title = prefix != null ? prefix + ":" + name : name;
        doLog(logLevel, title, exception.getMessage(), exception.getCause(),
                exception.getStackTrace());
    }

    String process(List<String> outerList, List<String> list){
        String s = null;
        int count = 0;
        for (String outer : outerList) {
            for (String inner : list) {
                if (outer.equals(inner)){
                    count++;
                }
            }
            if (count > 5) {
                s = outer;
                break;
            }
        }
        return s;
    }

    void processConferences(){
        System.out.println("I'm going to visit JPoint");
    }

    void greet(String name) {
        if (!isEmpty(name)) {
            System.out.println("Hello" + name);
        }
    }

    private boolean isEmpty(String name) {
        return name == null || name.trim().isEmpty();
    }

    private void doLog(int level, String title, String message, Throwable cause, StackTraceElement[] element){
        // do logging
    }
}
