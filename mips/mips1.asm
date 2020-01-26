.data
packets: # contains four example packet headers
.word 0x4500003c 0x1c464000 0x4006b1e6 0xac100a63 0xac100a0c
.word 0x45000030 0x44224000 0x80060000 0x8c7c19ac 0xae241e2b
.word 0x45000030 0x44224000 0x8006442e 0x8c7c19ac 0xae241e2b
.word 0x45000031 0x44224000 0x8006442e 0x8c7c19ac 0xae241e2b

.text
	j    main		#starting point of the program

check:
        # TODO: here would go the checksum verification function
        add $s0, $a0, $zero
	lhu $t0, 0($s0)
	add $t1, $t1, $t0
	
	addi $s0, $s0, 2
	
	addi $v1, $v1, 1
	blt $v1, 5, check
	sw $s0, 80($a0)
	jr   $ra

main:	la   $s0,packets	 # fetch address of packet buffer

	addi $t0, $zero, 0
	
	jal four
	j end
	

	#TODO: here would go a loop that calls
four:	
	
	

	addi $a0, $a0, 0x0014
	
	lui $v1, 0x0000
	ori $v1, $v1, 0x0000
	jal check
	addi $v0, $v0, 1
	blt $v0,4,four
	jr $ra
	#      check for each packet header

end:	nop
