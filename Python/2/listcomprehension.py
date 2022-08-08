#las listas por compresion son como las de haskell, pero mas raras, pues especificamos el ciclo
#por ejemplo, con listas. 
lista1 = [] #es una lista claramente, lleva corchetes
lista1 = [i for i in range(0,12)] #lleva el ciclo con un for y el primero, es el valor que se repite en la lista
print(lista1)

#podemos agregar condiciones con un if para sortear los datos
lista1 = [ i for i in range (0,100) if i % 4 == 0]
print(lista1)

#también para tuplas
tupla = ( i for i in range (0,129) if i% 7 ==0)#justo lo mismo
print(tuple(tupla))

#y finalmente con diccionarios
diccionario = {key: valor for key, valor in enumerate(lista1)}
print(diccionario)
