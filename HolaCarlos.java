import java.util.Scanner; //Clase
public class HolaCarlos {
 
	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		Scanner mensaje = new Scanner(System.in);
		
//Mostrar mensaje
		
	System.out.println("Introduce el primer valor");
		num1 = mensaje.nextInt();

//Lo que se introduce se almacena en la variable num1

	System.out.println("Introduce el segundo valor");
		num2 = mensaje.nextInt();

		num3 = num1 + num2;

//Lo que se introduce se almacena en la variable num2

		System.out.println("El resultado es: " + num3);
	}
 
}