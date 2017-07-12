class Main {
  public static void main(String[] args) {
    // Cancao c = new Cancao(); // proibido
    Cancao c = new Cancao("Vertigo", "U2");
    System.out.println(c.titulo().equals("Vertigo"));
    System.out.println(c.artista().equals("U2"));
    c.duracao(0); // proibido
    c.duracao(193);
    System.out.println(c.duracao().equals(193));
  }
}
