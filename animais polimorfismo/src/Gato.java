public final class Gato extends Mamifero {
    public Gato (String nome, int idade, double peso){

        super(nome, idade, peso);
    }


    @Override
    public String emitirSom(){

        return "miau ron ron";
    }

    @Override
    public String correr() {
        return "Este animal corre.";
    }
}
