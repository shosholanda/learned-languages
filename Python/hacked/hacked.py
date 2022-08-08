'''
 Programa para emular la aplicación hacked en computadora. 
 Se definen todas las  funciones creadas a partir de los problemas. 
 Junto con su conjunto de entrada, y salida. 
''' 



'''
1. THE HACKPAD 

--------------------------
# Increment me. 
Pattern detected.
 
Inputs | Outputs:
- 2  ->  3
- 5  ->  6
- 8  ->  9
'''
def increment_me(i):
    return i + 1


''' Positive
Inputs | Outputs:
    2  ->  true
    -7  ->  false
    9 -> True
'''
def positive(i):
    return i > 0

''' Abslute
In | Out
1 -> 1
-2  -> 2
0 -> 0
'''
def absolute(i):
    if positive(i):
        return i
    else:
        return -i
    
''' Absolute2
In | Out
1 -> 1
-2  -> 2
0 -> 0
'''
def absolute_2(i):
    return absolute(i)


'''
## THE HIGHSCHOOL HACK
'''
''' Power (solo while)
2 -> 4
3 -> 9
4 -> 16
'''
def power(i):
    var_b = i
    var_a = 0 #inicializar las variables en 0 
    while i > 0:
        var_a = var_a + var_b
        i-=1
    return var_a

''' Power2 usando power 1
2 -> 4
3 -> 9
4 -> 16
'''
def power_2(i):
    return pow(i,2)

''' Length
[3,8] -> 2
[4,5,3] -> 3
[6] -> 1
'''
def length(list_i):
    var_a = 0
    for i in list_i:
        var_a += 1
    return var_a

''' Push it (append = push)
2 -> [0,1]
3 -> 
4 -> 16
'''
def push_it(i):
    var_a = 0
    var_b = []
    while var_a < i:
        var_b.append(var_a)
        var_a += 1
    return var_b

'''
## JAILBREAK
'''

''' Max 
2 -> 4
3 -> 9
4 -> 16
'''
def max_i(list_i):
    var_a = list_i.pop()
    for var_b in list_i:
        if var_b > var_a:
            var_a = var_b
    return var_a

'''WTF, max puede recibir una lista
'''
def maxxxx(list_i):
    var_a = list_i.pop()
    for var_b in list_i:
        var_a = max(var_b, var_a)
    return var_a

''' this is odd 
5 -> 1
2 -> 0
'''
def this_is_odd(i):
    while i > 0:
        i -= 2
    return abs(i)

''' A man, a plan, a canal Panama
Palindromos
'''
def amanaplanacanalpanama(list_i):
    if length(list_i) <= 1:
        return True
    var_a = length(list_i)
    var_b = []
    while length(var_b) < var_a//2:
        var_b.append(list_i.pop())
    if length(list_i) > length(var_b):
        list_i.pop()
    for var_c in list_i:
        if list_i.pop() != var_b.pop():
            return False
    return True

##CHEATCODE
'''bring some order
ordenacion de listas usando pop y push
''' 
def bring_some_order(list_i):
    #lista de 1 o 0 elementos. 
    if length(list_i) < 2:
        return list_i
    #La lista tiene más de 1 elemento. 
    var_a = []
    while list_i != []:
        var_b = list_i.pop()
        for var_c in list_i:
            if var_c < var_b:
                var_d = []
                var_e = var_b
                while var_e != var_c:
                    var_e = list_i.pop()
                    var_d.append(var_e)
                list_i.append(var_b)
                var_b = var_d.pop()
                while var_d != []:
                    list_i.append(var_d.pop())
        var_a.append(var_b)
    return var_a

'''Missing number
Encontrar los números faltantes de 0 a n = max(list_i)
'''
def missing_number(list_i):
    list_i.sort()
    var_b = 0
    var_d = []
    for var_c in list_i:
        if var_b != var_c:
            while var_b < var_c:
                var_d.append(var_b)
                var_b += 1
        var_b +=1   
    return var_d


'''Anagrams
Decir si las sublistas contienen las mismas letras
'''
def anagrams(list_i):
    var_a = list_i.pop()
    var_a.sort()
    for var_b in list_i:
        var_b.sort()
        if var_a != var_b:
            return False
    return True 

