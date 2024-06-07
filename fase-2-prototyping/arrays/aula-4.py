# Outros métodos - coringas
valores = [1, 7, 7, 19, 3, 2, 11, 15, 6, 1, 5]
print("A lista foi criada assim: {}".format(valores))

contagem = valores.count(7)
print(f"Nessa lista o n. 7 aparece {contagem} vezes")

valores.reverse()
print(f"A lista agora está invertida: {valores}")

valores.sort()
print(f"A lista agora está ordenada: {valores}")

# ordenar de maneira decrescente
valores.sort(reverse=True)
print(f"Agora a lista está ordenada de forma decrescente: {valores}")
