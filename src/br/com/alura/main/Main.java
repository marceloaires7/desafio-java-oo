package br.com.alura.main;

import br.com.alura.modelos.Cartao;
import br.com.alura.modelos.Produto;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o limite do cartão:");
        double limiteCartao = sc.nextDouble();

        Cartao cartao = new Cartao(limiteCartao);

        int continuar = 1;
        while (continuar == 1) {

            System.out.println("Digite a descrição da compra:");
            String descricaoCompra = sc.next();

            System.out.println("Digite o valor da compra:");
            double valorCompra = sc.nextDouble();

            Produto compra = new Produto(descricaoCompra, valorCompra);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("SALDO: R$ " + cartao.getSaldo());
                System.out.println("Compra realizada!");
            } else {
                System.out.println("SALDO: R$ " + cartao.getSaldo());
                System.out.println("Saldo insuficiente!");
            }

            System.out.println("Digite 0 para sair ou 1 para continuar");
            continuar = sc.nextInt();

        }

        Collections.sort(cartao.getCompras());

        System.out.println("***********************\nCOMPRAS REALIZADAS:\n");
        cartao.getCompras().forEach(System.out::println);
        System.out.println("\n***********************");

        sc.close();
    }
}
