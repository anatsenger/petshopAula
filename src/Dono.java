public class Dono {
    //Crie uma classe chamada Dono, essa classe deve ter os atributos nome, cpf e email.
    private String nome;
    private String CPF;
    private String email;
    private Endereco endereco;
    private int id;

    public Dono(String nome, String CPF, String email, Endereco endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Dono(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
