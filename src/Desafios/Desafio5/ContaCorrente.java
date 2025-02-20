package Desafios.Desafio5;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente() {
        super(TipoConta.CORRENTE);
    }

    public ContaCorrente(double saldo) {
        super(saldo, TipoConta.CORRENTE);
    }

    @Override
    public void depositar(double valor) {
        this.saldo = valor;
    }
}
