public class IntegerParser implements NumberParser {

  @Override
  public Integer parseNumber(String s) {
    return Integer.valueOf(s);
  }

  @Override
  public String typeParsed() {
    return "Integer";
  }
}
