package util;

public class Currency_Converter {

	
	public static double IOF = 0.6;
	
	
	public double dollarToReal(double amount, double dollarPrice) {
		return dollarPrice * amount * IOF;
	}
	

}
