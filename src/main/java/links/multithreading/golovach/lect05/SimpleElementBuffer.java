package links.multithreading.golovach.lect05;

/*
Буффер с одним элементом
 */
public class SimpleElementBuffer {
    private Integer elem = null;

    public synchronized void put(int newElem) throws InterruptedException {
        while (this.elem != null) {
            this.wait();
        }
        this.elem = newElem;
        this.notifyAll();
    }

    public synchronized int get() throws InterruptedException {
        while (elem == null) {
            this.wait();
        }
        Integer result = this.elem;
        this.elem = null;
        this.notifyAll();
        return result;
    }
}
