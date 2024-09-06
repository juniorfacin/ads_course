# Implementar uma calculadora (soma, subtração, multiplicação, divisão)

while True:
  a = float(input('Digite um número: '))
  b = float(input('Digite outro número: '))

  print('1 - Soma')
  print('2 - Subtração')
  print('3 - Multiplicação')
  print('4 - Divisão')
  print('5 - Finalizar')
  opcao = int(input('Escola uma das opções acima: '))

  if opcao == 1:
    print(f'Resultado da soma: {a + b}')
  elif opcao == 2:
    print(f'Resultado da subtração: {a - b}')
  elif opcao == 3:
    print(f'Resultado da multiplicação: {a * b}')
  elif opcao == 4:
    print(f'Resultado da subtração: {a / b}')
  elif opcao == 5:
    print('Fim do programa!')
    break                   # finaliza o programa
  else:
    print('Opção inválida')

