class Teste {
  public static void main(String[] args) {

    Inimigo zorak = new Inimigo("Zorak", 50);
    System.out.println(zorak.nome.equals("Zorak"));
    System.out.println(zorak.energia == 50);
    zorak.dano(10);
    System.out.println(zorak.energia == 40);
    zorak.dano(30);
    System.out.println(zorak.energia == 10);
    zorak.dano(20);
    System.out.println(zorak.energia == 0);
    // ressucitação
    if (zorak.energia == 0) zorak.energia = 50;
    System.out.println(zorak.energia == 50);



  }
}
