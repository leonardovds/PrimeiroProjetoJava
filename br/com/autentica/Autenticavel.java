package br.com.autentica;

public interface Autenticavel {
    public abstract boolean Autenticacao(String login, String senha);
    public abstract void setLogin(String login);
    public abstract void setSenha(String senha);
}
