/*
Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Exemplo de Saída
I=1 J=7
I=1 J=6
I=1 J=5
I=3 J=9
I=3 J=8
I=3 J=7
...
I=9 J=15
I=9 J=14
I=9 J=13
*/

public class Main {
    public static void main(String[] args) {
        
        int i;
        int j;
        
        for (i = 1; i <= 9; i += 2) {
            for (j = i+6; j >= (i+6)-2; j--) {
                System.out.println("I=" + i + " J=" + j);
            }
        }
        
    }
}
