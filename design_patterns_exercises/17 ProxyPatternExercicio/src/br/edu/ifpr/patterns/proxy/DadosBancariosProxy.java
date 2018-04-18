package br.edu.ifpr.patterns.proxy;

public class DadosBancariosProxy implements DadosBancarios {
    @Override
    public float acessarSaldo(int id) throws Exception {
        if (id > 2) {
            return new DadosBancariosImpl().acessarSaldo(id);
        }

        throw new Exception("Usuário não pode se autenticar.");
    }
}
