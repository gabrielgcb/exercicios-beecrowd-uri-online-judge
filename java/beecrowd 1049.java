/*
Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, da esquerda para a direita.  
Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.

Entrada
A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura acima, com todas as letras minúsculas.

Saída
Imprima o nome do animal correspondente à entrada fornecida.

Exemplos de Entrada	Exemplos de Saída
vertebrado 
mamifero         homem
onivoro

vertebrado
ave              aguia
carnivoro

invertebrado
anelideo         minhoca
onivoro
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        String tipo1 = ler.next();
        String tipo2 = ler.next();
        String tipo3 = ler.next();
        
        if (tipo1.equals("vertebrado")){
            switch (tipo2){
                case "ave":
                    if (tipo3.equals("carnivoro")){
                        System.out.println("aguia");}
                    else{
                        System.out.println("pomba");}
                    break;
                case "mamifero":
                    if (tipo3.equals("onivoro"))
                        System.out.println("homem");
                    else
                        System.out.println("vaca");
                    break;
            }
            
        } else{
            switch (tipo2){
                case "inseto":
                    if (tipo3.equals("hematofago"))
                        System.out.println("pulga");
                    else
                        System.out.println("lagarta");
                    break;
                case "anelideo":
                    if (tipo3.equals("hematofago"))
                        System.out.println("sanguessuga");
                    else
                        System.out.println("minhoca");
                    break;
            }            
        }
        
    }
}
