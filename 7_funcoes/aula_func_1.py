# Função que calcula a velocidade media
# Lembrar que não é uma boa prática chamar uma função com inputs
def calcularVelocidadeMedia():
    distancia = float(input("Digite a distância percorrida: "))
    tempo = float(input("Digite o tempo de viagem: "))
    velocidade_media = distancia/tempo
    print(f"A velocidade média é {velocidade_media}")


# aqui começa o programa principal
calcularVelocidadeMedia()
