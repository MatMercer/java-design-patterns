/*
 * Exercício: Observer.
 * Converter esta aplicação para que faça uso do padrão de projetos citado
 * realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias, inclusive utilizando outros padrões de projeto.
 */
package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.observer.ListNumeros;
import br.edu.ifpr.patterns.observer.MaxObserver;
import br.edu.ifpr.patterns.observer.MediaObserver;
import br.edu.ifpr.patterns.observer.SomaObserver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @author
 */
public class ObserverPrincipal implements Runnable {
    public ObserverPrincipal() {
        (new Thread(this)).start();
    } // public ObserverPrincipal()

    public ArrayList<Integer> randomArrayList(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(255));
        }
        return list;
    }

    @Override
    public void run() {
        ListNumeros listNumeros = new ListNumeros(new ArrayList<>());

        SomaObserver so = new SomaObserver();
        MediaObserver mo = new MediaObserver();
        MaxObserver maxo = new MaxObserver();

        listNumeros.attach(so);
        listNumeros.attach(mo);
        listNumeros.attach(maxo);

        Random rand = new Random();

        int loops = 1;

        while (true) {
            listNumeros.setState(randomArrayList((Math.abs(rand.nextInt() % 10)) + 1));

            System.out.println("\nList is: ");
            System.out.println(listNumeros.getState());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            if (loops > 3) {
                listNumeros.detach(so);
            }
            if (loops > 4) {
                listNumeros.detach(mo);
            }
            if (loops > 10) {
                break;
            }

             loops += 1;
        } // while (true)
    }

    /**
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) {
        new ObserverPrincipal();
    }
} // public class ObserverPrincipal implements Runnable
