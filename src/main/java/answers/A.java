package answers;

public class A {
    Number show(){
        System.out.println("A");
        return null;
    }
}

class B extends A {
    Integer show(){
        System.out.println("B");
        return null;
    }
}
