'''The program that you create for this exercise will begin by reading the cost of a meal
ordered at a restaurant from the user. Then your program will compute the tax and
tip for the meal. Use your local tax rate when computing the amount of tax owing.
Compute the tip as 18 percent of the meal amount (without the tax). The output from
your program should include the tax amount, the tip amount, and the grand total for
the meal including both the tax and the tip. Format the output so that all of the values
are displayed using two decimal places.'''

#input
cost = float(input("Ingrese el costo de la carne: "))

#constantess
IVA= 0.15 #%
PROPINA = 0.18#porciento

#operaciones
prop = cost*PROPINA
iv = cost*IVA
total = prop + iv + cost
#Resultados
print("Coste de impuestos: $%.2f." % iv )
print("Propina: $%.2f." % prop )
print("Coste Total: $%.2f." %total)
