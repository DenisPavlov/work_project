package links.multithreading.golovach.jmm;

public class App {
    static Str str = null;

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                str = new Str(new char[]{'H', 'e', 'l', 'l', 'o'}, 0, 5);
            }
        }).start();

        while (true) {
            Str tmp = str;
            if (tmp != null) {
                System.out.println(str.value);
                System.out.println(str.len);
                System.out.println(str.off);
            }
        }
    }
}

class Str {
    final char[] value;
    final int off;
    final int len;

    public Str(final char[] value, final int off, final int len) {
        this.value = value;
        this.off = off;
        this.len = len;
    }
}
