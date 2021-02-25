package br.com.utilidades;

import java.util.Scanner;
import br.com.cliente.*;
import br.com.conta.*;

public class Menu {

    private static Scanner scan = new Scanner(System.in);

    public static boolean MenuInicial() {

        String textoConsole = "O que deseja fazer no sistema?\n1-Criar cliente\n2-Criar conta\n3-Ver clientes\n"
                + "4-Sair\n";
        System.out.println(textoConsole);
        int n = scan.nextInt();

        switch (n) {
            case 1:
                System.out.println("Criar cliente..");
                CriaCliente();
                break;
            case 2:
                System.out.println("Criar conta");
                break;
            case 3:
                System.out.println("Ver clientes");
                MostraClientes();
                break;
            case 4:
                System.out.println("Até mais :)");
                return false;
            default:
                System.out.println("Opção inválida");

        }

        return true;

    }

    private static void CriaCliente() {

        System.out.println("Informe o nome do cliente:\n");
        String nome = scan.next();

        System.out.println("Informe o CPF do cliente:\n");
        String CPF = scan.next();

        System.out.println("Informe a idade do cliente:\n");
        int idade = scan.nextInt();

        ClientePrime cliente = new ClientePrime(nome, CPF, idade);

        ClientePrime.AdicionaCliente(cliente);

    }

    public static void MostraClientes(){

        ClientePrime.MostraClientes();
    }

}
