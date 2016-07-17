/** Program:  10.8 Tax Class
  * File:     mainTax.java 
  * Summary:  Chapter 10, Excersise 8, create a Tax class
  * Author:   Eric Roberts
  * Date:     July 16, 2016
**/
public class mainTax {

	public static void main(String[] args) {
		
		//create tax objects
		Tax tax1 = new Tax();
		Tax tax2 = new Tax();
		
		//2001 tax rates
		double[] rate2001 = {15, 27.5, 30.5, 35.5, 39.1};
		tax1.setRates(rate2001);
		
		//brackets for 2001
		int [][] brackets2001 = {
				
				//filing single
				{27050, 65550, 136750, 297350},
				
				//filing Married jointly or qualified widow(er)
				{45200, 109250, 166500, 297350},
				
				//filing married separately
				{22600, 54625, 83250, 148675},
				
				//head of household
				{36250, 93650, 151650, 297350}
				
		};
		
		tax1.setBrackets(brackets2001);
		
		//Print tax tables
		final double FROM = 50000;
		final double TO = 60000;
		final double INTERVAL = 1000;
		
		System.out.println("2001 taxable income brackets from $50,000 to $60,000");
		printTax(tax1, FROM, TO, INTERVAL);
		
		System.out.println("2009 taxable income brackets from $50,000 to $60,000");
		printTax(tax2, FROM, TO, INTERVAL);
			
		

	}

	private static void printTax(Tax tax, double from, double to,
			double interval) {
		
					for (double taxableIncome = from;
						taxableIncome <= to; taxableIncome += interval) {
					tax.setTaxableIncome(taxableIncome);
					System.out.printf("%-13.0f", taxableIncome);
					tax.setfilingStatus(tax.SINGLE_FILER);
					System.out.printf("%8.2f", tax.getTax());
					tax.setfilingStatus(tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER);
					System.out.printf("%15.2f", tax.getTax());
					tax.setfilingStatus(tax.MARRIED_SEPERATELY);
					System.out.printf("%18.2f", tax.getTax());
					tax.setfilingStatus(tax.HEAD_OF_HOUSEHOLD);
					System.out.printf("%15.2f\n", tax.getTax());
				};
	}

}
