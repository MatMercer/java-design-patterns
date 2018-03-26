package br.edu.ifpr.modelo;

/**
 * @author Romualdo Rubens de Freitas
 */
public class PessoaProt implements Cloneable {
    private int id;
    private String nome;

    public PessoaProt(int id, String nome) {

        setId(id);
        setNome(nome);
    } // public Pessoa(int, String)

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        super.clone();

        return new PessoaProt(this.id, this.nome);
    }

    // getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pessoa [" + id + ", " + nome + "]";
    } // public String toString()
} // public class Pessoa
