package br.com.cliente;

public abstract class Cliente {
    protected String nome;
    protected String cpf;
    protected int idade;

    public Cliente(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String GetNome(){
        return this.nome;
    }

    public String GetCpf(){
        return this.cpf;
    }

    public int GetIdade(){
        return this.idade;
    }

}
