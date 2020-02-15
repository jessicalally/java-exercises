public class Rectangle extends Shape {

  protected double width;
  protected double height;

  public Rectangle(double width, double height){
    this.width = width;
    this.height = height;
  }

  @Override
  protected double getSize() {
    return width * height;
  }

  @Override
  protected void changeWidth(double w) {
    this.width = w;
  }

  @Override
  protected void changeHeight(double h) {
    this.height = h;
  }

  @Override
  protected boolean isCircle() {
    return false;
  }

  @Override
  protected boolean isSquare() {
    return width == height;
  }


}
