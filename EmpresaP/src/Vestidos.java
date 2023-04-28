 public final class Vestidos extends Roupa implements PrecoFixo {
        public Vestidos(String nome, double preco){
            super (nome, preco);
        }

    @Override
    public double desconto() {
        return 0;
    }

    @Override
    public double PrecoFixo() {

            return this.preco;
    }
}

