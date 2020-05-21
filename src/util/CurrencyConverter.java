package util;

public class CurrencyConverter {
		
	public static double convert(double dollarValue, double dollarBought) {
		return (dollarValue * dollarBought) * 0.06 + (dollarValue * dollarBought);
	}
}
