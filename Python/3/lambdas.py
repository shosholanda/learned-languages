#las lambdas al igual que en otros lenguajes, son para hacer funciones compactas.
#por ejemplo

def suma(valor_1,valor_2):
    return valor_1 + valor_2

#lo mismo podemos hacer con una lambda
sumita = lambda x1, x2 : x1 + x2#es equivalente a la funcion de arriba.
print(suma(1,2), sumita(1,2))

#otro ejemplo. convertir cualquier cosa a pregunta
pregunta = lambda oracion : '¿{}?'.format(oracion)

print(pregunta("Hola"))
#entonces, es funcion = lambda <no. args> : <cosas de args> y regresa lo que hace el minicodigo
