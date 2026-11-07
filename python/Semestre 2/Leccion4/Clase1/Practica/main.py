#Clase 1
# lista = Ariel, Liliana, Natalia, Osvaldo
from selectors import SelectSelector

nombres = ['Naty','Osvaldo','Lily', 'Ariel' ]
print(nombres)
print(nombres[0])
print(nombres[1])
print(nombres[3])
print(nombres[-1])
print(nombres[-2])
print(nombres[0:2]) #solo muestra el indice 0, 1 pero no el indice 2
#ir del inicio de la lista al indice (sin incluirlo)
print(nombres[:3])
#desde el indice indicado hasta el final
print(nombres[1:])
#modificamos un valor
nombres[2] = 'Liliana'
nombres[0] = 'Natalia'
print(nombres)
#iterar una lista
for nombre in nombres: #nombre es singular la lista es pluralo
    print(nombre)
else:
    print( 'se acabaron los elementos de la lista')
#preguntamos cuantos elementos tiene
print(len(nombres)) #le pasamos como parametro la lista
#agregamos un elemento
nombres.append('Marcelo')
print(nombre)

#Insertar un elemento en un indice especifico
nombres.insert(1,'Alberto')
print(nombres)
nombres.insert(3,'debora')
print(nombres)
#Eliminamos un elemento
nombres.remove('Alberto')
print(nombres)

#Eliminar el ultimo elemento (que hay en la lista no el ultimo ingresado)
nombres.pop()
print(nombres)
#Eliminar un indice especifico
del nombres[2] #del significa delete
print(nombres)

#Eliminar, borrar o limpiar todos lo elementos
nombres.clear()
print(nombres)

# Eliminar lista
del nombres
# print(nombres) # da eror pues la lista fue eliminada en al linea 57

# Concatenar listas
lista1 = [1, 2, 2]
lista2 = [4, 5, 6]
lista3 = lista1 + lista2
print("Lista concatenada: ", lista3)

# Agregar varios elementos a una lista
lista3.extend([7, 8, 9])
print(lista3)

# Funcion para saber en que indice esta un elemento
print(lista3.index(5))

# Funcion para saber cuantos valores estan repetidos en una lista
print(lista3.count(2))

# Funcion para poner una lista al revez
lista3.reverse()
print(lista3)

# Funcion para que una lista se multiplique repitiendo sus elementos
lista3 *= 2
print(lista3)

# Metodos de ordenamiento:

# Ascendente
lista3.sort()
print(lista3)

# Descendente
lista3.sort(reverse=True)
print(lista3)

# Tuplas

# Definir tupla
cocina = ("cuchara", "cuchillo", "tenedor")
print("\n", len(cocina))

# Acceder a un elemento
print(cocina[0])
print(cocina[-1]) # ultimo elemento

# Acceder a un rango
print(cocina[0:2])

# Nota: una tupla, aunque sea de un solo elemento siempre necesita una coma, de lo contrario seria una cadena
verduras = ("papa") #Cadena
verduras1 = ("papas",) #Tupla

# Recorrer elementos de una tupla
for cocinar in cocina:
    print(cocinar, end=" ") # Para mostrar elementos de una tupla y que se impriman en una sola linea utilizamos: end=""

# NOTA: Las tuplas en si son inmutables, no se pueden modificar. En cualquier caso que sea necesario modificarla este es el procedimiento
# de conversion a realizarse, sin embargo no es una buena practia
cocinaLista = list(cocina)
cocinaLista[0] = "plato"
cocina = tuple(cocinaLista)
print("\n", cocina) # "\n" sirve para anular end=""

# Eliminar tupla:
# del cocina

tupla = (4, "hola", 10.45,[1, 7, 3], True, 4, "tupla") # Las tuplas pueden contener distintos tipos de datos
print(tupla)

print(4 in tupla) # Verificar si un elemento existe dentro de una tupla

# Funciones que pueden utilizarse dentro de las tuplas: index, count, len
print(tupla.index("hola"))
print(tupla.count(4))
print(len(tupla))
# Se puede hacer la conversion de tuplas a lista y viceversa
listaN = tuple(tupla) # De tupla a lista
print("Lista: ", listaN)
tupla = tuple(listaN) # De lista a tupla
print("Tupla: ", tupla)