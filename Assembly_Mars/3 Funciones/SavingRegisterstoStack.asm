.data
	#vamos a utilizar una linea
	newLine: .asciiz "\n"
	
.text
	main:
	 	 #utilizaremos las convenciones que se tienen para los registros t0 y s0
	 	 #utilizando el registro s se guardara permanentemente, incluso si modificamos tempralmente
	 	 #el valor, tenemos que regresar al valor que tenía antes. por ejemplo aqui guardamos a 10 en s0
	 	 addi $s0, $zero, 10 
	 	 
	 	  #print value
	 	 li $v0, 1
	 	 move $a0, $s0
	 	 syscall
	 	 #imprimios una linea 
	 	 li $v0, 4
	 	 la $a0, newLine
	 	 syscall
	 	 
	 	 #En toda la ejecucion del programa (main) s0 siempre tiene que tener el valor de 10
	 	 #incluso si usamos el valor en una función y se modifica, entonces hay que guardarlo en el "stack"
	 	 #para poder recuperar el valor que tenía antes de modificarse. 
	 	 #Por convención, s no los podemos modificar, mientras que t si puede ser modificables. 
	 	 
	 	 #modificaremos temporalmente con increasemyregister 
	 	 jal increaseMyRegister
	 	 
	 	 #imprimios una linea 
	 	 li $v0, 4
	 	 la $a0, newLine
	 	 syscall
	 	 
	 	 #print value
	 	 li $v0, 1
	 	 move $a0, $s0
	 	 syscall
	 	  
	 	 
	 	 
	#Finalizamos el programa 
	li $v0, 10
	syscall
	
	#esta función incrementa el registro s0 (mientras se utilice la función)
	increaseMyRegister: 
		#como vamos a modificar un s, entonces usaremos el $sp (stack pointer) para poder guardarlo y así modificar s0
		#pero antes de regresar, hay que volver a restaurar el valor de s0
		
		#como vamos a guardar valores, hay que indicar de que tamaño será el "Stack" para saber cuantos valores guardar.
		#Como los arreglos, -4x determina el tamaño del arreglo (x). en este caso como x = 1 entonces -4x = -4.
		addi $sp, $sp, -4
		
		#una vez que ya creamos el tamaño del arreglo, hay que guardarlo indicando la posicion donde vamos a guardar el valor.
		#en este caso como es un solo valor entonces solo hay una posicion (0). se cuenta desde 0. 
		#sw = store word = guardar una cadena. sw a b == guardar a en b
		#con 0($sp) estamos diciendo en que posicion de la pila vamos a guardar. en este caso 0 (primer elemento) siempre es multiplo 
		#de cuatro. 
		sw $s0, 0($sp)
		
		#ahora que ya guardamos/respaldamos el valor de s0 n sp, entonces ya podemos hacer lo que queramos con s0.
		#incrementamos en 1 el valor
		addi $s0, $s0, 1
		
		#imprimos el valor de s0 para ver que realmente se modifico
		li $v0, 1
		move $a0, $s0
		syscall
		
		#ahora después de que hicimos lo que quisimos con s0, ahora hay que reestablecer el valor de s0 para cuando salgamos
		#de la función nada ha sido modificado.
		#Cargamos el valor de word desde la memoria ram con lw (cargar a con b)
		lw $s0, 0($sp) 
		
		#tecnicamente aqui hemos terminado, pero hay que "limpiar la pila de ejecucion "
		#Basicamente vamos a quitar los lugares que ocupamos para la pila, en este caso 4 (operacion inversa a -4x)
		addi $sp, $sp 4 
		
		
		#volvemos al lugar donde fue llamada la funcion.
		jr $ra 
	