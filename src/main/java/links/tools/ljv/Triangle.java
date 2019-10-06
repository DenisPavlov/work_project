package links.tools.ljv;

public class Triangle {
    private LineSegment segAB, segBC, segAC;

    public Triangle( Point A, Point B, Point C ) {
        segAB = new LineSegment( A, B );
        segBC = new LineSegment( B, C );
        segAC = new LineSegment( A, C );
    }

    public static void main( String[] args) {
        Triangle tri = new Triangle( new Point(0,0), new Point(4,0), new Point(4,3) );

        LJV.drawGraph( tri );
    }
}
