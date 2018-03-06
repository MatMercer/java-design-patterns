package br.edu.ifpr.patterns.observer;

import java.util.HashMap;
import java.util.HashSet;

public abstract class Subject<T> {
    // List of observers
    private HashSet<Observer> observers;

    // The state that must be watched
    private T state;

    public Subject(T state) {
        this(state, new HashSet<>());
    }

    public Subject(T state, HashSet<Observer> observers) {
        this.state = state;
        this.observers = observers;
    }

    public final boolean attach(Observer o) {
        o.setSubject(this);
        return observers.add(o);
    }

    public final boolean detach(Observer o) {
        o.removeSubject();
        return observers.remove(o);
    }

    public final void notifyChange() {
        for (Observer<T> o : observers) {
            o.notifyChange();
        }
    }

    public T getState() {
        return state;
    }

    public void setState(T state) {
        this.state = state;
        notifyChange();
    }
}
