valor_divida = float(input("Digite o valor da dívida: "))
taxa_juros = {3: 0.10, 6: 0.15, 9: 0.20, 12: 0.25}

print(f"Total: R$ {valor_divida:.2f} Juros: R$ 0,00 Número de parcelas: 1 Valor da Parcela: R$ {
      valor_divida:.2f}")

for parcelas in range(3, 13, 3):
    valor_atualizado = valor_divida * (1 + taxa_juros[parcelas])
    juros = valor_atualizado - valor_divida
    parcela = valor_atualizado / parcelas
    print(f"Total: R$ {valor_atualizado:.2f} Juros: R$ {
          juros:.2f} Número de parcelas: {parcelas} Valor da Parcela: R$ {parcela:.2f}")
