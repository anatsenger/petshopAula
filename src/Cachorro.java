public class Cachorro {
    private String nome;
    private String raca;
    private int idade;
    private boolean estaDoente;
    private Dono dono;
    private int id;
    private static int codigo;

    public Cachorro(String nome, String raca, int idade, boolean estaDoente, Dono dono) {
        codigo++;
        this.id = codigo;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.estaDoente = estaDoente;
        this.dono = dono;
    }

    public Cachorro(Dono dono) {
        codigo++;
        this.dono = dono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isEstaDoente() {
        return estaDoente;
    }

    public void setEstaDoente(boolean estaDoente) {
        this.estaDoente = estaDoente;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }
}
