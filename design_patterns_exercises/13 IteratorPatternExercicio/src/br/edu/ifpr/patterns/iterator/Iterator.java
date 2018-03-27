package br.edu.ifpr.patterns.iterator;

public class Iterator<T> {
    private int i;
    private T[] arr;

    public Iterator (T[] array) {
        arr = array;
    }

    public T first() {
        i = 0;
        return next();
    }

    public T next() {
        return arr[i++];
    }

    public boolean isDone() {
        return arr.length == i;
    }
}
