class Teste {
  public static void main(String[] args) {

    Inimigo zorak = new Inimigo("Zorak", 50);
    System.out.println(zorak.nome.equals("Zorak"));
    System.out.println(zorak.vivo == true);
    System.out.println(zorak.energia == 50);
    zorak.dano(10);
    System.out.println(zorak.energia == 40);
    System.out.println(zorak.vivo == true);
    zorak.dano(30);
    System.out.println(zorak.energia == 10);
    System.out.println(zorak.vivo == true);
    zorak.dano(20);
    System.out.println(zorak.energia == 0);
    System.out.println(zorak.vivo == false);
    zorak.vivo = true; // violação do encapsulamento
    System.out.println(zorak.energia == 0);
    System.out.println(zorak.vivo == true);

  }
}
