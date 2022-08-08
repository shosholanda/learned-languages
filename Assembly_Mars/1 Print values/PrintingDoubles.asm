.data
	#declararmos el double que vamos a imprimir
	myDouble: .double 2.414213562
	#creamos el 0 de double porque no lo tenemos
	#en otros tipos de datos si lo teniamos
	zeroDouble: .double 0.0

.text
	#vamos a leer el double que esta en la ram y lo vamos a pasar al coprocesador1
	#como vamos a leer double = 64 bits, entonces vamos a cargarlo con 2 registros de 32
	#es decir, f2 y f3 se utilizar para cargar el double
	ldc1 $f2, myDouble
	#lo mismo para el double 0 (f0 f1)
	ldc1 $f0, zeroDouble
	
	#get ready porque vamos a leer un double
	li $v0, 3
	#todos los números cono decimal que vayamos a paar como argumento deben de estar en f12
	#lo demás debe de guardarse en a0
	#sumamos doubles. basicmente es buena practica de programacion llamada "moviming clear"
	add.d	$f12, $f0, $f2
	#en realidad no es necesario sumar. pero en algunas ocaciones será de utilidad. de hecho se puede cargar directamente a f12
	#como en los floats
	syscall
	
	
	