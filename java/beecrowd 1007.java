/*
Leia quatro valores inteiros A, B, C e D. 
A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: 
DIFERENCA = (A * B - C * D).
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 
        
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        
        int diferenca = A*B - C*D;
        
        System.out.println("DIFERENCA = " + diferenca);
      
    }
}
