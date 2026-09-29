
import java.util.*;

public class OrdenacaoExemplo {

    // =========================
    // PRIMITIVOS / WRAPPERS
    // =========================

    static int[] numeros = {42, 7, 15, 3, 99, 1, 28, 64, 15, 8, 50, 2, 73};

    static Integer[] numerosObj = {42, 7, 15, 3, 99, 1, 28, 64, 15, 8, 50, 2, 73};


    // =========================
    // STRINGS
    // =========================

    static String[] nomes = {"João","Armando","José","Jonas","Maria","Pedro","Antônia","Carla","Wesley","Walmir","Ana","Bruno"};

    static String[] palavras = {
        "banana",
        "abacaxi",
        "computador",
        "java",
        "algoritmo",
        "stream",
        "array",
        "classe",
        "zebra",
        "cachorro",
        "árvore",
        "programação"
    };

    static String[] palavrasMaiusculas = {
        "banana",
        "Ana",
        "casa",
        "Bruno",
        "árvore",
        "Carlos",
        "java",
        "Zebra"
    };


    // =========================
    // LISTAS
    // =========================

    static List<Integer> listaNumeros = new ArrayList<>(List.of(42, 7, 15, 3, 99, 1, 28, 64, 15, 8));

    static List<String> listaNomes = new ArrayList<>(
        List.of(
            "João",
            "Maria",
            "Carlos",
            "Ana",
            "Pedro",
            "Bruno",
            "Antônia",
            "José"
        )
    );


    // =========================
    // OBJETOS - UM ATRIBUTO
    // =========================




    // =========================
    // OBJETOS - MÚLTIPLOS ATRIBUTOS
    // =========================

    static List<Pessoa> pessoas = new ArrayList<>(
        List.of(
            new Pessoa("João", 25, 3500.00),
            new Pessoa("Maria", 30, 4200.00),
            new Pessoa("Carlos", 22, 2800.00),
            new Pessoa("Ana", 30, 5100.00),
            new Pessoa("Pedro", 25, 3500.00),
            new Pessoa("Bruno", 19, 1800.00),
            new Pessoa("Antônia", 22, 3200.00),
            new Pessoa("José", 40, 7200.00),
            new Pessoa("Carla", 30, 4200.00),
            new Pessoa("Wesley", 25, 2900.00)
        )
    );


    static Pessoa[] pessoasArray = {
        new Pessoa("João", 25, 3500.00),
        new Pessoa("Maria", 30, 4200.00),
        new Pessoa("Carlos", 22, 2800.00),
        new Pessoa("Ana", 30, 5100.00),
        new Pessoa("Pedro", 25, 3500.00),
        new Pessoa("Bruno", 19, 1800.00),
        new Pessoa("Antônia", 22, 3200.00),
        new Pessoa("José", 40, 7200.00),
        new Pessoa("Carla", 30, 4200.00),
        new Pessoa("Wesley", 25, 2900.00)
    };

    // =========================
    // PRODUTOS
    // =========================

    static List<Produto> produtos = new ArrayList<>(
        List.of(
            new Produto("Notebook", 4500.00, 10),
            new Produto("Mouse", 80.00, 50),
            new Produto("Teclado", 150.00, 30),
            new Produto("Monitor", 1200.00, 15),
            new Produto("Headset", 250.00, 20),
            new Produto("Webcam", 300.00, 8),
            new Produto("SSD", 500.00, 25),
            new Produto("Memória RAM", 350.00, 40)
        )
    );


    static Produto[] produtosArray = {
        new Produto("Notebook", 4500.00, 10),
        new Produto("Mouse", 80.00, 50),
        new Produto("Teclado", 150.00, 30),
        new Produto("Monitor", 1200.00, 15),
        new Produto("Headset", 250.00, 20),
        new Produto("Webcam", 300.00, 8),
        new Produto("SSD", 500.00, 25),
        new Produto("Memória RAM", 350.00, 40)
    };

    // =========================
    // CLASSES
    // =========================



