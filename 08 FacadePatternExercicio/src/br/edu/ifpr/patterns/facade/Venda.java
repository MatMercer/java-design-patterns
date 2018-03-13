package br.edu.ifpr.patterns.facade;

public class Venda {
    private float valor;

    public Venda(float valor) {
        this.valor = valor;
    }

    public void fecharVenda() {
        System.out.println("Venda fechada");
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
