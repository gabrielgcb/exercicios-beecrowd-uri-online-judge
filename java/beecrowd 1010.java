/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, 
o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. 
Após, calcule e mostre o valor a ser pago.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 
        
        int codigoPeca1 = scan.nextInt();
        int numeroPecas1 = scan.nextInt();
        double valorUnitarioPecas1 = scan.nextDouble();
        int codigoPeca2 = scan.nextInt();
        int numeroPecas2 = scan.nextInt();
        double valorUnitarioPecas2 = scan.nextDouble();
        
        double valorTotalPeca1 = numeroPecas1 * valorUnitarioPecas1;
        double valorTotalPeca2 = numeroPecas2 * valorUnitarioPecas2;
        double valorTotal = valorTotalPeca1 + valorTotalPeca2;
        
        System.out.format("VALOR A PAGAR: R$ %.2f\n", valorTotal);
        
    }
}
