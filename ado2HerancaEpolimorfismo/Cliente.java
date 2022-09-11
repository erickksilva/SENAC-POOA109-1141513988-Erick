package adopoo;

@SuppressWarnings("unused")
public class Cliente {

    private String nome, cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void imprimirDados() {
        System.out.println("\t\tNome: " + nome);
        System.out.println("\t\tCpf: " + cpf);
    }

    // metodos getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    // metodos setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
