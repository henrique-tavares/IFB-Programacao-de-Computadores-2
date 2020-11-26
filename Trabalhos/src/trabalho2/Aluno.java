package trabalho2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aluno {
    private Integer matricula;
    private String nome;
    private LocalDate dataNascimento;

    public Aluno(Integer matricula, String nome, LocalDate dataNascimento) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public Aluno(Integer matricula, String nome, int dia, int mes, int ano) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataNascimento = LocalDate.of(ano, mes, dia);
    }

    @Override
    public String toString() {
        return String.join("\n", "Aluno:", "\tNome: " + nome, "\tMatrícula: " + matricula,
                "\tData de Nascimento: " + dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}