package com.bilgeadam.week4.lesson001.solid.singleResponsibility;

public class LoanService {

	
	public double getLoanInterestInfo(String loanType)
	{
		if(loanType.equals("homeloan"))
		{
			return 2.30;
		}
		else if(loanType.equals("carloan"))
		{
			return 1.99;
		}
		else if(loanType.equals("personalloan"))
		{
			return 2.00;
		}
		else
		{
			return 5.00;
		}
}
}