package study.semester1;

import study.semester1.list.Element;
import study.semester1.list.queue.Queue;
import study.semester1.list.stack.Stack;

public class MergeSortV2 {

    // в соответствии с псевдокодом из лекции
    // Слияние q – серии из списка a с r – серией из списка b, запись результата в очередь c
    public static void merge(Stack a, int q, Stack b, int r, Queue c){
        while (q != 0 && r != 0) {
            if (a.peek() <= b.peek()) {
                c.add(new Element(a.get().value));
                q--;
            } else {
                c.add(new Element(b.get().value));
                r--;
            }
        }

        while (q>0){
            c.add(new Element(a.get().value));
            q--;
        }

        while (r>0) {
            c.add(new Element(b.get().value));
            r--;
        }
    }

    // в соответствии с псевдокодом из лекции
    // расщепление
    // расщепление последовательности S на списки a и b
    // n - количество элементов в s
    public static void split(Queue s, Stack a, Stack b, int n) {

        while (s.length > 0) {
            a.add(s.get());


            b.add(s.get());
        }
    }

    public static void main(String[] args) {
        //mergeTest();
        splitTest();
    }

    static void splitTest() {
        Queue queue = new Queue();
        queue.add(new Element(2));
        queue.add(new Element(3));
        queue.add(new Element(1));
        queue.add(new Element(12));
        queue.add(new Element(5));
        queue.add(new Element(66));
        queue.add(new Element(8));
        queue.add(new Element(32));
        queue.add(new Element(21));

        Stack a = new Stack();
        Stack b = new Stack();

        split(queue, a, b, 1);

        System.out.println(a);
    }

    static void mergeTest() {
        Stack a = new Stack();

        a.add(new Element(10));
        a.add(new Element(7));
        a.add(new Element(5));
        a.add(new Element(1));

        Stack b = new Stack();

        b.add(new Element(12));
        b.add(new Element(11));
        b.add(new Element(8));
        b.add(new Element(5));
        b.add(new Element(3));
        b.add(new Element(2));

        Queue queue = new Queue();
        merge(a, a.length, b, b.length, queue);

        while (queue.length > 0) {
            System.out.println(queue.get().value);
        }
    }
}
