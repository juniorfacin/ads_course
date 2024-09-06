print("Bem-vindo a Tabela de Multiplicação")

for i in range (1, 10):
    print(f"\nTabuada do {i}:")
    for j in range (1, 10):
        resultado = i * j
        print(f"{i} x {j} = {resultado}")
        