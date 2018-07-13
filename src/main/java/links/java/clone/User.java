package links.java.clone;

public class User implements Cloneable {
    private String name;
    private int age;
    public User brother;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        return (User)super.clone();
    }
}
