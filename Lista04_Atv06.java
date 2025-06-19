import java.util.Scanner;

public class Lista04_Atv06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Variaveis
        double[] precos = new double[10];      
        int[] quantidades = new int[10];      
        double valorGeral = 0;
        int maisVendidoPosicao = 0;
        int maiorQuantidadeVendida = quantidades[0];
        
        // ===========================================
        System.out.println("Cadastro dos preços dos 10 objetos:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Preço do objeto " + (i + 1) + ": R$ ");
            precos[i] = input.nextDouble();
        }
        System.out.println("\nCadastro das quantidades vendidas dos 10 objetos:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Quantidade vendida do objeto " + (i + 1) + ": ");
            quantidades[i] = input.nextInt();
        }
        
        System.out.println("\n=== RELATÓRIO DE VENDAS ===");
        System.out.println("Objeto | Quantidade | Preço Unitário | Valor Total");

        for (int i = 0; i < 10; i++) {
            double valorTotal = precos[i] * quantidades[i]; // Valor total de cada objeto
            valorGeral += valorTotal; // Soma ao valor geral

            System.out.printf("  %2d    |     %3d    |     R$ %.2f    |   R$ %.2f\n",
                    (i + 1), quantidades[i], precos[i], valorTotal);

            if (quantidades[i] > maiorQuantidadeVendida) {
                maiorQuantidadeVendida = quantidades[i];
                maisVendidoPosicao = i;
            }
        }

        double comissao = valorGeral * 0.05;
        double salarioTotal = 545.00 + comissao;
        System.out.println("\nValor geral das vendas: R$ " + String.format("%.2f", valorGeral));
        System.out.println("Comissão do vendedor (5%): R$ " + String.format("%.2f", comissao));
        System.out.println("Salário total do vendedor: R$ " + String.format("%.2f", salarioTotal));

        System.out.println("\nObjeto mais vendido: Objeto " + (maisVendidoPosicao + 1));
        System.out.println("Quantidade vendida: " + maiorQuantidadeVendida);
        System.out.println("Preço do objeto mais vendido: R$ " + String.format("%.2f", precos[maisVendidoPosicao]));

    }
}
