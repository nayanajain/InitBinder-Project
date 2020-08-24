package com.seleniumexpress.lc.Converter;

import org.springframework.core.convert.converter.Converter;

import com.seleniumexpress.test.api.CreditCard;

public class CreditCardConverterObjtoString implements Converter<CreditCard, String>
{

	@Override
	public String convert(CreditCard source) {
	
         return "sample"+ source.getFirstFourDigits()+"-"+source.getSecondFourDigits()+"-"+source.getThirdFourDigits()+"-"+source.getLastFourDigits();	
}

}
