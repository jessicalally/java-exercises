public class Colour {

  private final int r;
  private final int g;
  private final int b;

  public Colour(int r, int g, int b) {
    this.r = r;
    this.g = g;
    this.b = b;
  }

  private int getR() {
    return this.r;
  }

  private int getG() {
    return this.g;
  }

  private int getB() {
    return this.b;
  }

  @Override
  public String toString() {
    return "(" + getR() + ", " + getG() + ", " + getB() + ")";
  }

}
