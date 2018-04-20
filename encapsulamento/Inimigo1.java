class Inimigo {
  String nome;
  int energia;

  Inimigo(String nome, int energia) {
    this.nome = nome;
    this.energia = energia;
  }

  void dano(int dano) {
    if (dano < this.energia) {
      this.energia = this.energia - dano;
    } else {
      this.energia = 0;
    }
  }
}
