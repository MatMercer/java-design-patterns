package br.edu.ifpr.patterns.composite;

public abstract class FileNode {
    private String name;

    public FileNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
