/*
Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

    Exemplo de Saída
    I=1 J=60
    I=4 J=55
    I=7 J=50
    ...
    I=? J=0
*/

public class Main {
	public static void main(String[] args) { 
		
		int j = 60;
		int i = 1;
		
		while (j >= 0) {
			System.out.println("I=" + i + " J=" + j);
			i += 3;
			j -= 5;
		}
		
	}
}
