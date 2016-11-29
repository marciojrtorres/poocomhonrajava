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

  }
}
