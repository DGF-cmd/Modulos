Proceso if0 
	
	leer a; 
	leer b;
	leer c;
	Si a>b y a>c y b>c Entonces 
			Escribir a "," b "," c;
		SiNo
			Si b>a y b>c y a>c Entonces 
				Escribir b "," a "," c;
			SiNo
				si c>a y c>b y b>a Entonces 
					Escribir c "," b "," a;
				FinSi
				
				FinSi
			
			
		FinSi
FinProceso
