/*
 * Exercício: Adapter.
 * Converter esta aplicação para que faça uso do padrão de projetos Adapter
 * realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias.
 */

package br.edu.ifpr.aplicacao;

import br.edu.ifpr.modelo.LinhaLegado;
import br.edu.ifpr.modelo.RetanguloLegado;
import br.edu.ifpr.patterns.adapter.Linha;
import br.edu.ifpr.patterns.adapter.Retangulo;

import static br.edu.ifpr.patterns.adapter.FiguraFactory.createFigura;
import static br.edu.ifpr.patterns.adapter.FiguraType.LINHA;
import static br.edu.ifpr.patterns.adapter.FiguraType.RETANGULO;

/**
 * @author
 */
public class AdapterPrincipal {
    public AdapterPrincipal() {
        // Seria melhor usar factory aqui
        Object[] figuras = {createFigura(RETANGULO), createFigura(LINHA)};

        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;

        for (Object figura : figuras)
            if (figura.getClass().getSimpleName().equals("Linha"))
                ((Linha) figura).desenhar(x1, y1, x2, y2);
            else if (figura.getClass().getSimpleName().equals("Retangulo"))
                ((Retangulo) figura).desenhar(x1, y1, x2, y2);
    } // public AdapterPrincipal()

    /**
     * @param args os argumentos da linha de comando
     */
    public static void main(String[] args) {
        new AdapterPrincipal();
    }
} // public class AdapterPrincipal
