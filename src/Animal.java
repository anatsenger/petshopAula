public abstract class Animal {
    private int id;
    private TipoAnimal tipoAnimal;
    private String nome;
    private int idade;
    private boolean estaDoente;
    private Dono dono;

    public Animal(Dono dono){
        this.dono = dono;
    }

    public void setEstaDoente(boolean estaDoente) {
        this.estaDoente = estaDoente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdade(int idade) {
        if(idade < 0){
            System.err.println("Cachorro não pode ter idade menor que 0");
        } else if(idade > 29) {
            System.err.println("Não é permitido cachorros com idades superiores a 29 anos");
        } else {
            this.idade = idade;
        }
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }
    public void setTipoAnimal(TipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    public boolean isEstaDoente() {
        return estaDoente;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Dono getDono() {
        return dono;
    }

    public int getId() {
        return id;
    }

    public TipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", tipoAnimal=" + tipoAnimal +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", estaDoente=" + estaDoente +
                ", dono=" + dono +
                '}';
    }

}

