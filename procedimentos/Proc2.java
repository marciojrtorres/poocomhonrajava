import java.util.Scanner; // scanner é um módulo!
public class Proc2 {
  public static void main(String[] args) {
    // ler dois números
    Scanner scan = new Scanner(System.in);
    int numero1 = scan.nextInt();
    int numero2 = scan.nextInt();
    // descobrir o maior número
    int maior = numero1 > numero2 ? numero1 : numero2;
    int mmc = maior;
    // somar o maior enquanto não for divisível
    while (mmc % numero1 != 0 || mmc % numero2 != 0) {
      mmc += maior;
    }
    // imprimir mmc
    System.out.println(mmc);

    // ler mais dois números
    int numero3 = scan.nextInt();
    int numero4 = scan.nextInt();
    // descobrir o maior número
    maior = numero3 > numero4 ? numero3 : numero4;
    mmc = maior;
    // somar o maior enquanto não for divisível
    while (mmc % numero3 != 0 || mmc % numero4 != 0) {
      mmc += maior;
    }
    // imprimir mmc
    System.out.println(mmc);
  }
}
