public final class Cachorro extends Mamifero {
    public Cachorro(String nome, int idade, double peso) {

        super(nome, idade, peso);
    }

    @Override
    public String emitirSom() {

        return "Au, au";


        }

    @Override
    public String correr() {
        return "Este animal corre";
    }
}