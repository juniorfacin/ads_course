# Uma loja concede descontos para compras pagas com cartão de crédito e com valor superior a R$ 100,00

valor_compra = float(input('Por favor, informe o total de compra: '))

forma_pagamento = int(input(
    'FORMA DE PAGAMENTO\n 1-CARTÃO DE CRÉDITO \n 2-DINHEIRO\n Informe a forma adotada: '))

if valor_compra > 100 and forma_pagamento == 1:
    valor_compra = valor_compra * 0.9
    print('O cliente tem direito a desconto!')

print('O valor da compra é de {}'.format(valor_compra))
print(f'O valor da compra é de {valor_compra}')
