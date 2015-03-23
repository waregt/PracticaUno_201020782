import java.io.IOException;
import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Scanner;


public class NivelUno {
	private Scanner scanUno = new Scanner(System.in);
	
	
	public void pausar(){
		System.out.println("\nPresione [Enter] para continuar...");
		try {
			System.in.read();
			for (int i = 0; i < 40; i++) {
				System.out.println("");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public boolean verificarNumero(String cadena){
		try{
			Integer.parseInt(cadena);
			return true;
		}catch (NumberFormatException a){
			return false;
		}
	}
	
	public boolean verificarDouble(String cadena){
		try{
			Double.parseDouble(cadena);
			return true;
		}catch (NumberFormatException a){
			return false;
		}
		
	}
	
	public boolean verificarFecha(String cadena){
		if(cadena.length()==10){
			int contador = 0;
			for (int i = 0; i < cadena.length(); i++) {
				if(cadena.charAt(i)=='-'){
					contador++;
				}
			}

			if(contador==2){
				if(cadena.charAt(2)=='-' && cadena.charAt(5)=='-'){
					String []fecha = cadena.split("-");

					if(verificarNumero(fecha[0]) && verificarNumero(fecha[1]) && verificarNumero(fecha[2])){
						
						if(valorEntero(fecha[0])<31 && valorEntero(fecha[1])<13 && valorEntero(fecha[2])>0){
							return true;
						}else{
							return false;
						}
						
					}else{
						return false;
					}
				}else{
					return false;
				}

			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	
	
	public int valorEntero(String dato){
		return Integer.parseInt(dato);
	}
	
	
	public void limpiarVentana(){
		for (int i = 0; i < 40; i++) {
			System.out.println("");
		}
	}
	
	
	public void problemaNumero1(){
		System.out.println("[Nivel 1 - Problema 1]");
		System.out.println("Dibujo de un rombo con asteriscos.");
		String signo = "* ";
		String signoDos = "* * ";
		System.out.printf("%10s\n", signo);
		
			for (int i = 0; i < 7; i=i+2) {
				System.out.printf("%"+(12+i)+"s\n", (signo+=signoDos));
			}
			
			for (int i = 2; i < 9; i=i+2) {
				System.out.printf("%"+(18-i)+"s\n", signo =signo.substring(0, signo.length()-4));
			}
			
		pausar();

	}

	
	public void problemaNumero2(){
		int sumaPro2 = 0, totalPro2=0;
		float resultadopro2 = 0;
		System.out.println("[Nivel 1 - Problema 2]");
		System.out.println("Ingrese 6 enteros entre 0 y 100 que representan las notas");
		System.out.println("de un estudiante del curso de ipc1, encontrar la media de");
		System.out.println("estas puntuaciones y visualizar una tabla de notas.\n");
		
		for (int i = 1; i < 7; i++) {
			do{
			System.out.print("Ingrese nota " + i + ":");
			totalPro2 = scanUno.nextInt();
			}while(totalPro2<0 || totalPro2>100);
			sumaPro2+=totalPro2; 
		}
		System.out.println("\nInterpretación:\n");
		System.out.printf("%10s %12s\n", "Media", "Puntuación");
		System.out.printf("%11s %5s\n", "[90-100]", "A");
		System.out.printf("%11s %5s\n", "[80 -89]", "B");
		System.out.printf("%11s %5s\n", "[70 -79]", "C");
		System.out.printf("%11s %5s\n", "[60 -69]", "D");
		System.out.printf("%11s %5s\n", "[00 -59]", "E");
		resultadopro2 = (float)sumaPro2 / 6;
		sumaPro2 = sumaPro2/6;
		
		System.out.println(" ");
		System.out.println("La media de las puntuaciones es: " + resultadopro2);
		
		if(sumaPro2<60){
			System.out.println("La nota correspondiente es: E");
		}else if(sumaPro2<70){
			System.out.println("La nota correspondiente es: D");
		}else if(sumaPro2<80){
			System.out.println("La nota correspondiente es: C");
		}else if(sumaPro2<90){
			System.out.println("La nota correspondiente es: B");
		}else if(sumaPro2<101){
			System.out.println("La nota correspondiente es: A");
		}
		
		pausar();
	}

	
	public void problemaNumero3(){
		String cadena = "";
		String limite = ":";
		int horas = 0, minutos = 0, signo = 0;
		
		System.out.println("[Nivel 1 - Problema 3]");
		System.out.println("Cambio de formato de hora. 24 horas a 12 horas.");
		do{
			System.out.println("Ingrese la hora: (24hrs) (Ejemplo: 19:34 ó 04:30)");
			cadena = scanUno.nextLine();
			if(cadena.length()==5){
				signo = cadena.indexOf(":");
				if(signo==2){
					String[] tiempo = cadena.split(limite);
					if(verificarNumero(tiempo[0]) && verificarNumero(tiempo[1])){
						horas = Integer.parseInt(tiempo[0]);
						minutos = Integer.parseInt(tiempo[1]);
						if(horas<25 && minutos<60){
							if(horas==12){
								System.out.println("La hora es: " + horas + ":" + minutos + " PM");
							}else if(horas==24){
								System.out.println("La hora es: 00:" + minutos + " AM");
							}else if(horas>12){
								horas-=12;
								System.out.println("La hora es: " + horas + ":" + minutos + " PM");
							}else{
								System.out.println("La hora es: " + tiempo[0] + ":" + minutos + " AM");
							}
						}else{
							System.out.println("Ayuda:\n(0-23) horas o menos...\n(0-59) minutos o menos...");
							cadena+="hola";
						}
					}else{
						System.out.println("Error en el ingreso de datos...");
						cadena+="hola";
					}
				}else{
					System.out.println("Error en el ingreso de datos...");
					cadena+="hola";
				}
				
			}else{
				System.out.println("*Ayuda: La fecha consta de 5 caracteres incluyendo los dos puntos.");
			}
		}while(cadena.length()!=5);
		
		
		pausar();
	}
	
	
	public void problemaNumero4(){
		DecimalFormat dcmls = new DecimalFormat("#.##");
		String cadena = " ";
		String signo =",";
		int verSigno=0;
		
		System.out.println("[Nivel 1 - Problema 4]");
		System.out.println("Figuras Geometricas\n");
		System.out.println("--------------------------------------------------");
		System.out.printf("%10s%10s%15s","Opción","Figura", "Detalles\n");
		System.out.println("--------------------------------------------------");
		System.out.printf("%8s%12s%30s","C,X","Circulo", "Area, Perimetro y Radio.\n");
		System.out.printf("%8s%13s%22s","U,X","Cuadrado", "Area y Perimetro.\n");
		System.out.printf("%8s%14s%29s","T,X","Triangulo", "Area, Perimetro y Altura.\n");
		System.out.println("\n[X es el valor del radio o lado del cuadrado o triangulo.]");
		System.out.println("Ingrese opción:");
		cadena = scanUno.nextLine();
		verSigno = cadena.indexOf(",");
		if(verSigno==1){
			String[] detalle = cadena.split(signo);
			char letraOpc = detalle[0].charAt(0);
			if(Character.isLetter(letraOpc) && verificarDouble(detalle[1])){
				
				if(letraOpc=='C' || letraOpc=='c'){
					double perimetroC = (2 * Math.PI * Double.parseDouble(detalle[1]));
					double areaC = Math.PI * Double.parseDouble(detalle[1]) * Double.parseDouble(detalle[1]);
					limpiarVentana();
					System.out.println("CIRCULO DE RADIO " + detalle[1] + "\n");
					System.out.println("El área es de: " + dcmls.format(areaC) + " [Unidades cuadradas]");
					System.out.println("El perimetro es de: " + dcmls.format(perimetroC) + " [Unidades lineales]");
				}else if(letraOpc=='U' || letraOpc=='u'){
					limpiarVentana();
					double perimetroU = 4 * Double.parseDouble(detalle[1]);
					double areaU = Double.parseDouble(detalle[1]) * Double.parseDouble(detalle[1]);
					System.out.println("CUADRADO DE LADO " + detalle[1] + "\n");
					System.out.println("El área es de: " + dcmls.format(areaU) + " [Unidades cuadradas]");
					System.out.println("El perimetro es de: " + dcmls.format(perimetroU) + " [Unidades lineales]");
				}else if(letraOpc=='T' || letraOpc=='t'){
					limpiarVentana();
					double perimetroT = 3 * Double.parseDouble(detalle[1]);
					double parte1 = (Math.sqrt(3))/4;
					double areaT = Math.pow(Double.parseDouble(detalle[1]),2) * parte1;
					System.out.println("TRIANGULO EQUILATERO DE LADO " + detalle[1] + "\n");
					System.out.println("El área es de: " + dcmls.format(areaT) + " [Unidades cuadradas]");
					System.out.println("El perimetro es de: " + dcmls.format(perimetroT) + " [Unidades lineales]");
				}else{
					limpiarVentana();
					System.out.println("Opción no encontrada...");
				}
				
			}else{
				limpiarVentana();
				System.out.println("verficar entradas\n"+ detalle[0] + "\n" + detalle[1]);
			}
			
		}else{
			limpiarVentana();
			System.out.println("Error en el ingreso de datos.");
		}
		pausar();
	}
	
	public void problemaNumero5(){
		String cadenaFecha1;
		String cadenaFecha2;
		System.out.println("[Nivel 1 - Problema 5]");
		System.out.println("Ingrese dos fechas y el programa cálculara la diferencia\n"
				+ "de dias entre ambas fechas.");
		do{
			System.out.println("*Formato de ingreso de fechas: 23-03-2015 [dia-mes-año]");
			System.out.println("*[30 dias o menos] [12 meses o menos] [1 o mas años]");
			System.out.println("Ingrese la Primer fecha:");
			cadenaFecha1 = scanUno.nextLine();
			limpiarVentana();
		}while(!verificarFecha(cadenaFecha1));
		
			System.out.println("La Primer Fecha es: " + cadenaFecha1);
		do{	
			System.out.println("Ingrese la Segunda fecha:");
			cadenaFecha2 = scanUno.nextLine();
			limpiarVentana();
			if(!verificarFecha(cadenaFecha2)){
				System.out.println("*Formato de ingreso de fechas: 23-03-2015 [dia-mes-año]");
				System.out.println("*[30 dias o menos] [12 meses o menos] [1 o más años]");
				System.out.println("La Primer fecha es: " + cadenaFecha1);
			}
		}while(!verificarFecha(cadenaFecha2));
		
		if(cadenaFecha1.equals(cadenaFecha2)){
			System.out.println("Las fechas son las mismas, 0 dias de diferencia.");
		}else{
			String []tiempo1 = cadenaFecha1.split("-");
			String []tiempo2 = cadenaFecha2.split("-");
			int dia1 = valorEntero(tiempo1[0]);
			int mes1 = valorEntero(tiempo1[1]);
			int ann1 = valorEntero(tiempo1[2]);
			int dia2 = valorEntero(tiempo2[0]);
			int mes2 = valorEntero(tiempo2[1]);
			int ann2 = valorEntero(tiempo2[2]);
			
			int auxd = 0, auxm = 0, auxa = 0;
			
		    if(ann1 == ann2){
		    	if(mes1 == mes2){
		    		if(dia1 < dia2){
		    			auxd = dia1;
		    			dia1 = dia2;
		    			dia2 = auxd;
		    		}
		    	}else if(mes2>mes1){
		    		
		    		auxd = dia1;
		    		auxm = mes1;
		    		
		    		dia1 = dia2;
		    		mes1 = mes2;
		    		
		    		dia2 = auxd;
		    		mes2 = auxm;
		    	}
		    }else if(ann1<ann2){
		    	
		    	auxd = dia1;
		    	auxm = mes1;
		    	auxa = ann1;
		    	
		    	dia1 = dia2;
		    	mes1 = mes2;
		    	ann1 = ann2;
		    	
		    	dia2 = auxd;
		    	mes2 = auxm;
		    	ann2 = auxa;
		    }
		    
		    System.out.println(cadenaFecha1);
		    System.out.println(cadenaFecha2);
		    System.out.println("Fecha 1 =" + dia1 + "-" + mes1 + "-" + ann1);
		    System.out.println("Fecha 2 =" + dia2 + "-" + mes2 + "-" + ann2);
		    
		    if(ann1==ann2){
		    	if(mes1 == mes2){
		    		System.out.println("La diferencia de dias es de: " + (dia1-dia2)+ " dias.");
		    	}else{
		    		int total = dia1 + (30*(mes1-mes2-1))+(30-dia2);
		    		System.out.println("La diferencia de dias es de: " + total + " dias.");
		    	}
		    }else{
		    	int total = (30-dia2)+(30*(12-mes2));
		    	int total2 = dia1 + (30*(mes1-1));
		    	int total3 = 360*(ann1-ann2-1);
		    	System.out.println("La diferencia de dias es de: " + (total+total2+total3) + " dias.");
		    }
		}
		pausar();
	}
		
}
