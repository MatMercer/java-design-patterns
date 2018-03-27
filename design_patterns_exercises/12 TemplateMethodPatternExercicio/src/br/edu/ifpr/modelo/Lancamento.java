package br.edu.ifpr.modelo;

import br.edu.ifpr.patterns.template.Venda;

/**
 * @author
 */
public class Lancamento {
    private Venda venda;

    public Lancamento(Venda venda) {
        this.venda = venda;
    }

    public void lancar() {
        System.out.println("Venda de $" + venda.calcularPreco() + " do " + venda.getVendaType() + ", lançada.");
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
} // public class Lancamento
