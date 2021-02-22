import br.com.conta.*;

class Main {
    public static void main(String args[]){
       
        ContaCorrente contaCorrente = new ContaCorrente(1300, "321654987-321");
        ContaPoupanca contaPoupanca = new ContaPoupanca("1112223339-987");
        
        contaPoupanca.AdicionaSaldo(1300);
        contaPoupanca.saca(20);
        contaCorrente.saca(20);

        System.out.println(contaCorrente.GetSaldo());
        System.out.println(contaPoupanca.GetSaldo());

        
    }
    }