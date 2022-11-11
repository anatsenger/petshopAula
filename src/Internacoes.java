import java.util.*;

public class Internacoes {
    private final int NUMERO_MAXIMO_VAGAS = 10;

    private Set<Animal> animaisInternados = new HashSet<>();

    public void internar(Animal animal){
        if (animaisInternados.size() < NUMERO_MAXIMO_VAGAS) {
            animaisInternados.add(animal);
        } else{
            System.err.println("Não há vagas");
        }
    }
    public void mostraCachorrosInternados(){
        System.out.println("-----------------ANIMAIS DOENTES--------------------");
        for (Animal animal: animaisInternados) {
            System.out.println(animal);
        }
    }

}
