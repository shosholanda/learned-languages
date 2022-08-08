.data
	#el comportamiento (funciones en ensamblador se le llaman procedures (procedimientos)
	#hacemos un mensaje en la ram
	message: .asciiz "Dead awake you all!\nStep into the light, and perish.\n You challenge makoa?!"
	
.text
	#Cuando hacemos un programa (es decir, algoritmos) es de buena practica siempre poner el metodo main (funcion)
	main: 
		
		#para llamar al procedimiento, llamamos a jal <etiquieta> (jump and link) 
		#automaticamente se guarda el registro en el que esta en ra para luego regresar.
		jal displayMessage
		
		#Aqui podemos seguir ejecutando mas procedimientos/codigo de ser necesario.s
		
	#para que el programa finalice correctamente, hay que indicarle al sistema de la siguiente forma. 
	li $v0, 10
	syscall
	#de otra forma, va a hacer recursión infinita sobre main. 
	
	
	#este es el nombre de nuestra funcion que imprimie el mensaje
	displayMessage: 
		#y es aqui donde podemos hacer el codigo que utilizara la funcion.
		#como hemos visto en ejemplos anteriores, imprimimos de la siguiente manera
		li $v0, 4
		la $a0, message
		syscall
		
		#normalmente aqui terminaria el programa, pero siempre que hagamos funciones, debemos de regresar
		#a la parte de codigo donde la mandamos llamar. por eso nos regresamos con
		jr $ra
		#jr saltamos hacia la parte de donde fuimos llamados para que el programa original continue su ejecucion.
		#ra es el registro donde estabamos antes de ejecutar la funcion.

