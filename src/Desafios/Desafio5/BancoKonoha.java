package Desafios.Desafio5;

public class BancoKonoha extends Banco {

    public BancoKonoha() {
        super(TipoConta.ADMIN);
    }

    public BancoKonoha(double saldo) {
        super(saldo, TipoConta.ADMIN);
    }

    public double calcularTaxa(TipoConta tipo) {
        return switch (tipo) {
            case CORRENTE -> 0.02;
            case POUPANCA -> 0.01;
            case ADMIN -> 0;
        };
    }

    public void realizarTransacao(ContaBancaria conta, double valor, double taxa) {
        conta.depositar(valor - valor * taxa);
        saldo += valor * taxa;
    }

    public void transeferir(ContaBancaria contaOrigem, ContaBancaria contaDestino, double valor) {
        contaOrigem.saldo -= valor;
        double taxa = calcularTaxa(contaOrigem.tipoConta);
        realizarTransacao(contaDestino,valor,taxa);
    }

    public void transeferir(ContaBancaria conta, double valor) {
        realizarTransacao(conta,valor,calcularTaxa(conta.tipoConta));
    }

    @Override
    public void depositar(double valor) {

    }
}
