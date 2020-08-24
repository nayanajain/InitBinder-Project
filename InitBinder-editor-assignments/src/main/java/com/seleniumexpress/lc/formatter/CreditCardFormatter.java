package com.seleniumexpress.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.seleniumexpress.test.api.CreditCard;

public class CreditCardFormatter implements Formatter<CreditCard> {

	@Override
	public String print(CreditCard object, Locale locale) {
	
		return null;
	}

	@Override
	public CreditCard parse(String text, Locale locale) throws ParseException {
		
		//splitting the credit card
		String[] digitsArray = text.split("-");
		
		//Setting credit card values
		CreditCard creditCard = new CreditCard();
		
		creditCard.setFirstFourDigits(Integer.valueOf(digitsArray[0]));
		creditCard.setSecondFourDigits(Integer.valueOf(digitsArray[1]));
		creditCard.setThirdFourDigits(Integer.valueOf(digitsArray[2]));
		creditCard.setLastFourDigits(Integer.valueOf(digitsArray[3]));
		
		
		//returning credit card objects
		return creditCard;
	}

}
