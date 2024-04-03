import java.util.Scanner;

public class AlunosAprovados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de alunos: ");
        int qtdAlunos = scanner.nextInt();

        String[] nomes = new String[qtdAlunos];
        double[] notas = new double[qtdAlunos];

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.next();
            System.out.print("Nota final do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        boolean Aprovados = false;
        System.out.println("\nAlunos aprovados:");
        for (int i = 0; i < qtdAlunos; i++) {
            if (notas[i] >= 7.0) {
                System.out.println(nomes[i]);
                Aprovados = true;
            }
        }

        if (!Aprovados) {
            System.out.println("Nenhum aluno aprovado.");
        }

        scanner.close();
    }
}
