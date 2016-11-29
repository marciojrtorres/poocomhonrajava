class DadosData {
  int dia, mes, ano;
}

class DataMisto {
  static int[] diasMes = {31, 28, 31, 30, 31, 30,
                          31, 31, 30, 31, 30, 31};

  static DadosData amanha(DadosData data) {
    DadosData amanha = new DadosData();
    amanha.dia = data.dia + 1;
    amanha.mes = data.mes;
    amanha.ano = data.ano;
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

  public static void main(String[] args) {
    DadosData umaData = new DadosData();
    umaData.dia = 31;
    umaData.mes = 7;
    umaData.ano = 2016;
    DadosData resultado = DataMisto.amanha(umaData);
    System.out.println(resultado.dia == 1);
    System.out.println(resultado.mes == 8);
    System.out.println(resultado.ano == 2016);
  }
}
