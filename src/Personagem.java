public class Personagem {

    private String name;
    private float height;
    private int stamina;
    private int age;
    private int collectedCoins;
    private int lifes;

    private int getLifes() {
        return lifes;
    }

    private void setLifes(int lifes) {
        this.lifes = lifes;
    }

    private int getCollectedCoins() {
        return collectedCoins;
    }

    private void setCollectedCoins(int collectedCoins) {
        this.collectedCoins = collectedCoins;
    }

    private void setName(String name) {
        this.name = name;
    }

    private float getHeight() {
        return height;
    }

    private void setHeight(float height) {
        this.height = height;
    }

    private int getStamina() {
        return stamina;
    }

    private void setStamina(int stamina) {
        this.stamina = stamina;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public Personagem(String name, float height, int stamina, int age) {
        this.setName(name);
        this.setHeight(height);
        this.setStamina(stamina);
        this.setAge(age);
        this.setCollectedCoins(0);
        this.setLifes(1);
    }

    public void reduceStamina(){
        if(getStamina() -10 <= 9 ){
            setStamina(0);
        }else{
            setStamina(getStamina() - 10);
        }
    }

    public void gainStamina(){
        if((getStamina() + 5) > 95 ){
            setStamina(100);
        }else{
            setStamina(getStamina() + 5);
        }
    }

    public void growthMushroomEffect(){
        setHeight(getHeight() * 2);
    }

    public void resetStaminaStatus(){
        this.setStamina(100);
    }

    public void die(){
        this.setStamina(0);

        if(getLifes() - 1 <= 0){
            this.setLifes(0);
        }else{
            this.setLifes(getLifes() - 1);
        }

        if(getLifes() >= 0){
            this.resetStaminaStatus();
        }

    }
    public void collectCoin(){
        this.setCollectedCoins(getCollectedCoins() + 1);
        if((getCollectedCoins() % 10) == 0){
            this.setLifes(getLifes() + 1);
        }
    }

    public void jump(){
        if (this.name.equals("Mario"))
            System.out.println("Pulando uma altura de " + this.getHeight() * 0.5);
        if (this.name.equals("Luigi"))
            System.out.println("Pulando uma altura de " + + this.getHeight() * 2);
    }

    public void currentStatus(){
        System.out.println("Nome='" + this.name +
                ", Altura=" + this.getHeight() +
                ", Idade=" + this.age +
                ", Estamina=" + getStamina() +
                ", Quantida de Moedas=" + getCollectedCoins() +
                ", Quantida de Vidas=" + getLifes());
    }
}
