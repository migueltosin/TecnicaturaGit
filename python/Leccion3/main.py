# Ciclo while (Mientras o durante)

#contador = 0

#while contador < 3:
#    print('Ejecutamos nuestro ciclo while', contador)
#   contador += 1
#else:
#   print('Fin del ciclo while')

#Imprimir numeros del 0 al 5 con el ciclo while
# maximo = 5
# contador = 0
# while contador <= maximo:
#     print(contador)
#     contador += 1
'''
minimo = 1
contador = 5
while contador >= minimo:
    print(contador)
    contador -= 1
'''
    '''
    # Ciclo for
    cadena = "Hello"
    for letra in cadena:
        print(letra)
    else:
        print("Fin del ciclo for")
        
  # Palabra reservada break
    for letra in "Alemania":
        if letra == "a":
            print(f"Letra encontrada: {letra}")
            break
    else:
        print("Fin del ciclo for")

    print("")

    # Palabra reservada continue
    for i in range(6):
        if i % 2 == 0:
            print(f"Valor: {i}") # mostrará los pares del 0-5

    print("")

    for i in range(6):
        if i % 2 == 0:
            continue
        print(f"Valor: {i}") # mostrará los impares del 0-5
  
        
# Ejercicio: Calcular salarios de 5 empleados

minimo = 1
contador = 5
while contador >= minimo:

suma = 0

for i in range(1, 6):
    print(f"\nSalario del empleado {i}")

    horas = float(input("Digite las horas trabajadas: "))
    tarifa = float(input("Digite la tarifa por hora: "))

    salario = horas * tarifa

    print("El salario es:", salario)

    suma += salario     
   

print("\nLa suma de todos los salarios es:", suma)

'''
    '''
n_elementos = int(input("Digite la cantidad de elementos a ingresar: "))

i = 1
suma_pares = 0
conteo_pares = 0
suma_impares = 0
conteo_impares = 0

while i <= n_elementos:
    num = int(input(f"{i}. Digite un número: "))

    if num % 2 != 0:
        # Es impar
        suma_impares = suma_impares + num
        conteo_impares = conteo_impares + 1
    else:
        # Es par
        suma_pares = suma_pares + num
        conteo_pares = conteo_pares + 1

    i = i + 1

# Resultados de pares
if conteo_pares != 0:
    print("La suma de los números pares es:", suma_pares)
    print("El conteo de los números pares es:", conteo_pares)
else:
    print("No se han digitado números pares.")

# Resultados de impares
if conteo_impares != 0:
    promedio_impares = suma_impares / conteo_impares
    print("El promedio de impares es:", promedio_impares)
else:
    print("No se han digitado números impares.")














