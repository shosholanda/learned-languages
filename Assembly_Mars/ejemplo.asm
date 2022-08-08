.data
buffer:	.space	128
bsize:	.word	127

.macro read_char()
	li $v0 12
	syscall
.end_macro

# name: etiqueta que apunta al buffer donde se guarda la cadena leida
# size: etiqueta que apunta al tamaño del buffer
.macro read_string_l(%buff,%size)
	li $v0 8
	la $a0 %name
	lw $a1 %size
	syscall
.end_macro

.macro exit()
	li $v0 10
	syscall
.end_macro

.text   #Programa para quitar el salto de linea al final de una cadena
	read_string_l(fname,nsize)
	move $t0 $a0
	
loop:	
	lb $t1 ($t0)
	beq $t1 '\0' fin
	beq $t1 '\n' quita
	addi $t0 $t0 1
	j loop
quita:	sb $zero ($t0)

fin:	exit()

