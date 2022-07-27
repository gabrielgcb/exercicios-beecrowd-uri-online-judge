/*
Leia 3 valores inteiros e ordene-os em ordem crescente. 
No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, 
os valores na sequência como foram lidos.
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int valor[] = new int[3];
        int novoValor[] = new int[3];
        
        int i = 0;
        while (i < 3) {
            valor[i] = scan.nextInt();
            novoValor[i] = valor[i];
            i++;
        }
        
        int j = 0;
        int k = 0;
        int aux = 0;
        
        while (j < 3) {
            k = j + 1;
            while (k < 3) {
                if (novoValor[k] < novoValor[j]) {
                    aux = novoValor[k];
                    novoValor[k] = novoValor[j];
                    novoValor[j] = aux;
                }
                k++;
            }
            j++;
        }
        
        int m = 0;
        while (m < 3) {
            System.out.println(novoValor[m]);
            m++;
        }
        
        System.out.print("\n");
        
        int n = 0;
        while (n < 3) {
            System.out.println(valor[n]);
            n++;
        }
        
    }
}
