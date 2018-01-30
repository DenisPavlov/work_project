package answers.core.statics;

public class Car extends Vehicle {
    public static void kmToMiles(int km){
        Vehicle.kmToMiles(10);
        System.out.println("Внутри дочернего класса/статического метода ");
    }

}
