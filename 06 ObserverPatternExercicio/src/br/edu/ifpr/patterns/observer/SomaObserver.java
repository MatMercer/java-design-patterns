package br.edu.ifpr.patterns.observer;

import java.util.ArrayList;

import static java.lang.System.out;

public class SomaObserver extends Observer<ArrayList<Integer>> {
    @Override
    public void notifyChange() {
        out.println("Array mudou, " + subject.getState().stream().mapToInt(e -> e).sum() + " é a soma.");
    }
}
