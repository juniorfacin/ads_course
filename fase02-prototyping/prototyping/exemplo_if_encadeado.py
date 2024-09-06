nome = input('Por favor, digite seu nome: ')
idade = input('Por favor, digite sua idade: ')
rm = input('Digite o seu rm: ')

if int(idade) >= 18:
    print(f'Sua participação foi autorizada {nome}, RM: {rm}')
    print('Mais informações serão enviadas para o e-mail cadastrada na FIAP')
else:
    autorizacao = input('Você possui autorização? S - SIM ou N - NÃO: ')
    if autorizacao.upper() == 'S':
        print(f'Sua participação foi autorizada {nome}, RM: {rm}')
        print('Mais informações serão enviadas para o e-mail cadastrada na FIAP')
    else:
        print('Sua participação não foi aceita por causa da idade e falta de autorização.')
