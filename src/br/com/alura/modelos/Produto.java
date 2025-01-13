package br.com.alura.modelos;

public class Produto extends Cartao implements Comparable<Produto> {
    private String nomeProduto;

    public Produto(double limiteCartao) {
        super(limiteCartao);
    }

    public Produto(double limiteCartao, double valorCompra, String nomeProduto) {
        super(limiteCartao, valorCompra);
        this.nomeProduto = nomeProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    @Override
    public String toString() {
        return getNomeProduto() + " - R$ " + getValorCompra();
    }

    @Override
    public int compareTo(Produto outroProduto) {
        return Double.compare(this.getValorCompra(), outroProduto.getValorCompra());
    }

}
