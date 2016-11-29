class Coordenada {

  double latitude;
  double longitude;

  Coordenada(double latitude, double longitude) {
    this.latitude  = latitude
    this.longitude = longitude;
  }

  @Override public String toString() {
    return this.latitude + ", " + this.longitude;
  }
}
