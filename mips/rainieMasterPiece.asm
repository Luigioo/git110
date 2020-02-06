.data
Final:.asciiz "\Fantastic\n"
packets: # contains four example packet headers
.word 0x4500003c 0x1c464000 0x4006b1e6 0xac100a63 0xac100a0c
.word 0x45000030 0x44224000 0x80060000 0x8c7c19ac 0xae241e2b
.word 0x45000030 0x44224000 0x8006442e 0x8c7c19ac 0xae241e2b
.word 0x45000031 0x44224000 0x8006442e 0x8c7c19ac 0xae241e2b

.text
	j main

	
check:
li $t4,0
total_loop:
li $t0,0
li $v1,0
loop:
#divide words into 16 bits
lhu $t1,0($a1)
add $v1,$t1,$v1
addi $a1,$a1,2

#add 16bits in total

addi $t0,$t0,1
blt $t0,10,loop

li $t2,0
srl $t2,$v1,16
li $t3,0
sll $t3,$v1,16
srl $t3,$t3,16
add $t2,$t2,$t3

#print
li $v0,34
addi $a0,$t2,0
syscall

addi $t4,$t4,1
blt $t4,4,total_loop

jr $ra

main:
	la $a1, packets 
		
	jal check
	
	li $v0,4
	la $a0,Final
	syscall 






