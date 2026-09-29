# Redes

## Sumário

1. [Modelos de Camadas](#modelos-de-camadas)
   - [Explicação de cada camada](#explicação-de-cada-camada)
2. [Classificação das Redes](#classificação-das-redes)
   - [Transmissão](#transmissão)
   - [Escala](#escala-extensão-geográfica-da-rede)
   - [Topologia](#topologia)
   - [Intranet e Extranet](#intranet-e-extranet)
3. [Dispositivos](#dispositivos)
4. [Redes Confiáveis](#redes-confiáveis)
   - [Metas de Segurança](#metas-de-segurança)
   - [Ameaças](#ameaças)
5. [Descendo na Hierarquia de Camadas](#descendo-na-hierarquia-de-camadas)
6. [Processo de uma Requisição Web](#processo-de-uma-requisição-web)
   - [Regra Principal](#regra-principal)
7. [Métricas de Rede](#métricas-de-rede)
8. [Camada de Aplicação](#camada-de-aplicação)
   - [DNS](#dns-domain-name-system)
   - [FTP](#ftp-file-transfer-protocol)
   - [Correio Eletrônico](#correio-eletrônico)
   - [World Wide Web (WWW)](#world-wide-web-www)
   - [HTTP](#http-hyper-text-transfer-protocol)
9. [Camada de Transporte](#camada-de-transporte)

---

## Modelos de Camadas

| Modelo OSI    | Arquitetura TCP/IP | Modelo Híbrido |
| ------------- | ------------------ | -------------- |
| Aplicação     | Aplicação          | Aplicação      |
| Apresentação  | Aplicação          | Aplicação      |
| Sessão        | Aplicação          | Aplicação      |
| Transporte    | Transporte         | Transporte     |
| Rede          | Internet           | Rede           |
| Enlace        | Enlace             | Enlace         |
| Física        | Enlace             | Física         |

> O modelo híbrido tem 5 camadas e é usado como referência de estudo.

### Explicação de cada camada

- **Física** -> Transmissão de bits
- **Enlace** -> Transmissão de dados (quadros) entre vizinhos, controle de erros e fluxo (protocolos ARP, Ethernet e WLAN)
- **Rede** -> Roteamento de pacotes (protocolos IPv4, IPv6)
- **Transporte** -> Comunicação (de segmento) fim a fim entre processos (protocolos TCP e UDP)
- **Sessão** -> Sincronização, verificação, recuperação e troca de dados
- **Apresentação** -> Representação de dados (criptografia, compactação)
- **Aplicação** -> Por exemplo, HTTP, e-mail, FTP, áudio, vídeo e arquivos

> Durante o processo de roteamento, a mensagem só passa nas três camadas inferiores.

- **Número IP** -> Identifica cada máquina em uma rede
- **Porta** -> Identifica cada serviço em uma máquina

---

## Classificação das Redes

### Transmissão

- **Broadcasting** -> "Todos" os computadores da rede
- **Unicasting** -> Um computador
- **Multicasting** -> Um subconjunto de computadores
- **Ponto-a-ponto** -> Conexões entre pares de computadores

### Escala (extensão geográfica da rede)

- **PAN** (Personal Area Network) -> Rede pessoal, metro quadrado
- **LAN** (Local Area Network) -> Rede local, sala a campus
- **MAN** (Metropolitan Area Network) -> Rede metropolitana, cidade
- **WAN** (Wide Area Network) -> Rede geograficamente distribuída, Internet, país a planeta

### Topologia

- **Barramento** -> Todos os dispositivos conectados por um único cabo
- **Anel** -> Conexão em formato circular; os dados percorrem um caminho fixo
- **Estrela** -> Dispositivos conectados a um ponto central (switch/roteador)
- **Estrela Estendida** -> Combinação de várias redes em estrela, formando uma hierarquia com pontos centrais interligados
- **Árvore** -> Estrutura hierárquica com dispositivos conectados em diferentes níveis; combina as características da estrela e do barramento
- **Malha** -> Cada dispositivo conecta-se a vários outros, garantindo redundância

### Intranet e Extranet

- **Intranet** -> Serviços de uma organização acessíveis aos seus membros internos
- **Extranet** -> Serviços de uma organização acessíveis a outras organizações que precisam dos mesmos

---

## Dispositivos

- **Switch** -> Camada 2 (enlace), conecta dispositivos de uma rede local
- **Hub** -> Camada 1 (física), conecta dispositivos de uma rede local
- **Roteador** -> Conecta redes diferentes e encaminha mensagens entre elas
- **Access Point (AP)** -> Camada 2 (enlace), conecta dispositivos sem fio (WiFi) a uma rede cabeada
- **Ponte (Bridge)** -> Camada 2 (enlace), conecta duas redes locais, permitindo a comunicação entre elas e reduzindo o tráfego desnecessário
- **Modem** -> Camada 1 (física), converte sinais digitais em analógicos e vice-versa para viabilizar a comunicação entre computadores e provedores de Internet
- **Firewall** -> Controla o tráfego de entrada e saída da rede considerando regras de segurança predefinidas, protegendo contra acessos não autorizados, malware e ataques
- **Gateway** -> Atua como uma "porta" entre diferentes redes que utilizam protocolos distintos, convertendo os dados entre eles
- **Repetidor** -> Camada 1 (física), amplifica o sinal de uma rede para expandir sua cobertura, útil em redes cabeadas ou sem fio
- **Proxy** -> Atua como intermediário entre dispositivos da rede e a Internet, filtrando, armazenando em cache e redirecionando solicitações de acesso

---

## Redes Confiáveis

Tolerância a falhas, Escalabilidade, Qualidade de serviço (QoS), Segurança

### Metas de Segurança

- **Confidencialidade** -> Somente os destinatários desejados podem ler os dados
- **Integridade** -> Garantia de que os dados não foram alterados durante a transmissão
- **Disponibilidade** -> Garantia de que os usuários autorizados terão acesso pontual e confiável aos dados

### Ameaças

- **Vírus** -> Software malicioso que se infiltra em máquinas para causar danos, roubar dados ou executar ações indesejadas
- **Spyware** -> Software que coleta dados sobre atividades do usuário sem consentimento, como teclas digitadas e navegação
- **Adware** -> Software que exibe anúncios intrusivos, como pop-ups e banners
- **Worm (verme)** -> Software malicioso que se espalha automaticamente para outros sistemas pela rede, explorando vulnerabilidades
- **Trojan (cavalo de Tróia)** -> Software aparentemente legítimo que contém código malicioso oculto
- **Ataque de dia zero (0-day)** -> Exploração de vulnerabilidade desconhecida antes que os desenvolvedores tenham tempo para corrigi-la
- **Ataque de ator de ameaça (Threat Actor)** -> Ataque realizado por pessoa ou grupo mal-intencionado contra dispositivos ou recursos de rede
- **Negação de serviço (DoS)** -> Sobrecarga de um sistema, rede ou serviço para torná-lo inacessível aos usuários
- **DDoS** -> DoS realizado de forma distribuída, por vários dispositivos ao mesmo tempo
- **Phishing** -> Golpe que se passa por entidade legítima para induzir o usuário a fornecer dados sensíveis
- **Ransomware** -> Software malicioso que bloqueia ou criptografa dados e exige resgate
- **Man-in-the-middle (MITM)** -> Atacante intercepta (e possivelmente altera) a comunicação entre duas partes sem que elas percebam

---

## Descendo na Hierarquia de Camadas

```
Mensagem  -> Aplicação
   ↓
Segmento  -> Transporte, porta de origem e destino
   ↓
Pacote    -> Rede, endereço IP de destino e origem
   ↓
Quadro    -> Enlace, endereço MAC
(Frame)
```

- **Endereço MAC** -> Tem 6 bytes (48 bits). Exemplo: `00:19:B9:FB:E2:58`
- **Endereço IP** -> IPv4 tem 32 bits; IPv6 tem 128 bits

---

## Processo de uma Requisição Web

**Servidor**
- IP = `200.13.14.3`
- Porta = `80` (HTTP)
- MAC = `88:88:88:88:88:88`

**DHCP** -> Atribui automaticamente a configuração de IP ao cliente (ex.: `192.168.10.2`)

**Cliente prepara a requisição**
- IP origem -> `192.168.10.2`
- IP destino -> `200.13.14.3`
- Porta destino -> `80`

**Passo a passo**

- **Camada de rede** -> Determina o próximo salto usando o IP de destino
- **ARP** -> Converte o IP do próximo salto em seu MAC (IPv4). No IPv6, utiliza-se NDP
- **Camada de enlace** -> Cria o quadro usando o MAC do nó atual e o MAC do próximo salto
- **Switch** -> Encaminha o quadro com base no MAC
- **Roteador** -> Remove o quadro recebido, analisa o IP destino, escolhe o próximo salto e cria um novo quadro
- **A cada salto**
  - IP origem/destino -> permanecem (sem NAT)
  - Portas -> permanecem
  - MAC origem/destino -> mudam
- **Ao chegar ao servidor** -> O pacote é entregue à aplicação Web na porta 80

### Regra Principal

| Elemento    | Função                       |
| ----------- | ---------------------------- |
| **IP**      | Destino final                |
| **MAC**     | Próximo salto                |
| **Porta**   | Serviço/aplicação            |
| **ARP**     | IP → MAC                     |
| **Roteador**| Escolhe o próximo salto      |

---

## Métricas de Rede

- **Latency** (Latência)
- **Bandwidth** (Largura de Banda)
- **Throughput** (Taxa de Dados)
- **Jitter** (Flutuação)
- **Reliability** (Confiabilidade)
- **Packet loss rate** (Taxa de perda de pacotes)

---

## Camada de Aplicação

### DNS (Domain Name System)

Camada de aplicação. Utiliza UDP/TCP na camada de transporte, porta 53.

**Regra para Nome e Endereço**
- **Nome** -> Tamanho variável, mnemônico, fácil para humanos memorizarem
- **Endereço** -> Tamanho fixo, fácil de processar, possui informações de roteamento

**Antigo**
- **NIC** -> Entidade central responsável por administrar os nomes e endereços através do arquivo `hosts.txt`

**Novo**
- **DNS** -> Sistema distribuído e hierárquico que traduz nomes de domínio em endereços IP

**Estrutura**
- **Espaço de nomes** -> Estrutura hierárquica de nomes
- **Registro de recursos** -> Associa nomes a informações (IP, e-mail, aliases...)
- **Servidores de nomes** -> Armazenam/fornecem informações DNS
- **Resolvedor** -> Realiza consultas DNS em nome do cliente

**Hierarquia**

`Raiz (.)` -> `TLD (.com, .br...)` -> `Domínio` -> `Host`

**Servidores**
- **Raiz** -> Indica servidores responsáveis pelo TLD
- **TLD** -> Indica servidor autoritativo do domínio
- **Autoritativo** -> Possui os registros oficiais do domínio
- **Local/Recursivo** -> Recebe consultas dos clientes e busca a resposta

**Mapeamento**
- **Recursivo** -> DNS local busca a resposta completa para o cliente
- **Não recursivo/Iterativo** -> Servidor indica o próximo servidor a ser consultado

---

### FTP (File Transfer Protocol)

Utilizado para transferência de arquivos entre cliente e servidor. Usa TCP para garantir a entrega dos dados.

**Conexões**
- **Controle** -> Porta 21
- **Dados** -> Porta 20 (modo ativo) ou porta dinâmica (modo passivo)

> FTP não é criptografado. Para transferência segura, utiliza-se FTPS ou SFTP.

---

### Correio Eletrônico

**Funções básicas:** Composição (criar e responder), Transferência, Notificação, Visualização, Organização.

**Arquitetura**
- **User Agent (UA)** -> Permite que o usuário leia, gerencie e envie mensagens
- **Message Transfer Agent (MTA)** -> Permite que um processo cliente envie mensagens para outro (servidor)
- **Message Access Agent (MAA)** -> Permite que um processo cliente baixe mensagens de outro (servidor)

**Protocolos**
- **SMTP** (Simple Mail Transfer Protocol) -> Envio de mensagens (MTA)
- **POP3** (Post Office Protocol) -> Recebimento, geralmente baixa as mensagens para o dispositivo
- **IMAP** (Internet Message Access Protocol) -> Recebimento e sincronização das mensagens com o servidor
- **MIME** (Multipurpose Internet Mail Extensions) -> Codificação binária de anexos

---

### World Wide Web (WWW)

- **Páginas Web** -> HTML
- **URL** (Uniform Resource Locator) -> Nome mundial de uma página: busca a página, onde ela está localizada e como acessá-la

```
protocolo://nome-dns-da-máquina/pagina.html
```

**Processamento de um link**

1. Usuário solicita uma URL para o navegador
2. Navegador solicita o endereço IP do servidor web ao servidor de DNS (via UDP)
3. Servidor de DNS retorna o endereço IP solicitado
4. Navegador faz uma conexão TCP com o servidor web
5. Navegador faz solicitação HTTP de uma página para o servidor web
6. Servidor web envia resposta HTTP com a página solicitada
7. Navegador requisita outras páginas ao servidor web
8. Navegador apresenta a página para o usuário\*
9. Navegador e servidor web terminam a conexão TCP

---

### HTTP (Hyper Text Transfer Protocol)

**Funcionamento básico**

1. Servidor HTTP aguarda conexões
2. Cliente HTTP abre uma conexão TCP e envia uma mensagem de requisição para o servidor
3. Servidor retorna uma mensagem de resposta, geralmente contendo o recurso requisitado
4. Cliente e servidor fecham a conexão TCP

**Métodos**
- **GET** -> Solicita ao servidor que envie um arquivo (página)
- **POST** -> Envia dados ao servidor (ex.: formulário), acrescentando algo a uma página web

**Mensagens de resposta**

| Código | Significado         |
| ------ | ------------------- |
| 1xx    | Informação          |
| 2xx    | Sucesso             |
| 3xx    | Redirecionamento    |
| 4xx    | Erro no Cliente     |
| 5xx    | Erro no Servidor    |

**Cabeçalhos de mensagens**
- **Requisição** -> `<método> <caminho do recurso requisitado> <versão do HTTP>`
- **Resposta** -> `<versão do HTTP> <código do status da resposta>`

**Otimização de acesso**
- **Web cache** -> Armazena conteúdo estático de páginas recentes
- **Replicação de Servidores (Mirroring)** -> Replicar o conteúdo de um servidor em múltiplas localidades separadas
- **CDN** (Redes de Entrega de Conteúdo)

**Versões do HTTP**

| Versão   | Ano  | Características                                                    |
| -------- | ---- | ------------------------------------------------------------------ |
| HTTP/0.9 | 1991 | Apenas GET, somente HTML                                           |
| HTTP/1.0 | 1996 | Cabeçalhos, POST e outras funcionalidades                          |
| HTTP/1.1 | 1997 | Conexões persistentes, Host, pipeline e cache                      |
| HTTP/2   | 2015 | Multiplexação, compressão de cabeçalhos e formato binário          |
| HTTP/3   | 2022 | QUIC sobre UDP, menor latência e melhor desempenho em redes instáveis |

---

## Camada de Transporte

Responsável pela comunicação fim a fim entre aplicações.

**Principais protocolos**
- **TCP** -> Orientado à conexão, confiável, ordenado, controle de fluxo/congestionamento
- **UDP** -> Sem conexão, mais simples e rápido, não garante entrega nem ordem

**Multiplexação/Demultiplexação**
- **Multiplexação** -> Reúne dados de várias aplicações e envia pela rede
- **Demultiplexação** -> Entrega os dados recebidos à aplicação correta usando portas
