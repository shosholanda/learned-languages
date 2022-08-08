'''In the United States, fuel efficiency for vehicles is normally expressed in miles-per-
gallon (MPG). In Canada, fuel efficiency is normally expressed in liters-per-hundred
kilometers (L/100 km). Use your research skills to determine how to convert from
MPG to L/100 km. Then create a program that reads a value from the user in American
units and displays the equivalent fuel efficiency in Canadian units.'''

CTE = 235.214583

mpg = float(input("Ingrese la cantidad en MPG: "))

l_100km = CTE/mpg

print("Rendimiento de combustible en L/100km: %.2f" %l_100km)  
