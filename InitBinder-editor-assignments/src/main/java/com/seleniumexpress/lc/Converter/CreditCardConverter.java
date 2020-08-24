package com.seleniumexpress.lc.Converter;

import org.springframework.core.convert.converter.Converter;

import com.seleniumexpress.test.api.CreditCard;

public class CreditCardConverter implements Converter<String, CreditCard> {

	@Override
	public CreditCard convert(String source) {
		
		//splitting the credit card
				String[] digitsArray = source.split("-");
				
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
