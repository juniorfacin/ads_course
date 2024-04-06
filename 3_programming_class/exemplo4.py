# Solicitar as notas de N alunos e calcular a média da turma

quantidade = int(input('Informe a quantidade de alunos: '))
cont = 0        # variável contadora (conta a quantidade de repetições)
soma = 0        # variável somadora (ou acumuladora) / somar todas as notas dos alunos

while cont < quantidade:       # De acordo com a quantidade que o usuário informar
  nota = float(input('Informe a nota: '))
  soma += nota
  cont += 1

print(f'Somatório das notas: {soma}')

media = soma / quantidade
print(f'Média das notas da turma: {media}')



