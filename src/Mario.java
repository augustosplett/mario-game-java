public class Mario {

    private float altura;
    private String nome;

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

    public void constructor(String nome, float altura){
            this.setAltura(altura);
            this.setNome(nome);
    }

}
