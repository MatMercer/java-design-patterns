package br.edu.ifpr.patterns.composite;

import java.util.ArrayList;
import java.util.Arrays;

public class Directory extends FileNode {
    private ArrayList<FileNode> childNodes;

    public Directory(String name, FileNode... childs) {
        this(name);

        this.childNodes = new ArrayList<>(Arrays.asList(childs));
    }

    public Directory(String name) {
        super(name);
        this.childNodes = new ArrayList<>();
    }

    public ArrayList<FileNode> getChildNodes() {
        return childNodes;
    }
}
