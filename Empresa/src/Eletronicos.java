public class Eletronicos extends Produto {
    public Eletronicos (String nome, double preco){
        super (nome, preco);
    }
    @Override
    public double desconto(){
        return this.preco * 0.95;
    }
}
