# Clase 2

# Set
planetas = {"Marte", "Jupiter", "Venus"}
print(planetas)
print(len(planetas)) # Muestra el largo, cuantos elementos hay
print("Jupiter" in planetas)

# Agregar un elemento
planetas.add("Tierra")
print(planetas)

# ELiminar un elemento
planetas.remove("Jupiter") # si el elemento no existe hay error en la ejecucion
print(planetas)
planetas.discard("saturno") # si el elemento no existe no pasa nada
print(planetas)

# Limpiar set
planetas.clear()
print(planetas)

# Eliminar set
del planetas
# print(planetas) da error, pues ya no existe el conjunto

# Diccionario
diccionario = {
    "IDE": "Integrated Development Environmet",
    "POO": "Programacion Orientada a Objetos",
    "SABD": "Sistema de Administracion de Bases de Datos"
}
print(diccionario)

# Verificar la cantidad de elementos del diccionario
print(len(diccionario))

# Acceder al diccionario con la llave/clave key
print(diccionario["POO"])

# Otra forma de acceder
print(diccionario.get("IDE"))
print(diccionario.get("SABD"))

# Modificar valor
diccionario["IDE"] = "Entorno de Desarrolo Integrado"
print(diccionario)

# Recorrer un diccionario
for clave in diccionario: # Recorremos y mostramos las claves/llave
    print(clave)

for clave, valor in diccionario.items(): # Recorremos y mostramos las claves y el valor de cada una
    print(clave, valor)

# Otras maneras de acceder a un diccionario
for clave in diccionario.keys(): # Esta funcion solo muestra las claves
    print(clave)

for valor in diccionario.values(): #Muestra solo los valores
    print(valor)

# Verificar si hay un elemento
print("POO" in diccionario)

# Agregar un elemento
diccionario["PK"] = "Primary key"
print(diccionario)

# Eliminar un elemento
diccionario.pop("SABD")
print(diccionario)

# Vaciar un diccionario
diccionario.clear()
print(diccionario)

# Eliminar un diccionario
del diccionario