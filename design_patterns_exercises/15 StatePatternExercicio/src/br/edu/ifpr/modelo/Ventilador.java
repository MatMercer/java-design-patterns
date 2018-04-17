package br.edu.ifpr.modelo;

import br.edu.ifpr.patterns.state.Velocidade;
import br.edu.ifpr.patterns.state.Velocidade1;

/**
 * @author
 */
public class Ventilador {
    private Velocidade velocidade;

    public Ventilador() {
        velocidade = new Velocidade1();

        velocidade.handle();
    }

    public void trocar() {
        proximaVelocidade();
        velocidade.handle();
    }

    private void proximaVelocidade() {
        try {
            String name = velocidade.getClass().toString();
            int vel = name.charAt(name.length() - 1) - '0';

            vel = vel == 3 ? 1 : vel + 1;

            Class<?> clazz = Class.forName("br.edu.ifpr.patterns.state.Velocidade" + vel);
            velocidade = (Velocidade) clazz.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
} // public class Ventilador
