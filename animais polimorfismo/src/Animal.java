public abstract class Animal {
    protected String nome;
    protected int idade;
    protected double peso;

    public Animal(String nome, int idade, double peso) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public abstract String emitirSom();
    public abstract String correr();

    public void Voar (){

    }
}
