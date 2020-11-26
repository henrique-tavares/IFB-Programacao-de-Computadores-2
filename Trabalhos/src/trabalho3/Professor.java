package trabalho3;

public class Professor {
    private Integer ctps;
    private String nome;
    private String formacao;
    private Integer qtdDependentes;

    public Professor(Integer ctps, String nome, String formacao, Integer qtdDependentes) {
        this.ctps = ctps;
        this.nome = nome;
        this.formacao = formacao;
        this.qtdDependentes = qtdDependentes;
    }

    public Integer getCtps() {
        return ctps;
    }

    public void setCtps(Integer ctps) {
        this.ctps = ctps;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public Integer getQtdDependentes() {
        return qtdDependentes;
    }

    public void setQtdDependentes(Integer qtdDependentes) {
        this.qtdDependentes = qtdDependentes;
    }

    @Override
    public String toString() {
        return String.join("\n", "Professor:", "\tCTPS: " + ctps, "\tNome: " + nome, "\tFormação: " + formacao,
                "\tQuantidade de dependentes: " + qtdDependentes);
    }

}
