	Proceso if0 
		Escribir "escribe los kilometros"
		leer a;
		precio=30
		
		si a>300 y a<1000 Entonces
			precio=30+(0.15*(a-300))
			Escribir precio
			iva<-precio*(18/100)
			Escribir "iva ",iva
		FinSi
		si a>1000 entonces
			precio=30+(0.10*(a-1000))
			Escribir precio
			iva<-precio*(18/100)
			Escribir "iva ",iva
		FinSi
		
FinProceso

