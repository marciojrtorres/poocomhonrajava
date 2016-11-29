class TV {

    private String modelo;
    private boolean ligada = false;
    private int canal = 14;
    private int volume = 10;

    TV(String modelo) {
      this.modelo = modelo;
      this.ligada = false; // a TV, por padrão, está desligada
      this.canal = 14; // inicia no canal 14
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

}
