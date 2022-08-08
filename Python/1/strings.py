my_string = "Buenos días a la vida!"
#Los strings pueden estar dentro de comillas dobles o simples, pero se contienen i.e.
#" contiene ' y ' contiene " o sea "Hola 'Mundo'" u 'Hola "Mundo"'

#Para hacer saltos de linea, usaremos 3 veces comillas dobles o simples
my_string = """When 
The 
Night is cold"""

#También podemos poner \n para saltos de linea
print(my_string)

#Hay varias formas de concatenar. 
apellido_materno = "Romo"
apellido_paterno = "Silva"

nombre = "Sebastián " + apellido_paterno + " " + apellido_materno #1 concatenar como en java
nombre = "Sebastián %s %s " %(apellido_paterno, apellido_materno) #2 por % donde se reemplazan en lugar de % en orden
nombre = "Sebastián {} {} " .format(apellido_paterno, apellido_materno) #3 aplicando el metodo format, similar al %

print(nombre)
