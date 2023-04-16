public class Produto {

    private String peca;
    private double preco;
    private String descricao;

    public Produto (String peca, double preco, String descricao) {
        this.peca = peca;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String getPeca() {
        
        return peca;
    }

    public void setPeca(String peca) {
        
        this.peca = peca;
    }

    public double getPreco() {
        
        return preco;
    }

    public void setPreco(float preco) {
        
        this.preco = preco;
    }

    public String getDescricao() {
        
        return descricao;
    }

    public void setDescricao(String descricao) {
        
        this.descricao = descricao;
    }
}
