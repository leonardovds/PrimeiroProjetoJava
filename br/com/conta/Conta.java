package br.com.conta;

import java.util.ArrayList;

public abstract class Conta {
    protected double saldo;
    protected String numeroConta;
    protected static ArrayList<Conta> listaContas = new ArrayList<>();
    
    public Conta(double saldo, String numeroConta){
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public Conta(String numeroConta){
        this.numeroConta = numeroConta;
        this.saldo = 0.00;
    }

    public double GetSaldo(){
        return this.saldo;
    }

    public String GetNumeroConta(){
        return this.numeroConta;
    }

    public abstract void AdicionaSaldo(double valorAdicionar);

    public abstract void saca(double valor);

    public boolean temSaldo(double valor){
        return (saldo >= valor)? true:false;
    }

    public static void AdicionaConta(Conta conta){
        listaContas.add(conta);
    }

    public static void VerContas(){
        for (Conta conta: listaContas){
            System.out.println(conta);
        }
    }

    @Override
    public String toString() {
        return  "Conta nº " + this.numeroConta + 
                " possui R$" + this.saldo + 
                " de saldo";
    }
}
