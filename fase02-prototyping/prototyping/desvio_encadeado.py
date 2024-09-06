# Operadora de Celular -  Bônus
# 1000 3GB / 500 1,5GB / 200 500MB / < 200 nenhum bônus

pontos = int(input('Informe a quantidade de pontos do cliente: '))
if pontos >= 1000:
    print('O cliente recebe 3GB adicionais!')
elif pontos >= 500:
    print('O cliente recebe 1,5GB adicionais!')
elif pontos >= 200:
    print('O cliente recebe 500MB adicionais!')
else:
    print('O cliente não recebe dados adicionais')
