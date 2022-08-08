#Strings and formatting 


types_of_people = 10    #Tipos de persona 
x = f"There are {types_of_people} types of people."     #string con tipos de personas. 
 
binary = "binary"       #la palabra binario 
do_not = "don't"        #la palabra don't
y = f"Those who know {binary} and those who {do_not}."

print(x)    #imprimir string formateada
print(y)    #Impirmir string formateada

print(f"I said: {x}")      #Insertar string formateada. 
print(f"I also said: '{y}'")    #Insertar string formateada. 

hilarious = False       #divertido = false
joke_evaluation = "Isn't that joke so funny?! {}"   #broma no divertida.

print(joke_evaluation.format(hilarious))        #String formateada e imprimir

w = "This is the left side of..."   #Un texto
e = "a string with a right side."   #otro texto.

print(w + e)    #Unir textos. 

#Buscar las inserciones de string into string. (7 en tota)
