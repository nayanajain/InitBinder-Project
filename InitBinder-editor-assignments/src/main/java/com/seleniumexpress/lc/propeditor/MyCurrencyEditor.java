package com.seleniumexpress.lc.propeditor;

import java.beans.PropertyEditorSupport;
import java.util.Currency;

public class MyCurrencyEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Currency currency = Currency.getInstance(text.toUpperCase());
		setValue(currency);
		// super.setAsText(text);
	}

}
