#con el ciclo for, se usa cuando conocemos el numero de veces a iterar}
#por ejemplo con una lista (arreglo)

lista = [1,2,3,4,5,6,7,8,9,10]

for elemento in lista:
    pass#print(elemento)
    
#tip adicional, range nos da el rango de 
#range(a) : el rango de 0 a A
#range(a,b) el rango de a a b-1
#range (a,b,c) el rango de a a b-1 de c pasos

#para sacar la longitud a una lista es con len()
#podemos simular el for de java como
#for (int i = 0, i < lista.length(), i++)
for elemento in range(0,len(lista)):
    print(elemento)

#las string también son iterables.
for caracter in "Cadena de texto 1":
    print(caracter)
