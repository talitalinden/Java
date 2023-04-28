 public class Passarinho extends Animal implements Voar {
        public Passarinho(String nome) {
            super(nome);
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