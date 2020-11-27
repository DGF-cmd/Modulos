
Proceso if0 
	Escribir "escribe la nota de un alumno"
	leer a; 

	si a<5 entonces
			escribir "Suspenso"
	FinSi
	
	si a>5 y a<7 entonces
		escribir "Aprobado"
	FinSi
	
	si a>=7 y a<9 entonces
		escribir "Bien"
	FinSi
	
	si a>=9 y a<10 entonces
		escribir "Notable"
	FinSi
	
	si a=10 Entonces
		Escribir "Sobresaliente"
	FinSi
FinProceso
