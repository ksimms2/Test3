public class Test {

  private static int initialize(int value) {
    System.out.println("initialize");
    return value;
  }

  private static boolean test(int value) {
    System.out.println("test");
    return value > 0;
  }

  private static int reduce(int value) {
    System.out.println("reduce");
    return value /= 2;
  }

  public static void main(String[] args) {
    for (int i = initialize(7); test(i); i = reduce(i)) {
    }
    System.out.println("done");
  }



}
