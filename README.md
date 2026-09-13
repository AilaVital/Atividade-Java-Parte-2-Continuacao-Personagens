#Continuacao-Personagens
# 🛡️ Laboratório de Práticas: Missão Java - Parte 2 (Torneio de Personagens)

Este repositório contém a resolução da Parte 2 do laboratório prático de Java, focado na ampliação do conceito de Programação Orientada a Objetos (POO).

## 🎯 Objetivos da Atividade
- **Encapsulamento**: Modificadores de acesso `private`, métodos *getters* e *setters* com validação.
- **Construtor**: Inicialização completa dos atributos do objeto.
- **Comportamentos**: Criação de métodos com e sem parâmetros para alterar o estado interno dos objetos.
- **Sobrescrita do `toString()`**: Formatando a exibição dos dados na saída.

---

## 📁 Estrutura do Projeto

| Arquivo | Descrição |
| :--- | :--- |
| `Personagem.java` | Classe modelo com 5 atributos privados (`nome`, `tipo`, `nivel`, `vida`, `vitorias`), construtor, getters/setters validados, métodos de ação e `toString()`. |
| `Main.java` | Classe principal com a criação dos objetos e execução dos testes do torneio. |

---

## 🐛 Desafio Divertido - Caça aos Erros

Abaixo estão os 5 erros encontrados no código de teste fornecido pela atividade e as devidas correções aplicadas:

| # | Erro Identificado | Correção Aplicada |
| :-: | :--- | :--- |
| **1** | Ausência da palavra-chave `new` na criação do objeto. | `Personagem p1 = new Personagem("Theo", "Mago", 1, 100, 0);` |
| **2** | Tentativa de acesso direto ao atributo privado `nome`. | `p1.setNome("Teodoro");` |
| **3** | Violação da regra de limite de vida (máximo 100) via `setVida(150)`. | `p1.setVida(100);` |
| **4** | Chamada do método `receberDano()` sem passar o argumento obrigatório. | `p1.receberDano(20);` |
| **5** | Tentativa de imprimir a variável `p2`, que não foi declarada nem instanciada. | `System.out.println(p1);` |

---

## 📝 Perguntas e Respostas

### 1. Qual foi o novo atributo acrescentado à classe?
Foi adicionado o atributo **`vitorias`** (do tipo inteiro `int`), utilizado para armazenar e contabilizar a quantidade de vitórias obtidas por cada personagem no torneio.

### 2. Para que o construtor foi atualizado?
O construtor foi atualizado para receber **cinco parâmetros**, permitindo que qualquer novo objeto seja instanciado com todos os seus atributos (`nome`, `tipo`, `nivel`, `vida` e `vitorias`) devidamente inicializados no momento da sua criação.

### 3. Qual é a diferença entre `receberDano(int dano)` e `registrarVitoria()`?
- **`receberDano(int dano)`**: É um método **com parâmetro** (`int dano`). Ele recebe um valor externo e subtrai da vida atual do personagem, garantindo que o valor final não seja inferior a zero.
- **`registrarVitoria()`**: É um método **sem parâmetros**. Ele realiza uma ação interna fixa: incrementa o número de vitórias do personagem em exatamente 1 unidade (`vitorias++`).

### 4. Por que foram utilizadas condições dentro dos setters e métodos?
As condições foram aplicadas para garantir o **encapsulamento e a integridade dos dados**, impedindo que o objeto assuma estados inválidos. Elas asseguram que a vida permaneça no intervalo de 0 a 100, o nível seja no mínimo 1 e o número de vitórias não seja negativo.

### 5. O que mudou no resultado do `toString()`?
Foi adicionada a exibição do novo atributo **`vitorias`** ao final da String formatada (`| Vitórias: X`), permitindo visualizar a quantidade total de triunfos diretamente ao imprimir o objeto no `System.out.println()`.
