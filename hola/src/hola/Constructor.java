package hola;
import java.util.Scanner;
public class Constructor {
	public static void main(String[]args) {
		
		Scanner teclado=new Scanner(System.in);
		
		int n1=0;		//iniamos variable en 0 para entrar al bucle
		
		do {

		System.out.println("elige una forma geometrica");		//informacion para el usuario
		System.out.println("1=Circulo");
		System.out.println("2=Cilindro");
		System.out.println("3=Rectangulo");
		System.out.println("4=salir");
		
		n1=teclado.nextInt();									//introduce opcion para el switch
		
		switch (n1) {

		case 1:  												//elige 1 vuelve a preguntar que quiere que haga
			System.out.println("has elegido circulo, ¿que deseas hacer ahora?");
			System.out.println("1=Area");
			System.out.println("2=Perimetro");
			int n2=teclado.nextInt();							//elige segunda opcion
			System.out.println("introduce radio");
			double radio=teclado.nextDouble();					//pide las variables que necesita para operar
			
				switch (n2) {

				case 1:  

					System.out.println("has elegido calcular el area");			
					Circulo micirculo = new Circulo (radio);				//llamamos al las clases creadas
					double area = micirculo.CalcularArea();
					System.out.println("el area del ciculo es: "+area);		//esta es la solucion
					break;
			
				case 2:  
					System.out.println("has elegido calcular el perimetro");
					Circulo micirculo2 = new Circulo (radio);				//llamamos al las clases creadas
					double perimetro= micirculo2.CalcularPerimetro();
					System.out.println("el area del ciculo es: "+perimetro);	//esta es la solucion
				
					break;

					default: 
						System.out.println("numero no valido");
				
		            break;
	
		             
				}
			
			
		             break;
		case 2:  
			System.out.println("has elegido cilindro, ¿que deseas hacer ahora?");
			System.out.println("1=Area");
			System.out.println("2=Volumen");
			int n3=teclado.nextInt();
			System.out.println("introduce altura");
			double altura=teclado.nextDouble();
			System.out.println("introduce radio");
			double radio2=teclado.nextDouble();
			
				switch (n3) {

				case 1:  

					System.out.println("has elegido calcular el area");
					Cilindro micilindro = new Cilindro (radio2,altura);
					double area = micilindro.CalcularArea();
					System.out.println("el area del ciculo es: "+area);
					break;
			
				case 2:  
					System.out.println("has elegido calcular el volumen");
					Cilindro micilindro2 = new Cilindro (radio2,altura);
					double volumen= micilindro2.CalcularVolumen();
					System.out.println("el area del ciculo es: "+volumen);
				
					break;

					default: 
						System.out.println("numero no valido");
		            break;
	
		             
				}
			
			
		             break;
		case 3:  
			System.out.println("has elegido rectangulo, ¿que deseas hacer ahora?");
			System.out.println("1=Area");
			System.out.println("2=Perimetro");
			int n4=teclado.nextInt();
			System.out.println("introduce altura");
			double altura3=teclado.nextDouble();
			System.out.println("introduce base");
			double base=teclado.nextDouble();
			
				switch (n4) {

				case 1:  

					System.out.println("has elegido calcular el area");
					Rectangulo mirectangulo = new Rectangulo (base,altura3);
					double area = mirectangulo.CalcularArea();
					System.out.println("el area del ciculo es: "+area);
					break;
			
				case 2:  
					System.out.println("has elegido calcular el perimetro");
					Rectangulo mirectangulo2 = new Rectangulo (base,altura3);
					double perimetro= mirectangulo2.CalcularPerimetro();
					System.out.println("el area del ciculo es: "+perimetro);
				
			        break;

					default: 
						System.out.println("numero no valido");
		            break;
	
		             
		}
			
				
				
		case 4:  
			System.out.println("has elegido salir");		//4º opcion del switch principal
			System.exit(0);									//sales del programa
				
				
					break;

					
					
			default: 										//opcion por si no introduces un valor valido
				System.out.println("numero no valido");
		             break;
	
		             
		}
		
		}while(n1!=4);										//comprueba si quieres continuar o salir
		
	}
}