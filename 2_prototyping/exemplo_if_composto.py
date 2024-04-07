rm = input("Insira seu RM: ")
idade = input("Insira a sua idade:")

if int(idade) >= 18:                                                  # desvio condicional simples (if)
  print('Sua participação foi autorizada, aluno de RM {}!'.format(rm))
  print('Mais informações serão enviadas para seu e-mail cadastrado!')
else:
  print('Sua participação não foi autorizada por causa da idade')     # desvio condicional composto (if else)