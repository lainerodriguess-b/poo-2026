class Personagem:
    def __init__(self, nome, vida, forca):
        self.nome = nome
        self.vida = vida
        self.forca = forca

    def receberDano(self, dano):
        self.vida = self.vida - dano
    def estaVivo(self):
        return self.vida > 0
    def ficha(self):
        print("Nome:", self.nome)
        print("Vida:", self.vida)
        print("Forca:", self.forca)
    def atacar(self, alvo):
        alvo.receberDano(self.forca)
if __name__ == "__main__":
    heroi = Personagem("Mari", 100, 60)
    chefe = Personagem("Laine", 100, 100)

    print("ANTES DA BATALHA")
    heroi.ficha()
    chefe.ficha()

    while heroi.estaVivo() and chefe.estaVivo():
        heroi.atacar(chefe)
    if chefe.estaVivo():
            chefe.atacar(heroi)

    print("DEPOIS DA BATALHA")
    heroi.ficha()
    chefe.ficha()

    if heroi.estaVivo():
        print("Vencedora:", heroi.nome)
    else:
        print("Vencedora:", chefe.nome)
