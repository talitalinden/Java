/* Elabre um código que tenha um gato, um cachorro e um passarinho.
Todos possuem nome, todos emitem sons, mas apenas gato e cachorro
podem correr. O passarinho pode voar. */

public class Main {
    public static void main(String[] args) {

        Animal g = new Gato("Bilbo", 6, 5);
        System.out.println("Nome do gato:  " + g.getNome());
        System.out.println("Som: " + g.emitirSom());
        System.out.println("Caracteristica: " + g.correr());

        Cachorro c = new Cachorro("Totó", 10, 13);
        System.out.println("Nome do cachorro:  " + c.getNome());
        System.out.println("Som: " + c.emitirSom());
        System.out.println("Caracteristica: " + c.correr());

        Passarinho p = new Passarinho("Tiquinho", 2, 0.300);
        System.out.println("Nome do passarinho:  " + p.getNome());
        System.out.println("Som: " + p.emitirSom());
        System.out.println("Caracteristica: Este animal voa.");
    }
}