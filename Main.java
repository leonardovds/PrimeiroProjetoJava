class Main {
    public static void main(String args[]){
        Cliente clienteUm = new Cliente("Leonardo Vitor dos Santos", "123.456.789-11", 25);
        ClientePrime clienteDois = new ClientePrime("Ana Beatriz", "321.654.987-22", 21);
        ClientePrime clienteTres = new ClientePrime("Marcos Vinicius", "987.654.321-00", 29, true, "login", "123456");
        Conta contaUm = new Conta("12345678-910", "Conta poupança");
        Conta contaDois = new Conta(1300, "321654987-321", "Conta corrente");

        contaUm.AdicionaSaldo(100.50);

        System.out.println(clienteUm);
        System.out.println(contaUm);
        System.out.println(contaDois);
        System.out.println(clienteDois);
        System.out.println(clienteTres);
        System.out.println(clienteDois.PegaCpf());
        System.out.println(clienteTres.GetCpf());
    }
    }