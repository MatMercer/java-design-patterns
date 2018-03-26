package br.edu.ifpr.patterns.adapter;

import br.edu.ifpr.modelo.RetanguloLegado;

public class Retangulo implements Figura {
    private RetanguloLegado retanguloLegado;

    public Retangulo(RetanguloLegado retanguloLegado) {
        this.retanguloLegado = retanguloLegado;
    }

    public void desenhar(int x1, int y1, int x2, int y2) {
        retanguloLegado.desenhar(
                Math.min(x1, x2),
                Math.min(y1, y2),
                Math.abs(x2 - x1),
                Math.abs(y2 - y1)
        );
    }
}
