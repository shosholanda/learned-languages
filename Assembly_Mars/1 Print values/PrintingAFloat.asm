.data
	#el float dice que tiene 6 numeros despues del punto decimal
	PI: .float 3.1415

.text
	li $v0, 2
	#en float es 2
	lwc1 $f12, PI
	#como es un punto decilmal, tenemos que guardarlo no en un registro
	#sino en el coprocesador 1 el cual guarda registros de punto flotante
	#siempre es f12 para guardar. de hecho f12 no está en los registros principales
	syscall