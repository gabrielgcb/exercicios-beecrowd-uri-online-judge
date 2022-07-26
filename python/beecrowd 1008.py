"""
Escreva um programa que:
- leia o número de um funcionário, 
- o seu número de horas trabalhadas, 
- o valor que recebe por hora e 
- calcule o salário desse funcionário. 
A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
"""

numero_funcionario = int(input())
horas_trabalhadas = int(input())
valor_hora = float(input())

salario = horas_trabalhadas * valor_hora

print("NUMBER =", numero_funcionario)
print("SALARY = U$ {:.2f}".format(salario))
