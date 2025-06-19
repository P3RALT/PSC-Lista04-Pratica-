import java.util.Scanner;

public class Lista04_Atv03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Variaveis
        int[] numeros = new int[9];

        for (int i = 0; i < 9; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = input.nextInt();
        }

        System.out.println("\nNúmeros primos e suas posições:");

        for (int i = 0; i < 9; i++) {
            if (ehPrimo(numeros[i])) {
                System.out.println("Número " + numeros[i] + " na posição [" + i + "]");
            }
        }

    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false; 
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; 
            }
        }

        return true; 
    }
}
