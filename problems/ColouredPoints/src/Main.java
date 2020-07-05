import java.util.HashSet;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    Set<Point> pointSet = new HashSet<Point>();
    Point p = new Point(0,0,0);
    Point q = new Point(0,0,0);
    pointSet.add(p);
    System.out.println(p.equals(q));
    System.out.println(pointSet.contains(q));

    Set<ColouredPoint> colouredPoints = new HashSet<ColouredPoint>();
    Colour black = new Colour(0,0,0);
    ColouredPoint cp = new ColouredPoint(0,0,0, black);
    ColouredPoint cq = new ColouredPoint(0,0,0, black);
    colouredPoints.add(cp);
    System.out.println(cp.equals(cq));
    System.out.println(colouredPoints.contains(cq));

  }

}

/* If we do not override the hashCode method of Point, although p equals q is true,
pointSet.contains(q) return false, even though intuitively it should return true as p
and q are equivalent.

We do not need to overwrite hashCode in ColouredPoint, but it is beneficial to use the
additional colour field of a ColouredPoint in practice to make the hash codes more diverse.
 */
