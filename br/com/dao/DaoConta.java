package br.com.dao;

import java.util.ArrayList;

import br.com.conta.Conta;

public class DaoConta {
    final ArrayList<Conta> listaConta = new ArrayList<>();

    public void addLista(Conta conta){
        listaConta.add(conta);
    }

    public Conta retornaContaPorNumero(String numeroConta){
        for (Conta conta: listaConta){
            if (conta.GetNumeroConta().equals(numeroConta)){
                return conta;
            }
        }
        return null;
    }

    public void removeLista(Conta conta){
        listaConta.remove(conta);
    }

    public void mostraContas(){
        for (Conta conta: listaConta){
            System.out.println(conta);
        }
    }
}