public class Cliente {
    private String nome;
    protected String cpf;
    private int idade;

    public Cliente(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String GetNome(){
        return this.nome;
    }

    public String GetCpf(){
        return this.cpf;
    }

    public int GetIdade(){
        return this.idade;
    }

    @Override
    public String toString() {
        return "Cliente: " + this.nome +
                "\nCPF: " + this.cpf;
    }

}
