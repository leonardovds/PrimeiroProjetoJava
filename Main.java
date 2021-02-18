class Main {
    public static void main(String args[]){
        Cliente clienteUm = new Cliente("Leonardo Vitor dos Santos", "123.456.789-11", 25);
        Conta contaUm = new Conta("12345678-910", "Conta poupança");
        Conta contaDois = new Conta(1300, "321654987-321", "Conta corrente");

        contaUm.AdicionaSaldo(100.50);

        System.out.println(clienteUm);
        System.out.println(contaUm);
        System.out.println(contaDois);
    }
    }