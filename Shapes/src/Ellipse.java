public class Ellipse extends Shape {

  protected double semiminor;
  protected double semimajor;

  public Ellipse(double semiminor, double semimajor){
    this.semiminor = semiminor;
    this.semimajor = semimajor;
  }

  @Override
  protected double getSize() {
    return semiminor * semimajor * Math.PI;
  }

  @Override
  protected void changeWidth(double w) {
    this.semiminor = w;
  }

  @Override
  protected void changeHeight(double h) {
    this.semimajor = h;
  }

  @Override
  protected boolean isCircle() {
    return semiminor == semimajor;
  }

  @Override
  protected boolean isSquare() {
    return false;
  }
}
