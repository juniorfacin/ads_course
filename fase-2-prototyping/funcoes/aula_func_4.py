def calcularVelocidadeMedia(distancia, tempo):
    velocidade_media = distancia / tempo
    return velocidade_media


dist = float(input("Informe a distância: "))
temp = float(input("Informe o tempo: "))

print(f"A velocidade média é {calcularVelocidadeMedia(dist, temp)}.")
