	Proceso if0 
		Escribir "escribe año y peso"
		leer a;
		
		
		si a>=0 y a<90 Entonces
			Escribir "Cuadrante 1"
		FinSi
		si a>90 y a<180 Entonces
			Escribir "Cuadrante 2"
		FinSi
		si a>180 y a<270 Entonces
			Escribir "Cuadrante 3"
		FinSi
		si a>270 y a<360 Entonces
			Escribir "Cuadrante 4"
		FinSi
		
		si a=90 entonces
			Escribir "Angulo 90º"
		FinSi
		si a=180 entonces
			Escribir "Angulo 180º"
		FinSi
		si a=270 entonces
			Escribir "Angulo 270º"
		FinSi
		si a=360 entonces
			Escribir "Angulo 360º"
		FinSi
FinProceso

