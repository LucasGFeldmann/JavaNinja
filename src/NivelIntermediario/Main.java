package NivelIntermediario;


public class Main {
    public static void main(String[] args) {

        Uchiha lucas = new Uchiha();
        lucas.nome = "Lucas GF";
        lucas.idade = 20;
        lucas.aldeia = "DNós";

        lucas.apresetarInfo();
        System.out.println(lucas.nomeEx());
        System.out.println(lucas.adulto(33));

        Uchiha erike = new Uchiha();
        erike.nome = "Erike GF";
        erike.idade = 14;
        erike.aldeia = "DNós";

        System.out.println(lucas.nome);

    }
}
