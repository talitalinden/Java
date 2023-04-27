public class InstrumentosCorda extends Instrumento {

    public InstrumentosCorda(String nome, String material, int quantidade){
        super (nome, material, quantidade);
    }

    public void trocarCorda (){
        System.out.println("Este instrumento troca corda");
    }

}
