package links.tools.ljv;

public class TutorialDemo2 {
    public static void main(String[] args) {
        String[] animals = new String[5];
        animals[0] = "bird";
        animals[3] = "horse";
        animals[4] = animals[3].substring(1, 3);

        LJV.Context ctxt = LJV.newContext();
        ctxt.ignoreField("offset");
        ctxt.ignoreField("hash");
        ctxt.ignoreField("count");
        LJV.drawGraph(ctxt, animals);
    }
}
