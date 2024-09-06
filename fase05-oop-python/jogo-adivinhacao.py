import random

numero_secreto = random.randint(1, 20)

print("Bem-vindo ao jogo da adivinhação!")
print("Escolha um número entre 1 e 20")

tentativas = 0
adivinhou = False

while not adivinhou:
    tentativa = int(input("Digite o seu palpite: "))
    tentativas += 1

    if tentativa == numero_secreto:
        print(f"Parabéns! Você acertou o numero secreto em {tentativas} tentativas!")
        adivinhou = True
    elif tentativa < numero_secreto:
        print("Tente um número maior.")
    else:
        print("Tente um número menor.")

