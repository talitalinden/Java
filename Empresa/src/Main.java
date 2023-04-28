/* Elabore um código que tenha uma empresa que vende produtos. Podendo ser livro, eletrônico ou roupa.
Todos eles possuem descontode 10%. eletrônicos apenas 5% e roupas sempre estão com preço fixo.
Neste sentido, o preço final de todos os produtos dependem do desconto aplicado quando há promoção.
 */

public class Main {
    public static void main(String[] args) {
        Livro l = new Livro("Os Despossuídos", 35.00);
        Eletronicos e = new Eletronicos("Tablet Sansung", 1800.00);
        Roupas r = new Roupas("Blusa", 70.00);

        System.out.println("Livro");
        System.out.println("Nome: " + l.getNome());
        System.out.println("Preço: " + l.getPreco());
        System.out.println("Valor após desconto: " + l.desconto());

        System.out.println("Eletrônicos");
        System.out.println("Nome: " + e.getNome());
        System.out.println("Preço: " + e.getPreco());
        System.out.println("Valor após desconto: " + e.desconto());

        System.out.println("Roupas");
        System.out.println("Nome: " + r.getNome());
        System.out.println("Preço: " + r.getPreco());
        System.out.println("Valor após desconto: " + r.PrecoFixo());

    }
}