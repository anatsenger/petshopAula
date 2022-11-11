import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AnimalRepository {

    // count para controlar a posição dos cachorros cadastrados
    private static List<Animal> animaisCadastrados = new ArrayList<>();

    // contador estatico para atribuir os ids...
    private static int sequence = 1;

    public void cadastra(Animal animal){
        setId(animal);

        if (Objects.nonNull(animal) && Objects.nonNull(animal.getDono())) {
            animaisCadastrados.add(animal);
        } else {
            System.err.println("Animal nulo ou sem Dono!");
        }
    }

    private void setId(Animal animal) {
        animal.setId(sequence);
        animal.getDono().setId(sequence);
        animal.getDono().getEndereco().setId(sequence);
        sequence ++;
    }
    public void imprimeAnimaisCadastrados(){
        System.out.println("_____________ANIMAIS CADASTRADOS:_____________");
        for (Animal animal: animaisCadastrados) {
            System.out.println(animal);
        }

        if (animaisCadastrados.isEmpty()){
            System.out.println("_____________ZERO ANIMAIS CADASTRADOS_____________");
        }
    }

    public void limpaCadastro(){
        System.out.println("_____________LIMPANDO O CADASTRO______________");
        this.animaisCadastrados.clear();
    }
}