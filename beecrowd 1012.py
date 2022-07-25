"""
Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
"""

A, B, C = input().split()

A = float(A)
B = float(B)
C = float(C)

a_triangulo = (A * C) / 2
a_circulo = 3.14159 * C**2
a_trapezio = ((A + B) * C) / 2
a_quadrado = B**2
a_retangulo = A * B

print("TRIANGULO: {:.3f}".format(a_triangulo))
print("CIRCULO: {:.3f}".format(a_circulo))
print("TRAPEZIO: {:.3f}".format(a_trapezio))
print("QUADRADO: {:.3f}".format(a_quadrado))
print("RETANGULO: {:.3f}".format(a_retangulo))
