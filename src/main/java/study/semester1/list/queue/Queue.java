package study.semester1.list.queue;

import study.semester1.list.Element;

public class Queue {
    private Element head;
    private Element tail;
    public int length = 0;

    public void add(Element element) {
        element.next = null;
        if (head != null) {
            tail.next = element;
        } else {
            head = element;
        }
        tail = element;
        length++;
    }

    public Element get() {
        if (head == null) {
            return null;
        }

        Element result = head;
        head = head.next;
        length--;
        return result;
    }
}
