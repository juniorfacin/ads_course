valor = float(input('Divida: '))
juros = 0.03
quantidade = 1
while quantidade <= 12:
    valor += valor * juros
    print(f'{valor:.2f}')
    quantidade += 1
    juros += 0.03
    