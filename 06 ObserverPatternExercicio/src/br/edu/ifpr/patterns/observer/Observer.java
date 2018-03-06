package br.edu.ifpr.patterns.observer;

import java.util.HashSet;

public abstract class Observer<T> {
    protected Subject<T> subject;

    public Observer() {
    }

    public Observer(Subject<T> subject) {
        this.subject = subject;
    }

    public final void setSubject(Subject<T> subject) {
        this.subject = subject;
    }

    public final void removeSubject() {
        this.subject = null;
    }

    public void notifyChangeNullSafe() {
        if (subject != null) {
            notifyChange();
        }
    }

    protected abstract void notifyChange();
}
