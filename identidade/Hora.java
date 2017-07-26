class Hora {

  final int horas, minutos, segundos;

  Hora(int horas, int minutos, int segundos) {
    this.horas    = horas;
    this.minutos  = minutos;
    this.segundos = segundos;
  }

  @Override
  public boolean equals(Object outroObjeto) {
    // se forem a mesma instância obviamente eles têm o mesmo estado
    if (this == outroObjeto) return true;
    // verifica se o parâmetro é uma Hora (e também se não é nulo)
    if (!(outroObjeto instanceof Hora)) return false;
    // conversão (coerção (cast)) do outroObjeto para o tipo Hora
    Hora outraHora = (Hora) outroObjeto;
    // verdadeiro se a outraHora tem os mesmos valores
    // para horas, minutos e segundos
    return (this.horas    == outraHora.horas   &&
            this.minutos  == outraHora.minutos &&
            this.segundos == outraHora.segundos);
  }
}
