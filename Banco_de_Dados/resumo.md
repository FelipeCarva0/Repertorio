
========================================
        INTRODUÇÃO À LINGUAGEM SQL
========================================

1. COMANDOS SQL
========================================

--- CONSULTAS (DQL) ---

SELECT
    Seleciona as colunas que serão retornadas.

FROM
    Define a tabela de origem.

WHERE
    Filtra registros antes do agrupamento.

DISTINCT
    Remove valores duplicados.

AS
    Cria um apelido (alias) para coluna ou tabela.

JOIN
    Combina registros de tabelas relacionadas.

INNER JOIN
    Retorna apenas registros com correspondência nas duas tabelas.

LEFT JOIN
    Retorna todos os registros da tabela da esquerda
    e os correspondentes da direita.

RIGHT JOIN
    Retorna todos os registros da tabela da direita
    e os correspondentes da esquerda.

FULL OUTER JOIN
    Retorna todos os registros de ambas as tabelas.

CROSS JOIN
    Combina cada registro de uma tabela com todos
    os registros da outra.

GROUP BY
    Agrupa registros por uma ou mais colunas.

HAVING
    Filtra grupos após o agrupamento.

ORDER BY
    Ordena o resultado.

LIMIT
    Limita a quantidade de registros retornados.

OFFSET
    Pula uma quantidade de registros.

CASE
    Cria condições dentro de uma consulta.

SUBQUERY / SUBSELECT
    Consulta dentro de outra consulta.


--- MANIPULAÇÃO DE DADOS (DML) ---

INSERT INTO
    Insere novos registros.

UPDATE
    Atualiza registros existentes.

DELETE FROM
    Exclui registros.


--- DEFINIÇÃO DE ESTRUTURA (DDL) ---

CREATE TABLE
    Cria uma tabela.

ALTER TABLE
    Altera a estrutura de uma tabela.

DROP TABLE
    Exclui uma tabela.

TRUNCATE TABLE
    Remove todos os registros de uma tabela.


--- TRANSAÇÕES (TCL) ---

COMMIT
    Confirma uma transação.

ROLLBACK
    Desfaz alterações de uma transação.

SAVEPOINT
    Cria um ponto de retorno na transação.


--- CONTROLE DE PERMISSÕES (DCL) ---

GRANT
    Concede permissões.

REVOKE
    Remove permissões.



2. TIPOS DE DADOS
========================================

INTEGER
    Número inteiro.

BOOLEAN
    Valor lógico: TRUE ou FALSE.

DATE
    Data.

TIME
    Horário.

TIMESTAMP
    Data e horário.

DECIMAL(p,s)
    Número decimal exato.
    p = precisão total.
    s = casas decimais.

CHARACTER / CHAR(n)
    Texto de tamanho fixo.

VARCHAR(n)
    Texto de tamanho variável.

TEXT
    Texto de tamanho variável, geralmente longo.

FLOAT
    Número de ponto flutuante.

REAL
    Número de ponto flutuante.

SERIAL
    Identificador auto incrementável.
    (PostgreSQL)


3. RESTRIÇÕES (CONSTRAINTS)

========================================

PRIMARY KEY

    Identifica unicamente cada registro da tabela.

    Não permite valores duplicados ou NULL.

    Exemplo:

    id INTEGER PRIMARY KEY


FOREIGN KEY

    Define uma relação entre tabelas.

    Garante que o valor exista na tabela referenciada.

    Exemplo:

    cliente_id INTEGER,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id)


UNIQUE

    Garante que os valores de uma coluna
    não sejam duplicados.

    Exemplo:

    email VARCHAR(100) UNIQUE


NOT NULL

    Impede que uma coluna receba valores NULL.

    Exemplo:

    nome VARCHAR(100) NOT NULL


CHECK

    Define uma condição que os valores
    da coluna devem satisfazer.

    Exemplo:

    salario DECIMAL(10,2) CHECK (salario > 0)


DEFAULT

    Define um valor padrão quando nenhum
    valor é informado.

    Exemplo:

    ativo BOOLEAN DEFAULT TRUE


