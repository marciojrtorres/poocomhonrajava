import java.util.Scanner; // scanner é um módulo!
public class Proc3 {
  // static = método estático (representa uma função/procedimento em Java)
  // void = sem retorno (return)
  // mmc = nome da função
  // int n1, int n2 = dados de entrada necessários
  static void mmc(int n1, int n2) {
    // seja qual for a variável elas entram como n1 e n2
    // descobrir o maior número
    int maior = n1 > n2 ? n1 : n2;
    int mmc = maior;
    // somar o maior enquanto não for divisível
    while (mmc % n1 != 0 || mmc % n1 != 0) {
      mmc += maior;
    }
    // imprimir mmc
    System.out.println(mmc);
  }

  public static void main(String[] args) {
    // ler dois números
    Scanner scan = new Scanner(System.in);
    int numero1 = scan.nextInt();
    int numero2 = scan.nextInt();
    // chamada/invocação da função/procedimento
    mmc(numero1, numero2);
    // ler mais dois números
    int numero3 = scan.nextInt();
    int numero4 = scan.nextInt();
    // chamada/invocação da função/procedimento
    mmc(numero3, numero4);
  }
}
