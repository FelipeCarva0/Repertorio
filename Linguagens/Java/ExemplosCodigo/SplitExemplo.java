

public class SplitExemplo{
    String texto1 = "João   Maria    Pedro Carlos";
    String texto2 = "Java,Python;C++;C#|JavaScript:Kotlin";
    String texto3 = "***João123Maria456José Pedro###Carlos!!!Ana";
    String texto4 = "  @João #Maria $Pedro %Carlos &Ana 42José  ";
    String texto5 = "árvore\tcafé\ncomputação  Leu Nome ids89 Ciência;tecnologia---programação_software";

    public SplitExemplo(){}

    public static void main(String[] args){
        SplitExemplo s = new SplitExemplo();

        //Caso 1  João   Maria    Pedro Carlos
        System.out.println("Caso 1(João   Maria    Pedro Carlos): ");
        String[] out1 = s.texto1.split(" +");
        for(String nome : out1){
            System.out.println(nome);
        } 


        //Caso 2 Java,Python;C++;C#|JavaScript:Kotlin
        System.out.println("\nCaso 2(Java,Python;C++;C#|JavaScript:Kotlin): ");
        String[] out2 = s.texto2.split("[,:|;]");
        for(String nome : out2){
            System.out.println(nome);
        } 
        
        //Caso 3 ***João123Maria456José Pedro###Carlos!!!Ana
        System.out.println("\nCaso 3(***João123Maria456José Pedro###Carlos!!!Ana): ");
        String[] out3 = s.texto3.split("[^\\p{L}]+"); //Unicode,Letter, pega somente as letras
        //String[] out3 = s.texto3.split("[^a-zA-Z0-9]+");  //não funcionaria porque não pega acentos
        for(String nome : out3){
            System.out.println(nome);
        }     

        /*
        Unicode
        \p{L}   → letra
        \p{N}   → número
        \p{P}   → pontuação
        \p{S}   → símbolo
        \p{Z}   → separador/espaço
        */

        //Caso 4   @João #Maria $Pedro %Carlos &Ana 42José  
        System.out.println("\nCaso 4(  @João #Maria $Pedro %Carlos &Ana 42José  ): ");
        String[] out4 = s.texto4.split("[^\\p{L}]+");
        for(String nome : out4){
            System.out.println(nome);
        }

        //Caso 5 árvore\tcafé\ncomputação   ciência;tecnologia---programação_software
        System.out.println("\nCaso 5(árvore\tcafé\ncomputação  Leu Nome ids89 Ciência;tecnologia---programação_software): ");
        String[] out5 = s.texto5.split("[^\\p{L}]+");
        for(String nome : out5){
            System.out.println(nome);
        }

    }
}