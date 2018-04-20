import java.util.Scanner;
public class Proc5 {

  static int mmc(int n1, int n2) {
    int maior = n1 > n2 ? n1 : n2;
    int mmc = maior;
    while (mmc % n1 != 0 || mmc % n2 != 0) {
      mmc += maior;
    }
    return mmc;
  }

  public static void main(String[] args) {
    int numero1 = 3;
    int numero2 = 5;
    int resultado = mmc(numero1, numero2);
    // esperado que o mmc entre 3 e 5 seja 15
    // deve imprimir `true`
    System.out.println(resultado == 15);
    // fazendo testes diretamente:
    System.out.println(mmc(5, 6) == 30);
    // testando no limite:
    System.out.println(mmc(14223, 77323) == 1099765029);
  }
}
