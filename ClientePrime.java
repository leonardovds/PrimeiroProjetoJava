public class ClientePrime extends Cliente{

    private boolean usaApp = false;
    private String login;
    private String senha;

    public ClientePrime(String nome, String cpf, int idade){
        super(nome, cpf, idade);
    }
    
    public ClientePrime(String nome, String cpf, int idade, Boolean usaApp, String login, String senha){
        super(nome, cpf, idade);
        this.usaApp = usaApp;
        this.login = login;
        this.senha = senha;
    }

    public String PegaCpf(){
        return super.GetCpf();
    }

    @Override
    public String toString() {
        return super.toString()
        + " é um cliente prime";
    }
}