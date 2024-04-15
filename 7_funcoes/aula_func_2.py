# Função que soma 2 valores
def somarValores():
    valor1 = int(input("Digite o primeiro valor: "))
    valor2 = int(input("Digite o segundo valor: "))

    soma = valor1 + valor2
    print(soma)


print("Primeira linha executada!")
# início do programa principal
somarValores()

# o programa executada toda a função antes de iniciar essa linha
print("Quando essa linha rodou?")
