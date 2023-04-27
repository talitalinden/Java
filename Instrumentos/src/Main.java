/* Elaboe um código para este problema. Todos são instrumentos musicais. Eles são cadastrados
no sistema com nome material, quantidade. Porém, os instrumentos de corda podem precisar trocar a corda.
 */

public class Main {
    public static void main(String[] args) {
        InstrumentosCorda h = new Harpa("Divina", "madeira jacarandá", 3);
        InstrumentosCorda v = new Violao("Bowie", "madeira de lei", 5);
        InstrumentoSopro f = new Flauta("Fufu", "bambu", 10);
    }
}