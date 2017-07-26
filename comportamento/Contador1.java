class Contador {

  int valor;
  int limite;

  Contador(int limite) {
    this.limite = limite;
    this.valor  = 0;
  }

  int valor() {
    return this.valor;
  }

  void avancar() {
    if (this.valor < this.limite) {
      valor = valor + 1;
    }
  }
}
