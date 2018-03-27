package br.edu.ifpr.patterns.template;

import br.edu.ifpr.modelo.Produto;

public class VendaSP extends Venda {
    public VendaSP(Produto produto) {
        super(produto);
    }

    @Override
    public float calcularJuros() {
        return 0.3f;
    }

    @Override
    public VendaType getVendaType() {
        return VendaType.SP;
    }
}
