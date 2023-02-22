/*Faça um programa para o cálculo de uma folha de pagamento. Para isso, o sistema
        deve saber o valor do salário. Com base na descrição abaixo, imprima os descontos
        do IR:
        salário até R$900,00 - isento;
        salário de 901,00 até 1500,00 - desconto de 5%;
        salário de 1501,00 até 2500,00 - desconto de 10%;
        salário acima de 2500,00 - desconto de 20% */

public class Main {
    public static void main(String[] args) {

        double salario = 3000.00;
        /*double salario1 = 1250.00;*/
        double desconto = 0; // variável inicializada//
        /*double salario2 = 2000.00;
        double desconto2 = (salario2 * 0.1);
        double salario3 = 3000;
        double desconto3 = (salario3 * 0.2);*/

        if (salario<=900.00) {
            System.out.println("Você está isento");
        }else if (salario>=901.00 && salario<1500){  //variável recebeu valor//
            desconto = (salario * 0.05);
        }else if (salario>=1500.00 && salario<2500){
            desconto = (salario * 0.1);
        }else{
            desconto = (salario * 0.2);
        }

        System.out.println("Você deve pagar " + desconto + " de imposto");

    }
}