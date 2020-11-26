package trabalho1;

import trabalho1.utils.DataPadraoBrasil;

public class Funcionario {
    private Integer matricula;
    private String nome;
    private DataPadraoBrasil dataDeNascimento;
    private String cargo;

    public Funcionario(Integer matricula, String nome, DataPadraoBrasil dataDeNascimento, String cargo) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionário: " + nome + "\nMatrícula: " + matricula + "\nData de Nascimento: " + dataDeNascimento
                + "\nCargo: " + cargo;
    }

}