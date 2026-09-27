import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Treino{



    public static void main(String[] args){
    
        Base b = new Base();
        
        //Arrays.stream(b.getNomes().split(" ")).limit(4).sorted().forEach(System.out::println);
        List<Integer> out = b.numeros.stream().sorted().toList();
        System.out.println(out.get(1) + " " + out.get(out.size()-2));
    
    }
}


//para uma outra classe existir no mesmo arquivo não pode ser public, public somente a classe que recebe o nome do arquivo
class Base{
    protected int numero;
    private String nomes;
    public List<Integer> numeros;


    Base(){
        this.numero = 5;
        this.nomes = "João Armando José Jonas Maria Pedro Maria Antônia Carla Wesley Walmir";
        this.numeros = List.of(5, 5, 6, 6, 8, 343, 54, 0, -123, 43, -1);  
    }

    public String getNomes(){
        return nomes;
    }

}