public class Conta {
    private double saldo;
    private String numeroConta;
    
    public Conta(double saldo, String numeroConta){
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public Conta(String numeroConta){
        this.numeroConta = numeroConta;
        this.saldo = 0.00;
    }

    public double GetSaldo(){
        return this.saldo;
    }

    public String GetNumeroConta(){
        return this.numeroConta;
    }

    public void AdicionaSaldo(double valorAdicionar){
        this.saldo += valorAdicionar;
    }

    public void saca(double valor){
        if (this.temSaldo(valor)){
            this.saldo -= valor;
        }
    }

    public boolean temSaldo(double valor){
        return (saldo >= valor)? true:false;
    }

    @Override
    public String toString() {
        return  "Conta nº " + this.numeroConta + 
                " possui R$" + this.saldo + 
                " de saldo";
    }
}
