# Enum em Java: Status de Pedido

Exemplo didático em Java para praticar o uso de `enum` na representação do ciclo de vida de um pedido.

## Funcionamento

A classe `Pedido` possui um status inicial e métodos para avançar ou cancelar o pedido.

### Estados disponíveis

| Estado                 | Descrição                       |
| ---------------------- | ------------------------------- |
| `AGUARDANDO_PAGAMENTO` | Aguardando pagamento do cliente |
| `PROCESSANDO`          | Pedido em processamento         |
| `ENVIADO`              | Pedido enviado para entrega     |
| `ENTREGUE`             | Pedido entregue                 |
| `CANCELADO`            | Pedido cancelado                |

### Fluxo de avanço

```text
AGUARDANDO_PAGAMENTO
		  ↓
PROCESSANDO
		  ↓
ENVIADO
		  ↓
ENTREGUE
```

Pedidos entregues ou cancelados não podem avançar para outro estado.

O cancelamento é permitido enquanto o pedido não estiver entregue. Depois da entrega, a operação informa que o pedido já foi finalizado.

## Estrutura do projeto

```text
enumJAVASenai/
├── README.md
├── enumExercicio.iml
└── src/
	├── Main.java          # Demonstração das transições
	├── Pedido.java        # Entidade e regras de status
	└── StatusPedido.java  # Enum com estados e descrições
```

## Conceitos praticados

- declaração e uso de `enum`;
- construtor de enum com descrição personalizada;
- `switch` sobre valores enumerados;
- encapsulamento com getters e setters;
- transição de estados em uma classe de domínio.

## Exemplo de uso

```java
Pedido pedido = new Pedido(1, "João", StatusPedido.AGUARDANDO_PAGAMENTO);
pedido.avancarStatus();
pedido.avancarStatus();
pedido.calcelarStatus();
```

No `Main`, o pedido começa aguardando pagamento, avança para processamento e envio e, em seguida, é cancelado antes de ser entregue.

## Tecnologias

- Java;
- IntelliJ IDEA;
- JDK Temurin 25;
- API padrão do Java.

Não há banco de dados ou dependências externas.

## Requisitos

- JDK 25 ou versão compatível com os recursos utilizados;
- IntelliJ IDEA ou outro ambiente Java;
- terminal, caso prefira compilar manualmente.

## Como executar pela IDE

1. Abra a pasta `enumJAVASenai` no IntelliJ IDEA.
2. Configure o projeto com o JDK Temurin 25.
3. Abra `src/Main.java`.
4. Execute o método `main` pelo botão **Run**.

## Como compilar pelo terminal

Na raiz do projeto:

```bash
javac -d out src/Pedido.java src/StatusPedido.java src/Main.java
java -cp out Main
```

## Observações

- O método `getDescricao()` retorna o texto associado a cada estado.
- O método `calcelarStatus()` mantém a grafia existente no código; o nome provavelmente deveria ser `cancelarStatus` em uma revisão futura.
- O código usa `IO.println`, recurso disponível nas versões recentes do Java.
- A transição de status é controlada dentro de `Pedido`, mantendo a regra junto ao objeto de domínio.

## Objetivo

Praticar enums, máquinas de estado simples e organização de regras de negócio em classes Java.
