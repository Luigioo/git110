.data
packets: # contains four example packet headers
.word 0x4500003c 0x1c464000 0x4006b1e6 0xac100a63 0xac100a0c
.word 0x45000030 0x44224000 0x80060000 0x8c7c19ac 0xae241e2b
.word 0x45000030 0x44224000 0x8006442e 0x8c7c19ac 0xae241e2b
.word 0x45000031 0x44224000 0x8006442e 0x8c7c19ac 0xae241e2b
beginWord: .asciiz "\nhello\n"
endWord: .asciiz "\nend of program\n"
sep: .asciiz "\n---\n"
ssep: .asciiz "\nis it FFFF?\n"


.text
	li $v0, 4
	la $a0, beginWord
	syscall
	
	j    main		#starting point of the program

four:	
	li $t7, 20
	mul $t7, $t7, $t0	#now t7 is our offset between ips
	

	
	addu $s1, $t7, $s0
	
	li $t3, 0
	li $t2, 0
	
check:

	lhu $t1, 0($s1)
	add $t2, $t2, $t1
	
	addi $s1, $s1, 2
	

	
	addi $t3, $t3, 1
	blt $t3, 10, check
	
#end of check
	li $t4, 0
	li $t5, 0
	srl $t4, $t2, 16
	sll $t5, $t2, 16
	srl $t5, $t5, 16
	
	
	
	add $t4, $t4, $t5
	
	li $v0, 34
	addi $a0, $t4, 0
	syscall
	li $v0, 4
	la $a0, ssep
	syscall
	
	
	addi $t0, $t0, 1	#jump back to four
	blt $t0,4,four
	jr $ra

main:	la   $s0,packets	 # fetch address of packet buffer
	li $t0, 0
	jal four
	j end
	

	#TODO: here would go a loop that calls

	#      check for each packet header


        # TODO: here would go the checksum verification function

end:	
	
	li $v0, 4
	la $a0, endWord
	syscall
	li $v0, 10
	syscall
