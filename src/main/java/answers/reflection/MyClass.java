package answers.reflection;

public class MyClass {
    public int num;
    public String name;

    public MyClass(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public MyClass(int num) {
        this.num = num;
    }

    public MyClass() {
    }

    public MyClass(String name) {
        this.name = name;
    }

    public int getNum(){
        return  num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int doubleSet(String name, int num){
        this.name = name;
        this.num = num;
        return num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
