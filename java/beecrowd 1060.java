/*
Faça um programa que leia 6 valores. 
Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). 
A seguir, mostre a quantidade de valores positivos digitados.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) { 
		
		Scanner ler = new Scanner(System.in);
		
		double vetor[] = new double[6];
		int i = 0;
		
		for (i = 0; i < 6; i++) {
			vetor[i] = ler.nextDouble();
		}
		
		int cont = 0;
		
		for (i = 0; i < 6; i++) {
			if (vetor[i] > 0)
				cont ++;
		}
