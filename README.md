# Desafio Java OO

Este projeto é um desafio de programação orientada a objetos em Java. O objetivo é gerenciar compras realizadas com um cartão de crédito, verificando o limite disponível e registrando as compras efetuadas.

## Estrutura do Projeto

O projeto está organizado em três classes principais:

1. **Cartao**: Representa o cartão de crédito, contendo o limite disponível e o valor da compra.
2. **Produto**: Extende a classe `Cartao` e adiciona a descrição do produto comprado.
3. **Main**: Classe principal que interage com o usuário, permitindo a inserção de compras e exibindo o saldo do cartão e as compras realizadas.

## Classes

### Cartao

```java
public class Cartao {
    private double limiteCartao;
    private double valorCompra;

    // Construtores, getters e setters

    public String validacao(double limiteCartao, double valorCompra) {
        if (this.limiteCartao >= this.valorCompra) {
            this.limiteCartao -= this.valorCompra;
            return "Compra realizada!";
        } else {
            return "Saldo insuficiente!";
        }
    }
}
```

### Produto

```java
public class Produto extends Cartao implements Comparable<Produto> {
    private String nomeProduto;

    // Construtores, getters e setters

    @Override
    public String toString() {
        return getNomeProduto() + " - R$ " + getValorCompra();
    }

    @Override
    public int compareTo(Produto outroProduto) {
        return Double.compare(this.getValorCompra(), outroProduto.getValorCompra());
    }
}
```

### Main

```java
public class Main {
    public static void main(String[] args) throws Exception {
        // Código principal para interação com o usuário
    }
}
```

## Como Executar

1. Clone o repositório para sua máquina local.
2. Compile as classes Java.
3. Execute a classe `Main` para iniciar o programa.

```bash
javac -d bin src/br/com/alura/modelos/*.java src/br/com/alura/main/Main.java
java -cp bin br.com.alura.main.Main
```

## Funcionalidades

- Inserção do limite do cartão.
- Registro de compras com descrição e valor.
- Validação do saldo disponível no cartão.
- Exibição das compras realizadas e do saldo restante.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

## Licença

Este projeto está licenciado sob a licença MIT.