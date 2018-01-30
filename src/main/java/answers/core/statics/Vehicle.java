package answers.core.statics;

class Vehicle{
    public static void kmToMiles(int km){
        System.out.println("Внутри родительского класса/статического метода");
        Car.kmToMiles(km);
    }
}

