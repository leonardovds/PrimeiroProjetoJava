package br.com.utilidades;

public class AutenticadorSistema {
    private String login;
    private String senha;

    public void setLogin(String login){
        this.login = login;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public boolean Autenticacao(String login, String senha){
        return ((this.senha == senha) && (this.login == login))? true: false;
    }
    
}
