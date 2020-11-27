Proceso if0
	escribir "escribe sexo, dia y mes de nacimiento"
	fe=0
	me=0
	semestre1=0
	semestre2=0
	Definir sexo Como Caracter
	Mientras fe<>10 Hacer
		
		leer sexo
		leer dia
		leer mes
		
		si sexo="f" Entonces
			fe=fe+1
		FinSi
	
		si sexo="m" Entonces
		me=me+1
		FinSi
		
		si mes<=6 Entonces
		semestre1=semestre1+1
		FinSi
		si mes>6 Entonces
		semestre2=semestre2+1
		FinSi
		
		Escribir fe " mujeres"
		Escribir me " varones"
		Escribir semestre1 " primer semestre"
		Escribir semestre2 " segundo semestre"
		FinMientras
		
		
	
FinProceso
	