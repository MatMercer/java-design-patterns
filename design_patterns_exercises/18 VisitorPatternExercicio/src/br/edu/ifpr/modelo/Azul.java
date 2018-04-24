package br.edu.ifpr.modelo;

import br.edu.ifpr.patterns.visitor.CorVisitor;

/**
 * @author
 */
public class Azul extends Cor {
    @Override
    public void visitar(CorVisitor visitor) {
        visitor.visitar(this);
    }
} // public class Azul extends Cor
