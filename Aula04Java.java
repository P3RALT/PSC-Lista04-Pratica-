/*

GRUPO : GABRIEL MACHADO DIOGO - PEDRO MARÇAL CARDOSO - Tulio Macedo
Tarefa
Dados os resultados dos quinze jogos da Fase Final, desenvolva um programa que determine
a equipe campe˜a.
Entrada: A entrada ´e composta pelo resultado dos 15 jogos. O resultado de um jogo
´e representado por dois n´umeros inteiros M e N, indicando respectivamente o n´umero
de gols da equipe representada `a esquerda e `a direita na tabela de jogos. Considere que
o n´umero de gols deve estar entre 0 e 20 e n˜ao podem haver empates (0 ≤ M ≤ 20,
≤ N ≤ 20 e M ̸= N)
Sa´ıda: Seu programa deve imprimir uma ´unica sa´ıda, indicando a letra identificadora da
equipe campe˜a


*/

package aula04.java;
import java.util.Scanner;
public class Aula04Java {
    public static void main(String[] args) {
       Scanner Ler = new Scanner(System.in);
       
       /* VARIAVEIS */
        String[] esquerda = new String[]{"A", "C", "E", "G", "I", "K", "M", "O"};
        String[] direita = new String[]{"B", "D", "F", "H", "J", "L", "N", "P"};
        /* VENCEDORES*/
        String[] oitavas = new String[8];
        String[] quartas = new String[4];
        String[] semi = new String[2];
        /* VARIAVEIS GOLLS*/
        int M = -1, N = -1;
       
  
        System.out.println(" --- BEM-VINDOS AO CAMPEONATO DIGITAL! ---");
        System.out.println(" --------- AS CHAVES ESTÃO -------- ");
        System.out.println("(1) A VS B - (2) C VS D - (3) E VS F - (4) G VS H");
        System.out.println("(5) I VS J - (6) K VS L - (7) M VS N - (8) O VS P");
        System.out.println("--- Vamos para os primeiros jogos ---");
        
        System.out.println("=OITAVAS-DE-FINAL=");
            /* LOOP para o RESULTADO DAS COMPETIÇÔES*/
               for (int i = 0; i < 8; i++) {
                    
                    System.out.println(" ---- Jogo " + (i + 1) + ": " + esquerda[i] + " VS " + direita[i]);
                    System.out.print("-> Placar do time " + esquerda[i] + ": ");
                     M = Ler.nextInt();
                        while (M < 0 || M > 20){
                            System.out.println(" Resultado Invalido, insira novamente: ");
                            M = Ler.nextInt(); }
                        
                    System.out.print("-> Placar do time " + direita[i] + ": ");
                     N = Ler.nextInt();
                        while (N < 0 || N > 20){
                        System.out.println(" Resultado Invalido, insira novamente: ");
                            N = Ler.nextInt(); }

                     if (M > N){
                         oitavas[i] = esquerda[i];
                     } else if( N < M)  {
                         oitavas[i] = direita[i];
                     } else if( N == M) {
                         System.out.println("Nao pode ocorrer EMPATES!!! ");
                         i = i-1;
                     }
               }
        System.out.println("=QUARTAS-DE-FINAL=");
            /* LOOP para o RESULTADO DAS COMPETIÇÔES*/
               for (int i = 0; i < 4; i++) {
                   /*GANHADORES*/
                   String t1 = oitavas[2*i];
                   String t2 = oitavas[2*i +1];
                   System.out.println("Jogo " + (i+1) + ": " + t1 + " vs " + t2);
                   System.out.print(" Placar " + t1 + ": ");
                   M = Ler.nextInt();
                    while (M < 0 || M > 20){
                            System.out.println(" Resultado Invalido, insira novamente: ");
                            M = Ler.nextInt(); } 
                  
                   System.out.print(" Placar " + t2 + ": ");
                   N = Ler.nextInt();
                    while (N < 0 || N > 20){
                            System.out.println(" Resultado Invalido, insira novamente: ");
                            N = Ler.nextInt(); }
                    
                   if (M > N) {
                      quartas[i] = t1;
                   } else if(N > M) {
                      quartas[i] = t2;
                   } else if( N == M) {
                      System.out.println("Nao pode ocorrer EMPATES!!! ");
                       i = i-1;
                     }
               }
        System.out.println("\n== SEMIFINAIS ==");
            /* LOOP para o RESULTADO DAS COMPETIÇÔES*/
                for (int i = 0; i < 2; i++) {
                String t1 = quartas[2*i];
                String t2 = quartas[2*i + 1];
                System.out.println("Jogo " + (i+1) + ": " + t1 + " vs " + t2);
                System.out.print(" Placar " + t1 + ": ");
                M = Ler.nextInt();
                while (M < 0 || M > 20){
                            System.out.println(" Resultado Invalido, insira novamente: ");
                            M = Ler.nextInt(); } 
                System.out.print(" Placar " + t2 + ": ");
                N = Ler.nextInt();
                while (N < 0 || N > 20){
                            System.out.println(" Resultado Invalido, insira novamente: ");
                            N = Ler.nextInt(); } 
                 if (M > N) {
                    semi[i] = t1;
                } else if (N > M) {
                    semi[i] = t2;
                    }
                 else if( N == M) {
                      System.out.println("Nao pode ocorrer EMPATES!!! ");
                       i = i-1;
                     }
                }
                
         System.out.println("\n== FINAL ==");
                String f1 = semi[0];
                String f2 = semi[1];
                
                for (int i = 0; i < 1; i++) {
                System.out.println(f1 + " vs " + f2);
                System.out.print(" Placar " + f1 + ": ");
                M = Ler.nextInt();
                while (M < 0 || M > 20){
                            System.out.println(" Resultado Invalido, insira novamente: ");
                            M = Ler.nextInt(); } 
                
                System.out.print(" Placar " + f2 + ": ");
                N = Ler.nextInt();
                while (N < 0 || N > 20){
                       System.out.println(" Resultado Invalido, insira novamente: ");
                       N = Ler.nextInt(); };
                       
                String campeao;
                 if (M > N) {
                  campeao = f1;
                  System.out.println("\n*** CAMPEÃO: " + campeao + " ***");
                 } else if (N > M){
                  campeao = f2; 
                 System.out.println("\n*** CAMPEÃO: " + campeao + " ***");}
                 else if( N == M) {
                      System.out.println("Nao pode ocorrer EMPATES!!! ");
                       i = i-1;
                     }
        }
               
    }
}
             