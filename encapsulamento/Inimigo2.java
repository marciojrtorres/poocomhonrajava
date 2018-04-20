class Inimigo {
  String nome;
  int energia;

  Inimigo(String nome, int energia) {
    this.nome = nome;
    this.energia = energia;
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
}
