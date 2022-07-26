"""
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias.
Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. 
Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. 
Este é apenas um exercício com objetivo de testar raciocínio matemático simples.
"""

idade_dias = input()
idade_dias = int(idade_dias)

i_anos = idade_dias // 365
idade_dias = idade_dias % 365
i_meses = idade_dias // 30
idade_dias = idade_dias % 30

print(i_anos, "ano(s)")
print(i_meses, "mes(es)")
print(idade_dias, "dia(s)")
