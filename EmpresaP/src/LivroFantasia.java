public final class LivroFantasia extends Livro{
    public LivroFantasia (String nome, double preco){
        super (nome, preco);


        }
        @Override
        public double desconto(){
        return this.preco * 0.90;
    }

}
