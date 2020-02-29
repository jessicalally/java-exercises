public class Demo {

  public static void main(String[] args) {
    IntegerParser newInt = new IntegerParser();
    DoubleParser newDouble = new DoubleParser();

    System.out.println(newInt.typeParsed() + ": " + newInt.parseNumber("8"));
    System.out.println(newDouble.typeParsed() + ": " + newDouble.parseNumber("8"));
  }

}
