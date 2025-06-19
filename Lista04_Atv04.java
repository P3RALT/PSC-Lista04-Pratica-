import java.util.Scanner;

public class Lista04_Atv04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] gabarito = new char[8];
        int nota = 0;
        System.out.println("Digite o gabarito da prova (A, B, C, D ou E):");
        for (int i = 0; i < 8; i++) {
            System.out.print("Questão " + (i + 1) + ": ");
            gabarito[i] = input.next().toUpperCase().charAt(0); // Lê a letra e converte para maiúscula
        }

        for (int aluno = 1; aluno <= 10; aluno++) {
            System.out.println("\nAluno " + aluno);
            System.out.print("Digite o número de matrícula do aluno: ");
            int matricula = input.nextInt();

            char[] respostas = new char[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Resposta da questão " + (i + 1) + ": ");
            respostas[i] = input.next().toUpperCase().charAt(0);
            }
            
        for (int i = 0; i < 8; i++) {
            if (respostas[i] == gabarito[i]) {
            nota++; 
                }
            }

            // Exibir resultado do aluno
            System.out.println("Aluno matrícula: " + matricula + " - Nota: " + nota + " pontos.");
        }

        input.close(); // Fecha o Scanner
    }
}
