package answers.OOP.polimorfism;

public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle();
        circle.draw();

        Drawing drawing = new Triangle();
        drawing.draw();

        Triangle triangle = new Triangle();
        System.out.println(((Drawing)triangle).COLOR);
        System.out.println(((Drawing1)triangle).COLOR);
    }

    public static void drawShape(Drawing drawing){
        drawing.draw();
    }
}
