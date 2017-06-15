class Contador {

  private int valor;
  private final int limite;

  Contador(int limite) {
    this.limite = limite;
    this.valor = 0;
  }

  int valor() {
    return this.valor;
  }

  int limite() {
    return this.limite;
  }

  boolean avancar() {
    if (this.valor < this.limite) {
      valor = valor + 1;
      return true;
    }
    return false;
  }

  void zerar() {
    this.valor = 0;
  }
}
