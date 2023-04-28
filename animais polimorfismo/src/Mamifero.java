public class Mamifero extends Animal{
    public Mamifero (String nome, int idade, double peso){
        super (nome, idade, peso);
    }

    @Override
    public String emitirSom() {
        return null;
    }

    @Override
    public String correr() {
        return null;
    }
}
