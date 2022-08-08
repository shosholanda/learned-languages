.data
	#en este caso no usaremos variables en la ram
	#Hay tres formas de multiplicar: Usaremos mul
	#  mul a = b x c
	#  mult a b
	#  sll 
	
.text
	#Como no cargamos desde la RAM hacemos add immediatly
	#es como si crearamos a 10 y lo guardamos en s0s
	addi $s0, $zero, 10
	addi $s1, $zero, 4
	
	#haemos la operacion de multiplicacion
	mul $t0, $s0, $s1 
	#La restriccion que tiene esto es que no se pueden multiplicar numeros que el 
	#producto de mas de 32 bits, ya que no cabe en t0, por lo que mult es mejor
	
	#impirimios el resultado de t0
	li $v0, 1
	move $a0, $t0
	
	syscall
	

