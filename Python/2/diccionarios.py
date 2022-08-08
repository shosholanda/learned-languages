#Los diccionarios son una estructura donde todos elementos tienen un indice unico
diccionario = { 1 : "Hola crayola", 2: True, 3: False, 'c' : "Lmao"}
#donde: 
# x <- es el indicador : <- "lo asociamos a" y <- este elemento. {x:y}

print(diccionario) #se imprime exactamente igual que como lo escribimos 
#las llaves deben ser inmutables e inrrepetibles. si se repite se toma el ultimo valor

#los diccionarios pueden crecer/decrecer, por lo que para agregar elementos es.
diccionario['a'] = "nuevo string" #añadir 'c':"nuevo string"
print(diccionario)

#para poder modificar algo del diccionario se hace (la llave debe estar en el diccionario, de lo contrario lo crea)
diccionario['c'] = "You motherfucker"
print(diccionario)

#para imprimir cierto valor, hay que buscar con
valor = diccionario['a']
print(valor)

#pero si el valor no lo encuentra, regresa un error, podemos solucionarlo usando un metodo que nos evita el error
valor = diccionario.get('h', "Error: no se encontro el valor")
#aqui regresa el valor que tiene asociado h, en caso de no encontrar, regresa el segundo parametro.
print(valor)

#para borrar un elemento, hay que usar del
del diccionario['c'] #borra el elemento con la llave c

print(diccionario)

#para que nos regrese todas las llaves 
llaves = diccionario.keys() #metodo de diccionarios.
#pero esto nos regresa un objeto iterable, para transformarlo a solo lista
llaves = list(llaves)

print(llaves)

#podemos también obtener todos los valores de un diccionario con values
valores = list(diccionario.values())
print(valores)

#si en lugar de lista queremos tupla, entonces tuple(diccionario.values())

#para unir diccionarios hacemos
diccionario_dos = {'3':"Salchicha", "Nombre 1": False}
#entonces 
diccionario.update(diccionario_dos)
print(diccionario)
