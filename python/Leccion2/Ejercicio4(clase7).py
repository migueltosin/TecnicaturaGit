edad = int(input("Ingresa tu edad: "))

if edad >= 0 and edad <= 10:
    print("La infancia es increíble y bella")

elif edad >= 11 and edad <= 19:
    print("Tienes muchos cambios, mucho que estudiar")

elif edad >= 20 and edad <= 29:
    print("Amor y comienza el trabajo")

elif edad >= 30 and edad <= 59:
    print("Etapa de responsabilidad y crecimiento")

elif edad >= 60:
    print("Tiempo de disfrutar la experiencia de la vida")

else:
    print("Edad no válida")