package br.edu.ifpr.patterns.template;

import br.edu.ifpr.modelo.Produto;

public class VendaPR extends Venda {
    public VendaPR(Produto produto) {
        super(produto);
    }

    @Override
    public float calcularJuros() {
        return 0.4f;
    }

    @Override
    public VendaType getVendaType() {
        return VendaType.PR;
    }
}
