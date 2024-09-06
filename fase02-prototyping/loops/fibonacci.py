qtd_elementos = int(input('Informe uma quantidade de elementos entre 1 e 10: '))
anterior1 = 1
anterior2 = 0

if qtd_elementos != 0 and qtd_elementos <= 10:
  for n_elemento in range(1, qtd_elementos + 1, 1):
    atual = anterior1 + anterior2
    anterior1 = anterior2
    anterior2 = atual
    print(atual)
else:
  print('Você digitou um número maior que 10, tente novamente!')