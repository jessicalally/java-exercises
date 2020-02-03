public class ColouredPoint extends Point {

  private final Colour colour;

  public ColouredPoint(double x, double y, double z, Colour colour) {
    super(x, y, z);
    this.colour = colour;
  }

  public Colour getColour(){
    return this.colour;
  }

  @Override
  public String toString() {
    return "(" + super.toString() + ", " + colour + ")";
  }

  @Override
  public boolean equals(Object other){
    if (other instanceof ColouredPoint){
      ColouredPoint otherPoint = (ColouredPoint) other;
      return this.getX() == otherPoint.getX() && this.getY() == otherPoint.getY() && this.getZ() == otherPoint.getZ() && this.getColour() == otherPoint.getColour();
    }
    return false;
  }
}
