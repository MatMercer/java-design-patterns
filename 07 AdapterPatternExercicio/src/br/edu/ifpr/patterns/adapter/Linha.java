package br.edu.ifpr.patterns.adapter;

import br.edu.ifpr.modelo.LinhaLegado;

public class Linha implements Figura {
    private LinhaLegado linhaLegado;

    public Linha(LinhaLegado linhaLegado) {
        this.linhaLegado = linhaLegado;
    }

    public void desenhar(int x1, int y1, int x2, int y2) {
        linhaLegado.desenhar(x1, y1, x2, y2);
    }
}
