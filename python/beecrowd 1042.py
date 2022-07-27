"""
Leia 3 valores inteiros e ordene-os em ordem crescente. 
No final, mostre os valores em ordem crescente,
uma linha em branco e em seguida, 
os valores na sequência como foram lidos.
"""

n1, n2, n3 = input().split()
n1 = int(n1)
n2 = int(n2)
n3 = int(n3)
lista = [n1, n2, n3]

N1 = n1
N2 = n2
N3 = n3
novaLista = [N1, N2, N3]

i = 0
for elem in novaLista:
    j = i + 1
    while j < 3:
        if novaLista[j] < novaLista[i]:
            aux = novaLista[j]
            novaLista[j] = novaLista[i]
            novaLista[i] = aux
        j += 1
    i += 1

print(novaLista[0])
print(novaLista[1])
print(novaLista[2])
print()
print(lista[0])
print(lista[1])
print(lista[2])
