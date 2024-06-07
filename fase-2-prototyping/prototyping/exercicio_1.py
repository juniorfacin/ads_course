# Verificar os batimentos cardíacos

idade = int(input('Informe a sua idade: '))
bpm = int(input('Informe o número de Batimentos por Minuto(BPM): '))

if idade <= 2:
    if bpm >= 120 and bpm <= 140:
        print('Frequência cardíaca adequada para 2 anos.')
    else:
        print('Frequência cardíaca inadequada para 2 anos.')
elif idade >= 8 and idade <= 17:
    if bpm >= 80 and bpm <= 100:
        print('Frequência cardíaca adequada de 8 anos até 17 anos.')
    else:
        print('Frequência cardíaca inadequada de 8 anos até 17 anos.')
elif idade >= 18 and idade < 60:
    if bpm >= 70 and bpm <= 80:
        print('Frequência cardíaca adequada para um Adulto Sedentário.')
    else:
        print('Frequência cardíaca inadequada para um Adulto Sedentário.')
elif idade >= 60:
    if bpm >= 50 and bpm <= 60:
        print('Frequência cardíaca adequada para um Idoso.')
    else:
        print('Frequência cardíaca inadequada para um Idoso.')
else:
    print('Não existem dados para a idade informada, tente')
