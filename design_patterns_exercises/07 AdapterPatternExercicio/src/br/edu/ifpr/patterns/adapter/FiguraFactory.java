package br.edu.ifpr.patterns.adapter;

import br.edu.ifpr.modelo.LinhaLegado;
import br.edu.ifpr.modelo.RetanguloLegado;

public class FiguraFactory {
    public static Figura createFigura(FiguraType type) {
        switch (type) {
            case LINHA:
                return new Linha(new LinhaLegado());
            case RETANGULO:
                return new Retangulo(new RetanguloLegado());
        }
        return null;
    }
}
