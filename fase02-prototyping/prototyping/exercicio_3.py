voto1 = input(('Escolha um console: PLAYSTATION, XBOX ou NINTENDO: '))
voto2 = input(('Escolha um console: PLAYSTATION, XBOX ou NINTENDO: '))
voto3 = input(('Escolha um console: PLAYSTATION, XBOX ou NINTENDO: '))
voto4 = input(('Escolha um console: PLAYSTATION, XBOX ou NINTENDO: '))
voto5 = input(('Escolha um console: PLAYSTATION, XBOX ou NINTENDO: '))

# Variável para armazenar os votos em cada console
playstation = 0
xbox = 0
nintendo = 0

# Verificador de votos, que irá se repetir para os 05
if voto1.upper() == 'PLAYSTATION':
    playstation += 1
elif voto1.upper() == 'XBOX':
    xbox += 1
elif voto1.upper() == 'NINTENDO':
    nintendo += 1
else:
    print('A opção de voto do colaborador 1 não é válida, tente novamente!')

if voto2.upper() == 'PLAYSTATION':
    playstation += 1
elif voto2.upper() == 'XBOX':
    xbox += 1
elif voto2.upper() == 'NINTENDO':
    nintendo += 1
else:
    print('A opção de voto do colaborador 2 não é válida, tente novamente!')

if voto3.upper() == 'PLAYSTATION':
    playstation += 1
elif voto3.upper() == 'XBOX':
    xbox += 1
elif voto3.upper() == 'NINTENDO':
    nintendo += 1
else:
    print('A opção de voto do colaborador 3 não é válida, tente novamente!')


if voto4.upper() == 'PLAYSTATION':
    playstation += 1
elif voto4.upper() == 'XBOX':
    xbox += 1
elif voto4.upper() == 'NINTENDO':
    nintendo += 1
else:
    print('A opção de voto do colaborador 4 não é válida, tente novamente!')

if voto5.upper() == 'PLAYSTATION':
    playstation += 1
elif voto5.upper() == 'XBOX':
    xbox += 1
elif voto5.upper() == 'NINTENDO':
    nintendo += 1
else:
    print('A opção de voto do colaborador  não é válida, tente novamente!')

if playstation > xbox and playstation > nintendo:
    print('O console vencedor foi o PlayStation')
elif xbox > playstation and xbox > nintendo:
    print('O console vencedor foi o Xbox')
elif nintendo > playstation and nintendo > xbox:
    print('O console vencedor foi o Nintendo')
else:
    print('Houve um empate, entre em contato com a direção!')
