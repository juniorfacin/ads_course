contadora = 1

numero = int(input('Por favor, informe um número para cálculo da tabuada: '))

while contadora <= 10:
  resultado = numero * contadora
  print(f'{numero} x {contadora} = {resultado}')
  contadora += 1
  
