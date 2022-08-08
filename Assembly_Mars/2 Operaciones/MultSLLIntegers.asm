.data
	#SLL = Shift Left Logical 
	#instruction efectiva para multiplicar. para dividir se puede usar srl (shift right logical o div

.text
	#addi puede cargar constantes inmediatamente
	#en este caso vamos a exponenciar el 4
	addi $s0, $zero, 4 
	
	#Basicamente la operacion es de exponenciacion. 
	# donde a = b ^ k
	sll $t0, $s0, 2  # = 4*4
	
	#imprimios
	li $v0, 1
	add $a0, $zero, $t0
	
	syscall
	