# Resumo de Banco de Dados

## Sumário

1. [Sistema de Banco de Dados (SBD)](#sistema-de-banco-de-dados-sbd)
2. [As Doze Regras de Codd](#as-doze-regras-de-codd)
3. [Introdução à Linguagem SQL](#introdução-à-linguagem-sql)
4. [Organização de Dados](#organização-de-dados)

---

# Sistema de Banco de Dados (SBD)

> "Sistemas de banco de dados referem-se ao conjunto de dados relacionados e sua respectiva forma de acesso e organização"

- **Coleção de Dados** → banco de dados
- **Estrutura Lógica** → modelo de dados
- **Software** → sistema gerenciador de banco de dado

## BD (Propriedades)

- **Finalidade**
- **Realidade**
- **Coerência**
- **Compartilhamento**

## BD (Projeto)

1. **Especificação** → descrição do minimundo
2. **Análise de Requisitos** → restrições de operações
3. **Projeto Conceitual** → estruturas e restrições conceituais
4. **Projeto Lógico** → estruturas e restriões lógicas
5. **Projeto Físico** → estruturas e restrições físicas

## Modelo de dados

- **Conceitual** → Modelo Entidade-Relacionamento (MER) / DER
- **Representativo** → Modelo Relacional
- **Físico** → Tabelas físicas, índices, páginas, arquivos, particionamento, estruturas de armazenamento

## Linguagens

- **VDL** → define o esquema externo e as visões dos usuários.
- **DDL** → define o esquema conceitual do banco.
- **SDL** → define o esquema interno e o armazenamento dos dados.
- **DML** → realiza operações sobre os dados: inserção, exclusão, alteração e recuperação.

**SQL = VDL + DDL + SDL + DML**

---

# As Doze Regras de Codd

## Introdução

As Doze regras de Codd são um conjunto de treze regras (enumeradas de zero a doze) propostas por Edgar F. Codd, um contumaz do modelo relacional para banco de dados, designado para definir o que é necessário para que um sistema de gerenciamento de banco de dados para ser considerado relacional.[1][2] Elas são às vezes, por brincadeira, chamadas de "Doze Mandamentos de Codd".

Codd criou estas regras como parte de uma campanha pessoal para impedir que a sua visão de banco de dados relacional fosse diluída, como fornecedores de banco de dados embaralhados no início de 1980 para remontar produtos existentes com um verniz relacional. A regra 12 foi especialmente criada para combater este posicionamento dos fornecedores.

## As regras

### Regra 0: O sistema precisa ser qualificado como relacional, como um banco de dados, e como um sistema de gerenciamento.

Para um sistema se qualificar como um sistema de gerenciamento de banco de dados relacional (SGBD), este sistema precisa usar suas facilidades de relacionamento (exclusivamente) para gerenciar o banco de dados.

### Regra 1: A regra da informação

Todas as informações no banco de dados necessitam estar representadas de apenas uma forma, nomeados por valores em posições de colunas dentro de registros de tabelas.

### Regra 2: A regra de acesso garantido

Todos os dados necessitam ser acessíveis. Esta regra é essencialmente uma reafirmação do requisito fundamental para chaves primárias. Diz que todo valor na base de dados necessita ser logicamente endereçavel por um nome específico do conteúdo tabela, o nome do conteúdo da coluna e o valor da chave primária do conteúdo registro.

### Regra 3: Tratamento sistemático de valores nulos

O SGBD deve permitir que cada campo possa permanecer nulo (ou vazio). Especificamente, ele deve suportar uma representação de "falta de informação e informações inaplicáveis" que é sistemática, diferente de todos os valores regulares (por exemplo, "diferente de zero ou qualquer outro número", no caso de valores numéricos), e independente de tipo de dados. É também implícito que tais representações devem ser manipuladas pelo SGBD de maneira sistemática.

### Regra 4: Catálogo on-line baseado no modelo relacional

Os metadados devem ser armazenados e gerenciados como dados comuns, ou seja, em tabelas no interior do Banco de Dados. Esses dados devem estar disponíveis aos usuários autorizados, utilizando a linguagem de consulta padrão do Banco de Dados.

### Regra 5: Sublinguagem Ampla de Dados

O sistema necessita suportar ao menos uma linguagem relacional que:

- Possua uma sintaxe linear;
- Possa ser utilizada seja interativamente, seja por meio de programas;
- Suporte operações de definição de dados (incluindo definições de Visualizações);
- Suporte operações de manipulação de dados (atualização, bem como recuperação), de segurança e restrições de integridade, e transação; operações de gerenciamento (begin, commit e rollback).

### Regra 6: Atualização por meio de Visualizações

Todas as Visualizações que são teoricamente atualizáveis devem ser atualizáveis pelo sistema.

### Regra 7: Inserção, Atualização, e exclusão de Alto nível

O sistema necessita fornecer suporte à configuração do nível de operações de insert, update, e delete. Isto significa que os dados podem ser recuperados a partir de um banco de dados relacional em conjuntos de dados construídos a partir de várias linhas e / ou várias tabelas. Esta regra afirma que as operações de inserção, atualização, e exclusão devem ser apoiadas para qualquer conjunto recuperável e não apenas para uma única linha em uma única tabela.

### Regra 8: Independência Física de dados

Aplicativos e recursos ad hoc não são afetados logicamente quando os métodos de acesso ou as estruturas de armazenamento físico são alterados.

### Regra 9: Independência Lógica de Dados

Aplicativos e recursos ad hoc não são afetados logicamente quando de alterações de estruturas de tabela que preservem os valores originais da tabela (alteração da ordem ou inserção de colunas). Alterações nas relações e nas Visualizações causam pouco ou nenhum impacto nas aplicações.

### Regra 10: Independência de Integridade

Todas as restrições de integridade necessitam ser especificadas separadamente dos programas de aplicação e armazenadas no catálogo. É necessário que seja possível mudar estas restrições sem que necessariamente tenha-se de modificar as aplicações.

### Regra 11: Independência de Distribuição

A distribuição de partes do SGBD em várias localidades deve ser transparente para os usuários do banco de dados. Aplicações existentes necessitam continuar a operar com sucesso:

- quando uma versão distribuída do SGBD é introduzida pela primeira vez, e
- quando dados distribuídos existentes são redistribuídos em outras localidades físicas.

### Regra 12: A não-transposição das regras

Se o SGBD dá suporte a acesso de baixo nível aos dados, não deve haver um modo de negligenciar as regras de integridade do banco.

---

# Introdução à Linguagem SQL

## 1. Comandos SQL

### Consultas (DQL)

**SELECT**
Seleciona as colunas que serão retornadas.

**FROM**
Define a tabela de origem.

**WHERE**
Filtra registros antes do agrupamento.

**DISTINCT**
Remove valores duplicados.

**AS**
Cria um apelido (alias) para coluna ou tabela.

**JOIN**
Combina registros de tabelas relacionadas.

**INNER JOIN**
Retorna apenas registros com correspondência nas duas tabelas.

**LEFT JOIN**
Retorna todos os registros da tabela da esquerda e os correspondentes da direita.

**RIGHT JOIN**
Retorna todos os registros da tabela da direita e os correspondentes da esquerda.

**FULL OUTER JOIN**
Retorna todos os registros de ambas as tabelas.

**CROSS JOIN**
Combina cada registro de uma tabela com todos os registros da outra.

**GROUP BY**
Agrupa registros por uma ou mais colunas.

**HAVING**
Filtra grupos após o agrupamento.

**ORDER BY**
Ordena o resultado.

**LIMIT**
Limita a quantidade de registros retornados.

**OFFSET**
Pula uma quantidade de registros.

**CASE**
Cria condições dentro de uma consulta.

**SUBQUERY / SUBSELECT**
Consulta dentro de outra consulta.

### Manipulação de Dados (DML)

**INSERT INTO**
Insere novos registros.

**UPDATE**
Atualiza registros existentes.

**DELETE FROM**
Exclui registros.

### Definição de Estrutura (DDL)

**CREATE TABLE**
Cria uma tabela.

**ALTER TABLE**
Altera a estrutura de uma tabela.

**DROP TABLE**
Exclui uma tabela.

**TRUNCATE TABLE**
Remove todos os registros de uma tabela.

### Transações (TCL)

**COMMIT**
Confirma uma transação.

**ROLLBACK**
Desfaz alterações de uma transação.

**SAVEPOINT**
Cria um ponto de retorno na transação.

### Controle de Permissões (DCL)

**GRANT**
Concede permissões.

**REVOKE**
Remove permissões.

## 2. Tipos de Dados

**INTEGER**
Número inteiro.

**BOOLEAN**
Valor lógico: TRUE ou FALSE.

**DATE**
Data.

**TIME**
Horário.

**TIMESTAMP**
Data e horário.

**DECIMAL(p,s)**
Número decimal exato.
p = precisão total.
s = casas decimais.

**CHARACTER / CHAR(n)**
Texto de tamanho fixo.

**VARCHAR(n)**
Texto de tamanho variável.

**TEXT**
Texto de tamanho variável, geralmente longo.

**FLOAT**
Número de ponto flutuante.

**REAL**
Número de ponto flutuante.

**SERIAL**
Identificador auto incrementável.
(PostgreSQL)

## 3. Restrições (Constraints)

**PRIMARY KEY**

Identifica unicamente cada registro da tabela.

Não permite valores duplicados ou NULL.

Exemplo:

```sql
id INTEGER PRIMARY KEY
```

**FOREIGN KEY**

Define uma relação entre tabelas.

Garante que o valor exista na tabela referenciada.

Exemplo:

```sql
cliente_id INTEGER,
FOREIGN KEY (cliente_id) REFERENCES clientes(id)
```

**UNIQUE**

Garante que os valores de uma coluna não sejam duplicados.

Exemplo:

```sql
email VARCHAR(100) UNIQUE
```

**NOT NULL**

Impede que uma coluna receba valores NULL.

Exemplo:

```sql
nome VARCHAR(100) NOT NULL
```

**CHECK**

Define uma condição que os valores da coluna devem satisfazer.

Exemplo:

```sql
salario DECIMAL(10,2) CHECK (salario > 0)
```

**DEFAULT**

Define um valor padrão quando nenhum valor é informado.

Exemplo:

```sql
ativo BOOLEAN DEFAULT TRUE
```

**CONSTRAINT**

Permite dar um nome à restrição.

Exemplo:

```sql
CONSTRAINT salario_positivo
CHECK (salario > 0)
```

### Principais Restrições

**PRIMARY KEY**
Identificação única do registro.

**FOREIGN KEY**
Integridade referencial entre tabelas.

**UNIQUE**
Impede valores duplicados.

**NOT NULL**
Impede valores nulos.

**CHECK**
Impõe uma condição aos valores.

**DEFAULT**
Define um valor padrão.

## 4. Operadores

### Comparação

| Operador | Descrição |
|---|---|
| `=` | Igual. |
| `!=`, `<>` | Diferente. |
| `>` | Maior que. |
| `>=` | Maior ou igual. |
| `<` | Menor que. |
| `<=` | Menor ou igual. |

### Lógicos

**AND**
Todas as condições devem ser verdadeiras.

**OR**
Pelo menos uma condição deve ser verdadeira.

**NOT**
Inverte uma condição.

### Outros Operadores

**IN**
Verifica se um valor está em uma lista.

**NOT IN**
Verifica se não está em uma lista.

**BETWEEN**
Verifica se está em um intervalo inclusivo.

**LIKE**
Busca por padrão de texto.

**ILIKE**
Busca sem diferenciar maiúsculas e minúsculas.
(PostgreSQL)

**IS NULL**
Verifica se o valor é nulo.

**IS NOT NULL**
Verifica se o valor não é nulo.

### Padrões com LIKE

**LIKE '%abc%'**
Contém "abc".

**LIKE 'A%'**
Começa com "A".

**LIKE '%A'**
Termina com "A".

**||**
Concatena textos.
(PostgreSQL)

## 5. Aggregate Functions

**SUM()**
Soma valores.

**COUNT()**
Conta registros.

**MAX()**
Retorna o maior valor.

**MIN()**
Retorna o menor valor.

**AVG()**
Retorna a média.

**FIRST_VALUE()**
Retorna o primeiro valor de uma janela.

**LAST_VALUE()**
Retorna o último valor de uma janela.

**STRING_AGG()**
Concatena textos em um único resultado.
(PostgreSQL)

## 6. Ordem de Escrita de uma Consulta

```
SELECT
FROM
JOIN
WHERE
GROUP BY
HAVING
ORDER BY
LIMIT
OFFSET
```

## 7. Exemplo de Consulta Completa

```sql
SELECT
    departamento,
    COUNT(*) AS quantidade,
    AVG(salario) AS media_salarial
FROM funcionarios
WHERE salario > 2000
GROUP BY departamento
HAVING COUNT(*) > 2
ORDER BY media_salarial DESC
LIMIT 10;
```

## 8. Exemplos de DML

### INSERT

```sql
INSERT INTO funcionarios (nome, salario)
VALUES ('Felipe', 3000);
```

### UPDATE

```sql
UPDATE funcionarios
SET salario = 3500
WHERE nome = 'Felipe';
```

### DELETE

```sql
DELETE FROM funcionarios
WHERE nome = 'Felipe';
```

## 9. Exemplos de DDL

### CREATE TABLE

```sql
CREATE TABLE funcionarios (
    id INTEGER PRIMARY KEY,
    nome VARCHAR(100),
    salario DECIMAL(10,2)
);
```

### ALTER TABLE

```sql
ALTER TABLE funcionarios
ADD COLUMN idade INTEGER;
```

### DROP TABLE

```sql
DROP TABLE funcionarios;
```

## 10. Observações Importantes

- SELECT, FROM, WHERE, GROUP BY, ORDER BY e JOIN são comandos essenciais para consultas.
- HAVING filtra grupos. WHERE filtra registros.
- GROUP BY é geralmente utilizado com funções agregadas.
- COUNT(*) conta registros, incluindo aqueles que possuem valores NULL.
- COUNT(coluna) não conta valores NULL daquela coluna.
- BETWEEN inclui os dois limites do intervalo.
- NULL não é comparado usando = ou !=. Utilize IS NULL ou IS NOT NULL.
- FIRST e LAST não são funções agregadas padrão em todos os bancos. FIRST_VALUE() e LAST_VALUE() são funções de janela.
- SERIAL é específico do PostgreSQL.

## 11. Vídeo de Resumo de SQL

https://www.youtube.com/watch?v=OFLMhFuArXQ

---

# Organização de Dados

* **Registro** → conjunto de campos que representa uma unidade de informação.
* **Arquivo** → conjunto de registros armazenados de forma organizada.
* **Arquivo de registros** → arquivo formado por uma coleção de registros.
* **Espalhamento (spanning)** → define se um registro pode ou não ocupar mais de um bloco.
  * **Não espalhado** → registro não pode atravessar o limite de um bloco; deve caber completamente em um único bloco.
  * **Espalhado** → registro pode atravessar o limite de um bloco e ser armazenado em múltiplos blocos.
* **Blocagem** → processo de organizar registros em blocos para armazenamento e transferência entre memória principal e armazenamento secundário.
* **Fator de blocagem** → quantidade de registros que podem ser armazenados em um bloco.

## Tipos de Arquivo

* **Arquivo Heap (Pilha)** → registros posicionados sem ordem, com novos registros acrescentados ao final do arquivo.
  * **Pesquisa** → geralmente é necessário percorrer os registros até encontrar o desejado.
  * **Inserção** → simples e rápida, pois o registro pode ser acrescentado ao final.
  * **Exclusão** → primeiro localiza o registro e depois o remove, podendo deixar espaço livre.
  * **Alteração** → localiza o registro e modifica seus dados; se o tamanho mudar, pode ser necessário realocá-lo.

* **Arquivo Sequencial** → registros posicionados ordenadamente por um ou mais campos, denominados campos de ordenação.
  * **Pesquisa** → eficiente quando realizada pelo campo de ordenação; pode utilizar pesquisa binária.
  * **Inserção** → mais custosa, pois o registro deve ser colocado na posição correta para manter a ordem.
  * **Exclusão** → pode exigir reorganização para manter os registros ordenados.
  * **Alteração** → simples quando não altera o campo de ordenação; caso altere, o registro pode precisar ser reposicionado.

* **Arquivo Hash** → registros posicionados a partir da aplicação de uma função hash sobre um ou mais campos, denominados campos hash.
  * **Pesquisa** → muito eficiente para buscas por igualdade utilizando o campo hash.
  * **Inserção** → a função hash determina a posição do registro; colisões precisam ser tratadas.
  * **Exclusão** → localiza o registro por meio do hash e realiza sua remoção.
  * **Alteração** → se o campo hash mudar, o registro pode precisar ser reposicionado.
  * **Limitação** → não é adequado para pesquisas por intervalo, como valores entre 10 e 20.

## Indexação de Nível Único

* **Índice** → estrutura auxiliar que armazena informações para localizar registros mais rapidamente.
* **Índice Denso** → possui uma entrada de índice para cada registro ou valor de busca.
* **Índice Esparso** → possui entradas apenas para parte dos registros, normalmente uma entrada por bloco.
* **Índice Primário** → índice baseado no campo utilizado para ordenar o arquivo, normalmente a chave primária.
* **Índice de Agrupamento (Clustering)** → índice baseado em um campo de ordenação que pode possuir valores repetidos, agrupando registros com o mesmo valor.
* **Índice Secundário** → índice baseado em um campo que não é utilizado para ordenar fisicamente o arquivo.

## Indexação Multinível

* **Índice Multinível** → utiliza índices sobre outros índices para reduzir o número de acessos necessários até encontrar um registro.
* **Índice Estático** → estrutura de índice que não se adapta automaticamente às alterações do arquivo, podendo exigir reorganização.
* **Índice Dinâmico** → estrutura que se adapta às inserções e exclusões de registros, mantendo o índice atualizado.
* **B-Tree / B+ Tree** → estruturas de índice dinâmico muito utilizadas para pesquisas e operações em grandes volumes de dados.

## Processamento de Consulta

**Parsing → Otimização → Geração de código → Execução**

* **Parsing** → analisa a consulta SQL, verificando sua sintaxe e identificando seus elementos.
* **Otimização** → procura o plano de execução mais eficiente para realizar a consulta.
* **Geração de código** → transforma o plano escolhido em operações que podem ser executadas pelo SGBD.
* **Execução** → executa o plano e produz o resultado da consulta.

## Otimização de Consulta

* **Árvore de Consulta** → representação da consulta como uma árvore de operações relacionais.
* **Otimização Heurística** → utiliza regras pré-definidas para tentar melhorar a consulta.
* **Otimização Baseada em Custo** → compara diferentes planos e escolhe aquele com menor custo estimado.
* **Otimização Semântica** → utiliza informações sobre os dados e suas restrições para simplificar ou melhorar a consulta.

### Técnicas importantes de otimização

* **Seleção antecipada** → aplica filtros o mais cedo possível para reduzir a quantidade de registros processados.
* **Projeção antecipada** → elimina atributos desnecessários o mais cedo possível.
* **Reordenação de JOINs** → altera a ordem dos `JOINs` para reduzir o custo da consulta.
* **Uso de índices** → utiliza índices para evitar a leitura completa do arquivo quando possível.

## Processamento de Transações

* **Transação** → sequência de operações que representa uma unidade lógica de trabalho no banco de dados.
* **Read (R)** → operação que realiza a leitura de um dado.
* **Write (W)** → operação que altera ou grava um dado.
* **Read-Write (RW)** → transação que realiza operações de leitura e escrita.
* **Confirmada (Commit)** → transação que terminou com sucesso e teve suas alterações permanentemente confirmadas.
* **Abortada (Abort/Rollback)** → transação que não pôde ser concluída e tem suas alterações desfeitas.

## Concorrência

* **Concorrência** → execução intercalada de várias transações ao mesmo tempo, permitindo melhor utilização dos recursos do sistema.
* **Granularidade** → tamanho da unidade de dados que pode ser bloqueada, como banco, tabela, página ou registro.

### Problemas de Concorrência

* **Atualização Perdida** → ocorre quando duas transações alteram o mesmo dado e uma alteração sobrescreve a outra.
* **Leitura Suja (Dirty Read)** → ocorre quando uma transação lê um dado alterado por outra transação que ainda não foi confirmada.
* **Leitura Não Repetitiva (Non-repeatable Read)** → ocorre quando uma transação lê o mesmo dado duas vezes e obtém valores diferentes porque outra transação o alterou entre as leituras.
* **Resumo Incorreto** → ocorre quando uma transação calcula uma agregação enquanto outra transação modifica os dados envolvidos, produzindo um resultado inconsistente.

## Bloqueio

* **Bloqueio (Lock)** → mecanismo utilizado para controlar o acesso concorrente aos dados e evitar conflitos entre transações.
* **Bloqueio Compartilhado (S)** → permite que várias transações leiam o mesmo dado, mas impede sua alteração.
* **Bloqueio Exclusivo (X)** → permite que apenas uma transação acesse o dado para leitura ou escrita.
* **Deadlock** → ocorre quando duas ou mais transações ficam esperando indefinidamente por recursos bloqueados umas pelas outras.

## Falha

* **Falha** → ocorrência que impede uma transação ou o sistema de continuar funcionando normalmente.
* **Falha de Transação** → ocorre quando uma transação não consegue ser concluída e precisa ser abortada.
* **Falha do Sistema** → ocorre quando o SGBD ou sistema operacional falha, podendo deixar transações em andamento.
* **Falha de Mídia** → ocorre quando há perda ou corrupção dos dados armazenados, como em uma falha de disco.
* **Recuperação** → conjunto de técnicas utilizadas para restaurar o banco a um estado consistente após uma falha.

## Propriedades das Transações — ACID

* **Atomicidade** → uma transação é executada completamente ou não é executada; não pode ficar parcialmente concluída.
* **Consistência** → uma transação deve levar o banco de um estado consistente para outro estado consistente.
* **Isolamento** → transações concorrentes não devem interferir umas nas outras de forma que produza resultados incorretos.
* **Durabilidade** → após o `COMMIT`, as alterações da transação devem permanecer armazenadas mesmo após uma falha do sistema.

## Escalonamento

* **Escalonamento** → sequência que determina a ordem de execução das operações de várias transações concorrentes.

### Tipos

* **Escalonamento Serial** → uma transação é executada completamente antes da próxima começar.
* **Escalonamento Não Serial** → operações de diferentes transações são intercaladas.
* **Escalonamento Serializável** → escalonamento não serial cujo resultado é equivalente ao de algum escalonamento serial.
* **Escalonamento Recuperável** → uma transação só confirma depois que as transações das quais ela leu dados também foram confirmadas.
* **Escalonamento sem Cascata** → evita que uma transação leia dados escritos por uma transação ainda não confirmada.
* **Escalonamento Estrito** → impede que dados escritos por uma transação sejam lidos ou modificados por outra até que a primeira seja confirmada ou abortada.

## Controle de Concorrência

* **Controle de Concorrência** → conjunto de técnicas utilizadas para permitir a execução simultânea de transações mantendo a consistência e o isolamento dos dados.

### Protocolos

* **Protocolo de Bloqueio** → controla o acesso aos dados utilizando bloqueios de leitura e escrita.
* **Two-Phase Locking (2PL)** → protocolo de bloqueio dividido em duas fases: uma fase de crescimento, na qual a transação adquire bloqueios, e uma fase de redução, na qual libera os bloqueios.
* **Protocolo de Timestamp** → utiliza marcas de tempo para determinar a ordem das transações e controlar quais operações podem ser realizadas.
* **Timestamp** → valor associado a uma transação que representa sua ordem de execução em relação às demais transações.