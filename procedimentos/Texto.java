class Texto {

  static void corta(String texto, int tamanho) {
    texto.substring(0, tamanho);
  }

  static String corta2(String texto, int tamanho) {
    String cortada = texto.substring(0, tamanho);
    return cortada;
  }

  public static void main(String[] args) {
    String hashtag = "#poocomhonra";
    // cortar a string a partir
    // do 4º caractere (exclusivo)
    Texto.corta(hashtag, 4);
    // o teste não passa (false)
    // a hashtag continua sendo #poocomhonra
    System.out.println(hashtag.equals("#poo"));
    // cortar e devolver em uma cópia
    String hashtagmod = Texto.corta2(hashtag, 4);
    System.out.println(hashtagmod.equals("#poo"));
    System.out.println(hashtag.equals("#poocomhonra"));
  }
}
