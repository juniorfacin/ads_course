lista = [10, 5, 15, 2]

maior = max(lista)
print(maior)

# conta quantas vezes um número apareceu
quantidade = lista.count(maior)
print(quantidade)

if quantidade > 1:
  print('Empate')
else:
  print(f'Houve uma vitoria que teve {maior}')