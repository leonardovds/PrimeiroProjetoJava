package br.com.cliente;

public class ClientePrime extends Cliente{

    private boolean usaApp = false;
    private String login;
    private String senha;

    public ClientePrime(String nome, String cpf, int idade){//cliente prime sem uso do sistema
        super(nome, cpf, idade);
    }
    
    public ClientePrime(String nome, String cpf, int idade, Boolean usaApp, String login, String senha){//cliente prime com uso do sistema
        super(nome, cpf, idade);
        this.usaApp = usaApp;
        this.login = login;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Cliente: " + this.nome +
                "\nCPF: " + this.cpf + 
                " é um cliente prime";
    }
}