#CORRUPTED 
'''110101110101000101
Dar la representación decimal de la lista en binario
'''
def _110101110101000101(list_i):
    var_a = 0
    var_o = 0
    while list_i != []:
        var_b = list_i.pop()
        if var_b == 1:
            var_o = var_o + pow(2, var_a)
        var_a += 1
    return var_o

'''Prime
Decir si un número es primo sin usar recursión'''
def prime(i):
    if i < 2:
        return False
    if i == 2:
        return True
    var_a = 2
    while var_a < i:
        if i%var_a == 0:
            return False
        var_a+=1
    return True

'''Number in order
Nos dice si la palabra está en orden'''
def number_in_order(list_i):
    var_a = []
    for var_b in list_i:
        var_a.append(var_b)
    return var_a == list_i.sort()

#CYBER ATTACK
'''complete
Añade los números faltantes a la lista de 0 a n = max(l)'''
def complete(list_i):
    var_a = list_i.pop()
    var_b = 0
    var_c = []
    while var_b < var_a + 1:
        var_c.append(var_b)
        var_b += 1
    return var_c

'''match
nos dice si los paréntesis están balanceados'''
def match(list_i):
    var_a = []
    var_d = []
    for var_c in list_i:
        var_d.append(var_c)
    var_e = var_d.pop(0)
    if var_e == ')':
        return False
    for var_b in list_i:
        if var_b == '(':
            var_a.append(var_b)
        if var_b == ')':
            var_a.pop()
    return var_a == []

'''Rotate
pasa el primer elemento al último lugar'''
def rotate(list_i):
    if len(list_i) < 2:
        return list_i
    var_a = list_i.pop(0)
    list_i.append(var_a)
    return list_i

#Se definen las funciones lambda
#reverse sort:
#input.sort_with(function var_a, var_b -> var_a > var_b)
'''add one
añade uno a cada elemento de la lista'''
def add_one(list_i):
    var_a = []
    for var_b in list_i:
        var_a.append(var_b+1)
    return var_a

'''Función map
input.map(function var_a -> var_a = var_a+1)
positivity
para cada elemento, nos dice si es positivo o no.'''
def positivity(list_i):
    def f1(var_a):
        return var_a >= 0
    return list(map(f1, list_i))
    

'''Nearest to 0,0
nos dice cual es la pareja más cercana al 0,0
'''
def nearest_to_0_0(list_i):
    var_a = 9999
    for var_b in list_i:
        var_c = var_b[0] + var_b[1]
        if var_c < var_a:
            var_d = var_b
            var_a = var_c
    return var_d

#KILLER ROBOT
'''Adition:
Suma los numeros de las listas como numeros normales'''
def adition(list_i):
    var_d = 0
    while lista_i != []:
        var_a = lista_i.pop()
        var_c = 0
        while var_a != []:
            var_b = var_a.pop()
            var_d = var_d + var_b*pow(10, var_c)
            var_c+=1
    var_f = []
    while var_d > 9:
        var_e = mod(var_d, 10)
        var_f.append(var_e)
        var_d = var_d / 10
    var_f.append(var_d)
    var_h = []
    while var_f != []:
        var_g = var_f.pop()
        var_h.append(var_g)
    return var_h

'''match 2 
nos dice si los paréntesis están balanceados incluyendo corchetes'''
def match_2(list_i):
    if len(list_i) == 0:
        return True
    if mod(len(list_i), 2) == 1:
        return False
    var_a = []
    while list_i != []:
        var_b = list_i.pop(0)
        if var_b == '(':
            var_a.append(var_b)
        if var_b == '[':
            var_a.append(var_b)
        if var_b == ')':
            if len(var_a) < 1:
                return False
            var_c = var_a.pop()
            if var_c != '(':
                return False
        if var_b == ']'
            if len(var_a) < 1:
                return False
            var_c = var_a.pop()
            if var_c != '[':
                return False
    return var_a == []
    
#SKYNET
'''tree
Muestra todos los elementos del arbol en forma de lista como inorden'''
def tree(list_i):
    def f1(var_a, var_b):
        if var_a == []:
            return var_b
        for var_c in var_a:
            if var_c.islist():
                var_e = f1(var_c, [])
                for var_f in var_e:
                    var_b. push(var_f)
            else:
                var_b.push(var_c)
    return f1(list_i, [])

#Funciones auxiliares
def length(list_i):
    var_a = 0
    for i in list_i:
        var_a += 1
    return var_a
