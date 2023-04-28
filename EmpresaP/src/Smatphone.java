public final class Smatphone extends Eletronicos {

    public Smatphone(String nome, double preco){
        super (nome, preco);
    }

    @Override
    public double desconto(){
        return this.preco * 0.95;
    }
}
