class Teste {
  public static void main(String[] args) {
    Horario h1 = new Horario();
    System.out.println(h1.horas); // 0
    System.out.println(h1.horas == 0); // true
    System.out.println(h1.minutos); // 0
    System.out.println(h1.minutos == 0); // true
    System.out.println(h1.segundos); // 0
    System.out.println(h1.segundos == 0); // true

    // 13:45:16
    Horario h2 = new Horario(13, 45, 16);
    System.out.println(h2.horas == 13); // true
    System.out.println(h2.minutos == 45); // true
    System.out.println(h2.segundos == 16); // true
    System.out.println(
      h2.horas + ":" + h2.minutos + ":" + h2.segundos
    ); // 13:45:16
  }
}
