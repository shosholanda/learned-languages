.data
	#usaremos dos mensajes:
	message: .asciiz "the numbers are equal."
	message2: .asciiz "the numbers are different."
.text
	main:
		#vamos a comparar dos numeros
		addi $t0, $zero, 20
		addi $t1, $zero, 20
		
		#para comparar utilizaremos una instruccion especial: branch if equal
		#los primeros dos registros son los que vamos a comparar, el tercero es un label a donde iremos si son iguales t0 y t1
		beq $t0, $t1,  numerosIguales
		
		#si los numeros no son iguales, no entra al metodo. pero si quieremos saber si son diferentes entonces usamos bne
		bne $t0, $t1, numerosDiferentes
		
		#otra forma chafa de saltar a un metodo es usando b 
	
	#end the program
	li $v0, 10
	syscall
	
	#imprime el mensaje cuanto los numeros son iguales:
	numerosIguales: 
		li $v0, 4
		la $a0, message
		syscall 
		
	#but wtf si se llama a esta funcion, se sigue desde aqui lmao
	numerosDiferentes:
		li $v0, 4
		la $a0, message2
		syscall
		
		
	