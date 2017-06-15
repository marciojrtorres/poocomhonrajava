class Main {
  public static void main(String[] args) {
    Contador c = new Contador(10);
    System.out.println("Tabuada do 7");
    while (c.valor() < c.limite()) {
      System.out.println("7 x " + c.valor() + " = " + (7 * c.valor()));
      c.avancar();
    }
    System.out.println(c.valor());
  }
}
