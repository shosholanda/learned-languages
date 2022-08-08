#Basicamente así son las funciones en python

#esta es una funcion void
def factorial_numero(numero): #no se necesita definir el tipo de argumento
    resultado = 1
    while numero > 1:
        resultado = resultado * numero
#    print(numero, resultado)
        numero = numero -1 
    print(resultado)
        
factorial_numero(10)#todavía no sabemos pasar argumentos por la terminal

#una función que regresa valores, es decir podemos cachar el resutlado

def factorial(numero):
    resultado = 1
    while numero > 0:
        resultado = numero * resultado
        numero -= 1
    return resultado

print(factorial(19))
