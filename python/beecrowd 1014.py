# Calcule o consumo médio de um automóvel sendo fornecidos a 
# distância total percorrida (em Km) e o total de combustível gasto (em litros).

distancia_total = int(input())
combustivel_gasto = float(input())

consumo = distancia_total / combustivel_gasto

print("{:.3f} km/l".format(consumo))
