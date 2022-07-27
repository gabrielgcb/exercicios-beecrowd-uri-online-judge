/*
Leia 2 valores inteiros (A e B). 
Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", 
indicando se os valores lidos são múltiplos entre si.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) { 
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		if (B >= A) {
			if (B % A == 0)
				System.out.println("Sao Multiplos");
			else
				System.out.println("Nao sao Multiplos");
		} else {
			if (A % B == 0)
				System.out.println("Sao Multiplos");
			else
				System.out.println("Nao sao Multiplos");
		}
		
	}
}
