public class InstrumentoSopro extends Instrumento {

    public InstrumentosCorda(String nome, String material, int quantidade){
        super (nome, material, quantidade);

        public void afinar(){
        System.out.println("Este instrumento afina.");
    }
}
