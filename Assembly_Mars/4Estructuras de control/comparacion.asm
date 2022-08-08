.data
	message: .asciiz "the number is less than the other"
	
.text
	#usaremos dos numeros
	addi $t0, $zero, 1
	addi $t1, $zero, 200
	
	#como queremos ver quien es mayor usamos
	#if t0 < t1 => s0 = 1, else s0 = 0
	#convierete a un boolean la comparacion 
	slt $s0, $t0, $t1
	#ahora vamos a saltar a la direccion de memoria que quermaos
	bne $s0, $zero, notEqual
	
	#finish the program
	li $v0, 10
	syscall
	
	notEqual:
		li $v0, 4
		la $a0, message
		syscall
