public class Mario {

    private String name;
    private float height;
    private int stamina;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Mario(String name, float height, int stamina, int age) {
        this.setName(name);
        this.setHeight(height);
        this.setStamina(stamina);
        this.setAge(age);
    }

    public void pular(){
        System.out.println("mario pulou!");
    }

}
