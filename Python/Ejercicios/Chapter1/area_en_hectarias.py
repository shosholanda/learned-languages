'''Create a program that reads the length and width of a farmer’s field from the user in
feet. Display the area of the field in acres.
Hint: There are 43,560 square feet in an acre.'''

largo = float(input("Cuantos pies de largo es el terreno?: "))
ancho = float(input("Cuántos pies de ancho es el terreno?: "))

ACRE = 43560 
area_feet = largo*ancho
print("El area en acres es:", area_feet/acre)

