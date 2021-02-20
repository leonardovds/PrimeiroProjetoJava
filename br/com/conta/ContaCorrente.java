package br.com.conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(String numeroConta){
            super(numeroConta);
    }

    public ContaCorrente(double saldo, String numeroConta){
        super(saldo, numeroConta);
    }

    @Override
    public void saca(double valor) {
        valor *= 1.1; //taxa sacar conta corrente
        super.saca(valor);
    }
}
