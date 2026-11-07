# Clase 3

# Repaso de conjuntos

# Definir un conjunto
conjunto = set() # Este es un conjunto vacio
conjunto2 = {"bye",}
conjunto2.add(7)
conjunto2.add("Hola")
conjunto.add("hola")
print(3 not in conjunto)
print(conjunto)
print(conjunto2)

# Operacion con conjuntos

# Igualar conjuntos
print(conjunto == conjunto2)

# Elemento que tienen en comun
conjunto3 = conjunto & conjunto2
print(conjunto3)

# Esto asigna el valor que esta en conjunto y no en conjunto2
conjunto3 = conjunto - conjunto2
print(conjunto3)
conjunto3 = conjunto2 - conjunto
print(conjunto3)

# Elementos que no comparte o que son diferentes entre ambos
conjunto3 = conjunto ^ conjunto2
print(conjunto3)

# Unir conjuntos
"""conjunto3 = conjunto.union(conjunto2)
print(conjunto3)"""
conjunto3 = conjunto | conjunto2

# Verficar si un conjunto es un subconjunto dentro de otro
print(conjunto.issubset(conjunto3))
print(conjunto2.issubset(conjunto3))
print(conjunto3.issubset(conjunto))
print(conjunto3.issubset(conjunto2))

# Verificar si los elementos de un conjuntos estan dentro de otros (superconjunto)
print(conjunto3.issuperset(conjunto))
print(conjunto3.issuperset(conjunto2))
print(conjunto2.issuperset(conjunto3))
print(conjunto.issuperset(conjunto2))

# Verificar si dos conjuntos son disconexos (es decir que no contienen elementos en comun)
print(conjunto.isdisjoint(conjunto2))
print(conjunto3.isdisjoint(conjunto))

# Convertir un conjunto a INMUTABLE
conjunto = frozenset

# Repaso de Diccionarios
diccionario = {"Azul" : "Blue", "Rojo" : "Red", "Verde" : "Green", "Amarillo" : "Yellow"}
print(diccionario)

# Mostrar solo los valores de un diccionario
print(diccionario.values())

# Recorrer un diccionario y mostrar valores y llaves
for llave, valor in diccionario.items():
    print(llave, valor)

# Eliminar elemento (tambien se uede eliminar el dicionario)
del diccionario["Azul"]
print(diccionario)

diccionario2 = {
    "Juan" : {"Edad" : "18", "Altura" : "1.79"},
    "Flavio" : [18, 1.86],
    "Guille" : [17, 1.63]
}
print(diccionario2)

# Pilas usando listas
pila = [1, 2, 3]

# Agregar elemetos a la pila (en el final)
pila.append(4)
pila.append(5)
print(pila)

# Quitamos elementos desde el final
elementoBorrado = pila.pop() # Aqui quitamos el ultimo elemento y se lo asignamos a la variable
print(f"Elemento quitado: {elementoBorrado}")
print(f"La pila quedo : {pila}")

# Colas con listas
# Estructura de datos de tipo fifo (first input / first output)
cola = ["Juan", "Flavio", "Lauti"]

# Agregamos elementos al final de la cola
cola.append("Guille")
cola.append("Ana")
print(cola)

# Quitamos elementos de la cola
elementoQuitado = cola.pop(0)
print(f"\nAtendido el cliente: {elementoQuitado}")
print(f"Clientes: {cola}")
print(f"Turno de: {cola[0]}")
print("...")
elementoQuitado = cola.pop(0)
print(f"\nAtendido el cliente: {elementoQuitado}")
print(f"Clientes: {cola}")
print(f"Turno de: {cola[0]}")
print("...")
elementoQuitado = cola.pop(0)
print(f"\nAtendido el cliente: {elementoQuitado}")
print(f"Clientes: {cola}")
print(f"Turno de: {cola[0]}")
print("...")
elementoQuitado = cola.pop(0)
print(f"\nAtendido el cliente: {elementoQuitado}")
print(f"Clientes: {cola}")
print(f"Turno de: {cola[0]}")
print("...")
elementoQuitado = cola.pop(0)
print(f"\nAtendido el cliente: {elementoQuitado}")
print(f"Clientes: {cola}")