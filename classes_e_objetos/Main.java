class Main {
  public static void main(String[] args) {

    Livro liv1   = new Livro();
    liv1.titulo  = "Neuromancer";
    liv1.autor   = "William Gibson";
    liv1.paginas = 321;

    Livro liv2   = new Livro();
    liv2.titulo  = "Fortaleza Digital";
    liv2.autor   = "Dan Brown";
    liv2.paginas = 197;

    System.out.println("Livro " + liv1.titulo
                     + " de "   + liv1.autor
                     + " com "  + liv1.paginas
                     + " páginas");

    System.out.println("Livro " + liv2.titulo
                     + " de "   + liv2.autor
                     + " com "  + liv2.paginas
                     + " páginas");
  }
}
