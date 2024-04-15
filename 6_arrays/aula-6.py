# estrutura de Menu
opcao = -1

# usar lista para armazenar cada uma das litas
notas = []

while opcao != 4:
    print("1- Cadastrar nota \n2- Exibir Notas \n3- Calcular Média \n4- Sair")
    opcao = int(input("Informe a opção desejada: "))

    if opcao == 1:
        nota = float(input("Por favor, informe a nota do aluno: "))
        notas.append(nota)
    elif opcao == 2:
        print("As notas da turma são: ")
        for nota in notas:
            print(nota)
    elif opcao == 3:
        # soma = 0
        # for nota in notas:
        #     soma = soma + nota
        # media = soma / len(notas)
        media = sum(notas) / len(notas)
        print(f"A medida das notas: {media}")
    elif opcao == 4:
        print("Sainda")
    else:
        print("Opção inválida")
