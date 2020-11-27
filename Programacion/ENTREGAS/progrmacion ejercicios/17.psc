	Proceso if0 
		Escribir "escribe las longitudes"
		leer a;
		leer b;
		leer c;
		
		m=a
		si b>m   entonces
			m=b
			
		SiNo
		FinSi
		si c>m entonces
			m=c
			
		FinSi
		si m<(b+c) entonces
			escribir "es un triangulo"
			si a=b y a=c Entonces
				escribir "es equilatero"
			FinSi
			si a=b o a=c Entonces
				escribir "es isosceles"
			SiNo
				escribir "es escaleno"
			FinSi
			
		sino
			escribir "no es un triangulo"
		FinSi
		
		
FinProceso

