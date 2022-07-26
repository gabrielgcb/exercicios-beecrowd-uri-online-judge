/*
Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. 
A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 
        
        int numeroFuncionario = scan.nextInt();
        int horasTrabalhadas = scan.nextInt();
        double salarioHora = scan.nextDouble();
        
        double salario = horasTrabalhadas * salarioHora;
        
        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.format("SALARY = U$ %.2f\n", salario);
      
    }
}
