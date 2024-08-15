print("Bem-vindo ao Café Python!")
print("Escolha o tamanho do seu café: (P) Pequeno, (M) Médio, (G) Grande")
tamanho_cafe = input("Escolha o tamanho do café:").upper()

print("Escolha o tipo de café: (E) Expresso, (C) Cappuccino, (L) Latte")
tipo_cafe = input("Escolha o tipo do café: ").upper()

preco = 0

match tamanho_cafe:
        case "P":
            preco += 2.50
        case "M":
            preco  += 3.00
        case "G":
            preco += 3.50
        case _:
            print("Opção de tamanho inválida.")
            exit()

match tipo_cafe:
    case "E":
         preco += 1.50
         print("Café Expresso selecionado")
    case "C":
          preco += 2.00
          print("Café Capuccino selecionado")
    case "L":
          preco += 2.50
          print("Café Latte selecionado")
    case _:
          print("Opção inválida!")
          exit()

print("Seu pedido foi confirmado!")
print(f"Total à pagar: R$ {preco}")
