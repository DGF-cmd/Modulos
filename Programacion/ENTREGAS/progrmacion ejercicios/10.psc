
Proceso if0 
	
	leer a;
	leer b;
	leer c;
	
	leer d;
	leer e;
	leer f;
	
	dias=0
	hora=a+d;
	minutos=b+e;
	segu=c+f;
	
	si hora>24 entonces
		dias=dias+1
		hora=hora-24
	FinSi
	
	si minutos>60 entonces
		hora=hora+1;
		minutos=minutos-60;
	FinSi
	
	si segu>60 entonces
		minutos=minutos+1;
		segu=segu-60;
	FinSi
	
	escribir dias," dia/s";
	escribir hora," hora/s";
	escribir minutos," minutos/s";
	escribir segu," segundo/s";
	
	
FinProceso