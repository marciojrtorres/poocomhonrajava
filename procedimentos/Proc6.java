import java.util.Scanner;
public class Proc6 {

  static int mmc(int n1, int n2) {
    int maior = n1 > n2 ? n1 : n2;
    int mmc = maior;
    while (mmc % n1 != 0 || mmc % n1 != 0) {
      mmc += maior;
    }
    return mmc;
  }

  public static void main(String[] args) {
    // menor inteiro positivo que é múltiplo
    // simultaneamente de a e de b
    System.out.println(mmc(5, -6) == 30);
    System.out.println(mmc(-5, 6) == 30);
    System.out.println(mmc(-5, -6) == 30);
    // se a = 0 ou b = 0, então mmc(a, b)
    // é zero por definição
    System.out.println(mmc(0, 10) == 0);
    System.out.println(mmc(0, -10) == 0);
    System.out.println(mmc(10, 0) == 0);
    System.out.println(mmc(-10, 0) == 0);
    System.out.println(mmc(0, 0) == 0);
  }
}
