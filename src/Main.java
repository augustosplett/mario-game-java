import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Personagem mario = new Personagem("Mario", 1.5f, 100, 40 );
        Personagem luigi = new Personagem("Luigi", 1.8f, 100, 38 );
        Jogo jogo = new Jogo(mario, luigi);

        jogo.jogar();

    }
}
