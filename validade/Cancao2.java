class Cancao {
  // final significa constante, não pode ser reatribuído
  private final String titulo, artista;
  private String  album;
  private Integer duracao;
  // construtor com os atributos obrigatórios
  Cancao(String t, String a) {
    // se inválido não é instanciado
    if (t == null || t.trim().length() == 0) throw new IllegalArgumentException();
    if (a == null || a.trim().length() == 0) throw new IllegalArgumentException();
    // se chegou aqui tudo bem :)
    this.titulo  = t;
    this.artista = a;
  }
  // mutators: métodos para alterar o álbum e duração
  void album(String a) { this.album = a; }
  void duracao(Integer d) {
    if (d != null && d <= 0) throw new IllegalArgumentException();
    this.duracao = d;
  }
  // accessors: métodos para consultar título, artista, album e duração
  String  titulo() { return this.titulo; }
  String  artista() { return this.artista; }
  String  album() { return this.album; }
  Integer duracao() { return this.duracao; }
}
