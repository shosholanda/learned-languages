'''The surface of the Earth is curved, and the distance between degrees of longitude
varies with latitude. As a result, finding the distance between two points on the surface
of the Earth is more complicated than simply using the Pythagorean theorem.
Let (t 1 , g 1 ) and (t 2 , g 2 ) be the latitude and longitude of two points on the Earth’s
surface. The distance between these points, following the surface of the Earth, in
kilometers is:
distance = 6371.01 × arccos(sin(t 1 ) × sin(t 2 ) + cos(t 1 ) × cos(t 2 ) × cos(g 1 − g 2 ))
The value 6371.01 in the previous equation wasn’t selected at random. It is
the average radius of the Earth in kilometers.
Create a program that allows the user to enter the latitude and longitude of two
points on the Earth in degrees. Your program should display the distance between
the points, following the surface of the earth, in kilometers.'''
from math import *

AVG_EARTH_RATIO = 6371.01

punto_1 = radians(float(input("Ingrese el primer elemento de la primera coordenada: ")))
punto_2 = radians(float(input("Ingrese el segundo elemento de la primera coordenada: ")))

coordenada_1 = (punto_1, punto_2)

punto_1 = radians(float(input("Ingrese el primer elemento de la segunda coordenada: ")))
punto_2 = radians(float(input("Ingrese el segundo elemento de la segunda coordenada: ")))

coordenada_2 = (punto_1, punto_2)

print("Coordenadas: ", coordenada_1, ", ", coordenada_2)

distancia = AVG_EARTH_RATIO* acos(sin(coordenada_1[0]) * sin(coordenada_2[0]) + cos (coordenada_1[0])*cos(coordenada_2[0]) * cos (coordenada_1[1]-coordenada_2[1]))

print("La distancia entre ambos puntos de la tierra es: %.3f" %distancia)
