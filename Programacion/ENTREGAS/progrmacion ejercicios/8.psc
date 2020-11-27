Proceso if0 
	
	leer a; 
	
	Si a>0 y a<100 Entonces 
		si a<10 Entonces
			Escribir "Tiene un dígito"
		SiNo
			Escribir "Tiene dos dígitos"
		FinSi
	SiNo
		si a<0 Entonces
			c<-a*(-1)
			Si c>0 y c<100 Entonces 
				si c<10 Entonces
					Escribir "Tiene un dígito"
				SiNo
					Escribir "Tiene dos dígitos"
				FinSi
			SiNo
		FinSi
	FinSi 
	finsi
FinProceso
