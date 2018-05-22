package tasks.testPackage;

import tasks.other.*;
class Test{
    public static void main(String[] args) {
        String hello = "Hello", lo = "lo";
        System.out.print((tasks.testPackage.Other.hello == hello) + " ");
        System.out.print((tasks.other.Other.hello == hello) + " ");
        System.out.print((hello == ("Hel"+"lo")) + " ");
        System.out.print((hello == ("Hel"+lo)) + " ");
        System.out.println(hello == ("Hel"+lo).intern());
    }
}

class Other {
    static String hello = "Hello";
}
