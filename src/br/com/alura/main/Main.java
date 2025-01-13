package br.com.alura.main;

import br.com.alura.modelos.Produto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double limiteCartao;
        String descricaoCompra;
        double valorCompra;
        int continuar = 1;

        List<Produto> listaProdutos = new ArrayList<>();

        System.out.println("Digite o limite do cartão:");
        limiteCartao = sc.nextDouble();

        Produto produto = new Produto(limiteCartao);

        while (continuar == 1) {

            System.out.println("Digite a descrição da compra:");
            descricaoCompra = sc.next();

            System.out.println("Digite o valor da compra:");
            valorCompra = sc.nextDouble();

            produto.setNomeProduto(descricaoCompra);
            produto.setValorCompra(valorCompra);

            if (produto.getLimiteCartao() >= produto.getValorCompra()) {
                listaProdutos
                        .add(new Produto(produto.getLimiteCartao(), produto.getValorCompra(),
                                produto.getNomeProduto()));
            }

            System.out.println("\n" + produto.validacao(produto.getLimiteCartao(), produto.getValorCompra()));

            System.out.println("SALDO: R$ " + produto.getLimiteCartao() + "\n");

            System.out.println("Digite 0 para sair ou 1 para continuar");
            continuar = sc.nextInt();

        }

        Collections.sort(listaProdutos);

        System.out.println("***********************\nCOMPRAS REALIZADAS:\n");
        listaProdutos.forEach(System.out::println);
        System.out.println("\n***********************");

        sc.close();
    }
}
