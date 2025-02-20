package Desafios.Desafio3;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String statusMissao;

    public void mostrarInformacoes() {
        System.out.println("=========Ninja=========");
        System.out.println(nome);
        System.out.println(idade +  " anos");
        System.out.println("Missão: " + missao);
        System.out.println("Status Missão: " + statusMissao);
    }
}
