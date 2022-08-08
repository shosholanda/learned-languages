.data
	#igual no leeremos nada
.text
	#cargamos los valores de 2000 y 10
	addi $t0, $zero, 2000
	addi $t1, $zero, 10
	
	#hacemos la oepracion
	#ojo que solo utilizamos 2 parametros, que son los valores que vamos a multiplicar, en este caso t0 y t1
	mult $t0, $t1
	#Y a donde es el resultado? Bueno, como no caben en un registro, el resultado se va directamente al registro low o high (lo y hi)
	#Estos registros son especiales, porque si es muy grande el numero nos ayudan a contenterlo.
	
	#Como esta en lo, hay que sacarlo de ahi con move from high-low
	#en este caso como no era muy grande el numero, no había necesidad de cargarlo desde high
	mflo $s0
	
	#lo imprimimos
	li $v0, 1
	add $a0, $zero, $s0
	
	syscall
	
	