package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;



public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		double dollarValue, dollarBought, convert;
		
		System.out.print("What is the dollar price? ");
		dollarValue = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		dollarBought = sc.nextDouble();
		
		convert = CurrencyConverter.convert(dollarValue, dollarBought);
		
		System.out.printf("Amount to be paid in reais = %.2f", convert);
		
		sc.close();
		
	}

}
