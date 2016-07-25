import java.util.Scanner; // scanner é um módulo!

public class Estrutura1 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int diaInicio = scan.nextInt();
    int mesInicio = scan.nextInt();
    int anoInicio = scan.nextInt();

    int diaFim = scan.nextInt();
    int mesFim = scan.nextInt();
    int anoFim = scan.nextInt();

    System.out.println(diaInicio + "/"
                     + mesInicio + "/"
                     + anoInicio + " a "
                     + diaFim + "/"
                     + mesFim + "/"
                     + anoFim);
  }
}
