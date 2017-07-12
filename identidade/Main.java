class Main {
  public static void main(String[] args) {

    Hora h1 = new Hora(13, 25, 55);
    Hora h2 = h1;
    Hora h3 = new Hora(13, 25, 55);
    Hora h4 = new Hora(13, 25, 56);

    System.out.println(h1 == h2); // true
    System.out.println(h1 == h3); // false, não é a mesma instância!

    // usando equals em Hora
    System.out.println(h1.equals(h2)); // true
    System.out.println(h1.equals(h3)); // true
    System.out.println(!h1.equals(h4)); // true

    Veiculo v1 = new Veiculo("IHQ8899", "Fiat", "Palio", 1000);
    Veiculo v2 = new Veiculo("IHQ8899", "Fiat", "Punto", 1400);

    System.out.println(v1.equals(v2)); // true!
  }
}
