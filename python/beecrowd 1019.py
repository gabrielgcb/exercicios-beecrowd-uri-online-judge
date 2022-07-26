"""
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, 
e informe-o expresso no formato horas:minutos:segundos.
"""

tempo_segundos = input()
tempo_segundos = int(tempo_segundos)

resto_hora = tempo_segundos // 3600
resto_minuto = (tempo_segundos - (3600*resto_hora)) // 60
resto_segundo = (tempo_segundos - 3600) % 60

print(resto_hora, resto_minuto, resto_segundo, sep=':')
