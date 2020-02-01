import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class TestSuite {

  Colour black = new Colour(0,0,0);

  @Test
  public void pointGetX() {
    assertEquals(new Point(42, 52, 62).getX(), 42.0);
  }

  @Test
  public void pointGetX2() {
    assertEquals(new ColouredPoint(42, 52, 62, black).getX(), 42.0);
  }

  @Test
  public void pointGetY() {
    assertEquals(new Point(42, 52, 62).getY(), 52.0);
  }

  @Test
  public void pointGetY2() {
    assertEquals(new ColouredPoint(42, 52, 62, black).getY(), 52.0);
  }

  @Test
  public void pointGetZ() {
    assertEquals(new Point(42, 52, 62).getZ(), 62.0);
  }

  @Test
  public void pointGetZ2() {
    assertEquals(new ColouredPoint(42, 52, 62, black).getZ(), 62.0);
  }

  @Test
  public void calcMagnitude() {
    assertEquals(new Point(3, 4, 0).magnitude(), 5.0);
  }

  @Test
  public void calcMagnitude2() {
    assertEquals(new ColouredPoint(3, 4, 0, black).magnitude(), 5.0);
  }

  @Test
  public void calcDistance() {
    assertEquals(new Point(3, 4, 0).magnitude(), new Point(3,4,0).distanceTo(new Point(0,0,0)) );
  }

  @Test
  public void calcDistance2() {
    assertEquals(new ColouredPoint(3, 4, 0, black).magnitude(), new Point(3,4,0).distanceTo(new Point(0,0,0)) );
  }

}
