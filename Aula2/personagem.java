public class Main {
    String nome;
    int vida;
    int forca;
  
 Main(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }
    void receberDano(int dano) {
        vida = vida - dano;
    }
    boolean estaVivo() {
        return vida > 0;
    }
    void ficha() {
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Forca: " + forca);
    }
    void atacar(Main alvo) {
        alvo.receberDano(forca);
    }
public static void main(String[] args) {
     Main heroi = new Main("Anaju", 100, 80);
     Main chefe = new Main("Laine", 100, 20);
      System.out.println("ANTES DA BATALHA");
      heroi.ficha();
      chefe.ficha();

  while (heroi.estaVivo() && chefe.estaVivo()) {
  heroi.atacar(chefe);
  if (chefe.estaVivo()) {
      chefe.atacar(heroi);
  }
  }

    System.out.println("DEPOIS DA BATALHA");
    heroi.ficha();
    chefe.ficha();

        if (heroi.estaVivo()) {
            System.out.println("Vencedora: " + heroi.nome);
        } else {
            System.out.println("Vencedora: " + chefe.nome);
        }
    }
}
