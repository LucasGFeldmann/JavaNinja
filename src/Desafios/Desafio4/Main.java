package Desafios.Desafio4;

public class Main {
    public static void main(String[] args) {
        NinjaBasico erike = new NinjaBasico("Erike",TipoHabilidade.RINNENGAN, 14);
        erike.mostrarInformacoes();
        erike.executarHabilidade();


        NinjaAvancado lucas = new NinjaAvancado("Lucas",TipoHabilidade.NINJUTSU, 20);
        lucas.mostrarInformacoes();
        lucas.executarHabilidade();
    }
}
