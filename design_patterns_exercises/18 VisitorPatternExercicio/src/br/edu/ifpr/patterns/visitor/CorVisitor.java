package br.edu.ifpr.patterns.visitor;

import br.edu.ifpr.modelo.Cor;

public interface CorVisitor {
    void visitar(Cor cor);

    void mostrar();
}
