"""
A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:

Salário	Percentual de Reajuste
0 - 400.00          15%
400.01 - 800.00     12%
800.01 - 1200.00    10% 
1200.01 - 2000.00   7%
Acima de 2000.00    4% 

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.
"""

salario = input()
salario = float(salario)

if salario <= 400:
    novoSalario = salario * 1.15
    reajuste = novoSalario - salario
    percentual = 15
    print("Novo salario: {:.2f}".format(novoSalario))
    print("Reajuste ganho: {:.2f}".format(reajuste))
    print("Em percentual:", percentual, "%")
    
elif salario <= 800:
    novoSalario = salario * 1.12
    reajuste = novoSalario - salario
    percentual = 12
    print("Novo salario: {:.2f}".format(novoSalario))
    print("Reajuste ganho: {:.2f}".format(reajuste))
    print("Em percentual:", percentual, "%")
    
elif salario <= 1200:
    novoSalario = salario * 1.10
    reajuste = novoSalario - salario
    percentual = 10
    print("Novo salario: {:.2f}".format(novoSalario))
    print("Reajuste ganho: {:.2f}".format(reajuste))
    print("Em percentual:", percentual, "%")
    
elif salario <= 2000:
    novoSalario = salario * 1.07
    reajuste = novoSalario - salario
    percentual = 7
    print("Novo salario: {:.2f}".format(novoSalario))
    print("Reajuste ganho: {:.2f}".format(reajuste))
    print("Em percentual:", percentual, "%")
    
else:
    novoSalario = salario * 1.04
    reajuste = novoSalario - salario
    percentual = 4
    print("Novo salario: {:.2f}".format(novoSalario))
    print("Reajuste ganho: {:.2f}".format(reajuste))
    print("Em percentual:", percentual, "%")
