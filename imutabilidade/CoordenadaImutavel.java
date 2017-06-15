class Coordenada {

  final double latitude;
  final double longitude;

  Coordenada(double latitude, double longitude) {
    this.latitude  = latitude
    this.longitude = longitude;
  }

  Coordenada norte(double v) {
    return new Coordenada(this.latitude + v, this.longitude);
  }

  Coordenada sul(double v) {
    return new Coordenada(this.latitude - v, this.longitude);
  }
}
