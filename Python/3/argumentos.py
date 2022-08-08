#si en dado caso que no sepamos cuantos argumentos necesita una funcion, podemos pasar los n-argumentos como tupla
def suma_grande(n_1,n_2,n_3): #etc, pero es limitado a como esta definida la funcino
    return n_1+n_2+n_2

#por otro lado si quieremos llamar n argumentos
def suma_n_elementos(*args):#args convencion
    #args es en forma de tupla, con los n argumentos llamados 
    resultado = 0
    for valor in args:
        resultado = resultado + valor
    return resultado

#Y llamar la funcion como queramos
suma = suma_n_elementos(1,2,3,4,5,67,7,8,9,5,2,2,1,1,45,6,7)
print(suma)

#Y SI POR alguna razon quisieramos hacer una asignacion de parametros, entonces ponemos doble asterisco
def suma_finita(**kwargs):
    print(kwargs)
    #con ** los argumentos los pasa como un diccionario, llave y valor
    valor = kwargs.get('Hola', 'No existe el valor hola')
    print(valor)
    
suma_finita(valor_1 = True, valor_2 = 89, valor_3 = 'crayola')
