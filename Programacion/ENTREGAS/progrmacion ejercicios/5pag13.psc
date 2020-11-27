Proceso if0
	escribir "escribe numeros o algo"
	leer a
	definir x,m,f Como Entero
	x=0
	m=0
	f=0
	mientras a<>0 Hacer
		leer a
		m<-m+1
		
		si a>x Entonces
			x<-a
		FinSi
		si x>a Entonces
			f=f+1
		FinSi
	FinMientras
	
	Escribir x
	escribir "La ubicacion del maximo valor es ", (m+1)-f
FinProceso
	