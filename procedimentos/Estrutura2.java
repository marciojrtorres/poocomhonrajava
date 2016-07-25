import java.util.Scanner;

public class Estrutura2 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // dois vetores de três posições
    int[] dataInicio = new int[3];
    int[] dataFim = new int[3];
    // zero based indexes
    dataInicio[0] = scan.nextInt();
    dataInicio[1] = scan.nextInt();
    dataInicio[2] = scan.nextInt();

    dataFim[0]    = scan.nextInt();
    dataFim[1]    = scan.nextInt();
    dataFim[2]    = scan.nextInt();

    System.out.println(dataInicio[0] + "/"
                     + dataInicio[1] + "/"
                     + dataInicio[2] + " a "
                     + dataFim[0]    + "/"
                     + dataFim[1]    + "/"
                     + dataFim[2]);
  }
}
