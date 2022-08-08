'''Pretend that you have just opened a new savings account that earns 4 percent interest
per year. The interest that you earn is paid at the end of the year, and is added
to the balance of the savings account. Write a program that begins by reading the
amount of money deposited into the account from the user. Then your program should
compute and display the amount in the savings account after 1, 2, and 3 years. Display
each amount so that it is rounded to 2 decimal places.'''

#leer el dinero depositado
money = float(input("Ingrese la cantidad que quiere ahorrar: "))

INTERESES = 0.04 #por ciento

for i in range(0, 4):
    money = money + money*INTERESES
    print("El dinero ahorrado en el año {} es $%.2f".format(i) %money)
         
