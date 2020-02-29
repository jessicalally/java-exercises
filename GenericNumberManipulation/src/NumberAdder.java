public interface NumberAdder <T extends Number> {

  // Return a number of type T that represents zero
  T zero();

  // Return the sum of x and y
  T add(T x, T y);

}
