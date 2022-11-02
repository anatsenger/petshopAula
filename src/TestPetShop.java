import java.util.Objects;

public class TestPetShop {

    public static void main(String[] args) {
        /* criando/instanciando objetos e pegando o endereço deles na memoria
        esse endereço é atributo a variavel
        estamos usando varios construtores para isso*/
        Endereco casa = new Endereco("Dom João VI", 1854, "85960-000", "Centro", "Paraná");
        Dono mae = new Dono("Ana", "111.111.111-11", "ana@hotmail.com", casa);
        Cachorro leci = new Cachorro("Leci", "Virala-lata", 16, true, mae);

        Cachorro cachorro = new Cachorro("Doguinho", "pitbull",10, true, mae);



        System.out.println("Idade do " + leci.getNome()+ " e " + leci.getIdade());



        System.out.println("-----------------IMPRIMINDO OS DOGS--------------------");

        // chama o toString ao realizar a impressão
        System.out.println(cachorro);
        System.out.println(leci);


        Internacoes internacoes  = new Internacoes();
        internacoes.internar(cachorro);
        internacoes.internar(leci);

        internacoes.mostraCachorrosInternados();

    }
    private  int count = 0;
    private Cachorro[] caoCadastrado = new Cachorro[10];


    public void cadastroCao(Cachorro cachorro){
        if(Objects.nonNull(cachorro) && Objects.nonNull(cachorro.getDono())){
            caoCadastrado[count] = cachorro;
            count++;
        }else {
            System.err.println("Cachorro null ou sem dono");
        }
    }

    public void mostraCaesCadastrados(){
        System.out.println("-----------------Cães cadastrados--------------------");
        for (Cachorro cachorro: caoCadastrado) {
            if (Objects.nonNull(cachorro)) {
                System.out.println(cachorro);
            }
        }
    }

}