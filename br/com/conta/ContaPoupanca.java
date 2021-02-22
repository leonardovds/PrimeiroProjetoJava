package br.com.conta;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(String numeroConta){
        super(numeroConta);
    }

    public ContaPoupanca(double saldo, String numeroConta){
        super(saldo, numeroConta);
    }

    @Override
    public void AdicionaSaldo(double valorAdicionar) {
        valorAdicionar -= (valorAdicionar * 0.05);
        this.saldo += valorAdicionar;
    }

    @Override
    public void saca(double valor) {
        valor *= 1.25;//taxa sacar conta poupança
        if (this.temSaldo(valor)){
            saldo -= valor;
        }
    }
}
