
public class Rectangle {

  private final Point topLeft;
  private final int width;
  private final int height;

  public Rectangle(Point topLeft, int width, int height) {
    this.topLeft = topLeft;
    this.width = width;
    this.height = height;
  }

  public Point getTopLeft() {
    return topLeft;
  }

  public Point getBottomRight() {
    return new Point(
        getTopLeft().getCoordX() + getWidth(),
        getTopLeft().getCoordY() + getHeight()
    );
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public int area() {
    return getWidth() * getHeight();
  }

  public boolean contains(Rectangle other) {
    return
        getTopLeft().getCoordX() <= other.getTopLeft().getCoordX()
            && getTopLeft().getCoordY() <= other.getTopLeft().getCoordY()
            && other.getHeight() <= getHeight()
            && other.getWidth() <= getWidth();
  }

  @Override
  public String toString() {
    return "(top-left = " + getTopLeft() + ", width = " + getWidth()
        + ", height = " + getHeight() + ")";
  }

}