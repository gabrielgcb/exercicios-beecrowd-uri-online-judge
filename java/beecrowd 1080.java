/*
Leia 100 valores inteiros. 
Apresente o maior valor lido e a posição dentre os 100 valores lidos.
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int vetor[] = new int[100];
        int i = 0;
        
        while (i < 100) {
            vetor[i] = scan.nextInt();
            i++;
        }
        
        int maior = 0;
        int posicao = 0;
        int j = 0;
        
        while (j < 100) {
            if (j == 0) {
                maior = vetor[0];
            }
            else {
                if (vetor[j] > maior) {
                    maior = vetor[j];
                    posicao = j;
                }
            }
            j++;
        }
        
        System.out.println(maior);
        System.out.println(posicao+1);
        
    }
}
