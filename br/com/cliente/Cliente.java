package br.com.cliente;

import java.util.ArrayList;

public abstract class Cliente {
    protected String nome;
    protected String cpf;
    protected int idade;
    protected static ArrayList<Cliente> listaCliente = new ArrayList<>();

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

    public static void AdicionaCliente(Cliente novoCliente){
        listaCliente.add(novoCliente);
    }

    public static void MostraClientes(){
        for (Cliente cliente : listaCliente){
            System.out.println(cliente);
        }
    }

}
