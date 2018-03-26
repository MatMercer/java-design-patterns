package br.edu.ifpr.patterns.facade;

public class Gerente {
    public boolean validarVenda(Venda venda) {
        if (venda.getValor() > 1000) {
            System.out.println("Venda não pode ser validada!");
            return false;
        }
        else {
            System.out.println("Venda validada!");
            return true;
        }
    }
}
