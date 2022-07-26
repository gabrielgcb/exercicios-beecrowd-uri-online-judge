/*
Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        
        double distanciaTotal = scan.nextDouble();
        double combustivelGasto = scan.nextDouble();
        
        double consumo = distanciaTotal / combustivelGasto;
        
        System.out.format("%.3f km/l\n", consumo);
 
    }
}
