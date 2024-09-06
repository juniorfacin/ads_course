while True:
    numero = int(input("Digite um número inteiro: "))
    
    if numero <= 1:
        print("Número inválido! Digite um número maior que 1!")
        continue

    isPrimo = True  # Inicializando a variável como True

    for i in range(2, numero):
        if numero % i == 0:
            isPrimo = False
            break
    
    if isPrimo:
        print(f"O número {numero} é primo.")
    else:
        print(f"O número {numero} não é primo.")
    
    break
