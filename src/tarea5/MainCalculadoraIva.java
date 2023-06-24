package tarea5;

import java.util.Scanner;

import tarea5.CalculadoraInteres;

public class MainCalculadoraIva {
	
	public static void main(String[] args) {
	Scanner texto = new Scanner(System.in);
	
	System.out.println("¿Cual fue el precio del primer producto?"); 
	int precio1 = texto.nextInt();;
	System.out.println("¿Cual fue el precio del segundo producto?");
	int precio2 = texto.nextInt();
	
	CalculadoraInteres sumaIVA= new CalculadoraInteres(); 
	
	
	double SumaIva = sumaIVA.sumador (precio1, precio2);
	if (SumaIva > 50 ) {
	double Total= SumaIva - (SumaIva* 0.1);
	System.out.println("El pago total con IVA y decuento es " + Total);

	   }
	else if (SumaIva < 50 ) {
		double Tota2= SumaIva - (SumaIva* 0.05);
		System.out.println("El pago total con IVA y decuento es " + Tota2);
	}
	
	
   }
}
