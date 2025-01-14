package br.com.alura.modelos;

import java.util.ArrayList;
import java.util.List;

public class Cartao {
    private double limiteCartao;
    private double saldo;
    private List<Produto> compras;

    public Cartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
        this.saldo = limiteCartao;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Produto compra) {
        if (this.saldo > compra.getValorProduto()) {
            this.saldo -= compra.getValorProduto();
            this.compras.add(compra);
            return true;
        }
        return false;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Produto> getCompras() {
        return compras;
    }

}
