"""
Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. 
Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:
Perimetro = XX.X

Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, 
mostrando a mensagem
Area = XX.X
"""

a, b, c = input().split()
a = float(a)
b = float(b)
c = float(c)

if (a+b) > c and (b+c) > a and (c+a) > b:
    perimetro = a+b+c
    print("Perimetro = {:.1f}".format(perimetro))
else:
    area = ((a+b)*c) / 2
    print("Area = {:.1f}".format(area))
