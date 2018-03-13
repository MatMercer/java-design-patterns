package br.edu.ifpr.patterns.decorator;

public class ComparadorC extends Decorator {
    public ComparadorC(Comparador comparador) {
        super(comparador);
    }

    @Override
    public void comparar() {
        super.comparar();

        System.out.println("Comportamento especifico C");
    }
}
