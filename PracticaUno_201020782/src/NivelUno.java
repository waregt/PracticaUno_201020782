import java.io.IOException;
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
			System.out.println("Ingrese la hora: (24hrs) (Ejemplo: 19:34)");
			cadena = scanUno.nextLine();
			if(cadena.length()==5){
				signo = cadena.indexOf(":");
				if(signo==2){
					String[] tiempo = cadena.split(limite);
					if(verificarNumero(tiempo[0]) && verificarNumero(tiempo[1])){
						horas = Integer.parseInt(tiempo[0]);
						minutos = Integer.parseInt(tiempo[1]);
						if(horas<24 && minutos<60){
							if(horas==12){
								System.out.println("La hora es: " + horas + ":" + minutos + " PM");
							}else if(horas==24){
								System.out.println("La hora es: " + horas + ":" + minutos + " AM");
							}else if(horas>12){
								horas-=12;
								System.out.println("La hora es: " + horas + ":" + minutos + " PM");
							}else{
								System.out.println("La hora es: " + horas + ":" + minutos + " AM");
							}
						}else{
							System.out.println("Ayuda:\n23 horas o menos...\n59 minutos o menos...");
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
		
		
		System.out.println("exito");
		pausar();
	}
	
	public void problemaNumero4(){
		System.out.println("[Nivel 1 - Problema 4]");
		pausar();
	}
	
	public void problemaNumero5(){
		System.out.println("[Nivel 1 - Problema 5]");
		pausar();
	}
	
}
