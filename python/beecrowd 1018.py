"""
Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. 
As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. 
A seguir, mostre o valor lido e a relação de notas necessárias.
"""

valor = int(input())
lista_notas = [100, 50, 20, 10, 5, 2, 1]

print(valor)
for i in lista_notas:
    if valor >= i:
        resto = valor // i
        print(resto, "nota(s) de R$", i, end=',00')
        print()
        valor = valor % i
        i += 1
    else:
        print("0 nota(s) de R$", i, end=',00')
        print()
        i += 1
        
