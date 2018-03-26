package br.edu.ifpr.patterns.command.factory;

public interface Factory<T, E extends Enum> {
    public T create(E en);
}
