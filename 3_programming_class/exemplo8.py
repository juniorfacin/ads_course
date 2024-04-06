# LISTA (armazena uma sequência)

lista = ['Paulo', 'Ana', 'João', 10, 4, 60]
print(lista)

# indice de uma lista representa as posições de cada índice em uma lista
# A lista sempre começa no índice 0
print(lista[0])

# altera um item da lista
lista[0] = 100
print(lista)

# inserir um item na lista
lista.append(500)
lista.append(600)
print(lista)

# printar item a item
lista = [10, 5, 15, 25, 40]
conta_par = 0
for item in lista:
  if item % 2 == 0:
    conta_par += 1
print(f'Quantidade de pres: {conta_par}')

# lsita vazia para preenchimento com for
for i in range(10):
  numero = int(input('Numero: '))
  lista.append(numero)
print(lista)