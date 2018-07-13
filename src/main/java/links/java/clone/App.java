package links.java.clone;

public class App {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Иванов");
        user.setAge(25);

        System.out.println("Даные до клонирования: " + user.getName() + " - " + user.getAge() + " лет");

        User clone;
        try {
            clone = user.clone();
            clone.setAge(30);
            clone.setName("Петров");

            System.out.println("Даные после клонирования: " + clone.getName() + " - " + clone.getAge() + " лет");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        System.out.println("Оригинал после манипуляции с клоном: " + user.getName() + " - " + user.getAge() + " лет");
    }
}
