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
    },

    MULTI {
        @Override
        public int apply(int a, int b) {
            return a * b;
        }
    },

    DIVISION {
        @Override
        public int apply(int a, int b) {
            return a / b;
        }
    }

}

class Main {
    public static void main(String[] args) {
        for (SimpleOperators simpleOperators : SimpleOperators.values()) {
            System.out.println(simpleOperators.apply(20, 10));
        }
    }
}