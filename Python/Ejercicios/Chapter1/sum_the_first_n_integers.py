'''Write a program that reads a positive integer, n, from the user and then displays the
sum of all of the integers from 1 to n. The sum of the first n positive integers can be
computed using the formula:'''

numero_n = int(input("Ingrese un número: "))

resultado = (numero_n * (numero_n+1))// 2

print("La suma de los primeros {} números es {}".format(numero_n, resultado))
