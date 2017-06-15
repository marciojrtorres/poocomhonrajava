class Main {
  public static void main(String[] args) {

    TV tv1 = new TV("AA");
    TV tv2 = tv1;
    

    tv1.ligarDesligar();
    System.out.println(tv1.volume());
    tv1.aumentarVolume();
    System.out.println(tv1.volume());
    System.out.println(tv2.volume());

    tv2.aumentarVolume();
    tv2.aumentarVolume();
    tv2.aumentarVolume();
    System.out.println(tv1.volume());
    System.out.println(tv2.volume());
  }
}
