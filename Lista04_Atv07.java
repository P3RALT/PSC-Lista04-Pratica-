import java.util.Scanner;

public class Lista04_Atv07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //VARIAVEIS
        int[] numeros = new int[6]; 
        int somaPares = 0;
        int quantidadeImpares = 0;
        
        // ========================
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = input.nextInt();
        }
        System.out.println("\n=== RELATÓRIO ===");
        System.out.println("Os números pares são:");
        for (int i = 0; i < 6; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("Número " + numeros[i] + " na posição " + (i + 1));
                somaPares += numeros[i];
            }
        }
        
        System.out.println("Soma dos pares = " + somaPares);
        System.out.println("\nOs números ímpares são:");
        for (int i = 0; i < 6; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println("Número " + numeros[i] + " na posição " + (i + 1));
                quantidadeImpares++;
            }
        }
        System.out.println("Quantidade de ímpares = " + quantidadeImpares);
    }
}
