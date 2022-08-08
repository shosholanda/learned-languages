.data
	#para hacer el tamaño del arreglo hay que calcular cuantos bytes queremos guardar
	#por ejemplo, si quieremos guardar 1 entero = 4 bytes, entonces al menos habria que hacer el arreglo
	#de tamaño 4. 
	myArray: .space 12
.text
	#cargamos los valores que queremos guardar en el arreglo:
	addi $s0, $zero, 2
	addi $s1, $zero, 4
	addi $s2, $zero, 8
	
	#CARGAR EN UN ARREGLO:
	#creamos un contador para poder movernos en las posiciones del arreglo
	#ojo que el contador se incrementa en este caso en 4 porque son 4 bytes por entero.
	#si fuera 1 byte, entonces se incrementa en 1
	#usamos la instruccion store word para guardar en memeora RAm
	sw $s0, myArray($t0)
	#basicamente en la posicion t0 = 0, de mi array guardamos s0 ie. myArray[0] = s0
	
	#incrementamos el contador
	addi $t0, $t0, 4
	#guardamos el segundo valor, ahora que t0 ya se incremento
	sw $s1, myArray($t0)
	add $t0, $t0, 4
	sw $s2, myArray ($t0)
	
	#CARGAR DESDE UN ARREGLO
	#para poder cargar de un arreeglo utilizamos la instruccino load word lw e indicamos de 
	#que posicion quieremos tomar el valor.
	lw $t1, myArray($t0)
	
	#imprimir el valor
	li $v0, 1
	add $a0, $zero, $t1
	syscall
	
	#restar el valor 
	subi $t0, $t0, 4
	
	lw $t1, myArray($t0)
	
	li $v0, 1
	add $a0, $zero, $t1
	syscall
	
	#finalmente si quieremos siempre ir al principio del arerglo, podemos usar el registro zero
	lw $t1, myArray($zero)
	
	li $v0, 1
	add $a0, $zero, $t1
	syscall
	
	
	
	
