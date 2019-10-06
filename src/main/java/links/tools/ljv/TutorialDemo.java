package links.tools.ljv;

public class TutorialDemo {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        numbers[0] = 3;
        numbers[3] = 11;
        numbers[2] = -4;
        numbers[1] = 0;

        LJV.drawGraph( numbers );
    }
}
