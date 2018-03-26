package br.edu.ifpr.patterns.factory;

import br.edu.ifpr.modelo.*;

public class PessoaFactory {
    public static Pessoa getPessoa(PessoaEnum tipo) {
        switch (tipo) {
            case ALUNO:
                return new Aluno(1, "João", 1999);
            case PROFESSOR:
                return new Professor(1, "João", "Doutor em Teoria da Informação");
            case SECRETARIA:
                return new Secretaria(1, "João", "Secretaria");
        }
        return null;
    }
}
