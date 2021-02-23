package br.com.conta;

import br.com.autentica.*;
import br.com.utilidades.*;

public class ContaEspecial extends Conta implements Autenticavel{

    AutenticadorSistema autenticadorSistema = new AutenticadorSistema();

    public ContaEspecial(double saldo, String numeroConta) {
        super(saldo, numeroConta);
    }

    public ContaEspecial(String numeroConta){
        super(numeroConta);
    }

    @Override
    public void AdicionaSaldo(double valorAdicionar) {
        this.saldo += valorAdicionar;
    }

    @Override
    public void saca(double valor) {
        if (this.temSaldo(valor)){
            this.saldo -= valor;
        }

    }

    @Override
    public boolean Autenticacao(String login, String senha) {
        return false;
    }

    @Override
    public void setLogin(String login) {
        this.autenticadorSistema.setLogin(login);
    }

    @Override
    public void setSenha(String senha) {
        this.autenticadorSistema.setSenha(senha);
    }
    
}
