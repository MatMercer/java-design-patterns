package br.edu.ifpr.patterns.observer;

import java.util.ArrayList;
import java.util.function.BinaryOperator;

import static java.lang.System.out;

public class MediaObserver extends Observer<ArrayList<Integer>> {
    @Override
    public void notifyChange() {
        out.println("Array mudou, " + subject.getState().stream().mapToInt(e -> e).average().getAsDouble() + " é a média.");
    }
}
