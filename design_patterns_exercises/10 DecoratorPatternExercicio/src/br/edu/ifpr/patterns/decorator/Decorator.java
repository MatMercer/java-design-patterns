package br.edu.ifpr.patterns.decorator;

public abstract class Decorator implements Comparador {
    protected Comparador comparador;

    public Decorator(Comparador comparador) {
        this.comparador = comparador;
    }

    public void comparar() {
        comparador.comparar();
    }
}
