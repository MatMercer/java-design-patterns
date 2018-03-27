package br.edu.ifpr.patterns.template;

import br.edu.ifpr.modelo.Produto;

public abstract class Venda {
    private Produto produto;

    public Venda(Produto produto) {
        this.produto = produto;
    }

    public double calcularPreco() {
        return produto.getPreco() + (produto.getPreco() * calcularJuros());
    }

    public abstract float calcularJuros();

    public abstract VendaType getVendaType();
}
