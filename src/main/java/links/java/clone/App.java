package links.java.clone;

public class App {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Иванов");
        user.setAge(25);

        User brother = new User();
        brother.setName("Иванов 1");

        user.brother = brother;

        System.out.println("Даные до клонирования: " + user.getName() + " - " + user.getAge() + " лет");
        System.out.println("Брат до клонирования: " + user.brother.getName());

        User clone;
        try {
            clone = user.clone();
            clone.setAge(30);
            clone.setName("Петров");

            System.out.println("Даные после клонирования: " + clone.getName() + " - " + clone.getAge() + " лет");
            System.out.println("Брат после клонирования: " + clone.brother.getName());

            clone.brother.setName("Петров");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        System.out.println("Оригинал после манипуляции с клоном: " + user.getName() + " - " + user.getAge() + " лет");
        System.out.println("Брат после манипуляции с клоном клонирования: " + user.brother.getName());
    }
}
