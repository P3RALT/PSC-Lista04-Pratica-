import java.util.Scanner;

public class Lista04_Atv2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variaveis
        int[] numeros = new int[8];
        int[] positivos = new int[8];
        int[] negativos = new int[8];
        int contadorPositivo = 0;
        int contadorNegativo = 0;
        
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = input.nextInt();
            if (numeros[i] >= 0) {
                positivos[contadorPositivo] = numeros[i]; // Armazena no vetor de positivos
                contadorPositivo++; // Incrementa o contador de positivos
            } else {
                negativos[contadorNegativo] = numeros[i]; // Armazena no vetor de negativos
                contadorNegativo++; // Incrementa o contador de negativos
            }
        }
        System.out.print("\nNúmeros positivos: ");
        for (int i = 0; i < contadorPositivo; i++) {
            System.out.print(positivos[i] + " ");
        }
        System.out.print("\nNúmeros negativos: ");
        for (int i = 0; i < contadorNegativo; i++) {
            System.out.print(negativos[i] + " ");
        }    } }
