/*
Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R). 
A fórmula para calcular o volume é: (4/3) * pi * R^3. 
Considere (atribua) para pi o valor 3.14159.
*/

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 
        
        double raioEsfera = scan.nextDouble();
        double volumeEsfera = (4 * 3.14159 * Math.pow(raioEsfera, 3)) / 3;
        
        System.out.format("VOLUME = %.3f\n", volumeEsfera);
        
    }
}
