/*
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

Distancia = raiz_quadrada( (x2 - x1)^2 + (y2 - y1)^2 )
*/

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        
        double distancia = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        
        System.out.format("%.4f\n", distancia);
 
    }
}
