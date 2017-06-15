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

  void avancar() {
    if (this.valor < this.limite) {
      valor = valor + 1;
    }
  }
}
