/* Elabre um código que tenha um gato, um cachorroe um passarinho.
Todos possuem nome, todos emitem sons, mas apenas gato e cachorro
podem correr. O passarinho pode voar. */

public class Main {
    public static void main(String[] args) {
        Gato g = new Gato("Bilbo");
        System.out.println("Nome do gato:  " + g.getNome() + g.emitirSom());
        Cachorro c = new Cachorro("Totó");
        System.out.println("Nome do cachorro:  " + c.getNome() + c.emitirSom());
        Passarinho p = new Passarinho("Tiquinho");
        System.out.println("Nome do passarinho:  " + p.getNome() + p.emitirSom());
    }
}