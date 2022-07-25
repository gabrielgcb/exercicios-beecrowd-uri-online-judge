"""
A fórmula para calcular a área de uma circunferência é: area = pi * raio^2. 
Considerando para este problema que pi = 3.14159:
  - Leia o valor do raio da circuferência;
  - Efetue o cálculo da área, elevando o valor do raio ao quadrado e multiplicando por pi.
"""

raio = input()
raio = float(raio)

Area = 3.14159 * raio**2
print("A = {:.4f}" .format(Area))
