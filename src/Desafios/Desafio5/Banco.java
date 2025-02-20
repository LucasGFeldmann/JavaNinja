package Desafios.Desafio5;

public abstract class Banco extends ContaBancaria {


    public Banco(TipoConta tipoConta) {
        super(tipoConta);
    }

    public Banco(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }
}
