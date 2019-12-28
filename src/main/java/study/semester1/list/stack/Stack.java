package study.semester1.list.stack;

import study.semester1.list.Element;

public class Stack {

    public int length = 0;
    private Element head;

    public void add(Element element) {
        if (element == null) {
            return;
        }
        element.next = head;
        head = element;
        length++;
    }

    public Element get() {
        Element result = head;
        head = head.next;
        length--;
        return result;
    }

    //посмотреть, какой элемент сейчас вернется
    public int peek(){
        return head.value;
    }
}
