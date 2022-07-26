"""
Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. 
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. 
Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
"""

nota_A = float(input())
nota_B = float(input())
nota_C = float(input())

media = (nota_A*2 + nota_B*3 + nota_C*5) / 10

print("MEDIA = {:.1f}" .format(media))
