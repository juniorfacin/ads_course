jedi = ["Yoda", "Luke", "Obi-Wan", "Anakin"]

# interação com o usuário
# Método Append
# jedi.append(input("Digite um nome para adicionarmos a lista: "))

# Método Insert
jedi.insert(2, input("Digite o nome de um Jedi: "))

for nomes in jedi:
    print(nomes)
