package descuento;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//presentando tienda		
		System.out.println("--- Bienvenido a Mi Tienda ---");
		System.out.println("Si el monto de su compra es igual o superior a $100.000 obtendrá un 10% de descuento");
		
		//pidiendo datos
		System.out.println("Ingrese su nombre: ");
		String nombreCliente = scanner.nextLine();
		
		System.out.println("Ingrese el valor de su compra: ");
		int monto = scanner.nextInt();
		
		//calculando el descuento 10%
		int descuento = 0;
		if (monto >= 100000) {
			descuento = (monto * 10)/100; //para calcular 10%
		}
		int totalPago = monto - descuento;
		
		//resultado del descuento y datos cliente
		//para usar separador de miles se deben convertir a String y aplicar %,d
		System.out.println("\n---- Detalle de la compra ----");
		System.out.println("El cliente " + nombreCliente + " realizó una compra por $ " + String.format("%,d",monto));
		System.out.println("El descuento correspondiente a su compra es de $ " + String.format("%,d",descuento));
		System.out.println("El total a pagar por su compra es de $ " + String.format("%,d",totalPago));
		System.out.println("---- Gracias por preferirnos ----");
		
		scanner.close();
		
	}

}
