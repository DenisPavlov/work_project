package links.tools.ljv;

public class Array3Points {
    public static void main( String[] args ) {
        Point [] points = new Point[ 5 ];
        points[0] = new Point( 0, 0 );
        points[1] = new Point( 4, 0 );
        points[2] = new Point( 3, 5 );

        LJV.drawGraph( points );
    }
}