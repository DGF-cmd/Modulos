
	Proceso if0 
		
		leer a; 
		escribir "ingrese una opcion"
		escribir "+"
		escribir "-"
		escribir "*"
		escribir "/"
		leer operando;
		leer b;
		Segun(operando)
			"+":
				escribir a+b
			"-":
				escribir a-b
			"*":
				escribir a*b
			"/":
				escribir a/b
			De Otro Modo:
				escribir "Error en simbolo"
		Fin Segun
FinProceso

