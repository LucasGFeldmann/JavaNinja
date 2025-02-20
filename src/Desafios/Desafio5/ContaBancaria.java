package Desafios.Desafio5;

public abstract class ContaBancaria implements Conta {
    double saldo;
    TipoConta tipoConta;

    public ContaBancaria(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public ContaBancaria(double saldo, TipoConta tipoConta) {
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public abstract void depositar(double valor);
}
