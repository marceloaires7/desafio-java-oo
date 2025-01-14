package br.com.alura.modelos;

public class Produto implements Comparable<Produto> {
    private String nomeProduto;
    private double valorProduto;

    public Produto(String nomeProduto, double valorProduto) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    @Override
    public String toString() {
        return "Produto: " + nomeProduto + " - R$ " + valorProduto;
    }

    @Override
    public int compareTo(Produto outroProduto) {
        return Double.valueOf(this.valorProduto).compareTo(Double.valueOf(outroProduto.valorProduto));
    }
}
