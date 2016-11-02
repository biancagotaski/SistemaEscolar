package br.edu.infnet.sistemaescolar;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintStream printStream = new PrintStream(System.out);

        String[] alunos = new String[100];
        Double[] av1 = new Double[100];
        Double[] av2 = new Double[100];

        boolean continuar = true;

        while (continuar) {

            printStream.println("\n------------------------------------------------------\n");

            printStream.println("[1] Registrar as notas de um aluno");
            printStream.println("[2] Consultar boletim de um aluno");
            printStream.println("[3] Consultar notas da turma");
            printStream.println("[4] Sair");

            int itemMenuEscolhido = Integer.parseInt(scanner.nextLine());

            switch (itemMenuEscolhido) {
                case 1:

                    printStream.println("\n------------------------------------------------------\n");

                    printStream.print("Nome do aluno: ");
                    String nome = scanner.nextLine();
                    printStream.print("Nota da AV1: ");
                    Double nota1 = Double.parseDouble(scanner.nextLine());
                    printStream.print("Nota da AV2: ");
                    Double nota2 = Double.parseDouble(scanner.nextLine());

                    int indiceDisponivel = 0;

                    for (int indice = 0; indice < alunos.length; indice++) {
                        if (alunos[indice] == null) {
                            indiceDisponivel = indice;
                            break;
                        }
                    }

                    alunos[indiceDisponivel] = nome;
                    av1[indiceDisponivel] = nota1;
                    av2[indiceDisponivel] = nota2;
                    printStream.println("Código do aluno: " + indiceDisponivel);

                    break;

                case 2:

                    printStream.println("\n------------------------------------------------------\n");

                    printStream.print("Código do aluno: ");

                    int codAluno = Integer.parseInt(scanner.nextLine());

                    printStream.println("\nNome: " + alunos[codAluno]);
                    printStream.println("Nota AV1: " + av1[codAluno]);
                    printStream.println("Nota AV2: " + av2[codAluno]);

                    Double mediaFinal = (av1[codAluno] + av2[codAluno]) / 2;
                    printStream.println("Média final: " + mediaFinal);

                    if (mediaFinal < 4) {
                        printStream.println("Situação: Reprovado");
                    }

                    if (mediaFinal >= 4 && mediaFinal < 7) {
                        printStream.println("Situação: Prova final");
                    }
                    if (mediaFinal >= 7) {
                        printStream.println("Situação: Aprovado");
                    }
                    break;

                case 3:

                    printStream.println("\n------------------------------------------------------\n");

                    printStream.println("____________________________________________________________________");
                    printStream.println(String.format("|%-30s|%6s|%6s|%12s|%10s|", "Nome do Aluno", "AV1", "AV2", "Média Final", "Situação"));
                    printStream.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                    for (int contador = 0; contador < alunos.length; contador++) {

                        if (alunos[contador] == null) {
                            break;
                        }

                        String nomeAluno = alunos[contador];
                        Double notaAv1 = av1[contador];
                        Double notaAv2 = av2[contador];

                        Double mediaFinalTabela = (av1[contador] + av2[contador]) / 2;

                        String situacaoAluno = null;

                        if (mediaFinalTabela < 4) {
                            situacaoAluno = "Reprovado";
                        }
                        if (mediaFinalTabela >= 4 && mediaFinalTabela < 7) {
                            situacaoAluno = "Prova Final";
                        }
                        if (mediaFinalTabela >= 7) {
                            situacaoAluno = "Aprovado";
                        }

                        printStream.println(String.format("|%-30s|%6.2f|%6.2f|%12.2f|%10s|", nomeAluno, notaAv1, notaAv2, mediaFinalTabela, situacaoAluno));
                    }
                    printStream.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯"); //alt+0175
                    break;
                case 4:
                    continuar = false;
                    break;
            }
        }
    }
}
