public class DataMain {
  public static void main(String[] args) {
    int[] dataInicio = { 1, 7, 2016};
    int[] dataFim    = {31, 7, 2016};

    System.out.println(
      Data.formataData(dataInicio).equals("1/7/2016"));
    System.out.println(
      Data.formataData(dataFim).equals("31/7/2016"));
    System.out.println(
      Data.formataData(new int[]{10,10,2010}).equals("10/10/2010"));

    // cumprindo primeiro o amanhã (soma um dia)
    int[] dataResult = Data.amanha(dataInicio);
    System.out.println(dataResult[0] == 2);
    System.out.println(dataResult[1] == 7);
    System.out.println(dataResult[2] == 2016);
    dataResult = Data.amanha(dataFim);
    System.out.println(dataResult[0] == 1);
    System.out.println(dataResult[1] == 8);
    System.out.println(dataResult[2] == 2016);

    int[] umaData   = {1, 1, 2016};
    int[] resultado = Data.somaDias(umaData, 40);
    System.out.println(resultado[0] == 10);
    System.out.println(resultado[1] == 2);
    System.out.println(resultado[2] == 2016);

    int[] bissexto = {28, 2, 2016};
    System.out.println(Data.amanha(bissexto)[0] == 29);
    System.out.println(Data.amanha(bissexto)[1] == 2);
    System.out.println(Data.amanha(bissexto)[2] == 2016);
  }
}
