public class Mario {

    private float altura;
    private String nome;

    public Mario(String mario, float altura) {
        this.setNome("mario");
        this.setAltura(altura);

    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void pular(){
        System.out.println("mario pulou!");
    }

}
