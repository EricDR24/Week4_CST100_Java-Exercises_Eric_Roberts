/** Program:  10.8 Tax Class
  * File:     Tax.java 
  * Summary:  Chapter 10, Excersise 8, create a Tax class
  * Author:   Eric Roberts
  * Date:     July 16, 2016
**/

public class Tax {
	
	//create data fields
	private int filingStatus;
	public static final int SINGLE_FILER = 0;
	public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
	public static final int MARRIED_SEPERATELY = 2;
	public static final int HEAD_OF_HOUSEHOLD = 3;
	private int[][] brackets;
	private double[] rates;
	private double taxableIncome;
	
	//constructor for tax object
	Tax() {
		
		filingStatus = SINGLE_FILER;
		
		double[] yearRates = {10, 15, 25, 28, 33, 35};
		setRates(yearRates);
		
		int[][] yearBrackets = {
				
				//single filer
				{8350, 33950, 82250, 171550, 372950},
				
				//married jointly or qualifying widow(er)
				{16700, 67900, 137050, 20885, 372950},
				
				//married filing separately
				{8350, 33950, 68525, 104425, 186475},
				
				//head of the household
				{11950, 45500, 117450, 190200, 372950}
		};
		
		setBrackets(yearBrackets);
		
		//default
		taxableIncome = 0;
		
	}
		//Tax constructor with specified brackets
		Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
			setfilingStatus(filingStatus);
			setBrackets(brackets);
			setRates(rates);
			setTaxableIncome(taxableIncome);
		}
		
		//setter for taxable income
		public void setTaxableIncome(double taxableIncome) {
			this.taxableIncome = taxableIncome;
			
			
		}
		//setter for rates
		public void setRates(double[] rates) {
			this.rates = new double[rates.length];
			for (int i = 0; i < rates.length; i++)
				this.rates[i] = rates[i] / 100;
			
		}
		//setter for brackets
		public void setBrackets(int[][] brackets) {
			this.brackets = new int[brackets.length] [brackets[0].length];
			for (int i = 0; i < brackets.length; i++) {
				for (int j = 0; j < brackets[i].length; j++)
					this.brackets[i][j] = brackets[i][j];
			}
		
			
		}
		//setter for filing status
		public void setfilingStatus(int filingStatus) {
			this.filingStatus = filingStatus;
		}
		
		//getter for filing status
		public int getFilingStatus() {
			return filingStatus;
		}
		
		//getter for tax brackets
		public int[][] getBrackets() {
			return brackets;
		}
		
		//getter for rates
		public double[] getRates() {
			return rates;
		}
		
		//getter for tax
		public double getTax() {
			double tax = 0, incomeTaxed = 0;
			double income = taxableIncome;
			if (rates.length >= 2) {
				for (int i = rates.length - 2; i >= 0; i--) {
					if (income > brackets[filingStatus] [i]) {
						tax += (incomeTaxed = income - brackets[filingStatus] [i]) * rates[i + 1];
						income -= incomeTaxed;
					}
				}
			}
			return tax += brackets[filingStatus][0] * rates[0];
		}
}


