public class Conta {
    private double saldo;
    private String numeroConta;
    private String tipoConta;
    
    public Conta(double saldo, String numeroConta, String tipoConta){
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
    }

    public Conta(String numeroConta, String tipoConta){
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.saldo = 0.00;
    }

    public double GetSaldo(){
        return this.saldo;
    }

    public String GetTipoConta(){
        return this.tipoConta;
    }

    public String GetNumeroConta(){
        return this.numeroConta;
    }

    public void AdicionaSaldo(double valorAdicionar){
        this.saldo += valorAdicionar;
    }

    @Override
    public String toString() {
        return this.tipoConta +
                " nº " + this.numeroConta + 
                " possui R$" + this.saldo + 
                " de saldo";
    }
}
