package tarea5;

import java.util.Scanner;

public class MainMonedas {
	public static void main(String[] args) {
	Scanner texto = new Scanner(System.in);
	
	System.out.println("¿Cual es tu moneda para cambiar Dolares, Quetzales, Pesos o Soles?");
	String moneda = texto.nextLine();
	
	//DOLARES
	if (moneda.equals("Dolares")){
	System.out.println("¿cuanto es el monto a cambiar?");
	double monto = texto.nextDouble();

	ConversionMonedas soles= new ConversionMonedas(); 
	ConversionMonedas pesos= new ConversionMonedas(); 
	ConversionMonedas quetzales= new ConversionMonedas(); 
	
	double cambioSoles = soles.DolarSoles (monto);
	System.out.println("La conversion en soles es " + cambioSoles);
	double cambioPesos = pesos.DolarPesos(monto);
	System.out.println("La conversion en pesos es " + cambioPesos);
	double cambioQuetzales = quetzales.DolarQuetzales(monto);
	System.out.println("La conversion en quetzales es " + cambioQuetzales);
	} 
	//QUETZALES
	else if (moneda.equals("Quetzales")){
		System.out.println("¿cuanto es el monto a cambiar?");
		double monto2 = texto.nextDouble();

		ConversionMonedas dolares= new ConversionMonedas(); 
		ConversionMonedas pesos= new ConversionMonedas(); 
		ConversionMonedas soles= new ConversionMonedas(); 
		
		double cambioDolares = dolares. QuetzalDolar (monto2);
		System.out.println("La conversion en dolares es " + cambioDolares);
		double cambioPesos2 = pesos.Quetzalpesos(monto2);
		System.out.println("La conversion en pesos es " + cambioPesos2);
		double cambioSoles2 = soles.Quetzalsoles(monto2);
		System.out.println("La conversion en soles es " + cambioSoles2);
		} 
	//PESOS
	else if (moneda.equals("Pesos")){
		System.out.println("¿cuanto es el monto a cambiar?");
		double monto3 = texto.nextDouble();

		ConversionMonedas quetzales= new ConversionMonedas(); 
		ConversionMonedas dolares= new ConversionMonedas(); 
		ConversionMonedas soles= new ConversionMonedas(); 
		
		double cambioQuetzales2 = quetzales. PesosQuetzales (monto3);
		System.out.println("La conversion en quetzales es " + cambioQuetzales2);
		double cambioDolares2 = dolares.PesosDolares(monto3);
		System.out.println("La conversion en dolares es " + cambioDolares2);
		double cambioSoles3 = soles.PesosSoles(monto3);
		System.out.println("La conversion en soles es " + cambioSoles3);
		} 
	//SOLES
	else {
		System.out.println("¿cuanto es el monto a cambiar?");
		double monto4 = texto.nextDouble();

		ConversionMonedas pesos= new ConversionMonedas(); 
		ConversionMonedas dolares= new ConversionMonedas(); 
		ConversionMonedas quetzal= new ConversionMonedas(); 
		
		double cambioPesos3 = pesos.SolesPesos (monto4);
		System.out.println("La conversion en pesos es " + cambioPesos3);
		double cambioDolares3 = dolares.SolesDolar(monto4);
		System.out.println("La conversion en dolares es " + cambioDolares3);
		double cambioQuetzal3 = quetzal.SolesQuetzal(monto4);
		System.out.println("La conversion en quetzales es " + cambioQuetzal3);
	}
	}
}
	