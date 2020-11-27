Proceso if0 
	leer a; 
	leer b;
	leer c;
	leer d;
	Si a>b y a>c y a>d Entonces 
		si a>d y b>d entonces
			si c>d Entonces
				escribir a+d;
			FinSi
		FinSi
		
		si a>b y c>b y d>b Entonces
				escribir a+b;
				
			
		FinSi
		si a>c y b>c y d>c Entonces
				escribir a+c;
				
			
		FinSi
		
	FinSi
	
		
	Si b>a y b>c y b>d Entonces 
			si a>d y c>d entonces
					escribir b+d;
				
			FinSi
			
			si c>a y d>a Entonces

					escribir b+a;
					

			FinSi
			si a>c y d>c Entonces

					escribir b+c;
					

			FinSi
		FinSi
		
		
	Si c>a y c>b y c>d Entonces 
			si a>d y b>d entonces

					escribir c+d;

			FinSi
			
			si b>a y d>a Entonces
					escribir c+a;
					

			FinSi
			si d>b y a>b Entonces

					escribir c+b;
					

			FinSi
		FinSi	
		
		
	Si d>a y d>b y d>c Entonces 
			si a>c y b>c entonces
				
				escribir d+c;
				
			FinSi
			
			si b>a y c>a Entonces
				escribir d+a;

			FinSi
			si a>b y a>b Entonces
				escribir d+b;
			FinSi
		FinSi
		
		

FinProceso