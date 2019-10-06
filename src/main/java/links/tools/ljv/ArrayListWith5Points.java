package links.tools.ljv;

import java.util.*;

public class ArrayListWith5Points {
    public static void main( String [] args ) {
        ArrayList point = new ArrayList( );
        point.add( new Point( 0, 0 ) );
        point.add( new Point( 4, 0 ) );
        point.add( new Point( 3, 5 ) );
        point.add( new Point(-1, 3 ) );
        point.add( new Point(13, 2 ) );

        Point pp = new Point(10, 20);
        point.add(pp);
        point.add(pp);

        LJV.drawGraph( point );
    }
}