CONSTRAINT

    Permite dar um nome à restrição.

    Exemplo:

    CONSTRAINT salario_positivo
    CHECK (salario > 0)


--- PRINCIPAIS RESTRIÇÕES ---

PRIMARY KEY
    Identificação única do registro.

FOREIGN KEY
    Integridade referencial entre tabelas.

UNIQUE
    Impede valores duplicados.

NOT NULL
    Impede valores nulos.

CHECK
    Impõe uma condição aos valores.

DEFAULT
    Define um valor padrão.

4. OPERADORES
========================================

--- COMPARAÇÃO ---

=
    Igual.

!=, <>
    Diferente.

>
    Maior que.

>=
    Maior ou igual.

<
    Menor que.

<=
    Menor ou igual.


--- LÓGICOS ---

AND
    Todas as condições devem ser verdadeiras.

OR
    Pelo menos uma condição deve ser verdadeira.

NOT
    Inverte uma condição.


--- OUTROS OPERADORES ---

IN
    Verifica se um valor está em uma lista.

NOT IN
    Verifica se não está em uma lista.

BETWEEN
    Verifica se está em um intervalo inclusivo.

LIKE
    Busca por padrão de texto.

ILIKE
    Busca sem diferenciar maiúsculas e minúsculas.
    (PostgreSQL)

IS NULL
    Verifica se o valor é nulo.

IS NOT NULL
    Verifica se o valor não é nulo.


--- PADRÕES COM LIKE ---

LIKE '%abc%'
    Contém "abc".

LIKE 'A%'
    Começa com "A".

LIKE '%A'
    Termina com "A".

||
    Concatena textos.
    (PostgreSQL)



5. AGGREGATE FUNCTIONS
========================================

SUM()
    Soma valores.

COUNT()
    Conta registros.

MAX()
    Retorna o maior valor.

MIN()
    Retorna o menor valor.

AVG()
    Retorna a média.

FIRST_VALUE()
    Retorna o primeiro valor de uma janela.

LAST_VALUE()
    Retorna o último valor de uma janela.

STRING_AGG()
    Concatena textos em um único resultado.
    (PostgreSQL)



6. ORDEM DE ESCRITA DE UMA CONSULTA
========================================

SELECT
FROM
JOIN
WHERE
GROUP BY
HAVING
ORDER BY
LIMIT
OFFSET


7. EXEMPLO DE CONSULTA COMPLETA
========================================

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


8. EXEMPLOS DE DML
========================================

--- INSERT ---

INSERT INTO funcionarios (nome, salario)
VALUES ('Felipe', 3000);


--- UPDATE ---

UPDATE funcionarios
SET salario = 3500
WHERE nome = 'Felipe';


--- DELETE ---

DELETE FROM funcionarios
WHERE nome = 'Felipe';


9. EXEMPLOS DE DDL
========================================

--- CREATE TABLE ---

CREATE TABLE funcionarios (
    id INTEGER PRIMARY KEY,
    nome VARCHAR(100),
    salario DECIMAL(10,2)
);


--- ALTER TABLE ---

ALTER TABLE funcionarios
ADD COLUMN idade INTEGER;


--- DROP TABLE ---

DROP TABLE funcionarios;


10. OBSERVAÇÕES IMPORTANTES
========================================

- SELECT, FROM, WHERE, GROUP BY, ORDER BY e JOIN
  são comandos essenciais para consultas.

- HAVING filtra grupos.
  WHERE filtra registros.

- GROUP BY é geralmente utilizado com funções agregadas.

- COUNT(*) conta registros, incluindo aqueles
  que possuem valores NULL.

- COUNT(coluna) não conta valores NULL daquela coluna.

- BETWEEN inclui os dois limites do intervalo.

- NULL não é comparado usando = ou !=.
  Utilize IS NULL ou IS NOT NULL.

- FIRST e LAST não são funções agregadas padrão
  em todos os bancos.
  FIRST_VALUE() e LAST_VALUE() são funções de janela.

- SERIAL é específico do PostgreSQL.


