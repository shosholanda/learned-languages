#las listas son como los arreglos de java, una estructura de bloque, donde se conoce todo de la lista. 
#estos arreglos a diferencia de java pueden almacenar varios tipos en la misma lista. 
#ademas pueden crecer y decrecer 

lista1 = ['String', 'a', 19, 2.123, [1,2], True]
print(lista1)

#para añadir elementos, usamos append (al final) 
lista1.append('holi')
print(lista1)

#para insertar elementos en n posicion usamos insertar
lista1.insert(10, "amor")
print(lista1)

#como le hicimos en con los strings, para imprimir una posicion, hay que indicar en corchetes
print(lista1[4])

#para poder eliminar usamos remove ( objeto a remover)
lista1.remove(True)
print(lista1)

#para remover el ultimo lo hacemos como pilas. solo pop
lista1.pop()
print(lista1)

#para poder ordenar listas (con numeros) es con sort
lista2 = [1,5,8,3,7,9,2,7,43,8,2,5657,23,7,34]
print(lista2)
lista2.sort() #de menor a mayor
print(lista2)
lista2.sort(reverse = True) #de mayor amenor
print(lista2)

#para unir listas o sea no agregar como una lista al final, sino elemento por elemento.#
#con append, se añade como objeto#. sjsj
lista1.extend(lista2)
print(lista1)
