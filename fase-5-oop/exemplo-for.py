import random

# # Exemplo de FOR em Python
# for numero in range(1, 11):
#     print(f"Contagem: {numero}")

## Sistema de Média de Notas

def sistema_de_notas():
    lista_de_notas = []
    soma_das_notas = 0

    for _ in range (10):
        nota_aleatoria = random.randint(1,10)
        lista_de_notas.append(nota_aleatoria)
        soma_das_notas += nota_aleatoria

    print(f"Lista de Notas: ", lista_de_notas)

    media_das_notas = soma_das_notas / len(lista_de_notas)
    print(f"Média da Notas: {media_das_notas}")

sistema_de_notas()
