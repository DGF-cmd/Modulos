	Proceso if0 
		Escribir "escribe las notas"
		leer a;
		leer b;
		leer c;
		leer d;
		
		m=a
		si b<m   entonces
			m=b
			p<-(a+c+d)/3
			escribir "El promedio es ",p
		SiNo
		FinSi
		si c<m entonces
			m=c
			p<-(a+b+d)/3
			escribir "El promedio es ",p
		
		FinSi	
		si d<m entonces
			m=d
			p<-(a+c+b)/3
			escribir "El promedio es ",p
		FinSi
				
		
			
		
		Escribir "El menor es ",m
FinProceso

