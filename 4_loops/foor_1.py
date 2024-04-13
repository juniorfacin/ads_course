#variavel para armazenar o peso total das caixas
peso_total = 0

for x in range (1, 11):
    peso_atual = float(input('Informe o peso da caixa atual: '))
    peso_total = peso_total + peso_atual

media = peso_total / 10
print(f'O peso total das caixas é {peso_total}. A média de peso é {media}')