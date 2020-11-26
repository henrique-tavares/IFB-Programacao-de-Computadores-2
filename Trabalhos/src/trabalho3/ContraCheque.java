package trabalho3;

public class ContraCheque {
    private Double valorHoraAula;
    private Integer qtdHoraSemanal;
    private Integer qtdHoraNoturna;
    private Professor professor;

    private static final Double DSR = 0.167;
    private static final Double ACT = 0.021;

    public ContraCheque(Double valorHoraAula, Integer qtdHoraSemanal, Integer qtdHoraNoturna, Professor professor) {
        this.valorHoraAula = valorHoraAula;
        this.qtdHoraSemanal = qtdHoraSemanal;
        this.qtdHoraNoturna = qtdHoraNoturna;
        this.professor = professor;
    }

    public Double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(Double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    public Integer getQtdHoraSemanal() {
        return qtdHoraSemanal;
    }

    public void setQtdHoraSemanal(Integer qtdHoraSemanal) {
        this.qtdHoraSemanal = qtdHoraSemanal;
    }

    public Integer getQtdHoraNoturna() {
        return qtdHoraNoturna;
    }

    public void setQtdHoraNoturna(Integer qtdHoraNoturna) {
        this.qtdHoraNoturna = qtdHoraNoturna;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public static Double getDsr() {
        return DSR;
    }

    public static Double getAct() {
        return ACT;
    }

    public Double salarioBase() {
        return valorHoraAula * qtdHoraSemanal * 4.5;
    }

    public Double adicionalNoturno() {
        return valorHoraAula * qtdHoraNoturna * 0.2;
    }

    public Double remuneracaoBruta() {
        var salario = salarioBase();

        return salario + (salario * DSR) + (salario * ACT) + adicionalNoturno();
    }

    public Double calculaINSS() {
        var remuneracao = remuneracaoBruta();

        if (remuneracao <= 1045) {
            return remuneracao * 0.075;
        } else if (remuneracao <= 2089.6) {
            return remuneracao * 0.09;
        } else if (remuneracao <= 3134.4) {
            return remuneracao * 0.12;
        } else if (remuneracao <= 6101.06) {
            return remuneracao * 0.14;
        } else {
            return 854.15;
        }
    }

    public Double calculaIRPF() {
        var salarioIRPF = remuneracaoBruta() - calculaINSS() - (189.59 * professor.getQtdDependentes());

        if (salarioIRPF <= 1903.98) {
            return salarioIRPF;
        } else if (salarioIRPF <= 2826.65) {
            return (salarioIRPF * 0.075) - 142.8;
        } else if (salarioIRPF <= 3751.05) {
            return (salarioIRPF * 0.15) - 354.8;
        } else if (salarioIRPF <= 4664.68) {
            return (salarioIRPF * 0.225) - 636.13;
        } else {
            return (salarioIRPF * 0.275) - 869.36;
        }
    }

    public Double calculaSVC() {
        return remuneracaoBruta() * 0.002;
    }

    public Double calculaFGTS() {
        return remuneracaoBruta() * 0.08;
    }

    public Double salarioLiquido() {
        return remuneracaoBruta() - calculaINSS() - calculaIRPF() - calculaSVC();
    }

    @Override
    public String toString() {
        return String.join("\n", "Contra-Cheque:", "\t" + professor + "", "\tValor da hora aula: " + valorHoraAula,
                "\tHoras por semana: " + qtdHoraSemanal, "\tHoras noturnas: " + qtdHoraNoturna);
    }
}
