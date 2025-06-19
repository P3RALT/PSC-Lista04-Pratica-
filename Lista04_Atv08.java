import java.util.Scanner;

public class  Lista04_Atv08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // VARIAVEIS
        double[][] vendas = new double[12][4];
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        double totalAnual = 0;
        
        // =====================
        System.out.println("Digite os valores de vendas por mês e por semana:");
        for (int mes = 0; mes < 12; mes++) {
            System.out.println("\nMês: " + meses[mes]);
            for (int semana = 0; semana < 4; semana++) {
                System.out.print("Semana " + (semana + 1) + ": R$ ");
                vendas[mes][semana] = input.nextDouble();
            }
        }
        System.out.println("\n=== Total vendido em cada mês ===");
        for (int mes = 0; mes < 12; mes++) {
            double totalMes = 0;
            for (int semana = 0; semana < 4; semana++) {
                totalMes += vendas[mes][semana];
            }
            System.out.println(meses[mes] + ": R$ " + String.format("%.2f", totalMes));
            totalAnual += totalMes;
        }
        System.out.println("\n=== Total vendido em cada semana durante o ano ===");
        for (int semana = 0; semana < 4; semana++) {
            double totalSemana = 0;
            for (int mes = 0; mes < 12; mes++) {
                totalSemana += vendas[mes][semana];
            }
            System.out.println("Semana " + (semana + 1) + ": R$ " + String.format("%.2f", totalSemana));
        }

        System.out.println("\n=== Total vendido no ano ===");
        System.out.println("R$ " + String.format("%.2f", totalAnual));
    }
}
