.data
	number1: .word 20
	number2: .word  8
	
.text
	#Cargamos en registros de s para no modificar en la funcion
	lw $s0, number1 	#s0 = 20 
	lw $s1, number2		#s1 = 8
	
	#Hacemos la resta con sub 
	sub $t0, $s0, $s1
	
	#lo imprimiimos
	li $v0, 1
	#en lugar de sumar (sumando 0) usamos move
	move $a0, $t0
	#usamos a0 porque es la forma de que el sistema sepa que vamos a imprimir en este caso.
	syscall
	