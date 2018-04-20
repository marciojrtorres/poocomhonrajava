class Inimigo {
  constructor(nome, energia) {
    this.nome = nome;
    this._energia = energia;
    this._max = energia;
  }

  dano(dano) {
    if (this.vivo) {
      this._energia = this._energia - dano;
    }
  }

  get energia() {
    return this._energia > 0 ? this._energia : 0;
  }

  get vivo() {
    return this.energia > 0;
  }

  ressucitar() {
    if ( ! this.vivo) {
      this._energia = this._max;
    }
  }
}

let zorak = new Inimigo('Zorak', 50);
console.assert(zorak.nome === 'Zorak', 'O nome deve ser Zorak');
console.assert(zorak.energia === 50, 'Deve iniciar com 50 de energia');
zorak.dano(10);
console.assert(zorak.energia === 40, 'Deve reduzir 10 e ficar 40');
zorak.dano(30);
console.assert(zorak.energia === 10, 'Deve reduzir 30 e ficar 10');
zorak.dano(20);
console.assert(zorak.energia === 0, 'Mesmo recebendo 20 de dano deve ir de 10 para 0');
