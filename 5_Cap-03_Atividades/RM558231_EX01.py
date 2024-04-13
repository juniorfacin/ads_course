qtd_colaboradores = int(
    input('Informe a quantidade de colaboradores que irão votar: '))

segunda = 0
terca = 0
quarta = 0
quinta = 0
sexta = 0

for _ in range(qtd_colaboradores):
    voto = int(input(
        'Escolha um dia da semana:\n1-Segunda-feira\n2-Terça-feira\n3-Quarta-feira\n4-Quinta-feira\n5-Sexta-feira:\nVoto: '))
    if voto == 1:
        segunda += 1
    elif voto == 2:
        terca += 1
    elif voto == 3:
        quarta += 1
    elif voto == 4:
        quinta += 1
    elif voto == 5:
        sexta += 1
    else:
        print('Valor não corresponde às opções de voto, tente novamente!')

total_votos = segunda + terca + quarta + quinta + sexta
mais_votado = max(segunda, terca, quarta, quinta, sexta)

if mais_votado == segunda:
    dia_mais_votado = 'Segunda-feira'
elif mais_votado == terca:
    dia_mais_votado = 'Terça-feira'
elif mais_votado == quarta:
    dia_mais_votado = 'Quarta-feira'
elif mais_votado == quinta:
    dia_mais_votado = 'Quinta-feira'
else:
    dia_mais_votado = 'Sexta-feira'

print(f'Total de votos: {total_votos}')
print(f'Dia mais votado: {dia_mais_votado} com {mais_votado} votos.')