11. VÍDEO DE RESUMO DE SQL
========================================

https://www.youtube.com/watch?v=OFLMhFuArXQ

# Organização de Dados

* **Registro** → conjunto de campos que representa uma unidade de informação.

* **Arquivo** → conjunto de registros armazenados de forma organizada.

* **Arquivo de registros** → arquivo formado por uma coleção de registros.

* **Espalhamento (spanning)** → define se um registro pode ou não ocupar mais de um bloco.

  * **Não espalhado** → registro não pode atravessar o limite de um bloco; deve caber completamente em um único bloco.
  * **Espalhado** → registro pode atravessar o limite de um bloco e ser armazenado em múltiplos blocos.

* **Blocagem** → processo de organizar registros em blocos para armazenamento e transferência entre memória principal e armazenamento secundário.

* **Fator de blocagem** → quantidade de registros que podem ser armazenados em um bloco.

---

# Tipos de Arquivo

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

---

# Indexação de Nível Único

* **Índice** → estrutura auxiliar que armazena informações para localizar registros mais rapidamente.
* **Índice Denso** → possui uma entrada de índice para cada registro ou valor de busca.
* **Índice Esparso** → possui entradas apenas para parte dos registros, normalmente uma entrada por bloco.
* **Índice Primário** → índice baseado no campo utilizado para ordenar o arquivo, normalmente a chave primária.
* **Índice de Agrupamento (Clustering)** → índice baseado em um campo de ordenação que pode possuir valores repetidos, agrupando registros com o mesmo valor.
* **Índice Secundário** → índice baseado em um campo que não é utilizado para ordenar fisicamente o arquivo.

---

# Indexação Multinível

* **Índice Multinível** → utiliza índices sobre outros índices para reduzir o número de acessos necessários até encontrar um registro.
* **Índice Estático** → estrutura de índice que não se adapta automaticamente às alterações do arquivo, podendo exigir reorganização.
* **Índice Dinâmico** → estrutura que se adapta às inserções e exclusões de registros, mantendo o índice atualizado.
* **B-Tree / B+ Tree** → estruturas de índice dinâmico muito utilizadas para pesquisas e operações em grandes volumes de dados.

---

# Processamento de Consulta

**Parsing → Otimização → Geração de código → Execução**

* **Parsing** → analisa a consulta SQL, verificando sua sintaxe e identificando seus elementos.
* **Otimização** → procura o plano de execução mais eficiente para realizar a consulta.
* **Geração de código** → transforma o plano escolhido em operações que podem ser executadas pelo SGBD.
* **Execução** → executa o plano e produz o resultado da consulta.

---

# Otimização de Consulta

* **Árvore de Consulta** → representação da consulta como uma árvore de operações relacionais.
* **Otimização Heurística** → utiliza regras pré-definidas para tentar melhorar a consulta.
* **Otimização Baseada em Custo** → compara diferentes planos e escolhe aquele com menor custo estimado.
* **Otimização Semântica** → utiliza informações sobre os dados e suas restrições para simplificar ou melhorar a consulta.

### Técnicas importantes de otimização

* **Seleção antecipada** → aplica filtros o mais cedo possível para reduzir a quantidade de registros processados.
* **Projeção antecipada** → elimina atributos desnecessários o mais cedo possível.
* **Reordenação de JOINs** → altera a ordem dos `JOINs` para reduzir o custo da consulta.
* **Uso de índices** → utiliza índices para evitar a leitura completa do arquivo quando possível.

---

# Processamento de Transações

* **Transação** → sequência de operações que representa uma unidade lógica de trabalho no banco de dados.
* **Read (R)** → operação que realiza a leitura de um dado.
* **Write (W)** → operação que altera ou grava um dado.
* **Read-Write (RW)** → transação que realiza operações de leitura e escrita.
* **Confirmada (Commit)** → transação que terminou com sucesso e teve suas alterações permanentemente confirmadas.
* **Abortada (Abort/Rollback)** → transação que não pôde ser concluída e tem suas alterações desfeitas.

---

# Concorrência

