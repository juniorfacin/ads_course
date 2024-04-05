## Calculadora
valor1 = int(input("Digite o primeiro valor: "))
valor2 = int(input("Digite o segundo valor: "))

soma = valor1 + valor2
print("A soma entre os valoes é {}".format(soma))

subtracao = valor1 - valor2
print("A subtração entre os valores é {}".format(subtracao))

divisao = valor1 / valor2
print("O resultado da divisão dos valores é {}".format(divisao))

multiplicacao = valor1 * valor2
print("O resultado da multiplicação é {}".format(multiplicacao))

## Patinete Elétrico - Calculo de Velocidade Média
print("Este programa irá calcular a velocidade média de um patinete elétrico")
distance = float(input("Digite a distância percorrida em km: "))
time = float(input("Quantos minutos o patinete demorou para percorrer essa distância? "))
mediaSpeed = distance / time
print("O patinete atingiu uma velocidade média de {:.2f} km/h".format(mediaSpeed))

## Trocando Valores
print("Esse programa inverte os conteúdos de duas variáveis")
A = int(input("Digite o valor de A: "))
B = int(input("Digite o valor de B: "))
A = B
B = A
print("Agora que trocamos, a variável A contém {} e a variável B contém {}".format(A, B))