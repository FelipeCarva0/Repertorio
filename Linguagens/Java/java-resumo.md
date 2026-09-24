# Java

## Sumário

- [POO](#poo)
- [Variáveis](#variáveis)
  - [Tipos primitivos de variáveis](#tipos-primitivos-de-variáveis)
- [Operadores](#operadores)
- [Comentários](#comentários)
- [Condicionais](#condicionais)
  - [switch/case](#switchcase)
- [Vetores](#vetores)
  - [Arrays multidimensionais](#arrays-multidimensionais)
- [Scanner](#scanner)
- [ArrayList](#arraylist)
  - [Métodos de ArrayList](#métodos-de-arraylist)
- [Iteração (loop)](#iteração-loop)
- [Casting (Conversão de dados para outro tipo)](#casting-conversão-de-dados-para-outro-tipo)
- [Compilação](#compilação)
- [POO em Java](#poo-em-java)
  - [Class](#class)
  - [Objeto](#objeto)
  - [Métodos](#métodos)
  - [Método especial (método inicial)](#método-especial-método-inicial)
- [Package](#package)
- [Modificadores de acesso](#modificadores-de-acesso)
  - [Extra sobre modificadores de variáveis e métodos](#extra-sobre-modificadores-de-variáveis-e-métodos)
- [Encapsulamento](#encapsulamento)
- [this vs super](#this-vs-super)
- [instanceof](#instanceof)
- [equals(), hashCode() e toString()](#equals-hashcode-e-tostring)
- [Enums](#enums)
- [Bloco de inicialização estático](#bloco-de-inicialização-estático)
- [Interfaces](#interfaces)
  - [Implementação da interface](#implementação-da-interface)
- [Classe Abstrata](#classe-abstrata)
- [Herança](#herança)
- [Polimorfismo](#polimorfismo)
- [Tratamento de exceções](#tratamento-de-exceções)
  - [Exceções checked vs unchecked](#exceções-checked-vs-unchecked)
  - [Múltiplos catch](#múltiplos-catch)
  - [try-with-resources](#try-with-resources)
  - [Exceções customizadas](#exceções-customizadas)
- [Pacotes (Packages)](#pacotes-packages)
- [Java Collections (Framework Java)](#java-collections-framework-java)
  - [Map](#map)
  - [Set](#set)
  - [List](#list)
  - [Queue](#queue)
- [Generics](#generics)
- [Records](#records)
- [Stream API](#stream-api)
  - [Métodos principais da Stream API](#métodos-principais-da-stream-api)

## POO

Fortemente Tipada (Todas as variáveis e métodos precisam definir seus tipos, e seus tipos são imutáveis).

Independente de plataforma (o java compilado pode ser executado em diferentes máquinas, pois a JVM executa o bytecode).

- **JDK** -> gera bytecode, faz a compilação/build da aplicação java
- **JVM** -> Ambiente de execução de programa Java

Todo arquivo java precisa declarar uma classe. O nome da classe declarada tem que ser igual ao nome do arquivo. Pode haver mais de uma classe dentro do arquivo, a classe que for ter o mesmo nome do arquivo tem que ser `public`.

## Variáveis

**Variável** -> espaço na memória do computador que armazena valor

```java
tipo nome = valor;

var nome = valor; // var faz inferência de tipo à variável
```

### Tipos primitivos de variáveis

| Tipo | Tamanho | Intervalo | Observação |
|---|---|---|---|
| byte | 8 bits | -128 a 127 | |
| short | 16 bits | -32768 a -32767 | |
| int | 32 bits | -2.147.483.648 a 2.147.483.647 | |
| long | 64 bits | -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 | Coloca `L` no final do valor. Ex: `65.4L` |
| float | 32 bits | Precisão simples | Coloca `f` no final do valor. Ex: `65.4f` |
| double | 64 bits | Precisão dupla | |
| boolean | 1 bit | | |
| char | 16 bits | `'c'` | |

**String** -> `"String"` (É uma classe, não um tipo primitivo de fato).

## Operadores

| Tipo | Operadores |
|---|---|
| Aritméticos | `+`  `-`  `*`  `/`  `%` |
| Relacionais | `==`  `!=`  `>`  `<`  `>=`  `<=` |
| Lógicos | `&&`  `\|\|`  `!` |

## Comentários

```java
// Comentário de uma linha

/* Comentário
   de múltiplas linhas */

/** Comentário Javadoc,
 * usado para documentar classes e métodos */
```

## Condicionais

```java
if(condição){
  comandos
}else if(condição 2){
  comandos
}else{
  comandos
}
```

### switch/case

Estrutura condicional usada como alternativa a vários `if/else if`. Exemplo:

```java
switch(dia){
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda");
        break;
    default:
        System.out.println("Dia inválido");
}
```

**Switch expression** (versão moderna, com `->`), não precisa de `break`:

```java
String nomeDia = switch(dia){
    case 1 -> "Domingo";
    case 2 -> "Segunda";
    default -> "Dia inválido";
};
```

## Vetores

Coleção de valores de um mesmo tipo de tamanho fixo. Exemplo:

```java
int[] coleção = {1, 2, 3, 4}; // valores inicializados
int[] numeros = new int[4];  // valores não inicializados
```

### Arrays multidimensionais

```java
int[][] matriz = {
    {1, 2, 3},
    {4, 5, 6}
};

System.out.println(matriz[1][2]); // 6
```

## Scanner

Usado para ler entradas do usuário. Necessita importar `java.util.Scanner;`. Exemplo:

```java
Scanner scanner = new Scanner(System.in);

System.out.println("Digite seu nome:");
String nome = scanner.nextLine();

System.out.println("Digite sua idade:");
int idade = scanner.nextInt();
```

## ArrayList

É uma classe, implementa uma lista dinâmica. Necessita importar a biblioteca `java.util.ArrayList;`. Exemplo:

```java
ArrayList<String> nomes = new ArrayList();
```

### Métodos de ArrayList

| Método | Descrição |
|---|---|
| `nomes.add("NovoNome");` | Adiciona um elemento |
| `nomes.get(indice);` | Pega o elemento |
| `nomes.remove(indice);` | Remove o elemento, pode ser por índice ou pelo nome do valor |

**Biblioteca** -> conjunto de códigos prontos que você pode utilizar no seu programa

## Iteração (loop)

```java
for(int i = 0; i < 10; i++){
  Comandos
}

for(Tipo variavel iterada : coleção){
  Comandos
}
```

Exemplo:

```java
for(String nome : nomes){
  System.out.println(nome):
}
```

```java
while(condição){
   Comandos
}

do {
    // código
} while (condição);
```

## Casting (Conversão de dados para outro tipo)

| Conversão | Sintaxe |
|---|---|
| double to int | `int meuInteiro = (int) pontoFlutuante;` |
| String to int | `int meuInteiro = Integer.parseInt(minhaString);` |
| int to String | `String minhaString = String.valueOf(meuInteiro);` |

## Compilação

```
javac nomeArquivo.java  // gera o nomeArquivo.class

java nomeArquivo  // executa o .class
```

## POO em Java

### Class

**Construtores** -> método especial usado para criar e inicializar um objeto. (Em java tem sobrecarga de métodos, pode haver mais de um construtor). Exemplo:

```java
public class Pessoa {
    String nome;
    int idade;

    public Pessoa() {
        nome = "Sem nome";
        idade = 0;
    }

    public Pessoa(String nome) {
        this.nome = nome;
        idade = 0;
    }
}
```

### Objeto

Instancializa uma classe chamando o construtor com o `new`. Exemplo:

```java
Pessoa alguem = new Pessoa();
```

### Métodos

```java
public int somar(int a, int b) {
    return a + b;
}
```

```java
modificadorAcesso tipoRetorno nomeMetodo(parametros){
  codigo
  return dadoTipoRetorno;
}
```

### Método especial (método inicial)

```java
public static void main(String[] args){
  codigo
}
```

## Package

Definida no topo do código dizendo que a classe pertence a um pacote. Eles respeitam a hierarquia dos diretórios, logo é necessário dizer a pasta que a classe pertence.

## Modificadores de acesso

Controlam a visibilidade das classes e dos métodos para outras classes e pacotes (package).

| Modificador | Visibilidade |
|---|---|
| public | acessível de qualquer lugar |
| private | acessível somente dentro da própria classe |
| protected | acessível na própria classe, subclasses e classes do mesmo package |
| default | somente dentro do mesmo package |

- **static** -> Faz o membro pertencer à classe, e não a cada objeto.
- **final** -> Impede alterações dependendo de onde é usado.

### Extra sobre modificadores de variáveis e métodos

| Modificador | Descrição |
|---|---|
| synchronized | controla acesso entre threads |
| volatile | controla visibilidade entre threads |
| transient | não participa da serialização padrão |

## Encapsulamento

Prática de tornar os atributos de uma classe `private` e controlar o acesso a eles por meio de métodos públicos: **getters** (retornam o valor) e **setters** (alteram o valor). Exemplo:

```java
public class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
```

## this vs super

- **this** -> referencia o próprio objeto da classe atual. Usado para diferenciar atributo de parâmetro com mesmo nome, ou chamar outro construtor da mesma classe.
- **super** -> referencia a classe pai (superclasse). Usado para chamar o construtor ou métodos da classe pai.

```java
class Animal {
    String nome;

    Animal(String nome) {
        this.nome = nome; // this: diferencia atributo do parâmetro
    }
}

class Cachorro extends Animal {
    Cachorro(String nome) {
        super(nome); // super: chama o construtor da classe pai
    }
}
```

## instanceof

Operador usado para verificar se um objeto é de um determinado tipo, muito usado em conjunto com polimorfismo. Exemplo:

```java
Animal animal = new Cachorro("Rex");

if (animal instanceof Cachorro) {
    System.out.println("É um cachorro!");
}
```

## equals(), hashCode() e toString()

Métodos da classe `Object` que podem (e geralmente devem) ser sobrescritos:

- **toString()** -> define como o objeto é representado como texto (usado, por exemplo, em `System.out.println(objeto)`)
- **equals()** -> define como dois objetos são comparados por igualdade de conteúdo (e não por referência de memória)
- **hashCode()** -> gera um código numérico associado ao objeto, usado internamente por coleções como `HashMap` e `HashSet`. Deve ser sobrescrito sempre que `equals()` for sobrescrito.

```java
public class Pessoa {
    String nome;
    int idade;

    @Override
    public String toString() {
        return "Pessoa{nome=" + nome + ", idade=" + idade + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Pessoa)) return false;
        Pessoa outra = (Pessoa) obj;
        return idade == outra.idade && nome.equals(outra.nome);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nome, idade);
    }
}
```

## Enums

Tipo especial usado para representar um conjunto fixo de constantes. Exemplo:

```java
enum DiaDaSemana {
    DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
}
```

Uso:

```java
DiaDaSemana hoje = DiaDaSemana.SEGUNDA;

if (hoje == DiaDaSemana.SEGUNDA) {
    System.out.println("Início da semana");
}
```

## Bloco de inicialização estático

Bloco executado uma única vez, quando a classe é carregada — antes de qualquer instância ser criada. Usado geralmente para inicializar atributos `static`. Exemplo:

```java
public class Configuracao {
    static String ambiente;

    static {
        ambiente = "produção";
        System.out.println("Bloco estático executado");
    }
}
```

## Interfaces

Contrato que define quais métodos uma classe deve ter, não define como os métodos são implementados e nem as variáveis que serão utilizadas. Exemplo:

```java
interface Animal {
    void emitirSom();
    int andar(int velocidade);	
}
```

### Implementação da interface

```java
class Cachorro implements Animal {  // Herança

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    @Override
    public int andar(int velocidade) {
        return velocidade + 2;
    }
}
```

```java
Cachorro lulu = new Cachorro();
```
→ pode acessar métodos de Animal + métodos específicos de Cachorro.

```java
Animal lulu = new Cachorro(); // Polimorfismo
```
A variável `lulu` é do tipo `Animal`, mas o objeto criado é um `Cachorro`. Assim, `lulu` só pode acessar os métodos definidos em `Animal`, porém será executada a implementação de `Cachorro`.

*obs: `@Override` sobrescreve o método pai ou de uma interface*

## Classe Abstrata

Uma classe que serve como base para outras classes. Ela não pode ser instanciada diretamente. Pode ter atributos, métodos normais e/ou métodos abstratos.

Exemplo:

```java
abstract class Animal {
    String nome;

    Animal(String nome) {
        this.nome = nome;
    }

    abstract void emitirSom();

    void apresentar() {
        System.out.println("Nome: " + nome);
    }
}

class Cachorro extends Animal {

    Cachorro(String nome) {
        super(nome); // chama o construtor da classe pai
    }

    @Override
    void emitirSom() {
        System.out.println("Au au!");
    }
}
```

Uso:

```java
Animal cachorro = new Cachorro("Rex");

cachorro.apresentar(); // Nome: Rex
cachorro.emitirSom();  // Au au!
```

## Herança

Uma classe herda atributos e métodos de outra classe, a classe pode ser normal ou classe abstrata.

## Polimorfismo

Diferentes comportamentos através de uma mesma referência.

1. **Sobrescrita (Override)** -> mesmo método, comportamento diferente, decidido em tempo de execução
2. **Interface** -> diferentes classes implementam o mesmo contrato, também permite polimorfismo de subtipo
3. **Sobrecarga (Overloading)** -> mesmo nome, parâmetros diferentes, decidido em tempo de compilação

## Tratamento de exceções

Mecanismo usado para tratar erros que podem ocorrer durante a execução do programa.

```java
try{
   Contém o código que pode gerar uma exceção.
}catch{
   Captura e trata a exceção.
}finally{
   Executa independentemente de ocorrer ou não uma exceção.
}
```

**throw** -> Usado para lançar uma exceção manualmente

```java
if (idade < 18) {
    throw new IllegalArgumentException("Idade inválida");
}
```

**throws** -> Indica que um método pode lançar determinadas exceções, deixando o tratamento para quem chamar o método.

```java
public void abrirArquivo() throws IOException {
    // código
}
```

### Exceções checked vs unchecked

- **Checked** -> verificadas em tempo de compilação. O compilador obriga a tratar (`try/catch`) ou declarar (`throws`). Ex: `IOException`, `SQLException`.
- **Unchecked** -> não verificadas em tempo de compilação (herdam de `RuntimeException`). Não é obrigatório tratar. Ex: `NullPointerException`, `ArithmeticException`, `IllegalArgumentException`.

### Múltiplos catch

Pode-se ter vários blocos `catch`, ou capturar mais de um tipo de exceção no mesmo bloco usando `|`. Exemplo:

```java
try {
    // código
} catch (IOException e) {
    System.out.println("Erro de I/O");
} catch (SQLException e) {
    System.out.println("Erro de banco de dados");
}
```

```java
try {
    // código
} catch (IOException | SQLException e) {
    System.out.println("Erro: " + e.getMessage());
}
```

### try-with-resources

Fecha automaticamente recursos (como arquivos ou conexões) ao final do bloco, sem precisar de `finally`. O recurso precisa implementar `AutoCloseable`. Exemplo:

```java
try (FileReader arquivo = new FileReader("dados.txt")) {
    // usa o arquivo
} catch (IOException e) {
    System.out.println("Erro ao ler arquivo");
}
// arquivo é fechado automaticamente aqui
```

### Exceções customizadas

Criadas estendendo `Exception` (checked) ou `RuntimeException` (unchecked). Exemplo:

```java
class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}
```

Uso:

```java
public void validarIdade(int idade) throws IdadeInvalidaException {
    if (idade < 18) {
        throw new IdadeInvalidaException("Idade inválida");
    }
}
```

## Pacotes (Packages)

Organizam as classes de forma hierárquica, definindo também visibilidades entre pacotes.

## Java Collections (Framework Java)

Fornece estruturas de dados prontas para armazenar e manipular grupos de objetos.

### Map

Estrutura chave-valor.

```java
Map<String, String> mapa = new HashMap<>();
```

### Set

Não permite elementos duplicados.

```java
Set<String> conjuntoString = new HashSet<>();
```

### List

Lista ordenada que permite elementos duplicados.

```java
List<String> lista = new ArrayList<>();
```

### Queue

Fila, usada para processamento em ordem.

```java
Queue<String> fila = new LinkedList<>();
```

## Generics

Permite criar classes e interfaces com tipos parametrizados. Exemplo:

```java
public class Caixa<T> {
    private T conteudo;

    public void guardar(T item) {
        this.conteudo = item;
    }

    public T pegar() {
        return conteudo;
    }
}
```

Uso:

```java
Caixa<String> caixa = new Caixa<>();
caixa.guardar("Olá");
String valor = caixa.pegar(); // sem cast, sem risco de erro de tipo
```

## Records

Classe imutável. Exemplo:

```java
public record Pessoa(String nome, int idade) {
    public boolean isMaiorDeIdade() {
        return idade >= 18;
    }
}
```

Uso:

```java
Pessoa p = new Pessoa("Ana", 25);
System.out.println(p.nome());           // Ana
System.out.println(p);                  // Pessoa[nome=Ana, idade=25]
System.out.println(p.isMaiorDeIdade()); // true
```

## Stream API

Realiza operações funcionais/declarativas em collections. Exemplo:

```java
List<String> nomes = List.of("Ana", "Bruno", "Carla", "Davi");

List<String> resultado = nomes.stream()
    .filter(nome -> nome.length() > 3)
    .map(String::toUpperCase)
    .collect(Collectors.toList());

System.out.println(resultado); // [BRUNO, CARLA, DAVI]
```

### Métodos principais da Stream API

**Operações intermediárias** (retornam outro Stream, podem ser encadeadas)

| Método | Descrição |
|---|---|
| `filter(Predicate)` | Filtra elementos que atendem a uma condição |
| `map(Function)` | Transforma cada elemento em outro tipo/valor |
| `flatMap(Function)` | Achata streams aninhados em um único stream |
| `sorted()` | Ordena os elementos (ordem natural) |
| `sorted(Comparator)` | Ordena os elementos com critério customizado |
| `distinct()` | Remove elementos duplicados |
| `limit(n)` | Limita o stream aos primeiros n elementos |
| `skip(n)` | Pula os primeiros n elementos |
| `peek(Consumer)` | Executa uma ação sem alterar o stream (debug) |

**Operações terminais** (finalizam o stream e produzem um resultado)

| Método | Descrição |
|---|---|
| `collect(Collector)` | Reúne o resultado em uma coleção (List, Set, Map, etc.) |
| `forEach(Consumer)` | Executa uma ação para cada elemento |
| `toArray()` | Converte o stream em um array |
| `count()` | Conta a quantidade de elementos |
| `sum()` | Soma os valores (streams numéricas: IntStream, etc.) |
| `average()` | Calcula a média (streams numéricas) |
| `min(Comparator)` | Retorna o menor elemento (Optional) |
| `max(Comparator)` | Retorna o maior elemento (Optional) |
| `reduce(BinaryOperator)` | Reduz todos os elementos a um único valor |
| `anyMatch(Predicate)` | Retorna true se ALGUM elemento atender à condição |
| `allMatch(Predicate)` | Retorna true se TODOS os elementos atenderem à condição |
| `noneMatch(Predicate)` | Retorna true se NENHUM elemento atender à condição |
| `findFirst()` | Retorna o primeiro elemento (Optional) |
| `findAny()` | Retorna qualquer elemento (útil em paralelo) (Optional) |

**Métodos de criação de Stream**

| Método | Descrição |
|---|---|
| `collection.stream()` | Cria um stream sequencial a partir de uma coleção |
| `collection.parallelStream()` | Cria um stream paralelo a partir de uma coleção |
| `Stream.of(...)` | Cria um stream a partir de valores/elementos |
| `Stream.empty()` | Cria um stream vazio |
| `IntStream.range(a, b)` | Cria um stream de inteiros de a até b (exclusive) |