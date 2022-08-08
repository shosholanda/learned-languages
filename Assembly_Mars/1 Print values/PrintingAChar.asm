.data
	sysCharacter: .byte 'm'

.text
	#Imprimir igual que en las string
	li $v0, 4
	la $a0, sysCharacter
	syscall