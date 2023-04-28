public class Roupas extends Produto implements PrecoFixo {
    public Roupas(String nome, double preco){
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
