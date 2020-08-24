package com.seleniumexpress.testing;

import java.util.Currency;
import java.util.Locale;

public class CurrencyDemo {
	
	public static void main(String[] args) {
		
	//JPY,AUD,INR,USD
	
	Currency currency = Currency.getInstance(Locale.CANADA);
	//System.out.println(currency.getDisplayName());
	//System.out.println(currency.getCurrencyCode());	
	System.out.println(currency.getSymbol(Locale.CANADA));
		
	}

}
