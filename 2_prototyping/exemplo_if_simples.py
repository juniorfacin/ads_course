rm = input("Insira seu RM: ")
idade = input("Insira a sua idade:")

# desvio condicional simples (if)
if int(idade) >= 18:
    print('Sua participação foi autorizada, aluno de RM {}!'.format(rm))
    print('Mais informações serão enviadas para seu e-mail cadastrado!')
