class Main {
  public static void main(String[] args) {

    Pergunta c1 = new Pergunta("user1@mail.me",
      "Vocês enviam para São José dos Ausentes no inverno?");
    System.out.println(c1.codigo().length() == 8);
    for (int i = 0; i < 8; i++) {
      char c = c1.codigo().charAt(i);
      System.out.println(c >= 'A' && c <= 'Z');
    }
    System.out.println(c1.email().equals("user@mail.me"));
    System.out.println(c1.texto().equals("Impressora não imprime"));
    System.out.println(c1.respondida() == false);
    System.out.println(c1.resposta() == null);
    c1.responder("Sim, enviamos :)");
    System.out.println(c1.respondida() == true);
    System.out.println(c1.resposta() == "Sim, enviamos :)");

    Avaliacao e1 = new Avaliacao("user2@mail.me",
      "A entrega foi muito rápida, obrigado!", 5);
    System.out.println(e1.codigo().length() == 8);
    for (int i = 0; i < 8; i++) {
      char c = e1.codigo().charAt(i);
      System.out.println(c >= 'A' && c <= 'Z');
    }
    System.out.println(e1.email().equals("user2@mail.me"));
    System.out.println(e1.texto().equals("A entrega foi muito rápida, obrigado!"));
    System.out.println(e1.nota() == 5);



  }
}
