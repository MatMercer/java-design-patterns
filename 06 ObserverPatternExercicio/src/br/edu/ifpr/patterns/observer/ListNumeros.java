package br.edu.ifpr.patterns.observer;

import java.util.ArrayList;

public class ListNumeros extends Subject<ArrayList<Integer>> {

    public ListNumeros(ArrayList<Integer> state) {
        super(state);
    }
}
