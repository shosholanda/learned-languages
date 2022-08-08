.data
	message: .asciiz "hi, how are you?"
	
.text
	main:
		#necesitamos dos numeros
		addi $s0, $zero, 10
		addi $s1, $zero, 20
		
		#hay un bunch de instrucciones para poer facilitarnos la vida como
		#if a > b then jump
		bgt $s0, $s1, displayMsg
				 
		#if a < b then jump
		blt $s0, $s1, displayMsg
		
		#incluso podemos comparar si un numero es positivo o negativo
		#if a > 0, then jump
		bgtz $s0, displayMsg
		
		#if b < 0, then jump
		bltz $s1, displayMsg
		
		#if a = 0 then jump
		beqz $s0, displayMsg
		
	li $v0, 10
	syscall
	
	displayMsg:
		li $v0, 4
		la $a0, message
		syscall