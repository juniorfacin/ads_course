valor_bruto = float(input('Por favor, informe o valor do pacote: R$ '))
categoria = input(
    'Por favor, informe a Categoria do Vôo: \nEconômica \nExecutiva \nPrimeira Classe \nOpção: ')
qtd_viajantes = int(input('Por favor, informe a quantidade de viajantes: '))

valor_desconto = 0

if categoria.upper() == 'ECONÔMICA' or categoria.upper() == 'ECONOMICA':
    if qtd_viajantes == 2:
        valor_desconto = valor_bruto * 0.03
    elif qtd_viajantes == 3:
        valor_desconto = valor_bruto * 0.04
    elif qtd_viajantes >= 4:
        valor_desconto = valor_bruto * 0.05
elif categoria.upper() == 'EXECUTIVA':
    if qtd_viajantes == 2:
        valor_desconto = valor_bruto * 0.05
    elif qtd_viajantes == 3:
        valor_desconto = valor_bruto * 0.07
    elif qtd_viajantes >= 4:
        valor_desconto = valor_bruto * 0.08
elif categoria.upper() == 'PRIMEIRA CLASSE':
    if qtd_viajantes == 2:
        valor_desconto = valor_bruto * 0.1
    elif qtd_viajantes == 3:
        valor_desconto = valor_bruto * 0.15
    elif qtd_viajantes >= 4:
        valor_desconto = valor_bruto * 0.2
else:
    print('Categoria inexistente, o desconto não será concedido')

# Cálculo dos valores
valor_liquido = valor_bruto - valor_desconto
media_viajante = valor_liquido / qtd_viajantes

print('O valor bruto da viagem é R$ {}. Após o desconto de R$ {}, o líquido será de R$ {}; o custo médio por viajante é R$ {}'.format(
    valor_bruto, valor_desconto, valor_liquido, media_viajante))
