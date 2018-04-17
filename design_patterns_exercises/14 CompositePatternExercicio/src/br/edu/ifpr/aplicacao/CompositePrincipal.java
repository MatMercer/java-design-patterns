/*
 * Exercício: Composite.
 * Converter esta aplicação para que faça uso do padrão de projetos citado
 * realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias, inclusive utilizando outros padrões de projeto.
 */
package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.composite.Directory;
import br.edu.ifpr.patterns.composite.File;
import br.edu.ifpr.patterns.composite.FileNode;

import static java.lang.System.out;

/**
 * @author
 */
public class CompositePrincipal {
    public static void listDirs(Directory dir) {
        listDirsImpl(dir, 1);
    }

    private static void printLevel(int level) {
        for (int i = 0; i < level; i += 1) {
            out.print('-');
        }
    }

    private static void listDirsImpl(Directory dir, int level) {
        if (level == 0) {
            out.println(" " + dir.getName());
        }

        for (FileNode node : dir.getChildNodes()) {
            if (node.getClass() == File.class) {
                File file = (File) node;

                printLevel(level);

                out.println(" " + file.getName());
            } else if (node.getClass() == Directory.class) {
                Directory directory = (Directory) node;

                printLevel(level);

                out.println(" " + directory.getName());

                listDirsImpl(directory, level + 1);
            }
        }
    }

    /**
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) {
        Directory root = new Directory(
                "home",
                new File(".hidden"),
                new Directory(
                        "mat",
                        new File(".zshrc"),
                        new File("Stuff"
                        )
                )
        );

        listDirs(root);
    } // public static void main(String[])
} // public class CompositePrincipal
