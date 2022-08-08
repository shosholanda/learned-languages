.data #todas las variables
	syMessage: .asciiz "Hello World\n"
	#El nombre se llama symessage
	#se guarda en el RAM (Random Access memory
	# .[] el tipo de dato que se guarda. asciiz es unicamente texto.
	
.text #todas las instrucciones
	li $v0, 4
	#get ready for instrucctions
	
	la $a0, syMessage
	#cargar el symessage en el a0 como dirreccion
	#se usa el a0 siempre para cadenas
	syscall 
	#do it now