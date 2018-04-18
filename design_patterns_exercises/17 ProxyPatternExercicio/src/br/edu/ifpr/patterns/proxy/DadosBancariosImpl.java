package br.edu.ifpr.patterns.proxy;

public class DadosBancariosImpl implements DadosBancarios {
    @Override
    public float acessarSaldo(int id) {
        return id * 23.33f;
    }
}
