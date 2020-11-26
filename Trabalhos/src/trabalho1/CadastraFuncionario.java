package trabalho1;

import java.util.Scanner;

import trabalho1.utils.DataPadraoBrasil;

public class CadastraFuncionario {
    public static void main(String[] args) {
        try (var input = new Scanner(System.in)) {
            System.out.print("\nInsira o nome: ");
            var nome = input.nextLine();

            System.out.print("\nInsira a matrícula: ");
            var matricula = Integer.parseInt(input.nextLine());

            System.out.println("\nData de Nascimento:");

            System.out.print("\tInsira o dia: ");
            var dia = input.nextLine();

            System.out.print("\tInsira o mes: ");
            var mes = input.nextLine();

            System.out.print("\tInsira o ano: ");
            var ano = input.nextLine();

            System.out.print("\nInsira o cargo: ");
            var cargo = input.nextLine();

            var funcionario = new Funcionario(matricula, nome, new DataPadraoBrasil(dia, mes, ano), cargo);
            System.out.println("\n----------------------------------------------");
            System.out.println("\n" + funcionario);

        } catch (NumberFormatException ex) {
            System.err.println("\nNúmero inválido. Tente novamente.");
        }
    }
}