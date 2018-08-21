package montoEsc;

public class montoEsc {
	
	private String[] vecUnidad = {"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
	private String[] vecDecena = {"diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta","ochenta","noventa"};
	private String[] vecEspecial = {"once","doce","trece","catorce","quince","dieciseis","diecisiete","dieciocho","diecinueve"};
	private String[] vecCentena = {"cien","doscientos","trescientos","cuatrocientos","quinientos","seiscientos","setecientos","ochocientos","novecientos"};
	private String mil = "mil";
	//Obtener nombre de unidades
	public String nameUnidad(int numUnidad) 
	{		
		return vecUnidad[numUnidad];
		
	}
	//Obtengo nombre de las decenas
	public String nameDecena(int numDecena) 
	{	
		
		int divNum = numDecena/10;
		int resNum = numDecena%10;
		//Si su residuo es igual a cero
		if (resNum == 0)
		{
			return vecDecena[divNum-1];
		}
		else 
		{	
			//Obtener los nombres del vecEspecial
			if(divNum == 1) {
				return vecEspecial[resNum-1];
			}
			//Obtener los nombres del veinte que son especiales
			else if(divNum == 2) {
				return "veinti"+nameUnidad(resNum);
			}
			else {
			return vecDecena[divNum-1] + " y " + nameUnidad(resNum);
			}
		}
		
	}
	//Obetener nombre de Centenas
	public String nameCentena(int numCentena) 
	{	
		
		int divNum = numCentena/100;//1
		int resNum = numCentena%100;//1
		//Si su residuo es igual a cero
		if (resNum == 0) 
		{ 
			return vecCentena[divNum-1];
		}
		else if (resNum >= 1 && resNum <= 9)
		{
			if (divNum == 1) 
			{ 
				return "ciento"+" "+nameUnidad(resNum);
			}
			else {
			return vecCentena[divNum-1]+" "+nameUnidad(resNum);
			}
		}
		else
		{
			String decena=nameDecena(resNum);
			if (divNum == 1) 
			{ 
				return "ciento"+" "+decena;
			}
			else {
			return vecCentena[divNum-1]+" "+decena;
			}
		}
	}
		//Obetener nombre de Milesimas
		public String nameMiles(int numMil) 
		{	
			
			int divNum = numMil/1000;//1
			int resNum = numMil%1000;//1
			//Si su residuo es igual a cero
			if (resNum == 0 && divNum == 1)
			{ 
				return mil ;
			}
			else if (resNum == 0)
			{
				return nameUnidad(divNum)+" "+mil;
			}
			else if (resNum >=1 && resNum <=9) 
			{
				return nameUnidad(divNum)+" "+mil+" "+nameUnidad(resNum);
			}
			else if (resNum >=10 && resNum<=99)
			{
				return nameUnidad(divNum)+" "+mil+" "+nameDecena(resNum);
			}
			else
			{
				return nameUnidad(divNum)+" "+mil+" "+nameCentena(resNum);
			}
	}

}
