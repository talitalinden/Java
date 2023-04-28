public class Livro extends Produto {
    public Livro (String nome, double preco){
        super (nome, preco);

    }
   @Override
   public double desconto(){
        return this.preco * 0.90;
   }

}
