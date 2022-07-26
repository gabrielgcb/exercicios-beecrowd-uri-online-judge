/*
Leia dois valores inteiros. 
A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. 
Mostre a variável PROD com mensagem correspondente.   
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 
        
        int A = scan.nextInt();
        int B = scan.nextInt();
        int produto = A * B;
        
        System.out.println("PROD = " + produto);
 
    }
}
