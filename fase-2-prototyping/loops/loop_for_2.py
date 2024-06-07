# contar números impares de 1 até 100
# entendendo os argumentos (inicial, final e intervalo)
# for contadora in range(1, 101, 2):
#     print(contadora)

# Melhorando nossa tabuada
n = int(input('Informe o valor qual deseja obter a tabuada: '))
for contadora in range (n, n * 10 + 1, n):
    print(contadora)
