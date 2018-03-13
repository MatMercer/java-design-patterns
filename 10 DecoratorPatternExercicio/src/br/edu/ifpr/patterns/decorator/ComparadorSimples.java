package br.edu.ifpr.patterns.decorator;

public class ComparadorSimples implements Comparador {
    @Override
    public void comparar() {
        System.out.println("Comportamento especifico A");
    }
}
