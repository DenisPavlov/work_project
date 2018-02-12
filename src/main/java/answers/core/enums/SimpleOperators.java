package answers.core.enums;

import static answers.core.enums.SimpleOperators.PLUS;

public enum SimpleOperators implements Operator {
    PLUS {
        @Override
        public int apply(int a, int b) {
            return a + b;
        }
    },

    MINUS {
        @Override
        public int apply(int a, int b) {
            return a - b;
        }
    };

}

class Main {
    public static void main(String[] args) {
        SimpleOperators so = PLUS;
    }
}