import java.util.Scanner;

public class Lista04_Atv05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Variaveis
        double[] temperaturas = new double[12];
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        double maiorTemperatura = temperaturas[0];
        double menorTemperatura = temperaturas[0];
        int mesMaior = 0;
        int mesMenor = 0;
        // ========
        
        
        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura média de " + meses[i] + ": ");
            temperaturas[i] = input.nextDouble();
        }
      
        for (int i = 1; i < 12; i++) {
            if (temperaturas[i] > maiorTemperatura) {
                maiorTemperatura = temperaturas[i];
                mesMaior = i;
            }
            if (temperaturas[i] < menorTemperatura) {
                menorTemperatura = temperaturas[i];
                mesMenor = i;
            }
        }
        
        System.out.println("\nMaior temperatura do ano: " + maiorTemperatura + "ºC em " + meses[mesMaior]);
        System.out.println("Menor temperatura do ano: " + menorTemperatura + "ºC em " + meses[mesMenor]);

        input.close(); 
    }
}
