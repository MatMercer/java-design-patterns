package br.edu.ifpr.patterns.visitor;

import br.edu.ifpr.modelo.Azul;
import br.edu.ifpr.modelo.Cor;
import br.edu.ifpr.modelo.Vermelho;

public class ChamarVisitor implements CorVisitor {
    @Override
    public void visitar(Cor cor) {
        if (cor.getClass() == Vermelho.class) {
            System.out.println("Olhos vermelhos");
        }
        if (cor.getClass() == Azul.class) {
            System.out.println("Ceu azul");
        }
    }

    @Override
    public void mostrar() {

    }
}
