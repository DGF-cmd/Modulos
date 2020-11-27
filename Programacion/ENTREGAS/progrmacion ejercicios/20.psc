	Proceso if0 
		Escribir "escribe año y peso"
		leer a;
		leer b;
		
		si a<=1970 Entonces
			si b<2700 Entonces
				cat=1
				reg=11600
			FinSi
			si b>=2700 y b<=3800 Entonces
				cat=2
				reg=23200
			FinSi
			si b>3800 Entonces
				cat=3
				reg=34800
			FinSi
		FinSi
		
		
		si a>=1971 y a<=1979 Entonces
			si b<2700 Entonces
				cat=4
				reg=13000
			FinSi
			si b>=2700 y b<=3800 Entonces
				cat=5
				reg=26000
			FinSi
			si b>3800 Entonces
				cat=6
				reg=39000
			FinSi
		FinSi
		si a>=1980 Entonces
			si b<3500 Entonces
				cat=7
				reg=12000
			FinSi
			si b>=3500 Entonces
				cat=8
				reg=46000
			FinSi
			
		FinSi
		Escribir cat
		Escribir reg
		
FinProceso

