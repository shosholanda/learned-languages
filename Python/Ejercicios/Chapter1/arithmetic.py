'''Programa que lee 2 números y computa la 
#suma
#diferencia 
#producto
#cociente q (a = b*q + r
#modulo r
#log_10 a 
#log a^b'''
from math import log10
#inputs

a = int(input("Ingrese el primer número (a): "))
b = int(input("Ingrese el segundo número (b): "))

#suma
print("a + b = ", a+b)

#diferentcia:
print("a - b = ", a-b)

#producto
print("a * b = ", a*b)

#cociente 
print("a * q + r = b, -> q = ", a/b)

#residuo
print("a * q + r = b, -> r = ", a%b)

#logaritmo
print("log_10(a) = ", log10(a))

#potencia
print("a^b = ", a ** b)

