.data
	#Creamos dos mensajes para el usuario predefinidos. 
	prompt: .asciiz "Enter your age: "
	message: .asciiz "Your age is :"
.text
	#vamos a hacer un programita que pida la edad y la imprima.
	
	#imprimimos prompt
	li $v0, 4
	la $a0, prompt
	syscall
	
	#ahora vamos a capturar un entero del usuario, el codigo es 5 para esto.
	#con esto vamos a poder leer enteros.
	li $v0, 5
	syscall
	#aqui el valor del usuario se guarda en v0, por ahora.
	
	#dado que en este punto, ya se guardo el valor, ahora hay que guardarlo en otro lugar porque v0 lo vamos a volver a usar.
	move $t0, $v0
	
	#ahora ya que tenemos el valor en t0, imprimimos lo que sigue.
	#imprimir el mensaje.
	li $v0, 4
	la $a0, message
	syscall
	
	#imprimir el entero. 
	li $v0, 1
	add $a0, $zero, $t0
	syscall
	
	#end the program
	li $v0, 10
	syscall