public class Gato extends Animal{
    private RacaGato raca;

    public Gato(Dono dono){
        super(dono);
    }

    public RacaGato getRaca() {
        return raca;
    }

    public void setRaca(RacaGato raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Gato: " +
                "raça = " + raca +
                super.toString();
    }
}
