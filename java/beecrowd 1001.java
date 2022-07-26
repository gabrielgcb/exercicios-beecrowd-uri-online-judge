/*
Leia 2 valores inteiros e armazene-os nas variaveis A e B. 
Efetue a soma de A e B atribuindo o seu resultado na variavel X. 
Imprima X conforme exemplo apresentado abaixo.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        
        int A = scan.nextInt();
        int B = scan.nextInt();
        int soma = A + B;
        
        System.out.println("X = " + soma);
      
    }
}
