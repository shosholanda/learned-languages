#variables locales. solo existen aqui, y no pueden usarse afuera de la funcion
def palindromo(string):
    string= string.replace(' ', '')
    string = string.lower()
    return string == string[::-1]

#variables globales. Las que pueden usarse en cualquier funcion 
#las funciones no se puedeen llamar igual que las variables
pal = 'anita la gorda lagartona no traga la droga latina'
resultado = palindromo(pal)
print(resultado)

#y las variables globales, son como las variables de clase. en cualquier metodo de la clase pueden ser accedidas.
#pero solo leidas, no modificadas. 
def palindromi():
    string = pal.replace(' ', '')
    string = string.lower()
    return string == string[::-1]

#pero aunque la utilicemos dentro de una funcion, la variable global queda intacta. si la queremos modificar hacemos
def planidi():
    #global <variable global a modificar>
    global pal 
    pal = "Luz azul"
    
#y finalmente podemos crear variables globales en una funcion con global.
def crear():
    global nueva_variable
    nueva_variable = "Hola"
    
crear()
print(nueva_variable)
