import java.util.Scanner;


public class Principal {

	public Scanner scan = new Scanner(System.in);
	private NivelUno nUno = new NivelUno();
	private int opcApp1 = 0; 
	private int opcUno = 0;
	
	public static void main(String[] args) {
		Principal pl = new Principal();
		pl.menuPrincipal();

	}

	public void menuPrincipal(){
		limpiarPantalla();
		
		do{
			System.out.println("************* MENU PRINCIPAL *************\n");
			System.out.printf("%8s%15s", "Opción", "Detalles\n");
			System.out.printf("%5s%27s","1", "Problemas Nivel 1\n");
			System.out.printf("%5s%27s","2", "Problemas Nivel 2\n");
			System.out.printf("%5s%28s","0", "Salir del Programa\n");
			do{
			System.out.print("\nIngrese opción:");
			opcUno = scan.nextInt();
			switch (opcUno) {
				case 1: menuAppUno();
					break;
				case 2: menuAppDos();
					break;
				default:
					System.out.println("*Ayuda: Solo se pueden ingresar los valores 0, 1 y 2.");
			}
			
			}while(opcUno<0 || opcUno>2);
		}while(opcUno!=0);
		
		limpiarPantalla();
		System.out.println("_______________FIN DEL PROGRAMA_______________");
		System.out.println("___________________Feliz Dia__________________");
		scan.close();
	}
	
	public void menuAppUno(){
		do{
		limpiarPantalla();
		System.out.println("********** APLICACIONES NIVEL 1 **********\n");
		System.out.printf("%8s%13s%15s", "Opción","Actividad", "Detalles\n");
		System.out.printf("%5s%17s%29s","1", "Problema 1","Figura Rombo Asteriscos\n");
		System.out.printf("%5s%17s%26s","2", "Problema 2","Notas del estuciante\n");
		System.out.printf("%5s%17s%18s","3", "Problema 3","Validar Hora\n");
		System.out.printf("%5s%17s%25s","4", "Problema 4","Figuras geometricas\n");
		System.out.printf("%5s%17s%23s","5", "Problema 5","Dias entre fechas\n");
		System.out.printf("%5s%15s%26s","0", "Reguesar","Regruesar Anterior\n");
		do{
			System.out.print("\nIngrese opción:");
		    opcApp1 = scan.nextInt();
			switch (opcApp1) {
			case 0: limpiarPantalla();
				break;
			case 1: limpiarPantalla();
					nUno.problemaNumero1();
				break;
			case 2: limpiarPantalla();
					nUno.problemaNumero2();
				break;
			case 3: limpiarPantalla();
					nUno.problemaNumero3();
				break;
			case 4: System.out.println("problema2");
				break;
			case 5: System.out.println("problema2");
				break;
			default:
				System.out.println("*Ayuda: Solo se pueden ingresar los valores en el rango de 0 y 5.");
			}
			}while(opcApp1<0 || opcApp1>5);
		}while(opcApp1!=0);
	}
	
	public void menuAppDos(){
		limpiarPantalla();
		System.out.println("********** APLICACIONES NIVEL 2 **********");
	}
	
	public void limpiarPantalla(){
		for (int i = 0; i < 40; i++) {
			System.out.println(" ");
		}
	}



}
