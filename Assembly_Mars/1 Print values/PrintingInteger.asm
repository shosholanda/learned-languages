.data
	age: .word 21
	#word son 32 bits de 0 y 1 (4 byets)
	#word sirve para cualquier informacion = la unidad

.text
	li $v0, 1
	#get ready system coz we gotta print a thing
	#En integer es 1
	lw $a0, age
	#anteriormente era la, porque leiamos la direccion como el asciiz
	#ahora leemos como word so lw
	#Cargamos el valor, no la direeccion
	syscall