package br.edu.ifpr.patterns.observer;

import java.util.ArrayList;

import static java.lang.System.out;

public class MaxObserver extends Observer<ArrayList<Integer>> {
    @Override
    public void notifyChange() {
        out.println("Array mudou, " + subject.getState().stream().mapToInt(e -> e).max().getAsInt() + " é o maior valor.");
    }
}
