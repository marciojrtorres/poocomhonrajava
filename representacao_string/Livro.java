class Livro {

  String titulo;
  String autor;
  int    paginas;

  @Override public String toString() {
    return "Livro " + this.titulo
           + " de " + this.autor
           + " com " + this.paginas
           + " páginas";
  }
}
