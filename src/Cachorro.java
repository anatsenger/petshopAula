public class Cachorro extends Animal {
    private RacaCachorro raca;


    public Cachorro(Dono dono){
        super(dono);
    }

    public RacaCachorro getRaca() {
        return raca;
    }

    public void setRaca(RacaCachorro raca) {
        this.raca = raca;
    }

    public String toString() {
        return "Cachorro: " +
                "raça = " + raca +
                super.toString();
    }
}
