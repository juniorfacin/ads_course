def calcular_aliquota(valor, dias, taxa_curto_prazo, taxa_medio_prazo, taxa_longo_prazo, taxa_padrao):
    if dias <= 180:
        imposto = valor * taxa_curto_prazo
    elif 181 <= dias <= 360:
        imposto = valor * taxa_medio_prazo
    elif 361 <= dias <= 720:
        imposto = valor * taxa_longo_prazo
    else:
        imposto = valor * taxa_padrao
    return imposto


def cdb():
    dias = int(input("Digite a quantidade de dias investidos: "))
    valor = float(input("Digite o valor investido: "))
    imposto = calcular_aliquota(valor, dias, 0.225, 0.20, 0.175, 0.15)
    print(f"O valor do IR é de R$ {imposto:.2f}")


def lci():
    print("Investimento isento de Imposto de Renda.")


def lca():
    print("Investimento isento de Imposto de Renda.")


def menu():
    while True:
        aplicacao = input('''Escolha o número para cada tipo de investimento:
1 - CDB
2 - LCI
3 - LCA
4 - SAIR
Digite o número: ''')
        if aplicacao == '1':
            cdb()
        elif aplicacao == '2':
            lci()
        elif aplicacao == '3':
            lca()
        elif aplicacao == '4':
            print("Saindo...")
            break
        else:
            print("Digite um número válido")


menu()
