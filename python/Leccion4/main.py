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

#Eliminar la lista
del nombres
print(nombres)
