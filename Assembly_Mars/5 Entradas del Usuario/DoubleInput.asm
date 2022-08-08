.data
	message: .asciiz "Enter the value of v/2: "
	
.text
	#El valor para cargar doubles es 7
	li $v0, 4
	la $a0, message
	syscall
	
	#cargamos el double por el usuario
	li $v0, 7
	syscall
	#el double cargado se guarda automaticamente en f0
	#como todas los valores del coproc1 valen 0, podemos usar cualquiera para mover f0 a f12
	#que es donde se guardan los agrgumentos para imprimir
	
	li $v0, 3
	add.d $f12, $f0, $f2
	syscall
	
	#end the program
	li $v0, 10
	syscall