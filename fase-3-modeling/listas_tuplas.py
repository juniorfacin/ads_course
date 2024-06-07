# Primeiro, importar o módulo (instalado por padrão no Python)
import sys

# Depois criamos algumas variáveis de exemplo
nome = 'Bruce Wayne'
idade = 30
peso = 110.5

#Vamos exibir em uma mensagem o nome da variável, o tipo (type) e o tamanho (getsizeof) 
print("A variável nome é do tipo {} e tem {} bytes".format(type(nome), sys.getsizeof(nome))) 
print("A variável idade é do tipo {} e tem {} bytes".format(type(idade), sys.getsizeof(idade))) 
print("A variável peso é do tipo {} e tem {} bytes".format(type(peso), sys.getsizeof(peso)))

# Aplicar a mesma lógica para entender o tamanho de uma lista (vazia)
#primeiro importamos o módulo sys 
import sys 
#agora vamos criar uma lista vazia 
lista = [] 
#E verificar o tamanho 
print("O objeto lista é do tipo {} e tem {} bytes".format(type(lista), sys.getsizeof(lista)))

# Criação de uma tupla em Linguagem Python
categorias = ("Youngling", "Padawan", "Knight", "Master") 
#exibindo a tupla inteira -> ('Youngling', 'Padawan', 'Knight', 'Master') 
print(categorias) 
#exibindo o segundo item da tupla -> Padawan 
print(categorias[1]) 
#usando um índice negativo para exibir o último item da tupla -> Master 
print(categorias[-1])

# Exibindo cada item de uma tupla com um loop
for categoria in categorias:
    print(categoria)

# utilizando o módulo sys para conseguirmos usar o getsizeof.
# criando uma lista e uma tupla vazias, respectivamente 
lista_vazia = [] 
tupla_vazia = () 
#printando o tipo e tamanho de cada estrutura 
print("O objeto lista_vazia é do tipo {} e ocupa {} bytes na memória".format(type(lista_vazia), 
sys.getsizeof(lista_vazia))) 
print("O objeto tupla_vazia é do tipo {} e ocupa {} bytes na memória".format(type(tupla_vazia), 
sys.getsizeof(tupla_vazia))) 