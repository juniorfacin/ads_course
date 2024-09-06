# Solicitando os dados do cliente
valor_compra = input('Informe o valor da compra realizada: ')
cupom = input('Digita o cupom de desconto: ')

# usamos a função upper para converter a string em letras maiúsculas
if cupom.upper() == 'NIVER10':
    # cálculo de 10% de desconto
    valor_final = float(valor_compra) * 0.9
else:
    valor_final = float(valor_compra)
    print = ('Cupom inválido')

# Exibindo o valor final da compra
print(f'O valor final da compra é {valor_final}')
