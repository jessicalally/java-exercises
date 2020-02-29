public class DoubleParser implements NumberParser<Double> {

  @Override
  public Double parseNumber(String s) {
    return Double.valueOf(s);
  }

  @Override
  public String typeParsed() {
    return "Double";
  }
}
