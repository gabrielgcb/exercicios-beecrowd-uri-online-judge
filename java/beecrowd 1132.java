/*
Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos números que não são múltiplos de 13 entre X e Y, incluindo ambos.
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int valor1 = scan.nextInt();
        int valor2 = scan.nextInt();
        
        int i = 0;
        int soma = 0;
        
        if (valor1 >= valor2) {
            for (i = valor2; i <= valor1; i++) {
                if (i % 13 != 0)
                    soma += i;
            }
        } else {
            for (i = valor1; i <= valor2; i++) {
                if (i % 13 != 0)
                    soma += i;
            }
        }
        
        System.out.println(soma);
        
    }
}
