.data

.text
	#La division es entera
	addi $t0, $zero, 40
	addi $t1, $zero, 4
	
	#hacemos la operacion con div a = b/c
	div $s0, $t0, $t1
	#Podemos dividir rapidamente con constante como
	div $s1, $t3, 102 # -192 | +293
	
	#esta division es poderosa, porque guarda los valores de cociente y residuo
	#cociente en lo y residuo en hi (los registros especiales)
	#los parametros que recibe son los numeros a dividir. 
	div $t0, $t1
	
	#ahora solo valta mover el resultado que esta en lo (cociente)
	mflo $s0 
	#movemos el residuo que esta en hi
	mfhi $s1
	
	
	
	#Imprimimos ya sea el residuo o el cociente, depende de lo que queramos 
	li $v0, 1
	add $a0, $zero, $s1
	
	syscall