package br.edu.ifpr.patterns.decorator;

public class ComparadorB extends Decorator {
    public ComparadorB(Comparador comparador) {
        super(comparador);
    }

    @Override
    public void comparar() {
        super.comparar();

        System.out.println("Comportamento especifico B");
    }
}
