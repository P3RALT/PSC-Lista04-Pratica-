import java.util.Scanner;

public class Lista04_Atv01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Variaveis
        int[] X = new int[10];
        int[] Y = new int[10];
        int[] Z = new int[20];  

        // ===================
        System.out.println("Digite 10 números para o vetor X:");
        for (int i = 0; i < 10; i++) {
            System.out.print("X[" + i + "] = ");
            X[i] = scanner.nextInt();
        }

        System.out.println("\nDigite 10 números para o vetor Y:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Y[" + i + "] = ");
            Y[i] = scanner.nextInt();
        }
        for (int i = 0, j = 0; i < 10; i++) {
            Z[j++] = X[i];
            Z[j++] = Y[i];
        }
        System.out.println("\nVetor Z (intercalado):");
        for (int i = 0; i < 20; i++) {
            System.out.print(Z[i] + " ");
        }

    }
}
