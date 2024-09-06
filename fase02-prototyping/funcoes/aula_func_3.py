def calcularVelocidadeMedia(distancia, tempo):
    # conversão de tempo

    if "h" in temp:
        tempo_em_horas = float(temp.rstrip("h"))
    else:
        tempo_em_minutos = float(temp.rstrip("m"))
        tempo_em_horas = tempo_em_minutos / 60

    # calcular a media
    velocidade_media = dist / tempo_em_horas
    print(f"A velocidade média é {velocidade_media} kmk/h!")


# Inicio do programa
dist = float(input("Informe a distância percorrida em KM: "))
temp = input("Informe o tempo no seguinte formato 00h(horas) ou 00m(min): ")

calcularVelocidadeMedia(dist, temp)
