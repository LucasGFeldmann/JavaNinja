package NivelBasico.Desafio1;


public class Desafio {
    public static void ninja(String nome, short idade, String missao, char nivelDificuldade, String status) {
        System.out.println("----------------------------------------");
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(missao);
        System.out.println(nivelDificuldade);
        System.out.println(status);

        if (idade < 15) {
            if (nivelDificuldade == 'C' || nivelDificuldade == 'D') {
                status = "Missão Concluida!";
            } else {
                status = "Missão não concluida, idade inferior";
            }
        } else {
            status = "Missão Não Concluida";
        }
        System.out.println(status);
        System.out.println("----------------------------------------");
    }
    public static void main(String[] args) {
        ninja("Lucas", (short) 20,"Aprender Java",'A',"Em andamento");
        ninja("Evandro", (short) 14,"Aprender Java",'A',"Em andamento");
        ninja("Erike", (short) 14,"Aprender Java",'C',"Em andamento");

    }
}
