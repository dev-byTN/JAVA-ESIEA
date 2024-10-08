package TD.TD1;

import java.util.Locale;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Currency;

public class Number{
    public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double doubleVal = sc.nextDouble();

        NumberFormat format = NumberFormat.getInstance(java.util.Locale.FRENCH); // formatage français
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.FRENCH);
        currency.setCurrency(Currency.getInstance(Locale.FRANCE));
		
        long french = Math.round(doubleVal); // arrondir

        Currency cur1 = Currency.getInstance("EUR");

		System.out.println("Number: " +format.format(doubleVal));
        System.out.println("Currency: " +currency.format(doubleVal)) ;//+ " " //+ cur1.getSymbol());
		System.out.println("Integer: " +format.format(french));
	}
}
