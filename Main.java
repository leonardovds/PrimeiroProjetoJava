import br.com.conta.*;
import br.com.cliente.*;

class Main {
    public static void main(String args[]){
        Cliente clienteUm = new Cliente("Leonardo Vitor dos Santos", "123.456.789-11", 25);
        ClientePrime clienteDois = new ClientePrime("Ana Beatriz", "321.654.987-22", 21);
        ClientePrime clienteTres = new ClientePrime("Marcos Vinicius", "987.654.321-00", 29, true, "login", "123456");
        Conta contaComum = new Conta("12345678-910");
        ContaCorrente contaCorrente = new ContaCorrente(1300, "321654987-321");
        ContaPoupanca contaPoupanca = new ContaPoupanca("1112223339-987");

        contaComum.AdicionaSaldo(1300);
        contaComum.saca(20);
        contaPoupanca.AdicionaSaldo(1300);
        contaPoupanca.saca(20);
        contaCorrente.saca(20);


        System.out.println(contaComum.GetSaldo());
        System.out.println(contaCorrente.GetSaldo());
        System.out.println(contaPoupanca.GetSaldo());

        
    }
    }