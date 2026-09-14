# Introdução

As Doze regras de Codd são um conjunto de treze regras (enumeradas de zero a doze) propostas por Edgar F. Codd, um contumaz do modelo relacional para banco de dados, designado para definir o que é necessário para que um sistema de gerenciamento de banco de dados para ser considerado relacional.[1][2] Elas são às vezes, por brincadeira, chamadas de "Doze Mandamentos de Codd".

Codd criou estas regras como parte de uma campanha pessoal para impedir que a sua visão de banco de dados relacional fosse diluída, como fornecedores de banco de dados embaralhados no início de 1980 para remontar produtos existentes com um verniz relacional. A regra 12 foi especialmente criada para combater este posicionamento dos fornecedores.

# As regras

## Regra 0: O sistema precisa ser qualificado como relacional, como um banco de dados, e como um sistema de gerenciamento.

Para um sistema se qualificar como um sistema de gerenciamento de banco de dados relacional (SGBD), este sistema precisa usar suas facilidades de relacionamento (exclusivamente) para gerenciar o banco de dados.

## Regra 1: A regra da informação

Todas as informações no banco de dados necessitam estar representadas de apenas uma forma, nomeados por valores em posições de colunas dentro de registros de tabelas.

## Regra 2: A regra de acesso garantido

Todos os dados necessitam ser acessíveis. Esta regra é essencialmente uma reafirmação do requisito fundamental para chaves primárias. Diz que todo valor na base de dados necessita ser logicamente endereçavel por um nome específico do conteúdo tabela, o nome do conteúdo da coluna e o valor da chave primária do conteúdo registro.

## Regra 3: Tratamento sistemático de valores nulos:

O SGBD deve permitir que cada campo possa permanecer nulo (ou vazio). Especificamente, ele deve suportar uma representação de "falta de informação e informações inaplicáveis" que é sistemática, diferente de todos os valores regulares (por exemplo, "diferente de zero ou qualquer outro número", no caso de valores numéricos), e independente de tipo de dados. É também implícito que tais representações devem ser manipuladas pelo SGBD de maneira sistemática.

## Regra 4: Catálogo on-line baseado no modelo relacional

Os metadados devem ser armazenados e gerenciados como dados comuns, ou seja, em tabelas no interior do Banco de Dados. Esses dados devem estar disponíveis aos usuários autorizados, utilizando a linguagem de consulta padrão do Banco de Dados.

## Regra 5: Sublinguagem Ampla de Dados

O sistema necessita suportar ao menos uma linguagem relacional que:

- Possua uma sintaxe linear;

- Possa ser utilizada seja interativamente, seja por meio de programas;

- Suporte operações de definição de dados (incluindo definições de Visualizações);

- Suporte operações de manipulação de dados (atualização, bem como recuperação), de segurança e restrições de integridade, e transação; operações de gerenciamento (begin, commit e rollback).

## Regra 6: Atualização por meio de Visualizações

Todas as Visualizações que são teoricamente atualizáveis devem ser atualizáveis pelo sistema.

## Regra 7: Inserção, Atualização, e exclusão de Alto nível

O sistema necessita fornecer suporte à configuração do nível de operações de insert, update, e delete. Isto significa que os dados podem ser recuperados a partir de um banco de dados relacional em conjuntos de dados construídos a partir de várias linhas e / ou várias tabelas. Esta regra afirma que as operações de inserção, atualização, e exclusão devem ser apoiadas para qualquer conjunto recuperável e não apenas para uma única linha em uma única tabela.

## Regra 8: Independência Física de dados

Aplicativos e recursos ad hoc não são afetados logicamente quando os métodos de acesso ou as estruturas de armazenamento físico são alterados..

## Regra 9: Independência Lógica de Dados

Aplicativos e recursos ad hoc não são afetados logicamente quando de alterações de estruturas de tabela que preservem os valores originais da tabela (alteração da ordem ou inserção de colunas). Alterações nas relações e nas Visualizações causam pouco ou nenhum impacto nas aplicações.

## Regra 10: Independência de Integridade

Todas as restrições de integridade necessitam ser especificadas separadamente dos programas de aplicação e armazenadas no catálogo. É necessário que seja possível mudar estas restrições sem que necessariamente tenha-se de modificar as aplicações.

## Regra 11: Independência de Distribuição

A distribuição de partes do SGBD em várias localidades deve ser transparente para os usuários do banco de dados. Aplicações existentes necessitam continuar a operar com sucesso:

- quando uma versão distribuída do SGBD é introduzida pela primeira vez, e

- quando dados distribuídos existentes são redistribuídos em outras localidades físicas.

## Regra 12: A não-transposição das regras

Se o SGBD dá suporte a acesso de baixo nível aos dados, não deve haver um modo de negligenciar as regras de integridade do banco.