# informe a quantidade de alimentos
qtd_alimentos = int(input('Por favor, informe a quantidade de alimenetos consumidos: '))

# responsável por armazenar o total de calorias
total_calorias = 0

for alimentos in range(1, qtd_alimentos + 1, 1):
    calorias = int(input('Informe a quantidade de calorias do alimento {}: '.format(alimentos)))
    total_calorias = total_calorias + calorias

print('Foram consumidas {} calorias.'.format(total_calorias))