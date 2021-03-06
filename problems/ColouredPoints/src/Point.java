public class Point {

  private final double x;
  private final double y;
  private final double z;

  public Point(double x, double y, double z){
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public double getX(){
    return this.x;
  }

  public double getY(){
    return this.y;
  }

  public double getZ(){
    return this.z;
  }

  public double distanceTo(Point other){
    double distance = 0;
    distance += Math.pow(x - other.getX(), 2);
    distance += Math.pow(y - other.getY(), 2);
    distance += Math.pow(z - other.getZ(), 2);
    return Math.sqrt(distance);
  }

  public Point getOrigin(){
    return new Point(0,0,0);
  }

  public double magnitude(){
    return distanceTo(getOrigin());
  }

  @Override
  public String toString(){
    return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
  }

  @Override
  public boolean equals(Object other){
    if (other instanceof Point) {
      Point otherPoint = (Point) other;
      return this.getX() == otherPoint.getX() && this.getY() == otherPoint.getY()
          && this.getZ() == otherPoint.getZ();
    }
    return false;
  }

  @Override
  public int hashCode(){
    return (int) Math.round(37 * (37 * y + x) + z);
  }
}
