package trabalho3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Faculdade {
    public static void main(String[] args) {
        List<ContraCheque> contraCheques = new ArrayList<>();

        int ctps;
        String nome;
        String formacao;
        int qtdDependentes;

        double valorHoraAula;
        int qtdHoraSemanal;
        int qtdHoraNoturna;

        try (var input = new Scanner(System.in)) {
            while (true) {
                try {
                    System.out.print("\nInforme o ctps do professor (0 para sair): ");
                    ctps = Integer.parseInt(input.nextLine());

                    if (ctps == 0) {
                        break;
                    }

                    System.out.print("Informe o nome do professor: ");
                    nome = input.nextLine();

                    System.out.print("Informe a formacao do professor: ");
                    formacao = input.nextLine();

                    System.out.print("Informe a quantitdade de dependentes do professor: ");
                    qtdDependentes = Integer.parseInt(input.nextLine());

                    System.out.print("\nInforme o valor da hora aula para o contra-cheque: ");
                    valorHoraAula = Double.parseDouble(input.nextLine());

                    System.out.print("Informe a quantidade de horas por semana para o contra-cheque: ");
                    qtdHoraSemanal = Integer.parseInt(input.nextLine());

                    System.out.print("Informe a quantidade de horas noturnas para o contra-cheque: ");
                    qtdHoraNoturna = Integer.parseInt(input.nextLine());

                    var professor = new Professor(ctps, nome, formacao, qtdDependentes);
                    var contraCheque = new ContraCheque(valorHoraAula, qtdHoraSemanal, qtdHoraNoturna, professor);

                    contraCheques.add(contraCheque);
                } catch (NumberFormatException ex) {
                    System.out.println("\nNúmero inválido. Tente Novamente.");
                }
            }

            for (var contraCheque : contraCheques) {
                System.out.println();
                System.out.println(contraCheque);
                System.out.println("\nDados Adicionais:");
                System.out.println("\tSalário base: " + contraCheque.salarioBase());
                System.out.println("\tDSR (Descanso Semanal Remunerado): " + ContraCheque.getDsr());
                System.out.println("\tACT (Acordo Coletivo de Trabalho): " + ContraCheque.getAct());
                System.out.println("\tAdicional Noturno: " + contraCheque.adicionalNoturno());
                System.out.println("\tDesconto do INSS: " + contraCheque.calculaINSS());
                System.out.println("\tDesconto de IRPF: " + contraCheque.calculaIRPF());
                System.out.println("\tDesconto de Seguro de Vida (SVC): " + contraCheque.calculaSVC());
                System.out.println("\tRemuneração Bruta: " + contraCheque.remuneracaoBruta());
                System.out.println(
                        "\tSalário base para INSS: " + (contraCheque.remuneracaoBruta() - contraCheque.calculaINSS()));
                System.out.println(
                        "\tSalário base para FGTS: " + (contraCheque.remuneracaoBruta() - contraCheque.calculaFGTS()));
                System.out.println(
                        "\tSalário base para IRPF: " + (contraCheque.remuneracaoBruta() - contraCheque.calculaIRPF()));
                System.out.println("\tValor do FGTS: " + contraCheque.calculaFGTS());
                System.out.println("\tSalário líquido: " + contraCheque.salarioLiquido());
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
