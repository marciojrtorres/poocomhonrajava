class RPG {
  public static void main(String[] args) {
    Guerreiro gTorvalds = new Guerreiro("Linus Torvalds");
    Guerreiro gRaymond = new Guerreiro("Eric Raymond");
    Mago mJobs = new Mago("Steve Jobs");
    Mago mGates = new Mago("Bill Gates");
    Arqueiro aLiskov = new Arqueiro("Barbara Liskov");
    Arqueiro aDijkstra = new Arqueiro("Edsger Dijkstra");
    System.out.println(gTorvalds.vida() == 100);
    System.out.println(gRaymond.vida() == 100);
    System.out.println(mJobs.vida() == 100);
    System.out.println(mGates.vida() == 100);
    System.out.println(aLiskov.vida() == 100);
    System.out.println(aDijkstra.vida() == 100);
    gTorvalds.ataca(mJobs);
    System.out.println(mJobs.vida() == 98);
    System.out.println(mJobs.estaVivo() == true);
    aLiskov.ataca(mJobs);
    System.out.println(mJobs.vida() == 97);
    System.out.println(mJobs.estaVivo() == true);
    mGates.ataca(mJobs);
    mGates.ataca(mJobs);
    System.out.println(mJobs.vida() == 95);
    mJobs.ataca(mGates);
    System.out.println(mGates.vida() == 99);
    while (mJobs.estaVivo()) aDijkstra.ataca(mJobs);
    System.out.println(mGates.vida() == 0);
    System.out.println(mJobs.estaVivo() == false);
    gTorvalds.ataca(gRaymond);
    System.out.println(gRaymond.vida() == 98);
    gTorvalds.ataca(aDijkstra);
    System.out.println(aDijkstra.vida() == 98);
    mJobs.ataca(gRaymond); // morto não ataca
    System.out.println(gRaymond.vida() == 98);
    // escreva mais testes
  }
}