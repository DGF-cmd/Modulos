	Proceso if0 
		Escribir "escribe numeros"
		Leer a
		leer b
		
		si a<=1970 entonces
			si b<2700 entonces
				cat=1
				tar=11.600
			FinSi
			si b>=2700 y b<3800 entonces
				cat=2
				tar=23.200
			FinSi
			si b>3800 entonces
				cat=3
				tar=34.800
			FinSi
		FinSi
		
		si a>1970 y a<1980 entonces
			si b<2700 entonces
				cat=4
				tar=13.000
			FinSi
			si b>=2700 y b<3800 entonces
				cat=5
				tar=26.000
			FinSi
			si b>3800 entonces
				cat=6
				tar=39.000
			FinSi
		FinSi
		
		si a>=1980 entonces
			si b<3500 entonces
				cat=7
				tar=12.000
			FinSi
			si b>=2700 y b<3800 entonces
				cat=2
				tar=23.200
			FinSi
			si b>3800 entonces
				cat=3
				tar=34.800
			FinSi
		FinSi
		escribir cat
		escribir tar
		
		
FinProceso

