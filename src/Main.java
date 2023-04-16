/* Elabore um programa que resolva o seguinte problema:
 Produto produto1 = new Produto("Camisa" , 49.99 , "Camisa polo azul");
 Produto produto2 = new Produto("Calça" , 99.99 , "Calça jeans preta"); */

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Camisa", 49.99 , "Camisa polo azul");
        Produto p2 = new Produto("Calça", 99.99 , "Calça jeans preta");

        System.out.println("Produto 1: ");
        System.out.println("Nome do produto: " + p1.getPeca());
        System.out.println("Preço: " + p1.getPreco());
        System.out.println("Descrição da peça: " + p1.getDescricao());

        System.out.println("Produto 2: ");
        System.out.println("Nome do produto: " + p2.getPeca());
        System.out.println("Preço: " + p2.getPreco());
        System.out.println("Descrição da peça: " + p2.getDescricao());

    }
}