package Desafios.Desafio5;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca() {
        super(TipoConta.POUPANCA);
    }

    public ContaPoupanca(double saldo) {
        super(saldo, TipoConta.POUPANCA);
    }

    @Override
    public void depositar(double valor) {
        this.saldo = valor;
    }
}
