import java.util.Random;

public class Jogo {

    private Personagem jogador1;
    private Personagem jogador2;

    public Jogo(Personagem jogador1, Personagem jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public void jogar(){
        System.out.println("Status dos Jogadores antes da partida");
        jogador1.currentStatus();
        jogador2.currentStatus();
        System.out.println("_____________________________________");
        this.coletarMoedas(jogador1);
        this.coletarMoedas(jogador2);
        System.out.println("Status dos Jogadores depois da partida");
        jogador1.currentStatus();
        jogador2.currentStatus();
        System.out.println("_____________________________________");
    }

    private void coletarMoedas(Personagem jogador){

        Random rodadas = new Random();
        for (int i = 0; i <= rodadas.nextInt(30); i++){
            jogador.collectCoin();
        }

    }
}
