/*
Faça um programa que leia um vetor A[100]. No final, mostre todas as posições do vetor que 
armazenam um valor menor ou igual a 10 e o valor armazenado em cada uma das posições.

Entrada
A entrada contém 100 valores, podendo ser inteiros, reais, positivos ou negativos.

Saída
Para cada valor do vetor menor ou igual a 10, escreva "A[i] = x", 
onde i é a posição do vetor e x é o valor armazenado na posição, com uma casa após o ponto decimal.
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
            
        double vetor[] = new double[100];
        
        int i = 0;
        while (i < 100){
            vetor[i] = ler.nextDouble();
            i++;
        }
        
        int j = 0;
        while (j < 100){
            if (vetor[j] <= 10){
                System.out.printf("A[%d] = %.1f\n", j, vetor[j]);
            }
            j++;
        }
        
    }
}
