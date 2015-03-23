import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;


public class NivelDos {
	private Scanner scanDos = new Scanner(System.in);

	public void limpiarPantalla(){
		for (int i = 0; i < 40; i++) {
			System.out.println("");
		}
	}
	
	public void pausa(){
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
	
	public void problema6(){
		int valor1 = 0, valor2 = 0, bandera = 0;
		String operador = "";
		limpiarPantalla();
		System.out.println("[Problema 6 - Nivel 2]");
		System.out.println("-----------------------------------");
		System.out.printf("%10s%10s\n","Opcion", "Detalles");
		System.out.println("-----------------------------------");
		System.out.printf("%8s%26s\n","s", "Suma entre dos numeros.");
		System.out.printf("%8s%27s\n","r", "Resta entre dos numeros.");
		System.out.printf("%8s%36s\n","m", "Multiplicacion entre dos numeros.");
		System.out.printf("%8s%30s\n","d", "Cociente entre dos numeros.");
		
			do{
				System.out.println("Ingrese opción:");
				operador = scanDos.next();
				switch (operador.charAt(0)){
					case 's':
					case 'r':
					case 'm':
					case 'd':
						bandera = 1;
						break;
				    default:
				    	bandera = 0;
						break;
				}
			}while((operador.length()>1) || bandera==0 );
			
			System.out.println("Ingrese el primer número: ");
			valor1 = scanDos.nextInt();
			System.out.println("Ingrese el segundo número: ");
			valor2 = scanDos.nextInt();
			
			switch (operador.charAt(0)){
				case 's':
					System.out.println("La suma de los numeros es: " + valor1 + "+" + valor2 + " = " + (valor1+valor2));
					break;
				case 'r':
					System.out.println("La resta de los numeros es: " + valor1 + "-" + valor2 + " = " + (valor1-valor2));
					break;
				case 'm':
					System.out.println("La multiplicación de los numeros es: " + valor1 + "*" + valor2 + " = " + (valor1*valor2));
					break;
				case 'd':
					System.out.println("El cociente de los numeros es: " + valor1 + "/" + valor2 + " = " + (valor1/valor2));
					break;
				default:
					System.out.println("error");
					break;
			}
	
		pausa();
	}

	public void problema7(){
		limpiarPantalla();
		int num1;
		System.out.println("[Problema 7 - Nivel 2]");
		System.out.println("Mostrar la tabla de multiplicar en orden descendente\nde número entre 1 y 10.");
		do{
			System.out.println("Ingrese un número:");
			num1 = scanDos.nextInt();
			if(num1<1 || num1>10){
				System.out.println("*valores entre 1 y 10.");
			}
		}while(num1<1 || num1>10);
		
		System.out.println("TABLA DEL NUMERO " + num1);
		for (int i = 10; i > 0; i--) {
			System.out.printf("%4s%4s%4s%4s%4s\n", num1 ,"*",i,"=",(num1*i));
		}
		pausa();
	}

	public void problema8(){
		limpiarPantalla();
		int num1 = 0, num2 = 0;
		System.out.println("[Problema 8 - Nivel 2]");
		System.out.println("Numeros a letras. Intervalo [0-100]");
		System.out.println("Al ingresar 2 numeros se generara un número aleatorio");
		System.out.println("en el rango y se interpretara en letras.");
		
		do{
	    System.out.println("Ingrese el Primer número: [lim inferior][0-100]");
	    num1 = scanDos.nextInt();
		}while(num1<0 || num1>100);
		
		do{	
	    System.out.println("Ingrese el segundo número: [lim superior][0-100]");
	    num2 = scanDos.nextInt();
		}while(num2<num1 || num2>100);
		
	    int valorEntero = (int) Math.floor(Math.random()*(num2-num1)+num1);
	    
	    String [] unidades =  {"", "UNO ", "DOS ", "TRES ", "CUATRO ", "CINCO ", 
				"SEIS ", "SIETE ", "OCHO ", "NUEVE ", "DIEZ ",
				"ONCE", "DOCE", "TRECE", "CATORCE", "QUINCE", "DIECISIEIS",
				"DIECISIETE", "DIECIOCHO", "DIECINUEVE" , "VEINTE", "VEINTIUNO"};
	
		String [] decenas = {"","","VEINTI", "TREINTA", "CUARENTA", "CINCUENTA", "SESENTA",
					"SETENTA", "OCHENTA", "NOVENTA"};
		
		String [] uni2 = {"", " Y UNO", " Y DOS", " Y TRES", " Y CUATRO", " Y CINCO",
				" Y SEIS", " Y SIETE", " Y OCHO", " Y NUEVE"};

		if(valorEntero<21){
			for (int i = 0; i < 22; i++) {
				if(valorEntero == i){
					limpiarPantalla();
					System.out.println("Liminte Inferior = " + num1);
					System.out.println("Valor Aleaotorio = " + valorEntero);
					System.out.println("Liminte Superior = " + num2);
					System.out.println("Aleatorio expresando en letras = " + unidades[i]);
					break;
				}
			}
		}else{
			String ltr = String.valueOf(valorEntero);
			String dec1 = String.valueOf(ltr.charAt(0));
			String uni1 = String.valueOf(ltr.charAt(1));
			int dec = Integer.parseInt(dec1);
			int uni = Integer.parseInt(uni1);
			String resultado ="";
			
			for (int i = 1; i < 10; i++) {
				if(dec==i){
					resultado = decenas[i];
					break;
				}
			}
			
			for (int i = 1; i < 10; i++) {
				
				if(dec>2){
					if(uni==i){
						resultado+=uni2[i];
						break;
					}
				}else{
					if(uni==i){
						resultado+=unidades[i];
						break;
					}
				}
			}
			limpiarPantalla();
			System.out.println("Liminte Inferior = " + num1);
			System.out.println("Valor Aleaotorio = " + valorEntero);
			System.out.println("Liminte Superior = " + num2);
			System.out.println("Aleatorio expresando en letras = " + resultado);
		}
		
	    pausa();
	}

	public void problema9(){
		limpiarPantalla();
		System.out.println("[Problema 9 - Nivel 2]");

	}
	public void problema10(){
		limpiarPantalla();
		int num1 = 0, num2=1 ,espacios=0;
		String linea = "";
		
		System.out.println("[Problema 10 - Nivel 2]");
		System.out.println("Piramide invertida de números");
		System.out.println("Ingrese un número entero:");
		num1 = scanDos.nextInt();
		espacios = num1*2;
		do{
			for (int i = (num1+1); i >1; i--) {
				linea+=num2+" ";
			}
			System.out.printf("%"+espacios+"s\n",linea);
			num1--;
			espacios--;
			num2++;
			linea="";
		}while(num1>0);
		pausa();
		

	}

	public void problema11(){
		limpiarPantalla();
		System.out.println("[Problema 11 - Nivel 2]");

	}
	public void problema12(){
		limpiarPantalla();
		String cadena= "", linea = "";
		
		System.out.println("[Problema 12 - Nivel 2]");
		System.out.println("Cambiar letras por asteriscos.");
		System.out.println("Ingrese una cadena de texto:");
		cadena = scanDos.nextLine();
		
		for (int i = 0; i < cadena.length(); i++) {
			
			if(cadena.charAt(i)!=' '){
				linea+="*";
			}else{
				linea+=" ";
			}
		}
		
		System.out.println("Cadena de texto ingresada:   "+cadena);
		System.out.println("Cadena de texto modificada:  "+linea);
		pausa();
	}

	public void problema13(){
		limpiarPantalla();
		String letra = "", intento="";
		
		System.out.println("[Problema 13 - Nivel 2]");
		System.out.println("Encuentra la letra.");
		do{
		System.out.println("Ingresa una letra [A-Z]:");
		letra = scanDos.nextLine();
		letra = letra.toUpperCase();
		
			if(letra.length()!=1){
				System.out.println("Error en el ingreso.");
				letra="4";
			}else if(letra.codePointAt(0)<65 || letra.codePointAt(0)>90){
				System.out.println("Error en el ingreso de la letra.\nSolo una letra.");
			}else{
				limpiarPantalla();
				System.out.println("Letra guardada exitosamente...\nQue empiece el juego... ");
			}
		}while(letra.codePointAt(0)<65 || letra.codePointAt(0)>90); 
		
		do{
			System.out.println("Ingresa una letra:");
			intento = scanDos.nextLine();
			
			if(intento.length()==1){
				intento = intento.toUpperCase();
				if(intento.codePointAt(0)>64 && intento.codePointAt(0)<91){
					if(intento.codePointAt(0)==letra.codePointAt(0)){
						System.out.println("Exito, Encontraste la letra. La letra buscada era la: " +letra);
					}else if(intento.codePointAt(0)>letra.codePointAt(0)){
						System.out.println("Atras...");
					}else {
						System.out.println("Adelante...");
					}
					
				}else{
					System.out.println("Error en el ingreso.\nSolo letras.");
				}
			}else{
				System.out.println("Error en el ingreso.");
			}
			
			
		}while(!intento.equals(letra));
		
		pausa();
	}
	
	public void problema14(){
		limpiarPantalla();
		String cadh="", cadv="*";
		System.out.println("[Problema 14 - Nivel 2]");
		System.out.println("Dibujar un cuadrado de 'n' elementos:");
		System.out.println("Ingrese un número entero:");
		int num = scanDos.nextInt();
		
		if(num == 0){
			System.out.println("No hay cuadrado... =0)");
		}else if(num == 1){
			System.out.println("*");
		}else if(num==2){
			System.out.println("**\n**");
		}else{
			for (int i = 0; i < num; i++) {
				cadh+="*";
			}
			System.out.println(cadh);
			
			for (int i = 0; i < (num-2); i++) {
				System.out.printf("%s%"+(num-1)+"s\n", "*","*");
			}
			System.out.println(cadh);
		}
		
		pausa();

	}

	public void problema15(){
		limpiarPantalla();
		DecimalFormat dcmls = new DecimalFormat("#.##");
		double num = 0, contador =0, conta2=0;
		pausa();
	}
	
}
