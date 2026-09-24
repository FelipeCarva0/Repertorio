import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExemplo {

    // Record para representar um produto
    record Produto(String nome, String categoria, double preco, int quantidade) {}

    public static void main(String[] args) {

        List<Produto> produtos = List.of(
            new Produto("Notebook", "Eletrônicos", 3500.00, 5),
            new Produto("Mouse", "Eletrônicos", 50.00, 20),
            new Produto("Cadeira", "Móveis", 450.00, 8),
            new Produto("Mesa", "Móveis", 800.00, 3),
            new Produto("Teclado", "Eletrônicos", 150.00, 15)
        );

        // 1. Filtrar produtos de "Eletrônicos" e listar só os nomes, em ordem alfabética
        List<String> nomesEletronicos = produtos.stream()
            .filter(p -> p.categoria().equals("Eletrônicos")) // mantém só Eletrônicos
            .map(Produto::nome)                                // transforma Produto -> String (nome)
            .sorted()                                           // ordena alfabeticamente
            .collect(Collectors.toList());                      // junta o resultado numa List

        System.out.println("Eletrônicos: " + nomesEletronicos);
        // Eletrônicos: [Mouse, Notebook, Teclado]


        // 2. Calcular o valor total do estoque (preço * quantidade de cada produto, somado)
        double valorTotalEstoque = produtos.stream()
            .mapToDouble(p -> p.preco() * p.quantidade()) // transforma cada produto num double (valor total dele)
            .sum();                                         // soma todos os valores

        System.out.println("Valor total em estoque: R$ " + valorTotalEstoque);
        // Valor total em estoque: R$ 24350.0


        // 3. Agrupar produtos por categoria (Map<Categoria, Lista de produtos>)
        Map<String, List<Produto>> porCategoria = produtos.stream()
            .collect(Collectors.groupingBy(Produto::categoria)); // agrupa usando a categoria como chave

        porCategoria.forEach((categoria, lista) -> {
            System.out.println(categoria + ":");
            lista.forEach(p -> System.out.println("  - " + p.nome()));
        });
        // Eletrônicos:
        //   - Notebook
        //   - Mouse
        //   - Teclado
        // Móveis:
        //   - Cadeira
        //   - Mesa


        // 4. Verificar se existe algum produto com estoque baixo (quantidade < 5)
        boolean temEstoqueBaixo = produtos.stream()
            .anyMatch(p -> p.quantidade() < 5); // true se AO MENOS UM produto atender a condição

        System.out.println("Tem produto com estoque baixo? " + temEstoqueBaixo);
        // Tem produto com estoque baixo? true


        // 5. Pegar o produto mais caro
        produtos.stream()
            .max((p1, p2) -> Double.compare(p1.preco(), p2.preco())) // compara pelos preços, pega o maior
            .ifPresent(p -> System.out.println("Produto mais caro: " + p.nome())); // executa só se existir resultado
        // Produto mais caro: Notebook
    }
}