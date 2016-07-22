import java.util.Scanner; // scanner é um módulo!
public class Proc1 {
  public static void main(String[] args) {
    // ler dois números
    Scanner scan = new Scanner(System.in);
    int numero1 = scan.nextInt();
    int numero2 = scan.nextInt();
    // descobrir o maior número
    int maior = numero1 > numero2 ? numero1 : numero2;
    int mmc = maior;
    // somar o maior enquanto não for divisível por ambos
    while (mmc % numero1 != 0 || mmc % numero2 != 0) {
      mmc += maior;
    }
    // imprimir mmc
    System.out.println(mmc);
  }
}
