public class DoubleAdder implements NumberAdder<Double> {

  @Override
  public Double zero() {
    return 0.0;
  }

  @Override
  public Double add(Double x, Double y) {
    return x + y;
  }
}
