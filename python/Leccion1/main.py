'''
miVariable = 3
print(miVariable)
miVariable = "Hola a todos los estudiantes de la tecnicatura"
print(miVariable)
miVariable = 3.5
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x + y
print(id(x))
#Las literales se escriben x736, la variable y = x984
print(id(y))
print(id(z))

# tipos int, float , String, bool
x = 10
print(x)
print(type(x))
x = "Hola alumnos"
print(type(x))
x = True
print(x)
print(type(x))

x= False
print(x)
print(type(x))

# manejo de cadenas(String)
miGrupoFavorito = "Joy Division "
caracteristicas = "The Best Rock Band"
print("Mi grupo favorito es: "+miGrupoFavorito, caracteristicas)
numero1 = "7"
numero2 = "8"
print(int(numero1) + int(numero2))

#tipos Boleanos (bool)
miBooleano = 3 > 2
print(miBooleano)

if miBooleano:
    print("El resultado es verdadero")
else:
    print("El resultado es falso")

    #Procesar la entrada del usuario
    #Funcion input

resultado = input("Digite un numero: ") # regresa un dato tipo string
print(resultado)


# Conversion de la entrada de datos
numero1 = int(input("Escribe el primer numero:"))
numero2 = int(input("Escribe el segundo numero:"))
resultado = numero1 + numero2
print("El resultado de la suma es: ",resultado)
'''
"""

operandoA = 8
operandoB = 5
suma = operandoA + operandoB
#print("El resultado de la suma es: ",suma)
print(f'El resultado de la suma es: {suma}')

resta = operandoA - operandoB
print(f'El resultado de la resta es: {resta}')

multiplicacion = operandoA * operandoB
print(f'El resultado de la multiplicacion es: {multiplicacion}')

division = operandoA / operandoB
print(f'El resultado de la division es: {division}')

division = operandoA // operandoB
print(f'El resultado de la division es: {division}')

modulo = operandoA % operandoB
print(f'El resultado de la modulo es: {modulo}')

exponente = operandoA ** operandoB
print(f'El resultado de la exponente es: {exponente}')
"""
'''
operandoA = 8
operandoB = 5
alto = int(input("Proporciona el alto del rectangulo: "))
ancho = int(input("Proporciona el ancho del rectangulo: "))
area = alto * ancho
perimetro = (alto + ancho) * 2
print("Area: ",area)
print("Perimetro: ",perimetro)
'''
"""
operandoA = 8
operandoB = 5
miVariable3 = 10
print(miVariable3)

# operadores de reasignacion
miVariable3 = miVariable3 + 1
print(miVariable3)
miVariable3 += 1
print(miVariable3)

miVariable3 -= 2
print(miVariable3)

#miVariable3 = miVariable3 * 3
miVariable3 *= 3
print(miVariable3)

#miVariable3 = miVariable3 / 2
miVariable3 /= 2
print(miVariable3)

# Operadores de comparacion
d = 4
b = 2
resultado = d == b #comprobamos si son iguales
print(resultado)

#Operador diferente
resultado = d != b
print(resultado)

# Operador mayor que
resultado = d > b
print(resultado)
# Operador menor que
resultado = d < b
print(resultado)

# Operador menor o igual
resultado = d <= b
print(resultado)

# Operado mayor o igual que
resultado = d >= b
print(resultado)
"""
'''
operandoA = 8
operandoB = 5'
a = int(input("Digite un numero: "))
print(f"El residuo de la division es: {a % 2}")
if a % 2 == 0:
    print(f"El valor de a es:{a} es un numero PAR")
else:
    print(f"El valor de a es: {a} no es un numero IMPAR")
'''
'''
operandoA = 8
operandoB = 5

edadAdulto = 18
edadPersona = int(input("Digite su edad: "))
if edadPersona >= edadAdulto:
    print(f"Su edad es:{edadPersona} años, usted es mayor de edad")
else:
    print(f"Su edad es:{edadPersona} años, usted  es menor de edad")
'''
# Operadores Logicos
'''
a = False
b = True
resultado = a and b
print(resultado)

# Operador or

resultado = a or b
print(resultado)

# Operador not
resultado = not a
print(resultado)
'''
'''
# Ejercicio valor dentro de un rango
valor = int(input("Digite un numero dentro del rango de 0 a 5: "))
valorMinimo = 0
valorMaximo = 5
dentroRango = (valor >= valorMinimo and valor <= valorMaximo)
if dentroRango:
    print(f"El valor es {valor}esta dentro del rango")
else:
    print(f"El valor es {valor} no esta dentro del rango")
'''
   # Ejercicio con el operador or, operador not
'''
vacaciones = True
diaDescanso = True
if not (vacaciones or diaDescanso):
    print('Tiene trabajo que hacer')
else:
    print('Puede asistir al juego')
    '''
''''
# Ejercicio: Rango entre 20 y 30 años
edad = int(input("Digite su edad: "))
veinte = edad >= 20 and edad < 30
print(veinte)
treinta = edad >= 30 and edad < 40
print(treinta)

#if veinte :
  #  print("Estas dentro del rango de los (20\'0)")
#elif treinta :
 #   print("Estas dentro del rango de los (30\'0)")

#else:
#   print("No estas dentro del rango de los (20'0) a (30'0)")
#Sintaxis simplificada
   #If veinte or treinta
if (20 <=  edad < 30) or (30 <=  edad < 40):
    print("Estas dentro del rango de los (20\'0) a (30'0)")

'''
'''
#Ejercicio: El mayor de dos numeros
numero1 = int(input("Digite el valor para el numero1: "))
numero2 = int(input("Digite el valor para el numero2: "))

if numero1 > numero2:
    print("El numero mayor es el numero1")
else:
    print("El numero mayor es el numero2")
    '''
'''
# Ejercicio tienda de libros
print("Digite los siguientes datos del libro")
nombre = input("Ingrese nombre del libro: ")
id = int(input("Ingrese el id del libro: "))
precio = float(input("Ingrese el precio del libro: "))
envioGratuito = input("Indicar si  el envio de gratuito: ")
if envioGratuito == True:
    envioGratuito = True
elif envioGratuito == False:
    envioGratuito = False
else:
    envioGratuito = "El valor es incorrecto, debe escribir True/False"
    print(f
        Nombre: {nombre}
        Id: {id}
        precio: {precio}
        envioGratuito: {envioGratuito}
        ''')''' 
        

















