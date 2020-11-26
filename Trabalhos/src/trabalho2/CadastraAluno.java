package trabalho2;

import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastraAluno {
    public static void main(String[] args) {
        var alunos = new ArrayList<Aluno>();

        int matricula;
        String nome;
        int dia, mes, ano;

        var input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("\nDigite a matrícula (0 para sair): ");
                matricula = input.nextInt();

                if (matricula == 0) {
                    break;
                }

                if (input.hasNextLine()) {
                    input.nextLine();
                }

                System.out.print("\nDigite o nome: ");
                nome = input.nextLine();

                System.out.print("\nData de nascimento:");
                System.out.print("\n\tDia: ");
                dia = input.nextInt();

                System.out.print("\n\tMes: ");
                mes = input.nextInt();

                System.out.print("\n\tAno: ");
                ano = input.nextInt();

                var aluno = new Aluno(matricula, nome, dia, mes, ano);
                System.out.println("\n" + aluno);
                alunos.add(aluno);

            } catch (InputMismatchException ex) {
                System.err.println("\nNúmero inválido. Tente Novamente.\n");

                if (input.hasNextLine()) {
                    input.nextLine();
                }
            } catch (DateTimeException ex) {
                System.err.println("\nData inválida. Tente Novamente.\n");
            }
        }

        System.out.println("\nTotal de alunos digitados: " + alunos.size() + "\n");
        input.close();
    }
}