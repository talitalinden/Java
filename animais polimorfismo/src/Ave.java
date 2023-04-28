public class Ave extends Animal implements Voa {
    public Ave (String nome, int idade, double peso){
        super (nome, idade, peso);
    }

    @Override
    public void Voa() {
        super.Voar();
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
