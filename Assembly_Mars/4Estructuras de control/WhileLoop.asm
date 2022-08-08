.data
	message: .asciiz "while terminado"
	space: .asciiz ", "

.text
	main:
		#iniciamos una variable en 0
		#nos aseguramos que este bien el 0
		addi $t0, $zero, 0
		
		#para hacer un while siempre hay que tener dos etiquetas, el while y la salida
		while:
			#la condicion del while
			bgt $t0, 10, exit
			
			#imprimimos el valor de t0 con otra funcion
			jal imprimeNumero
			
			addi $t0, $t0, 1	#i++
			
			j while #regresar al while siempre
			
		exit: 
			li $v0, 4
			la $a0, message
			syscall
	
	
	#finish the program
	li $v0, 10
	syscall
	
	imprimeNumero: 
		li $v0, 1
		add $a0, $t0, $zero
		syscall
		
		li $v0, 4
		la $a0, space
		syscall
		
		jr $ra
	
	