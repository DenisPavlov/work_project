package help.idea.refactoring;

public class Example1 {
    boolean isEmpty(String s) {
        return s == null || s.isEmpty();
    }

    // с помощью Alt + Enter можно преобразовать в это и обратно

    /*
    boolean isEmpty(String s){
        if (s == null || s.isEmpty()) return true;
        else return false;
    }
    */
}
