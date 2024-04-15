preco_inicial = float(input("Digite o valor inicial: "))

parcelas_percentuais = {6: 0.03, 12: 0.06, 18: 0.09, 24: 0.12,
                        30: 0.15, 36: 0.18, 42: 0.21, 48: 0.24, 54: 0.27, 60: 0.30}

valor_desconto = preco_inicial * 0.8
print(f'O preço à vista, com 20% de desconto, será R$ {valor_desconto}.')

for parcelas, percentual in parcelas_percentuais.items():
    valor_final = preco_inicial * (1 + percentual)
    valor_parcela = valor_final / parcelas
    print(f"O preço final parcelado em {parcelas} X será R${
          valor_final:.2f}, em {parcelas} de R${valor_parcela:.2f}")
