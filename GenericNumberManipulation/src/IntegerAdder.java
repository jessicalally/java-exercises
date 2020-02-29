public class IntegerAdder implements NumberAdder<Integer> {

  @Override
  public Integer zero() {
    return 0;
  }

  @Override
  public Integer add(Integer x, Integer y) {
    return x + y;
  }
}
