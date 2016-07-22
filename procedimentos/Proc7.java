public class Proc7 {

  static int dobro(int n) {
    return n + n; // ou n * 2
  }

  public static void main(String[] args) {
    System.out.println(dobro(0) == 0);
    System.out.println(dobro(5) == 10);
    System.out.println(dobro(90) == 180);
  }
}
