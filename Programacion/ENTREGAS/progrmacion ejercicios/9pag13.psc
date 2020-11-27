Proceso if0
	escribir "escribe numeros"
	leer a
	x<--1
	Mientras a>=x Hacer
		x<-a
		leer a
		si a<=-1 Entonces
			Escribir "ascendente"	
		FinSi
	FinMientras
	
	Si a>=0 Entonces
		escribir "no es ascendente"
	FinSi
	
FinProceso
	