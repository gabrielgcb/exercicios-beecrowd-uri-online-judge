"""
Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados. 
A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:
se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
"""

a, b, c = input().split()
a = float(a)
b = float(b)
c = float(c)

lista = [a, b, c]

i = 0
for n in lista:
    j = i+1
    while j < 3:
        if lista[j] > lista[i]:
            aux = lista[j]
            lista[j] = lista[i]
            lista[i] = aux
        j += 1
    i += 1
a = lista[0]
b = lista[1]
c = lista[2]

cont = 1
while cont == 1:
    if a >= (b+c):
        print("NAO FORMA TRIANGULO")
        break
    if a**2 == (b**2 + c**2):
        print("TRIANGULO RETANGULO")
    if a**2 > (b**2 + c**2):
        print("TRIANGULO OBTUSANGULO")
    if a**2 < (b**2 + c**2):
        print("TRIANGULO ACUTANGULO")
    if a == b == c:
        print("TRIANGULO EQUILATERO")
    if a == b and a != c or b == c and c != a:
        print("TRIANGULO ISOSCELES")
    cont += 1
