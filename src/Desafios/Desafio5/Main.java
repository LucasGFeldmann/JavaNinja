package Desafios.Desafio5;

public class Main {

    public static void apresentar(ContaBancaria conta1, ContaBancaria conta2) {
        System.out.println();
        System.out.println("conta1 " + conta1.consultarSaldo());
        System.out.println("conta2 " + conta2.consultarSaldo());
    }

    public static void main(String[] args) {
        ContaPoupanca contaLucas = new ContaPoupanca(100);
        ContaCorrente contaErike = new ContaCorrente(100);
        BancoKonoha bancoKonoha = new BancoKonoha();

        apresentar(contaLucas, contaErike);

        bancoKonoha.transeferir(contaLucas, contaErike, 20);

        apresentar(contaLucas, contaErike);

        bancoKonoha.transeferir(contaErike, contaLucas, 20);

        apresentar(contaLucas, contaErike);


    }
}
