class Agua {
  private int temp = 20;

  void aquecer() { this.temp++; }

  void esfriar() { this.temp--; }

  int temperatura() {
    return this.temp;
  }

  boolean solida() {
    return this.temp <= 0;
  }

  boolean gasosa() {
    return this.temp >= 100;
  }

  boolean liquida() {
    return !solida() && !gasosa();
  }
}
