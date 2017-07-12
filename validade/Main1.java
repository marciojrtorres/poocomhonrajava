class Main {
  public static void main(String[] args) {
    Cancao c = new Cancao();
    System.out.println(c.ehValida()); // false
    c.titulo = "Vertigo";
    System.out.println(c.ehValida()); // false
    c.artista = "U2";
    System.out.println(c.ehValida()); // true
    c.duracao = 0;
    System.out.println(c.ehValida()); // false
    c.duracao = 193;
    System.out.println(c.ehValida()); // true
  }
}
