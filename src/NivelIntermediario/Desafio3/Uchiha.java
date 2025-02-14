package NivelIntermediario.Desafio3;

public class Uchiha extends Ninja {
    public void mostrarHabilidadeEspecial() {
        System.out.println("Super Katana");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.print("Habilidade Especial: ");
        mostrarHabilidadeEspecial();
    }
}
