class Main {
  public static void main(String[] args) {
    Maquina m = new Maquina();
    System.out.println(m.doceSlot(1) == null);
    System.out.println(m.quantidadeSlot(1) == 0);
    System.out.println(m.precoSlot(1) == 0);
    System.out.println(m.doceSlot(2) == null);
    System.out.println(m.quantidadeSlot(2) == 0);
    System.out.println(m.precoSlot(2) == 0);
    System.out.println(m.doceSlot(3) == null);
    System.out.println(m.quantidadeSlot(3) == 0);
    System.out.println(m.precoSlot(3) == 0);
    System.out.println(m.doceSlot(4) == null);
    System.out.println(m.quantidadeSlot(4) == 0);
    System.out.println(m.precoSlot(4) == 0);
    System.out.println(m.credito() == 0);
    System.out.println(m.creditoString().equals("R$ 0,00"));
    m.abastece(1, "Kit Kat", 5); // slot, doce, preço (R$)
    m.abastece(2, "MM's", 2);
    System.out.println(m.doceSlot(1).equals("Kit Kat"));
    System.out.println(m.quantidadeSlot(1) == 100);
    System.out.println(m.precoSlot(1) == 5);
    System.out.println(m.doceSlot(2).equals("MM's"));
    System.out.println(m.quantidadeSlot(2) == 100);
    System.out.println(m.precoSlot(2) == 2);
    System.out.println(m.doceSlot(3) == null);
    System.out.println(m.quantidadeSlot(3) == 0);
    System.out.println(m.precoSlot(3) == 0);
    m.credita(5);
    System.out.println(m.credito() == 5);
    System.out.println(m.creditoString().equals("R$ 5,00"));
    m.cancela();
    System.out.println(m.credito() == 0);
    System.out.println(m.creditoString().equals("R$ 0,00"));
    m.credita(2);
    m.credita(5); // não acumula (1 cédula por vez)
    System.out.println(m.credito() == 2);
    System.out.println(m.creditoString().equals("R$ 2,00"));
    m.selecionaDoce(1); // doce 1 custa R$ 5
    System.out.println(m.quantidadeSlot(1) == 100);
    System.out.println(m.credito() == 2);
    System.out.println(m.creditoString().equals("R$ 2,00"));
    m.selecionaDoce(2); // doce 2 custa R$ 2 OK
    System.out.println(m.quantidadeSlot(2) == 99);
    System.out.println(m.credito() == 0);
    System.out.println(m.creditoString().equals("R$ 0,00"));
  }
}
