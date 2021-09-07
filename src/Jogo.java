public class Jogo {
    public static void main(String[] args) {
        Mario mario = new Mario("Mario Bros", 1.5f, 100, 40 );
        mario.pular();
        System.out.println(mario.getStamina());
        mario.reduceStamina();
        System.out.println(mario.getStamina());
        mario.gainStamina();
        System.out.println(mario.getStamina());
        mario.gainStamina();
        System.out.println(mario.getStamina());
        mario.gainStamina();
        System.out.println(mario.getStamina());
        System.out.println(mario.getHeight());
        mario.growthMushroomEffect();
        System.out.println(mario.getHeight());
    }
}
