public abstract class Produto {

    public int PrecoFixo;
    public interface PrecoFixo{};
    protected String nome;
        protected double preco;

        public Produto(String nome, double preco){
            this.nome = nome;
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public double desconto() {
            System.out.println();
            return 0;
        }
}
