/*
Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Exemplo de Saída
I=1 J=7
I=1 J=6
I=1 J=5
I=3 J=7
I=3 J=6
I=3 J=5
...
I=9 J=7
I=9 J=6
I=9 J=5
*/

class Main {
    public static void main(String[] args) {
        
        int i;
        int j;
        
        for (i = 1; i <= 9; i += 2) {
            for (j = 7; j >= 5; j--) {
                System.out.println("I=" + i + " J=" + j);
            }
        }
        
    }
}
