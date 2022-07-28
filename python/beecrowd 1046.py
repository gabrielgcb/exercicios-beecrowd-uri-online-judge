"""
Leia a hora inicial e a hora final de um jogo. 
A seguir calcule a duração do jogo, 
sabendo que o mesmo pode começar em um dia e terminar em outro, 
tendo uma duração mínima de 1 hora e máxima de 24 horas.
"""

inicio, fim = input().split()
inicio = int(inicio)
fim = int(fim)

if fim > inicio:
    tempo = fim - inicio
    print("O JOGO DUROU", tempo, "HORA(S)")
else:
    tempo = (24-inicio) + fim
    print("O JOGO DUROU", tempo, "HORA(S)")
