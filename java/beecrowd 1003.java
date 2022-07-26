/*
Leia dois valores inteiros, no caso para variáveis A e B. 
A seguir, calcule a soma entre elas e atribua à variável SOMA. 
Escrever o valor desta variável.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 
        
        int A = scan.nextInt();
        int B = scan.nextInt();
        int soma = A + B;
        
        System.out.println("SOMA = " + soma);
 
    }
}