    static class Pessoa {
        String nome;
        int idade;
        double salario;

        Pessoa(String nome, int idade, double salario) {
            this.nome = nome;
            this.idade = idade;
            this.salario = salario;
        }

        @Override
        public String toString() {
            return nome +
                   " | idade: " + idade +
                   " | salário: " + salario;
        }
    }


    static class Produto implements Comparable<Produto> {
        String nome;
        double preco;
        int estoque;

        Produto(String nome, double preco, int estoque) {
            this.nome = nome;
            this.preco = preco;
            this.estoque = estoque;
        }

        @Override 
        public int compareTo(Produto outro) {
            return this.nome.compareTo(outro.nome);
        }

        @Override
        public String toString() {
            return nome +
                   " | R$ " + preco +
                   " | estoque: " + estoque;
        }
    }


    static class Aluno {
        String nome;
        double nota;
        int idade;

        Aluno(String nome, double nota, int idade) {
            this.nome = nome;
            this.nota = nota;
            this.idade = idade;
        }

        @Override
        public String toString() {
            return nome +
                   " | nota: " + nota +
                   " | idade: " + idade;
        }
    }

    public static void main(String[] args){
        System.out.println("Exemplos de ordenação em Java");
        System.out.println("=================================== \n");
        System.out.println("Ordenação de arrays primitivos:");
        System.out.println("Ordenando int[] numeros = " + Arrays.toString(numeros) );
        Arrays.sort(numeros);
        System.out.println("Resultado: " + Arrays.toString(numeros) + "\n");
       
        /*int[] numerosOrdenados = Arrays.stream(numeros).sorted().toArray();
        System.out.println("Resultado: " + Arrays.toString(numerosOrdenados) + "\n");
        */
        System.out.println("\nOrdenando Integer[] numerosObj = " + Arrays.toString(numerosObj) );
        Arrays.sort(numerosObj);
        System.out.println("Resultado: " + Arrays.toString(numerosObj) + "\n");

        System.out.println("\nOrdenando Sring[] nomes = " + Arrays.toString(nomes) );
        Arrays.sort(nomes);
        System.out.println("Resultado: " + Arrays.toString(nomes) + "\n");

        System.out.println("Ordenação de listas primitivas:");
        System.out.println("\nOrdenando List<Integer> listaNumeros = " + listaNumeros );

        //Collections.sort(listaNumeros);
        //listaNumeros.sort(null);
        //listaNumeros.sort(Comparator.naturalOrder());
        //listaNumeros.sort(Comparator.comparingInt(Integer::intValue));
        listaNumeros = listaNumeros.stream().sorted().toList();
        System.out.println("Resultado: " + listaNumeros + "\n");

        System.out.println("\nOrdenando List<String> listaNomes = " + listaNomes );
        //Collections.sort(listaNomes); 
        //listaNomes.sort(Comparator.naturalOrder());
        //listaNomes.sort(Comparator.comparing(String::toString));
        //listaNomes.sort(null);
        listaNomes = listaNomes.stream().sorted().toList();
        System.out.println("Resultado: " + listaNomes + "\n");

        System.out.println("Ordenação de listas de objetos:");
        System.out.println("\nOrdenando List<Pessoa> pessoas = " + pessoas );
        System.out.println("\nOrdenando por nome (alfabética):");
        pessoas.sort(Comparator.comparing((Pessoa p) -> p.nome));
        //pessoas = pessoas.stream().sorted(Comparator.comparing(p -> p.nome)).toList();  //Torna a lista imutável
        System.out.println("Resultado: " + pessoas + "\n");

        System.out.println("Ordenando por idade (crescente):");
        pessoas.sort(Comparator.comparingInt((Pessoa p) -> p.idade));
        System.out.println("Resultado: " + pessoas + "\n");

        System.out.println("Ordenando por salário (decrescente):");
        pessoas.sort(Comparator.comparingDouble((Pessoa p) -> p.salario).reversed());
        System.out.println("Resultado: " + pessoas + "\n");

        
        
    }


}

