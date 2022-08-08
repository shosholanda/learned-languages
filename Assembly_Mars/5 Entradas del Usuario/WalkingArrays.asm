#programa que guarda 8 numeros y los imprime
.data
	myArray: .space 32
	newLine: .asciiz "\n"
	
.text
	#usaremos un while para poder recorrer el arreglo
	main:
		#primero guardamos los valores
		li $s0, 2
		li $s1, 4
		li $s2, 8
		li $s3, 16
		li $s4, 32
		li $s5, 64
		li $s6, 128
		li $s7, 256
		
		#creamos el contador:
		addi $t0, $zero, 0
		
		sw $s0, myArray($t0)
			
		#incrementar el contador
		addi $t0, $t0, 4
		sw $s1, myArray($t0)
		addi $t0, $t0, 4
		sw $s2, myArray($t0)
		addi $t0, $t0, 4
		sw $s3, myArray($t0)
		addi $t0, $t0, 4
		sw $s4, myArray($t0)
		addi $t0, $t0, 4
		sw $s5, myArray($t0)
		addi $t0, $t0, 4
		sw $s6, myArray($t0)
		addi $t0, $t0, 4
		sw $s7, myArray($t0)
		
		#reiniciamos el contador
			addi $t0, $zero, 0
			
			while:
				#mientras sigamos dentro del arreglo
				beq $t0, 32, exit
				
				#cargar el valor del arreglo
				lw $t1, myArray($t0)
				jal imprimirValor
				
				#incrementar el contador
				addi $t0, $t0, 4
				
				j while
		
			
		
		imprimirValor:
			li $v0, 4
			la $a0, newLine
			syscall
			
			li $v0, 1
			add $a0, $zero, $t1
			syscall
			
			jr $ra 
			
		#end the program
		exit: 
			li $v0, 10
			syscall
			