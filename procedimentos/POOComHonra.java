public class POOComHonra {
  public static void main(String[] args) {
    Data umaData = new Data();
    umaData.dia = 31;
    umaData.mes = 7;
    umaData.ano = 2016;
    Data resultado = umaData.amanha();
    System.out.println(resultado.dia == 1);
    System.out.println(resultado.mes == 8);
    System.out.println(resultado.ano == 2016);
  }
}

class Data {
  int dia, mes, ano;
  static final int[]
      diasMes = {31, 28, 31, 30, 31, 30,
                 31, 31, 30, 31, 30, 31};

  Data amanha() {
    Data amanha = new Data();
    amanha.dia = this.dia + 1;
    amanha.mes = this.mes;
    amanha.ano = this.ano;
    if (amanha.dia > diasMes[amanha.mes - 1]) {
      amanha.dia = 1;
      if (amanha.mes < 12) {
        amanha.mes = amanha.mes + 1;
      } else {
        amanha.mes = 1;
        amanha.ano = amanha.ano + 1;
      }
    }
    return amanha;
  }
}
