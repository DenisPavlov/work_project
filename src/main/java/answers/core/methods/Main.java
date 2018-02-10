package answers.core.methods;

public class Main {

    /*
    В случае с примитивными типами, параметры в методы передаются по значению.
    Тоесть создаются копии параметров и с ними ведется работа в методе.
    При передачи параметра сама переменная не будет меняться так как в метод просто копируется ее значение.
     */
    public int method(int i){
        i = i + 10;
        return i;
    }

    public Integer method(Integer i){
        Integer ii = new Integer(10);
        i = i + ii;
        return i;
    }

    public void oldCatAge(Cat cat){
        cat.age = cat.age + 10;
    }


    public static void main(String[] args) {
        Main main = new Main();

        //примитивный тип int
//        int i = 5;
//        System.out.println("до передачи в метод(примитив) " + i);
//        main.method(i);
//        System.out.println("После метода(примитив) " + i);

        //Объект класса Integer
        Integer ii = new Integer(5);
        System.out.println("до передачи в метод(объект) " + ii);

        Integer iii = main.method(ii);
        System.out.println("после метода(объект) " + ii);

        System.out.println(ii == iii);

//        Cat cat = new Cat(2);
//        System.out.println("До передачи в метод коту было " + cat.age + " лет");
//        main.oldCatAge(cat);
//        System.out.println("После передачи в метод коту стало " + cat.age + " лет");

    }
}

class Cat {
    public int age;

    public Cat(int age) {
        this.age = age;
    }
}
