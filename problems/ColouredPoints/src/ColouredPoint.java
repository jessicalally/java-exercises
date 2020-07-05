public class ColouredPoint extends Point {

  private final Colour colour;

  public ColouredPoint(double x, double y, double z, Colour colour) {
    super(x, y, z);
    this.colour = colour;
  }

  public Colour getColour() {
    return this.colour;
  }

  @Override
  public String toString() {
    return "(" + super.toString() + ", " + colour + ")";
  }

  @Override
  public boolean equals(Object other) {
    if (other instanceof ColouredPoint) {
      ColouredPoint otherPoint = (ColouredPoint) other;
      boolean xEqual = this.getX() == otherPoint.getX();
      boolean yEqual = this.getY() == otherPoint.getY();
      boolean zEqual = this.getZ() == otherPoint.getZ();
      boolean coloursEqual = this.getColour() == otherPoint.getColour();
      return xEqual && yEqual && zEqual && coloursEqual;
    }
    return false;
  }

  @Override
  public int hashCode(){
    return super.hashCode() ^ colour.hashCode();
  }
}
