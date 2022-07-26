/*
Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, ao utilizar um automóvel que faz 12 Km/l. 
Para isso, ele gostaria que você o auxiliasse através de um simples programa. 
Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade média durante a mesma (em km/h). 
Assim, pode-se obter distância percorrida e, em seguida, calcular quantos litros seriam necessários. 
Mostre o valor com 3 casas decimais após o ponto.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        
        double tempoGasto = scan.nextDouble();
        double velocidadeMedia = scan.nextDouble();
        
        double distancia = tempoGasto * velocidadeMedia;
        double consumoCombustivel = distancia / 12;
        
        System.out.format("%.3f\n", consumoCombustivel);
 
    }
}
