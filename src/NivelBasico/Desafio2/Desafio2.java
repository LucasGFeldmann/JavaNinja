package NivelBasico.Desafio2;

import java.util.Scanner;


public class Desafio2 {
    public static void main(String[] args) throws InterruptedException {
        String[] ninjas = new String[10];
        byte qtd_ninjas = 0;
        byte opt = 0;

        Scanner scanner = new Scanner(System.in);
        while (opt != 3) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            if (qtd_ninjas < ninjas.length) {
                opt = scanner.nextByte();
                scanner.nextLine();
            } else {
                System.out.println("Limite de Ninjas maximo atingido");
                break;
            }
            switch (opt) {
                case 1:
                    System.out.print("Escreva o nome do Ninja: ");
                    ninjas[qtd_ninjas] = scanner.nextLine();
                    qtd_ninjas ++;
                    break;
                case 2:
                    System.out.println("Lista de Ninjas:");
                    for (String ninja : ninjas) {
                        if (ninja != null)
                            System.out.println("=> " + ninja);
                    }
                    break;
                case 3:
                    System.out.println("Fechando Sistema");
                    break;
                default:
                    System.out.println("O tchê não sabe lê! ");
                    break;
            }
        }
        scanner.close();
    }
}
