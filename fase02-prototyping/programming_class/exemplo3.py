# Solicitar 10 números inteiros e contar quantos desses números são pares

cont = 0                   # contadora (a quantidade de repetições)
conta_par = 0              # contadora (a quantidade de números pares digitados)

while cont < 10:
  numero = int(input('Digite um número: '))
  if numero % 2 == 0:
      conta_par += 1
  cont += 1

print(f'Quantidade de Pares: {conta_par}')