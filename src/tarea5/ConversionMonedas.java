package tarea5;

public class ConversionMonedas {
	double solesDolar =3.8;
	double PesosDolar =17;
	double DolarQuetzal =7.65;
	double QuetzalDolar1 =0.13;
	double pesos1Quetzal =0.19;
	double Quetzalsoles1 =0.46;
	double Quetzalpesos2 =0.5;
	double Dolarpesos =0.058;
	double SolesPesos =0.21;
	double PesosSoles =4.74;
	double DolarSoles =3.648 ;
	double QuetzalSoles =2.15;
	
	//Dolares
	public double DolarSoles (double n1) {
		 double soles = n1 * solesDolar; 
		    return soles;
	}
	public double DolarPesos (double n1) {
		 double pesos = n1 * PesosDolar; 
		    return pesos;
	}
	
	public double DolarQuetzales (double n1) {
		 double quetzales = n1 * DolarQuetzal; 
		    return quetzales;
	}
	//QUETZALES
	public double QuetzalDolar (double n1) {
		 double dolares = n1 * QuetzalDolar1; 
		    return dolares;
	}
	
	public double Quetzalpesos (double n1) {
		 double pesos1 = n1 * pesos1Quetzal; 
		    return pesos1;
	}
	public double Quetzalsoles (double n1) {
		 double soles = n1 * Quetzalsoles1; 
		    return soles;
	}
	
	//PESOS
	public double PesosQuetzales (double n1) {
		 double quetzales = n1 * Quetzalpesos2; 
		    return quetzales;
	}
	public double PesosDolares (double n1) {
		 double Dolares = n1 * Dolarpesos; 
		    return Dolares;
		    
	}
	public double PesosSoles (double n1) {
		 double Soles = n1 * SolesPesos; 
		    return Soles;
	}
	
	//SOLES
	public double SolesPesos (double n1) {
		 double pesos5 = n1 * PesosSoles; 
		    return pesos5;

	}
	public double SolesDolar (double n1) {
		 double Dolar4 = n1 * DolarSoles; 
		    return Dolar4;
	}
	public double SolesQuetzal (double n1) {
		 double Quetzal9 = n1 * QuetzalSoles; 
		    return Quetzal9;
	}
}

