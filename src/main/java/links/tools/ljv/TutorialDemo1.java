package links.tools.ljv;

public class TutorialDemo1 {
    public static void main(String[] args) {
        String[] animals = new String[5];
        animals[0] = "bird";
        animals[3] = "horse";
        animals[4] = animals[3].substring(1,3);

        LJV.drawGraph( animals );
    }
}
