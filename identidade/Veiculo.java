class Veiculo {
  final String placa, marca, modelo;
  final int    cilindrada;

  Veiculo(String placa, String marca, String modelo, int cilindrada) {
    this.placa = placa; this.marca = marca; this.modelo = modelo;
    this.cilindrada = cilindrada;
  }

  @Override
  public boolean equals(Object outroObjeto) {
    // verifica se o parâmetro é um Veiculo (e também se não é nulo)
    if (!(outroObjeto instanceof Veiculo)) return false;
    // conversão (coerção (cast)) do outroObjeto para o tipo Veiculo
    Veiculo outroVeiculo = (Veiculo) outroObjeto;
    return this.placa != null && this.placa.equals(outroVeiculo.placa);
  }
}
