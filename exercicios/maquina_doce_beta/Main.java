class Main {
  public static void main(String[] args) {
    Maquina maquina = new Maquina();
    System.out.println(maquina.doceSlot(1) == null);
    System.out.println(maquina.quantidadeSlot(1) == 0);
    System.out.println(maquina.precoSlot(1) == 0);
    System.out.println(maquina.doceSlot(2) == null);
    System.out.println(maquina.quantidadeSlot(2) == 0);
    System.out.println(maquina.precoSlot(2) == 0);
    System.out.println(maquina.doceSlot(3) == null);
    System.out.println(maquina.quantidadeSlot(3) == 0);
    System.out.println(maquina.precoSlot(3) == 0);
    System.out.println(maquina.doceSlot(4) == null);
    System.out.println(maquina.quantidadeSlot(4) == 0);
    System.out.println(maquina.precoSlot(4) == 0);
    System.out.println(maquina.credito() == 0);
    System.out.println(maquina.creditoString().equals("R$ 0,00"));
    maquina.abastece(1, "Kit Kat", 5); // slot, doce, preço (R$)
    maquina.abastece(2, "MM's", 2);
    System.out.println(maquina.doceSlot(1).equals("Kit Kat"));
    System.out.println(maquina.quantidadeSlot(1) == 100);
    System.out.println(maquina.precoSlot(1) == 5);
    System.out.println(maquina.doceSlot(2).equals("MM's"));
    System.out.println(maquina.quantidadeSlot(2) == 100);
    System.out.println(maquina.precoSlot(2) == 2);
    System.out.println(maquina.doceSlot(3) == null);
    System.out.println(maquina.quantidadeSlot(3) == 0);
    System.out.println(maquina.precoSlot(3) == 0);
    maquina.credita(5);
    System.out.println(maquina.credito() == 5);
    System.out.println(maquina.creditoString().equals("R$ 5,00"));
    maquina.cancela();
    System.out.println(maquina.credito() == 0);
    System.out.println(maquina.creditoString().equals("R$ 0,00"));
    maquina.credita(2);
    maquina.credita(5); // não acumula (1 cédula por vez)
    System.out.println(maquina.credito() == 2);
    System.out.println(maquina.creditoString().equals("R$ 2,00"));
    maquina.selecionaDoce(1); // doce 1 custa R$ 5
    System.out.println(maquina.quantidadeSlot(1) == 100);
    System.out.println(maquina.credito() == 2);
    System.out.println(maquina.creditoString().equals("R$ 2,00"));
    maquina.selecionaDoce(2); // doce 2 custa R$ 2 OK
    System.out.println(maquina.quantidadeSlot(2) == 99);
    System.out.println(maquina.credito() == 0);
    System.out.println(maquina.creditoString().equals("R$ 0,00"));
  }
}
