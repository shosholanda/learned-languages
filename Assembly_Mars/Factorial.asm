.data
	prompt: .asciiz "Ingrese el numero para calcular el factorial: "
	final: .asciiz "\nEl resultado es: " 
	numero: .word 0
	resultado: .word 0
	
.text
	main:
		#imprimir prompt
		li $v0, 4
		la $a0, prompt
		syscall
		
		#leer un numero
		li $v0, 5
		syscall
		
		#guardar el numero
		sw $v0, numero
		
		#llamamos al a funcino con el valor ingresado
		lw $a0, numero
		jal factorial
		
		#guardar el resultado
		sw $v0, resultado
		
		#imprimir el final
		li $v0, 4 
		la $a0, final
		syscall
		
		#imprimir el numero
		li $v0, 1
		lw $a0, resultado
		syscall
		
		#terminar el programa
		li $v0, 10
		syscall
	
#------------------------------------------------------------------------------------
		
	#funcion recursiva
	factorial:
		#respaldar el valor de la direccion y numero
		#crear la pila
		subu $sp, $sp 8
		#guardar la direecion de regreso
		sw $ra, ($sp)
		#guardar el valor n 
		sw $s0, 4($sp)
		
		# Base case
		li $v0, 1
		beq $a0, 0, terminar
		
		#guardar el valor del argumento
		move $s0, $a0
		#n--
		sub $a0, $a0, 1
		#llamada recursiva
		jal factorial
		
		#la magia de la recursion
		#return n * (return n-1)
		mul $v0, $s0, $v0
		
		
		#return 1
		terminar:
			#restaurar la pila 
			lw $ra, ($sp)
			lw $s0, 4($sp)
			addu $sp $sp 8
			
			jr $ra
			
		
		
			
		
		 
