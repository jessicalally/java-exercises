import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestSuite {

  Colour black = new Colour(0,0,0);
  Colour white = new Colour(255,255,255);

  @Test
  public void equalPoints(){
    assertTrue(new Point(0,1,2).equals(new Point(0,1,2)));
  }

  @Test
  public void unEqualPoints(){
    assertFalse(new Point(0,1,2).equals(new Point(0,1,1)));
  }

  @Test
  public void equalColouredPoints(){
    assertTrue(new ColouredPoint(0,1,2, black).equals(new ColouredPoint(0,1,2, black)));
  }

  @Test
  public void unEqualColouredPoints(){
    assertFalse(new ColouredPoint(0,1,2, black).equals(new ColouredPoint(0,1,2, white)));
  }

  @Test
  public void equalPoints2(){
    assertTrue(new Point(0,1,2).equals(new ColouredPoint(0,1,2, black)));
  }

  @Test
  public void unEqualPoints2(){
    assertFalse(new ColouredPoint(0,1,2, black).equals(new Point (0,1,2)));
  }


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
