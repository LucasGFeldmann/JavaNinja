package Desafios.Desafio4;

public abstract class NinjaStandart {
    String nome;
    TipoHabilidade habilidade;
    int idade;

    public NinjaStandart(String nome, TipoHabilidade habilidade, int idade) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.idade = idade;
    }
}