* **Concorrência** → execução intercalada de várias transações ao mesmo tempo, permitindo melhor utilização dos recursos do sistema.
* **Granularidade** → tamanho da unidade de dados que pode ser bloqueada, como banco, tabela, página ou registro.

## Problemas de Concorrência

* **Atualização Perdida** → ocorre quando duas transações alteram o mesmo dado e uma alteração sobrescreve a outra.
* **Leitura Suja (Dirty Read)** → ocorre quando uma transação lê um dado alterado por outra transação que ainda não foi confirmada.
* **Leitura Não Repetitiva (Non-repeatable Read)** → ocorre quando uma transação lê o mesmo dado duas vezes e obtém valores diferentes porque outra transação o alterou entre as leituras.
* **Resumo Incorreto** → ocorre quando uma transação calcula uma agregação enquanto outra transação modifica os dados envolvidos, produzindo um resultado inconsistente.

---

# Bloqueio

* **Bloqueio (Lock)** → mecanismo utilizado para controlar o acesso concorrente aos dados e evitar conflitos entre transações.
* **Bloqueio Compartilhado (S)** → permite que várias transações leiam o mesmo dado, mas impede sua alteração.
* **Bloqueio Exclusivo (X)** → permite que apenas uma transação acesse o dado para leitura ou escrita.
* **Deadlock** → ocorre quando duas ou mais transações ficam esperando indefinidamente por recursos bloqueados umas pelas outras.

---

# Falha

* **Falha** → ocorrência que impede uma transação ou o sistema de continuar funcionando normalmente.
* **Falha de Transação** → ocorre quando uma transação não consegue ser concluída e precisa ser abortada.
* **Falha do Sistema** → ocorre quando o SGBD ou sistema operacional falha, podendo deixar transações em andamento.
* **Falha de Mídia** → ocorre quando há perda ou corrupção dos dados armazenados, como em uma falha de disco.
* **Recuperação** → conjunto de técnicas utilizadas para restaurar o banco a um estado consistente após uma falha.

---

# Propriedades das Transações — ACID

* **Atomicidade** → uma transação é executada completamente ou não é executada; não pode ficar parcialmente concluída.
* **Consistência** → uma transação deve levar o banco de um estado consistente para outro estado consistente.
* **Isolamento** → transações concorrentes não devem interferir umas nas outras de forma que produza resultados incorretos.
* **Durabilidade** → após o `COMMIT`, as alterações da transação devem permanecer armazenadas mesmo após uma falha do sistema.

---

# Escalonamento

* **Escalonamento** → sequência que determina a ordem de execução das operações de várias transações concorrentes.

## Tipos

* **Escalonamento Serial** → uma transação é executada completamente antes da próxima começar.
* **Escalonamento Não Serial** → operações de diferentes transações são intercaladas.
* **Escalonamento Serializável** → escalonamento não serial cujo resultado é equivalente ao de algum escalonamento serial.
* **Escalonamento Recuperável** → uma transação só confirma depois que as transações das quais ela leu dados também foram confirmadas.
* **Escalonamento sem Cascata** → evita que uma transação leia dados escritos por uma transação ainda não confirmada.
* **Escalonamento Estrito** → impede que dados escritos por uma transação sejam lidos ou modificados por outra até que a primeira seja confirmada ou abortada.

---

# Controle de Concorrência

* **Controle de Concorrência** → conjunto de técnicas utilizadas para permitir a execução simultânea de transações mantendo a consistência e o isolamento dos dados.

## Protocolos

* **Protocolo de Bloqueio** → controla o acesso aos dados utilizando bloqueios de leitura e escrita.
* **Two-Phase Locking (2PL)** → protocolo de bloqueio dividido em duas fases: uma fase de crescimento, na qual a transação adquire bloqueios, e uma fase de redução, na qual libera os bloqueios.
* **Protocolo de Timestamp** → utiliza marcas de tempo para determinar a ordem das transações e controlar quais operações podem ser realizadas.
* **Timestamp** → valor associado a uma transação que representa sua ordem de execução em relação às demais transações.
