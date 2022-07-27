/*
Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. 
Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.
*/

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double delta = (b*b) -(4*a*c);
        double raiz1 = (-b + Math.sqrt(delta)) / (2*a);
        double raiz2 = (-b - Math.sqrt(delta)) / (2*a);
        
        if (delta >= 0 & a != 0) {
            System.out.format("R1 = %.5f\n", raiz1);
            
            System.out.format("R2 = %.5f\n", raiz2);
        }    
        else {
            System.out.println("Impossivel calcular");
        }

    }
}
