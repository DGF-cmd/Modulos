	Proceso if0 
		Escribir "escribe numeros"
		Leer a
		leer b
		leer c
		leer d
		x=a
		Mientras (a!=0) y (b!=0) y (c!=0) y (d!=0) Hacer
			leer a
			leer b
			leer c
			leer d
		finmientras
		si a=0 entonces
			x=b
		FinSi
		si (a!=0) entonces
			x=a
		FinSi
		si (b<x) y (b!=0) entonces
			x=b
		FinSi
		si (c<x) y (c!=0) entonces
			x=c
		FinSi
		si (d<x) y (d!=0) entonces
			x=d
		FinSi
		escribir x
FinProceso

