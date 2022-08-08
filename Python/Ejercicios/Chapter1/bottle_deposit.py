'''In many jurisdictions a small deposit is added to drink containers to encourage people
to recycle them. In one particular jurisdiction, drink containers holding one liter or
less have a $0.10 deposit, and drink containers holding more than one liter have a
$0.25 deposit.
Write a program that reads the number of containers of each size from the user.
Your program should continue by computing and displaying the refund that will be
received for returning those containers. Format the output so that it includes a dollar
sign and always displays exactly two decimal places.'''

MENOS_DE_UN_LITRO = 0.10 #dolares
MAS_DE_UN_LITRO = 0.25 

menos = int(input("¿Cuántas botellas de litro o menos tienes? "))
mas = int(input("¿Cuántas botellas de litro más tienes: "))

total = menos*MENOS_DE_UN_LITRO + mas*MAS_DE_UN_LITRO
print("El total de ganancias es: $%.2f." %total) #el porciento nos deja cuanto f (floats) queremos a la derecha del punto
