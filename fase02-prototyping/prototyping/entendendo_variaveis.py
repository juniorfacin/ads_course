x = 10
y = 30.7 
z = "Teste"

print(type(x))
print(type(y))
print(type(z))

print(x)
x = float(x)
print(x)
print(type(x))

print(y)
y = int(y) # O que vem depois do . é desconsiderado
print(y)
print(type(y))

print(z)
print(len(z))
print(z.upper())
print(z.lower())
print(z.split("s"))
