class Numero {

  int n;

  Numero(int n) {
    this.n = n;
  }

  int dobro() {
    return this.n + this.n; // ou this.n * 2
  }

  public static void main(String[] args) {
    Numero n1 = new Numero(5);
    System.out.println(n1.dobro() == 10);
    System.out.println(new Numero(90).dobro() == 180);
    Numero zero = new Numero(0);
    System.out.println(zero.dobro() == 0);
  }
}
