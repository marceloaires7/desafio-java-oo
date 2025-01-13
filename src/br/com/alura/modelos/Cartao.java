package br.com.alura.modelos;

public class Cartao {
    private double limiteCartao;
    private double valorCompra;

    public Cartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }

    public Cartao(double limiteCartao, double valorCompra) {
        this.limiteCartao = limiteCartao;
        this.valorCompra = valorCompra;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setLimiteCartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String validacao(double limiteCartao, double valorCompra) {
        if (this.limiteCartao >= this.valorCompra) {
            this.limiteCartao -= this.valorCompra;
            return "Compra realizada!";
        } else {
            return "Saldo insuficiente!";
        }
    }

}
