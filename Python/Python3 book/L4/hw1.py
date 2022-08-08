#variables. aprender = es para dar nombre a los datos y que _ es para variables.

cars = 100  #Número de carros
space_in_cars = 4.0 #Espacio en carros
drivers = 30    #Número de personas que manejan
passengers = 90 #Número de pasajeros
cars_not_driven = cars - drivers    #Número de carros no manejados. 
cars_driven = drivers   #Número de carros manejados.
carpool_capacity = cars_driven * space_in_cars  #Número de lugares por carro.
average_passengers_per_car = passengers / cars_driven   #Promedio de personas por carro. 

#Imprime la variable cars con su descripción
print("There are", cars, "cars avaliable.")
#imprime la variable drivers con una pequeña descripción
print("There are only", drivers, "drivers avaliable.")
#Imprime la variable cars_not_driven con una descripción
print("There will be", cars_not_driven, "empty cars today.")
#Imprime la variable carpool_capacity mas una descripción.
print("We can transport", carpool_capacity, "people today.")
#Imprime la variable passengers con una descripción adicional. 
print("We have", passengers, "to carpool today.")
#Imprime la variable average_passengers_per_car con el mensaje adicional. 
print("We need to put about", average_passengers_per_car, "in each car")
    
