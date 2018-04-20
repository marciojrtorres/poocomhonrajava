class Inimigo {
  final String nome;
  private int energia;
  private final int max;

  Inimigo(String nome, int energia) {
    this.nome = nome;
    this.energia = energia;
    this.max = energia;
  }

  void dano(int dano) {
    if (this.vivo()) {
      this.energia = this.energia - dano;
    }
  }

  int energia() {
    return this.energia > 0 ? this.energia : 0;
  }

  boolean vivo() {
    return this.energia() > 0;
  }

  void ressucitar() {
    if (this.energia == 0) {
      this.energia = this.max;
    }
  }
}
