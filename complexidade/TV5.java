class TV {

    private String  modelo;
    private boolean ligada = false;
    private int     canal  = 14;
    private int     volume = 10;
    // 0 (zero) significa que não há anterior
    private int canalAnterior = 0;

    TV(String modelo) {
      this.modelo = modelo;
      this.ligada = false; // a TV, por padrão, está desligada
      this.canal  = 14; // inicia no canal 14
      this.volume = 10; // inicia com o volume 10
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
      if (this.ligada == true) { // ou só `if (this.ligada)`
        this.ligada = false;
        this.canalAnterior = 0;
      } else {
        this.ligada = true;
      }
      // ou na forma reduzida:
      // ligada = !ligada;
    }

    void aumentarVolume() {
      if (this.ligada && this.volume < 100) {
        this.volume = this.volume + 1;
      }
      // ou na forma reduzida;
      // if (ligada && volume < 100) volume++;
    }

    void baixarVolume() {
      if (this.ligada && this.volume > 0) {
        this.volume = this.volume - 1;
      }
    }

    void subirCanal() {
      if (ligada) {
        this.canalAnterior = this.canal;
        this.canal = this.canal < 69 ? this.canal + 1 : 14;
      }
    }

    void descerCanal() {
      if (ligada) {
        this.canalAnterior = this.canal;
        this.canal = this.canal > 14 ? this.canal - 1 : 69;
      }
    }

    void irParaCanal(int novoCanal) {
      if (novoCanal >= 14 && novoCanal <= 69) { // é válido?
        this.canalAnterior = this.canal;
        this.canal = novoCanal;
      }
    }

    void voltar() {
      if (this.canalAnterior > 0) {
        this.irParaCanal(this.canalAnterior);
      }
    }
}
