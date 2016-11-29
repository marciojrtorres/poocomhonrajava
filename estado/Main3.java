class Main {
  public static void main(String[] args) {

    TV tv = new TV("XingLing T800");

    System.out.println(tv.modelo()); // XingLing T800
    System.out.println(tv.modelo().equals("XingLing T800"));

    System.out.println(tv.ligada()); // false
    System.out.println(tv.ligada() == false);

    System.out.println(tv.canal()); // 14
    System.out.println(tv.canal() == 14);

    System.out.println(tv.volume()); // 10
    System.out.println(tv.volume() == 10);

    // com a TV desligada as operações
    // não afetam o estado
    tv.subirCanal();
    System.out.println(tv.canal()); // 14
    System.out.println(tv.canal() == 14);
    tv.descerCanal();
    System.out.println(tv.canal()); // 14
    System.out.println(tv.canal() == 14);
    tv.aumentarVolume();
    System.out.println(tv.volume()); // 10
    System.out.println(tv.volume() == 10);
    tv.baixarVolume();
    System.out.println(tv.volume()); // 10
    System.out.println(tv.volume() == 10);

    // TV ligada
    tv.ligarDesligar(); // liga se estiver desligada, desliga se estiver ligada
    System.out.println(tv.ligada()); // true
    System.out.println(tv.ligada() == true);

    tv.subirCanal();
    System.out.println(tv.canal()); // 15
    System.out.println(tv.canal() == 15);

    tv.aumentarVolume();
    System.out.println(tv.volume()); // 11
    System.out.println(tv.volume() == 11);
    // aumentar 100 vezes o volume
    for (int i = 0; i < 100; i++) tv.aumentarVolume();
    // não deve passar de 100
    System.out.println(tv.volume()); // 100
    System.out.println(tv.volume() == 100);

    tv.baixarVolume();
    System.out.println(tv.volume()); // 99
    System.out.println(tv.volume() == 99);
    // baixar 100 vezes o volume
    for (int i = 0; i < 100; i++) tv.baixarVolume();
    // não deve ser inferior a 0
    System.out.println(tv.volume()); // 0
    System.out.println(tv.volume() == 0);

    tv.subirCanal();
    System.out.println(tv.canal()); // 16
    System.out.println(tv.canal() == 16);
    // subir 100 vezes o canal
    for (int i = 0; i < 100; i++) tv.subirCanal();
    // não deve passar de 69
    System.out.println(tv.canal()); // 60
    System.out.println(tv.canal() == 60);

    // faltam os testes para descer canal

  }
}
