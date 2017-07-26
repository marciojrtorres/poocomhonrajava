class Coordenada {

  double latitude;
  double longitude;

  Coordenada(double latitude, double longitude) {
    this.latitude  = latitude
    this.longitude = longitude;
  }

  Coordenada() {
    // ou this(0, 0), ou nada
    this.latitude  = 0;
    this.longitude = 0;
  }

}
