package links.tools.ljv;

import java.util.*;

public class HashMapper1 {
    public static void main( String[] args ) {
        HashMap basic = new HashMap();

        Point p1 = new Point( 0,  0 );
        Point p2 = new Point( 1, 10 );
        Point p3 = new Point( 4,  5 );

        basic.put( new Integer(1), p1 );
        basic.put( new Integer(2), p2 );
        basic.put( new Integer(3), p3 );

        LJV.getDefaultContext( ).showPackageNamesInClasses = false;
        LJV.drawGraph( basic );
    }
}
