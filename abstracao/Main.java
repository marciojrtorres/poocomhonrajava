class Main {
  public static void main(String[] args) {
    Agua agua = new Agua();
    System.out.println(agua.temperatura()); // 20
    System.out.println(agua.gasosa()); // false
    System.out.println(agua.solida()); // false
    System.out.println(agua.liquida()); // true
    agua.aquecer(); // +1º
    System.out.println(agua.temperatura()); // 21
    System.out.println(agua.gasosa()); // false
    while ( ! agua.gasosa()) agua.aquecer();
    System.out.println(agua.temperatura()); // 100
    System.out.println(agua.gasosa()); // true
    System.out.println(agua.liquida()); // false
  }
}