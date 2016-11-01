package br.edu.infnet.sistemaescolar;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintStream printStream = new PrintStream(System.out);

        printStream.println("[1] Registrar as notas de um aluno");
        printStream.println("[2] Consultar boletim de um aluno");
        printStream.println("[3] Consultar notas da turma");
        printStream.println("[4] Sair");


        int itemMenuEscolhido = Integer.parseInt(scanner.nextLine());

        switch (itemMenuEscolhido){
            case 1:
                printStream.print("Nome do aluno: ");
                String nome = scanner.nextLine();
                printStream.print("Nota da AV1: ");
                Double nota1 = Double.parseDouble(scanner.nextLine());
                printStream.print("Nota da AV2: ");
                Double nota2 = Double.parseDouble(scanner.nextLine());
                break;

        }

    }
}
