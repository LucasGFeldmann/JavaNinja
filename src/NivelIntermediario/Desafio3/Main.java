package NivelIntermediario.Desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ninja[] ninjas = new Ninja[3];
        byte qtd_ninjas = 0;
        byte opt = 0;
        Scanner scanner = new Scanner(System.in);

        while (opt != 4) {
            System.out.println("===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Deletar Ninja");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            if (qtd_ninjas < ninjas.length) {
                opt = scanner.nextByte();
                scanner.nextLine();
            } else {
                System.out.println("Limite de Ninjas maximo atingido");
            }
            switch (opt) {
                case 1:
                    System.out.println("\n===== Cadastrar =====");
                    System.out.println("1. Ninja");
                    System.out.println("2. Uchiha");
                    System.out.print("Escolha uma opção: ");
                    opt = scanner.nextByte();
                    scanner.nextLine();
                    switch (opt) {
                        case 1:
                            Ninja ninja = new Ninja();
                            System.out.print("Nome: ");
                            ninja.nome = scanner.nextLine();
                            System.out.print("Idade: ");
                            ninja.idade = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Missão: ");
                            ninja.missao = scanner.nextLine();
                            System.out.print("Status da Missão: ");
                            ninja.statusMissao = scanner.nextLine();
                            ninjas[qtd_ninjas] = ninja;
                            break;
                        case 2:
                            Uchiha uchiha = new Uchiha();
                            System.out.print("Nome: ");
                            uchiha.nome = scanner.nextLine();
                            System.out.print("Idade: ");
                            uchiha.idade = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Missão: ");
                            uchiha.missao = scanner.nextLine();
                            System.out.print("Status da Missão: ");
                            uchiha.statusMissao = scanner.nextLine();
                            ninjas[qtd_ninjas] = uchiha;
                            break;
                    }
                    qtd_ninjas ++;
                    break;
                case 2:
                    System.out.println("Lista de Ninjas:");

                    for (Ninja ninja : ninjas) {
                        if (ninja != null) {
                            ninja.mostrarInformacoes();
                        }
                    }
                    break;
                case 3:
                    qtd_ninjas --;
                    ninjas[qtd_ninjas] = null;
                    break;
                case 4:
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
