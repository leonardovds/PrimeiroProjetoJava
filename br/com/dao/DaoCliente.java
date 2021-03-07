package br.com.dao;

import java.util.ArrayList;

import br.com.cliente.Cliente;

public class DaoCliente {
    final ArrayList<Cliente> listaCliente = new ArrayList<>();

    public void addLista(Cliente cliente){
        listaCliente.add(cliente);
    }

    public Cliente retornaClientePorCPF(String cpf){
        for (Cliente cliente: listaCliente){
            if (cliente.GetCpf().equals(cpf)){
                return cliente;
            }
        }
        return null;
    }

    public void removeLista(Cliente cliente){
        listaCliente.remove(cliente);
    }

    public void mostraClientes(){
        for (Cliente cliente: listaCliente){
            System.out.println(cliente);
        }
    }
}