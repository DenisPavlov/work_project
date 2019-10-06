package links.tools.ljv;

public class TutorialDemo3 {
    public static void main( String[] args ) {
        String[] animals = new String[ 5 ];
        animals[0] = "bird";
        animals[3] = "horse";
        animals[4] = animals[3].substring(1,3);

        LJV.Context ctxt = LJV.newContext();
        ctxt.treatAsPrimitive(String.class);
        LJV.drawGraph( ctxt, animals );
    }
}
