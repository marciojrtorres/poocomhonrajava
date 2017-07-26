class TV {

  private String  modelo;
  private boolean ligada = false;
  private int     canal  = 14;
  private int     volume = 10;

  TV(String modelo) {
    this.modelo = modelo;
    this.ligada = false;
    this.canal  = 14;
    this.volume = 10;
  }

  String modelo() {
    return this.modelo;
  }

  boolean ligada() {
    return this.ligada;
  }

  int canal() {
    return this.canal;
  }

  int volume() {
    return this.volume;
  }

  void ligarDesligar() {
    ligada = !ligada;
  }

  void aumentarVolume() {
    if (ligada && volume < 100) volume++;
  }

  void baixarVolume() {
    if (this.ligada && this.volume > 0) {
      this.volume = this.volume - 1;
    }
  }

  void subirCanal() {
    if (ligada) canal = canal < 69 ? canal + 1 : 14;
  }

  void descerCanal() {
    if (ligada) {
      if (this.canal > 14) {
        this.canal = this.canal - 1;
      } else {
        this.canal = 69;
      }
    }
  }
}
