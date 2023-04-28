public class Main {
    public static void main(String[] args) {

    Produto l = new LivroFantasia("O Hobbit", 55.00);
    Produto e = new Smatphone("Sansung", 2500.00);
    Produto v = new Vestidos("Antix", 200.00);

        System.out.println("Livro");
        System.out.println("Nome: " + l.getNome());
        System.out.println("Preço: " + l.getPreco());
        System.out.println("Valor após desconto: " + l.desconto());

        System.out.println("Eletrônicos");
        System.out.println("Nome: " + e.getNome());
        System.out.println("Preço: " + e.getPreco());
        System.out.println("Valor após desconto: " + e.desconto());

        System.out.println("Roupas");
        System.out.println("Nome: " + v.getNome());
        System.out.println("Preço: " + v.getPreco());
        System.out.println("Não há desconto na categoria roupas. ");

    }
}