/*
A fórmula para calcular a área de uma circunferência é: area = pi . raio^2. Considerando para este problema que pi = 3.14159:
- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por pi.
*/

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double raio = scan.nextDouble();
        double areaCirculo = 3.14159 * Math.pow(raio,2);
        
        System.out.format("A=%.4f\n", areaCirculo);
        
    }
}
