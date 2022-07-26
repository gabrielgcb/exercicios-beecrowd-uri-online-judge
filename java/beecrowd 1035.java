/*
Leia 4 valores inteiros A, B, C e D. 
A seguir, se B for maior do que C e 
se D for maior do que A, e 
a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e 
se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        
        if (B > C & D > A){
            if (C+D > A+B){
                if (C > 0 & D > 0){
                    if (A % 2 == 0){
                        System.out.println("Valores aceitos");
                    }else{
                        System.out.println("Valores nao aceitos");
                    }
                }else{
                   System.out.println("Valores nao aceitos"); 
                }
            }else{
               System.out.println("Valores nao aceitos");
            }
        }else{
           System.out.println("Valores nao aceitos"); 
        }
    }               
}
