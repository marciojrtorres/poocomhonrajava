class Cancao {

  String  titulo, artista, album;
  Integer duracao;

  boolean ehValida() {
    if (titulo == null || titulo.trim().length() == 0) return false;
    if (artista == null || artista.trim().length() == 0) return false;
    if (duracao != null && duracao <= 0) return false;
    return true;
  }
}
