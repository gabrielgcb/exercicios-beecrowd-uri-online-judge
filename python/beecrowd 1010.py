"""
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, 
o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. 
Após, calcule e mostre o valor a ser pago.
"""

codigo_peca1, numero_pecas1, valor_unid1 = input().split()
numero_pecas1 = int(numero_pecas1)
valor_unid1 = float(valor_unid1)

codigo_peca2, numero_pecas2, valor_unid2 = input().split()
numero_pecas2 = int(numero_pecas2)
valor_unid2 = float(valor_unid2)

total = (numero_pecas1 * valor_unid1) + (numero_pecas2 * valor_unid2)

print("VALOR A PAGAR: R$ {:.2f}" .format(total))
