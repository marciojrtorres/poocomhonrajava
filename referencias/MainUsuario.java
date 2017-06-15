class Main {
  public static void main(String[] args) {
    Usuario u = new Usuario();
    u.nome = "fin";
    u.senha = "1234";
    System.out.println(u.senha);
    geraSenha(u);
    System.out.println(u.senha);
    geraSenha(u);
    System.out.println(u.senha);
  }

  static void geraSenha(Usuario o) {
    String s = "";
    while (s.length() < 10) {
      s += (char) ((int) (Math.random() * 26) + 97);
    }
    o.senha = s;
  }
}
