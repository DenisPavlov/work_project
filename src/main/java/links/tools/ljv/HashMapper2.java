package links.tools.ljv;

import java.util.HashMap;

public class HashMapper2 {
    public static void main(String[] args) {
        HashMap<CustomElement, Point> map = new HashMap<>();

        Point p1 = new Point( 0,  0 );
        Point p2 = new Point( 1, 10 );
        Point p3 = new Point( 4,  5 );

        // хочу разместить элементы в одной корзине
        map.put( new CustomElement(), p1 );
        map.put( new CustomElement(), p2 );
        map.put( new CustomElement(), p3 );

        LJV.getDefaultContext( ).showPackageNamesInClasses = false;
        LJV.drawGraph(map);
    }
}
