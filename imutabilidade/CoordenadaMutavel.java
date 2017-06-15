class Coordenada {

  double latitude;
  double longitude;

  Coordenada(double latitude, double longitude) {
    this.latitude  = latitude
    this.longitude = longitude;
  }

  void norte(double v) {
    this.latitude = this.latitude + v;
  }

  void sul(double v) {
    this.latitude = this.latitude - v;
  }
}
