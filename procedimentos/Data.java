public class Data {
                       // Jan Fev Mar Abr Mai Jun
  static int[] diasMes = {31, 28, 31, 30, 31, 30,
                          31, 31, 30, 31, 30, 31};
                       // Jul Ago Set Out Nov Dez
  static int[] amanha(int[] data) {
    // copiar o estado
    int[] amanha = {data[0] + 1, data[1], data[2]};
    // se ultrapassou o último dia do mês
    if (amanha[0] > diasMes[amanha[1] - 1]) {
      amanha[0] = 1; // dia 1
      // se antes de dezembro
      if (amanha[1] < 12) {
        amanha[1] = amanha[1] + 1; // próximo mês
      } else { // se em dezembro
        amanha[1] = 1; // janeiro do
        amanha[2] = amanha[2] + 1; // próximo ano
      }
    }
    return amanha;
  }

  static int[] somaDias(int[] data, int dias) {
    int[] resultado = {data[0], data[1], data[2]};
    for (int i = 0; i < dias; i++) {
      resultado = amanha(resultado);
    }
    return resultado;
  }

  static String formataData(int[] data) {
    return data[0] + "/"
         + data[1] + "/"
         + data[2];
  }
}
