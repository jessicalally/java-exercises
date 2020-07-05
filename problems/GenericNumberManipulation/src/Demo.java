public class Demo {

  public static void main(String[] args) {
    IntegerParser newInt = new IntegerParser();
    DoubleParser newDouble = new DoubleParser();

    System.out.println(newInt.typeParsed() + ": " + newInt.parseNumber("8"));
    System.out.println(newDouble.typeParsed() + ": " + newDouble.parseNumber("8"));

    IntegerAdder intAdd = new IntegerAdder();
    DoubleAdder doubleAdd = new DoubleAdder();

    System.out.println(intAdd.add(intAdd.zero(), 5));
    System.out.println(doubleAdd.add(doubleAdd.zero(), 5.0));
  }

}
