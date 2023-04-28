public final class Passarinho extends Ave {
    public Passarinho(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public String emitirSom() {
        return "Piu, piu";
    }

    @Override
    public void Voar() {
        System.out.println("Este animal voa.");
    }
}