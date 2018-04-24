package br.edu.ifpr.modelo;

import br.edu.ifpr.patterns.visitor.CorVisitor;

/**
 * @author
 */
public abstract class Cor {
    public abstract void visitar(CorVisitor visitor);
} // public abstract class Cor
