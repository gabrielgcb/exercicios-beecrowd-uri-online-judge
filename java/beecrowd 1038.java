/*
Com base na tabela, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int codigo = scan.nextInt();
        int qtd = scan.nextInt();
        double total = 0;
        
        switch (codigo) {
            case 1: total = 4.00 * qtd;
                    System.out.format("Total: R$ %.2f\n", total);
                    break;
            case 2: total = 4.50 * qtd;
                    System.out.format("Total: R$ %.2f\n", total);
                    break;
            case 3: total = 5.00 * qtd;
                    System.out.format("Total: R$ %.2f\n", total);
                    break;
            case 4: total = 2.00 * qtd;
                    System.out.format("Total: R$ %.2f\n", total);
                    break;
            case 5: total = 1.50 * qtd;
                    System.out.format("Total: R$ %.2f\n", total);
                    break;        
        }
        
    }
}
