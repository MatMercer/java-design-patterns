package br.edu.ifpr.patterns.template;

import br.edu.ifpr.modelo.Produto;

public class VendaFactory {
    public static Venda getVenda(VendaType vendaType, Produto produto) {
        switch (vendaType) {
            case AM:
                return new VendaAM(produto);
            case PR:
                return new VendaPR(produto);
            case SP:
                return new VendaSP(produto);
        }

        return null;
    }
}
