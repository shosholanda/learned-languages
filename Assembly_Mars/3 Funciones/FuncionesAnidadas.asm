.data
	#basicamente en este ejercicio vamos a evitar repetir codigo. 
	#este ees el ejercicio pasado (SavingRegisterToStack),pero como podemos ver, repetimos inecesariamente
	#codigo para poder imprimir el valor de s0, así que vamos a quitar eso utilizando una función que haga eso.
	newLine: .asciiz "\n"
	
.text
	main:
	 	 addi $s0, $zero, 10 
	 	 
	 	 #aqui en lugar de usar el codigo para imprimr, solamente llamamos a la funcion que imprime el valor en s0
	 	 jal imprimeValor
	 	 
	 	 jal increaseMyRegister
	 	 
	 	 #usamos función en lugar de escribir el codigo de impresion
	 	 jal imprimeValor
	 	  
	 	 
	 	 
	#Finalizamos el programa 
	li $v0, 10
	syscall
	
	#esta función incrementa el registro s0 (mientras se utilice la función)
	#como vamos a llamar una funcion dentro de otra funcion, hay que también pasar y guardar
	#la direccion de la funcion. esto porque las funciones son llamadas desde el main
	#esto es que hay que guardar no solamente 1 valor, (el que hacia anteriormente el programa)
	#sino que ahora tambien hay que guardar la direccion de la funcion anidada. esto es: 
	increaseMyRegister: 
		#hacemos el tamaño del stack a 8 porque ahora vamos a añadir dos cosas
		addi $sp, $sp, -8
		sw $s0, 0($sp)
		#aparte de cargar lo que pasamos, también vamos a tener que guardar la direccion de la funcion que queremos anidar, 
		#la direccino del regreso siempre se guarda en ra, esto es:
		sw $ra, 4($sp)
		
		#seguimos con el 
		addi $s0, $s0, 1
		
		#para imprimir el valor, habria que solamente llamar a la funcion (tiene sentido)
		#jal imprimeValor
		#pero esto genera un error (si la pila sigue siendo de tamaño 4) por lo que hay que modificar la pila 
		#para guardar también la llamada a la función. 
		
		#procedimiento anidado (cuidado)!!!
		
		
		#seguimos con la ejecucion del programa 
		lw $s0, 0($sp) 
		lw $ra, 4($sp)
		addi $sp, $sp 8 
		
		#volvemos al lugar donde fue llamada la funcion.
		jr $ra 
		
	#esta funciones se utilizara para evitar repetir codigo de imprimir 
	#de hecho el codigo de esta funcion ya estaba hecho cuando imprimíamos separadamente. 
	imprimeValor: 
		 #print value
	 	 li $v0, 1
	 	 move $a0, $s0
	 	 syscall
	 	 #imprimios una linea 
	 	 li $v0, 4
	 	 la $a0, newLine
	 	 syscall
	 	 
	 	 #siempre regresar a donde llamamos la funcion
	 	 jr $ra
	
		
