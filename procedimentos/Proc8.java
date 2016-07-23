public class Proc8 {

  static int menor(int a, int b) {
    System.out.println("calculando o menor");
    int menor = a < b ? a : b;
    System.out.println("menor calculado");
    return menor;
  }

  static int mdc(int a, int b) {
    System.out.println("calculando o mdc");
    int mdc = menor(a, b);
    while (a % mdc != 0 || b % mdc !=0) {
      mdc = mdc - 1;
    }
    System.out.println("mdc calculado");
    return mdc;
  }

  static int mmc(int a, int b) {
    System.out.println("calculando o mmc");
    int mmc = a / mdc(a, b) * b;
    System.out.println("mmc calculado");
    return mmc;
  }

  public static void main(String[] args) {
    // testando o mmc
    System.out.println(mmc(5, 6) == 30);
  }
}
