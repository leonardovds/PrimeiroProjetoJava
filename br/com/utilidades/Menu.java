package br.com.utilidades;

import java.util.Scanner;

import br.com.cliente.*;
import br.com.conta.*;

public class Menu {

    private Scanner scan = new Scanner(System.in);

    public boolean MenuInicial() {

        String textoConsole = "O que deseja fazer no sistema?\n1-Criar cliente\n2-Criar conta corrente\n3-Ver clientes\n"
                + "4-Ver contas\n5-Editar cliente\n6-Sair\n";

        System.out.println(textoConsole);
        int n = scan.nextInt();

        switch (n) {
            case 1:
                System.out.println("Criar cliente..");
                CriaCliente();
                break;
            case 2:
                System.out.println("Criar conta corrente");
                CriarConta();
                break;
            case 3:
                System.out.println("Ver clientes");
                MostraClientes();
                break;
            case 4:
                System.out.println("Ver contas");
                MostrarContas();
                break;
            case 5:
                System.out.println("Editar cliente");
                EditaCliente();
                break;
            case 6:
                System.out.println("Até mais :)");
                return false;
            default:
                System.out.println("Opção inválida");

        }

        return true;

    }

    private void CriaCliente() {

        System.out.println("Informe o nome do cliente:\n");
        String nome = scan.next();

        System.out.println("Informe o CPF do cliente:\n");
        String CPF = scan.next();

        System.out.println("Informe a idade do cliente:\n");
        int idade = scan.nextInt();

        ClientePrime cliente = new ClientePrime(nome, CPF, idade);

        ClientePrime.AdicionaCliente(cliente);

    }

    private void MostraClientes() {

        ClientePrime.MostraClientes();
    }

    private void CriarConta() {
        System.out.println("Deseja criar conta já com saldo?\n1- Sim\n2- Não");
        int n = scan.nextInt();

        switch (n) {
            case 1:
                ContaComSaldo();
                break;
            case 2:
                ContaSemSaldo();
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }
    }

    private void ContaComSaldo() {
        System.out.println("Informe o número da conta:");
        String numeroConta = scan.next();

        System.out.println("Informe o saldo da conta:");
        double saldo = scan.nextDouble();

        ContaCorrente conta = new ContaCorrente(saldo, numeroConta);
        Conta.AdicionaConta(conta);
    }

    private void ContaSemSaldo() {
        System.out.println("Informe o número da conta:");
        String numeroConta = scan.next();

        ContaCorrente conta = new ContaCorrente(numeroConta);
        Conta.AdicionaConta(conta);
    }

    private void MostrarContas() {
        Conta.VerContas();
    }

    private void EditaCliente() {

        System.out.println("Digite o CPF do cliente que deseja editar");
        String cpfEditar = scan.next();

        Cliente clienteEditar = Cliente.RetornaClientePeloCPF(cpfEditar);

        if (clienteEditar == null) {
            System.out.println("Cliente não encontrado.");
        } else {

            System.out.println("Cliente: " + clienteEditar + "\nO que deseja editar?\n1- Excluir ");

            int n = scan.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Removendo cliente");
                    Cliente.RemoveCliente(clienteEditar);
                    break;
                default:
                    System.out.println("Opção inválida. Saindo...");
            }

        }
    }

}
