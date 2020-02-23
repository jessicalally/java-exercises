public class Demo {

  public static void transferStacks(GenericStack dst, GenericStack src){
    while (!src.isEmpty()){
      dst.push(src.pop());
    }
  }

  public static void main(String[] args) {
    GenericStackArray array = new GenericStackArray();
    GenericStackList list = new GenericStackList();

    array.push("The");
    array.push("quick");
    array.push("brown");
    array.push("fox");
    array.push("jumped");
    array.push("over");
    array.push("the");
    array.push("lazy");
    array.push("dog");

    transferStacks(list, array);

    assert array.isEmpty();

    while (!list.isEmpty()){
      System.out.println(list.pop());
    }
  }

}
