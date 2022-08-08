#creamos 2 strings
string1 = 'Chupame la pija boludo'
string2 = 'Jirafa'

#METODO .FORMAT
#sustituye conforme vayan llegando los elementos
union1 = union = '{} y {}'.format(string1, string2)

#pero también podemos darle un orden.
union = '{a} y {b}'.format(b = string1, a = string2)
print('Imprimir a y b:', union)
union = '{b} y {b}'.format(b = string1, a = string2)
print('Imprimir b y b:', union) 

#METODO PARA MAYUSCULAS/MINUSCULAS .UPPER.LOWER
union = union.lower()
print('Imprimir en minusculas: ', union)
union = union.upper()
print('Imprimir en mayusculas:' , union)

#METODO PARA PONER MAYUCULAS EN CADA PALABRA .TITLE
union = union.title()
print('Imprimir en titulo:', union)

#METODO PARA BUSCAR EN STRING 
#nos dice en que caracter empieza la palabra a buscar 
palabra = union1.find('pija')
print('Encontrar la posicion de la palabra pija:', palabra)

#METODO PARA CONTAR REPETIICNOES DE CADENAS
#
veces = union1.count('a')
print('Contar las repeticiones de la cadena a:', veces)


#METODO DE SUSTITUCION: 
#sustituye la primera posicion por la segunda
string = union1.replace('a','x')
print('Sustitucion de strings', string)

#Metodo de separacion en listas
string = string.split(' ')
print(string)
