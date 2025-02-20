package Desafios.Desafio4;

public class NinjaBasico extends NinjaStandart implements Ninja {

    public NinjaBasico(String nome, TipoHabilidade habilidade, int idade) {
        super(nome, habilidade, idade);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Meu nome é " + nome + " tenho a habilidade " + habilidade + " e tenho " + idade + " anos");
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Execuntando " + habilidade);
    }
}
