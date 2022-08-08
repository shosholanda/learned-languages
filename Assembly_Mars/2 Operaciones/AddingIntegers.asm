.data
	#los numeros que vamos a sumar
	number1: .word 5
	number2: .word 10

.text
	#Cargamos los valores de tipo word a los registros
	lw $t0, number1($zero)
	lw $t1, number2($zero)
	
	#usamos la operacion
	add $t2, $t0, $t1 	#t2 = t1 + t0
	#tecnicamente aqui acabamos la operacion, pero para imprimirlo hay que hacer lo siguiente
	
	li $v0, 1
	
	#Aqui lo que hacemos es sumar 0 con lo que teniamos
	#Basicamente movemos t2 a a0 pero lo sumamos
	#para que se limpien los registros. 
	add $a0, $zero, $t2
	
	syscall
	
	
	
	
	