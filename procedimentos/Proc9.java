public class Proc9 {

  static double potencia(double base, int expoente) {
    double potencia = base;
    for (int i = 1; i < expoente; i++) {
      potencia *= base;
    }
    return potencia;
  }

  static int fatorial(int numero) {
    int fatorial = 1;
    for (int i = 1; i <= numero; i++) {
      fatorial = fatorial * i;
    }
    return fatorial;
  }

  static double seno(double radianos) {
    double seno = 0;
    seno = radianos - (potencia(radianos, 3) / fatorial(3))
                    + (potencia(radianos, 5) / fatorial(5))
                    - (potencia(radianos, 7) / fatorial(7))
                    + (potencia(radianos, 9) / fatorial(9));
    return seno;
  }

  static double radianos(double graus) {
    double PI = 3.1416;
    double radianos;
    radianos = PI * graus / 180.0;
    return radianos;
  }

  public static void main(String[] args) {
    // System.out.println(fatorial(5));
    // combinando os procedimentos
    System.out.println(seno(radianos(75)));
                    //(seno(1.309))
                    //(0.9659270976271132)
    // é uma resposta aproximada
    // a esperada de 0.96592583
    // além disso, double sempre trabalha
    // com aproximações (ver problemas de precisão)
  }
}
