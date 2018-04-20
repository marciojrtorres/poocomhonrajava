import java.util.Scanner;

public class Proc4 {
 // esse int antes do nome signigica um retorno inteiro
  static int mmc(int n1, int n2) {
    int maior = n1 > n2 ? n1 : n2;
    int mmc = maior;
    while (mmc % n1 != 0 || mmc % n2 != 0) {
      mmc += maior;
    }
    // aqui trocamos o print pelo return
    return mmc;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numero1 = scan.nextInt();
    int numero2 = scan.nextInt();
    // agora a chamada traz um retorno
    // que pode ser atribuído e impresso
    int resultado = mmc(numero1, numero2);
    System.out.println(resultado);
    // ou então ser feito diretamente:
    System.out.println(mmc(scan.nextInt(), scan.nextInt()));
  }
}
