/*
Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 
        
        String nomeVendedor = scan.next();
        double salarioFixo = scan.nextDouble();
        double totalVendas = scan.nextDouble();
        double comissao = totalVendas * 0.15;
        
        double salario = salarioFixo + comissao;
        
        System.out.format("TOTAL = R$ %.2f\n", salario);
      
    }
}
