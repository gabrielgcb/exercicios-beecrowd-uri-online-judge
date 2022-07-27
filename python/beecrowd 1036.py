"""
Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. 
Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, 
caso haja uma divisão por 0 ou raiz de numero negativo.
"""

import math

a, b, c = input().split()
a = float(a)
b = float(b)
c = float(c)

if a != 0:
    delta = b**2 - 4*a*c
    if delta >= 0:
        x1 = (-b + math.sqrt(delta)) / (2*a)
        x2 = (-b - math.sqrt(delta)) / (2*a)
        print("R1 = {:.5f}" .format(x1))
        print("R2 = {:.5f}" .format(x2))
    else:
        print("Impossivel calcular")
else:
    print("Impossivel calcular")
