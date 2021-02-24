package br.com.utilidades;

import java.util.Scanner;

public class Menu {

    private static Scanner scan = new Scanner(System.in);

    public static boolean MenuInicial() {

        System.out.println("O que deseja fazer no sistema?\n1-Criar cliente\n2-Criar conta\n3-Sair");
        int n = scan.nextInt();

        switch (n) {
            case 1:
                System.out.println("Criar cliente");
                break;
            case 2:
                System.out.println("Criar conta");
                break;
            case 3:
                System.out.println("Até mais :)");
                return false;
            default:
                System.out.println("Opção inválida");

        }

        return true;

    }

}
