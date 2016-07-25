public class Estrutura4 {

  static String formataData(int[] data) {
    return data[0] + "/"
         + data[1] + "/"
         + data[2];
  }

  public static void main(String[] args) {
    int[] dataInicio = { 1, 7, 2016};
    int[] dataFim    = {31, 7, 2016};

    System.out.println(
      formataData(dataInicio).equals("1/7/2016"));
    System.out.println(
      formataData(dataFim).equals("31/7/2016"));
    System.out.println(
      formataData(new int[]{10,10,2010}).equals("10/10/2010"));
  }
}
