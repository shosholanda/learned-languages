.data
	#el mensaje que vamos pedir al usuario.
	message: .asciiz "Enter the value of PI: "
	#dado que no tenemos un registro 0 para float, hay que crearlo
	zeroAsFloat: .float 0.0
.text

	#Primero que nada hay que cargar el valor del float zero para poder hacer operaciones con zero
	lwc1 $f4, zeroAsFloat
	
	#seguimos con la ejecucion del programa.
	li $v0, 4
	la $a0, message
	syscall
	
	#el codigo para leer floats es el 6
	li $v0, 6
	syscall
	#el valor ingresado se guarda automáticamente en f0
	
	#ahora imprimirmos el valor de PI
	li $v0, 2
	#f12 es como el a0, pero para floats (argumento)
	add.s $f12, $f4, $f0
	syscall
	
	#end the program
	li $v0, 10
	syscall