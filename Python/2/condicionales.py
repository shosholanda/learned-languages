#cuidado con la indentacion
#estructura de if (los operadores son los mismos)
condicion = True
if condicion:
    print("hola mundo")
else:
    print("NO hola mundo :C")
    
#en azucar sintactica
valor = "Este mensaje se cumple si se cumple el if" if condicion else "se cumple este mensaje"

#para hacer varias condiciones (cases) hacemos

if 1 == 1 :
    print("Cosa 1")
    #si se cumple esto, ya no ejecutara los demas else, se sale de la estructura.
elif 1 < 9:
    print("cosa 2")
elif 0 < 0 :
    #si no queremos tener codigo, ponemos pass
    pass
#lo que hace, es omitir el codigo
else:
    print("Caso final")
    
#para anidar, hay que escribir respetando la tabulación. 
#en pyton todas las variables tienen valor booleano. si la variable esta en "0", entonces su valor es booleano
#en otro caso, su valor es true wtf
#aqui el null es None 
#y los operadores logicos son con and, or, not
