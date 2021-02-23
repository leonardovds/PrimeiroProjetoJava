package br.com.cliente;

import br.com.autentica.*;
import br.com.utilidades.*;

public class ClientePrime extends Cliente implements Autenticavel{

    private AutenticadorSistema autenticadorSistema = new AutenticadorSistema();

    public ClientePrime(String nome, String cpf, int idade){//cliente prime sem uso do sistema
        super(nome, cpf, idade);
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

    @Override
    public String toString() {
        return "Cliente: " + this.nome +
                "\nCPF: " + this.cpf + 
                " é um cliente prime";
    }
}