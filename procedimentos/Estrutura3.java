import java.util.Scanner;

public class Estrutura3 {

  static String formataData(int[] data) {
    return data[0] + "/"
         + data[1] + "/"
         + data[2];
  }

  public static void main(String[] args) {
    int[] dataInicio = new int[3];
    int[] dataFim = new int[3];

    dataInicio[0] = scan.nextInt();
    dataInicio[1] = scan.nextInt();
    dataInicio[2] = scan.nextInt();

    dataFim[0]    = scan.nextInt();
    dataFim[1]    = scan.nextInt();
    dataFim[2]    = scan.nextInt();

    System.out.println(formataData(dataInicio) + " a "
                     + formataData(dataFim));
  }
}
