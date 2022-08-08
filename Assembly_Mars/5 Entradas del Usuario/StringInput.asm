#un programa que le des tu nombre y te diga hola
.data
	prompt: .asciiz "Please enter your name: "
	message: .asciiz "Hello, "
	#aqui vamos a guardar el nombre del usuario
	#es como una clase de arreglo, por eso el .space, Hay que especificar el tamaño
	userInput: .space 20
.text
	#siempre es buena practica hacer un main
	main:
	
		li $v0, 4
		la $a0, prompt
		syscall
		
		#vamos a cargar el nombre con el codigo 8, Se guarda en la variable especificada de a0 (buffer)
		li $v0, 8
		#en esta direccion de memoria (userinput) se guardara la cadena, pero tambien
		la $a0, userInput
		#hay que decirle al programa de que tamaño es userIput.
		li $a1, 20 
		#lo ejecutamos
		syscall
		#ya en este punto tenemos el nombre guardado en la variable de userInput.
		
		#seguimos con la ejecucion del programa.
		li $v0, 4
		la $a0, message
		syscall
		
		li $v0, 4
		la $a0, userInput
		syscall
		
	
	
	
	#siempre es bueno terminar la ejecucion con llamada al sistema cuando hay funciones, si no hay recursion infinita.
	li $v0, 10
	syscall