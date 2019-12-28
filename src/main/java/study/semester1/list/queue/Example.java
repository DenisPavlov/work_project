package study.semester1.list.queue;

import study.semester1.list.Element;

public class Example {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(new Element(1));
        queue.add(new Element(2));
        queue.add(new Element(3));
        queue.add(new Element(4));

        System.out.println(queue);
    }
}
