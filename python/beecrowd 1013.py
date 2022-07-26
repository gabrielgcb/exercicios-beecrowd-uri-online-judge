# Faça um programa que leia três valores a, b, c e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”.

a, b, c = input().split()

a = int(a)
b = int(b)
c = int(c)

maior_ab = (a + b + abs(a - b)) / 2
maior = (c + maior_ab + abs(c - maior_ab)) / 2
maior = int(maior)

print(maior, "eh o maior")
