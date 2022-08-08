.data 
	#basicamente, para llamar a una funcion con ciertos argumentos que le pasamos y queremos un valore de regreso 
	#hay que usar POR CONVENCION los registros
	#a : para argumentos
	#v : para los valores que regresamos 
	#podemos usar en cualquier lugar del programa estos registros. 

.text
	main:
		#vamos a hacer una funcion que reciba dos numeros y regrese el resultado de ambos.
		addi $a0, $zero, 30
		addi $a1, $zero, 40
		#los vamos a guardar en a0 porque los vamos a pasar como argumentos a la funcion suma
	
		#llamamos a la funcion
		jal suma
		
		#lo impimimos
		li $v0, 1
		add $a0, $zero, $v1
		#ojo con usar a0 varias veces. 
		syscall
	
	#Terminar el programa:
	li $v0, 10
	syscall
	
	#funcion que calcula la suma de dos numeros pasados en a0 y a1
	suma: 
		#sumamos
		add $v1, $a0, $a1
		#lo guardamos en v1 porque por convencion, es el registro que guarda el valor de regreso de una función
		#ademas v0 siempre esta siendo ocupado por las llamadas al sistema. 
		
		#regresamos a la linea en donde estabamos
		jr $ra
		
		
		
	