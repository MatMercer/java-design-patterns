package br.edu.ifpr.patterns.visitor;

import br.edu.ifpr.modelo.Azul;
import br.edu.ifpr.modelo.Cor;
import br.edu.ifpr.modelo.Vermelho;

public class TotalizadorVisitor implements CorVisitor {
    private int vermelho, azul = 0;

    @Override
    public void visitar(Cor cor) {
        if (cor.getClass() == Vermelho.class) {
            vermelho += 1;
        }
        if (cor.getClass() == Azul.class) {
            azul += 1;
        }
    }

    @Override
    public void mostrar() {
        System.out.println("Vermelhos " + vermelho);
        System.out.println("Azuis " + azul);
    }

    public int getVermelho() {
        return vermelho;
    }

    public int getAzul() {
        return azul;
    }


}
