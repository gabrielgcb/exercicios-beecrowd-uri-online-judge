"""
Leia um valor inteiro entre 1 e 12, inclusive. 
Correspondente a este valor, deve ser apresentado 
como resposta o mês do ano por extenso, em inglês, 
com a primeira letra maiúscula.
"""

mes = input()
mes = int(mes)

meses1 = ['January', 'February', 'March', 'April', 'May', 'June']
meses2 = ['July', 'August', 'September', 'October', 'November', 'December']
meses1.extend(meses2)

print(meses1[mes-1])
