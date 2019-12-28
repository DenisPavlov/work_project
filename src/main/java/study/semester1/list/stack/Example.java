package study.semester1.list.stack;

import study.semester1.list.Element;

public class Example {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.add(new Element(5));
        stack.add(new Element(3));
        stack.add(new Element(2));

        System.out.println(stack.get().value);
        System.out.println(stack.get().value);
        System.out.println(stack.get().value);
    }
}
