def suma(valor_uno, valor_dos):
    return valor_uno + valor_dos

def division(valor_uno, valor_dos):#clasicamente es lo mismo que en java
    return valor_uno / valor_dos

#pero también podemos pasar los argumentos en diferente orden
resultado = division(10,100) #aqui valor uno toma el valor de 10, y 100 respectivamente.
print(resultado)

#si le asignamos el argumento, aunque esten en difernte orden, se especifica.
resultado = division(valor_dos = 100, valor_uno = 10) #es equivalente al resultado anterior.
print(resultado)

#hay que tener en claro que cuando asignamos argumentos, estos deben exisistir en la definicion de la función

#podemos también dejar un argumento constante, y solo llamar la función con un solo argumento 
def multiplicacion(valor_uno, valor_dos = 19):
    return valor_uno * valor_dos

resultado = multiplicacion(10) # esto es equivalente a multiplicacion 10, 19
#pero si le pasamos un argumentoa multiplicacion es decir, 
resultado = multiplicacion(10, 12) #tomara el valor de 12n en valor 2, y no el constante
print(resultado)

##########################################################33
#REGRESAR MULTIPLES COSAS (NUEVO)

#podemos regresar varias cosas como:
#pero las regresa en forma de TUPLA
def multiples_valores():
    return "String", 1, True, 29.3

resultado = multiples_valores()
#como es una tupla, podemos sacar cada uno de los valores como arreglo
stringg = resultado[0] #etc..
#pero como vimos con el for, podemos regresar 2 cosas con coma si sabes cuantas cosas va a regresar
string, entero, booleano, flotante = multiples_valores()
print(resultado)

#y ya tendriamos los valores separados
print(string, entero, booleano, flotante)


#también podemos "duplicar" funciones asignando a una variable
funcion_uno = multiplicacion #aqui como que copiamos la funcion mult pero ahora la podemos llamar también con el nombre de la nueva variable-
print(funcion_uno(10,2))

#y finalmente, funciones anidadas. o como argumentos
def mi_funcion(funcion):
    print(funcion)
    #funcion debe ser una funcion
    
#ahora, debemos llamar a la funcion con una funcion
mi_funcion(funcion_uno(19,219))
