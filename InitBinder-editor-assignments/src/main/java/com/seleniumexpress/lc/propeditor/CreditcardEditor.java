package com.seleniumexpress.lc.propeditor;

import java.beans.PropertyEditorSupport;

import com.seleniumexpress.test.api.CreditCard;

public class CreditcardEditor extends PropertyEditorSupport{
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
      String[] digitsArray = text.split("-");
		
		//Setting credit card values
		CreditCard creditCard = new CreditCard();
		
		creditCard.setFirstFourDigits(Integer.valueOf(digitsArray[0]));
		creditCard.setSecondFourDigits(Integer.valueOf(digitsArray[1]));
		creditCard.setThirdFourDigits(Integer.valueOf(digitsArray[2]));
		creditCard.setLastFourDigits(Integer.valueOf(digitsArray[3]));
		
		
		//returning credit card objects
		setValue(creditCard); 

		
	}
	
	
//	@Override
//	public String getAsText() {
//		//return "enter in xxxx-xxxx-xxxx-xxxx";
//	
//	    CreditCard creditCard=(CreditCard)getValue();
//	    return "try"+creditCard;
//	}
}
