class Texto2 {

  static String corta(String texto, int tamanho) {
    // reservando o espaço para os caracteres
    char[] caracteres = new char[tamanho];
    // copiando da string para o vetor
    for (int i = 0; i < tamanho; i++) {
      caracteres[i] = texto.charAt(i);
    }
    // usando o vetor para uma String
    return new String(caracteres);
  }

  public static void main(String[] args) {
    String hashtag = "#poocomhonra";
    System.out.println(corta(hashtag, 1).equals("#"));
    System.out.println(corta(hashtag, 2).equals("#p"));
    System.out.println(corta(hashtag, 3).equals("#po"));
    System.out.println(corta(hashtag, 4).equals("#poo"));
    System.out.println(corta(hashtag, 5).equals("#pooc"));
    // faltam as situações excepcionais, por exemplo:
    // System.out.println(corta(hashtag, 20).equals("#poocomhonra"));
  }
}
