public abstract class Animal {
    protected String nome;


    public Animal(String nome){
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public abstract String emitirSom();
}
