package br.edu.ifpr.patterns.builder;

public class ComandoSql {
    private OperacaoSql operacao;
    private String comando;

    private ComandoSql() {}

    public static ComandoSqlBuilder builder() {
        return new ComandoSqlBuilder();
    }

    public OperacaoSql getOperacao() {
        return operacao;
    }

    public void setOperacao(OperacaoSql operacao) {
        this.operacao = operacao;
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }

    public static class ComandoSqlBuilder {
        private ComandoSql comandoSql;

        public ComandoSqlBuilder() {
            this.comandoSql = new ComandoSql();
        }

        public ComandoSqlBuilder operacao(OperacaoSql operacao) {
            comandoSql.setOperacao(operacao);

            return this;
        }

        public ComandoSqlBuilder comando(String comando) {
            comandoSql.setComando(comando);

            return this;
        }

        public ComandoSql build() {
            return comandoSql;
        }
    }

    @Override
    public String toString() {
        return "ComandoSql{" +
                "operacao=" + operacao +
                ", comando='" + comando + '\'' +
                '}';
    }
}
