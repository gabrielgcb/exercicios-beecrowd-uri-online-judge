"""
Com base na tabela, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme a tabela.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
"""

cod_item, qtd = input().split()
cod_item = int(cod_item)
qtd = int(qtd)

if cod_item == 1:
    valor = 4 * qtd
    print("Total: R$ {:.2f}".format(valor))
elif cod_item == 2:
    valor = 4.5 * qtd
    print("Total: R$ {:.2f}".format(valor))
elif cod_item == 3:
    valor = 5 * qtd
    print("Total: R$ {:.2f}".format(valor))
elif cod_item == 4:
    valor = 2 * qtd
    print("Total: R$ {:.2f}".format(valor))
if cod_item == 5:
    valor = 1.5 * qtd
    print("Total: R$ {:.2f}".format(valor))
