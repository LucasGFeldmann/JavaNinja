package NivelIntermediario;

public class Ninja {
    String nome;
    String aldeia;
    int idade;
    
//    Criar um metodo publico personalizavel
    public void apresetarInfo() {
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("aldeia = " + aldeia);
    }

    public String nomeEx() {
        return nome.toUpperCase();
    }

    public int adulto(int idadeParaSerAdulto) {
        return idadeParaSerAdulto - idade;
    }

}
