package com.seleniumexpress.lc.controllers;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CurrencyEditor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.lc.formatter.CreditCardFormatter;
import com.seleniumexpress.lc.propeditor.CreditcardEditor;
import com.seleniumexpress.lc.propeditor.MyCurrencyEditor;
import com.seleniumexpress.test.api.BillDTO;
import com.seleniumexpress.test.api.CreditCard;

@Controller
public class TestController {

	@RequestMapping("/")
	public String showHomepage(@ModelAttribute("billDTO") BillDTO billDTO) {
		CreditCard creditCard=new CreditCard();
		creditCard.setSecondFourDigits(1234);
		creditCard.setFirstFourDigits(1234);

		creditCard.setThirdFourDigits(8787);
		creditCard.setLastFourDigits(1234);
		billDTO.setCreditCard(creditCard);

		

		return "bill-page";
	}

	@RequestMapping(value = "/process-bill")
	public String showResultPage(@Valid @ModelAttribute("billDTO") BillDTO billDTO, BindingResult result) {

		if (result.hasErrors()) {

			return "bill-page";
		}

		return "result-page";

	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-mm-yyyy");
		CustomDateEditor editor = new CustomDateEditor(simpleDateFormat, true);
		binder.registerCustomEditor(Date.class, "date", editor);

		NumberFormat numberFormat = new DecimalFormat("##,###.00");
		CustomNumberEditor editor2 = new CustomNumberEditor(BigDecimal.class, numberFormat, true);
		binder.registerCustomEditor(BigDecimal.class, "amount", editor2);

		MyCurrencyEditor currencyEditor = new MyCurrencyEditor();
		binder.registerCustomEditor(Currency.class, "currency", currencyEditor);
		
		
		
		//registering custom formatter with init binder
		//binder.addCustomFormatter(new CreditCardFormatter());
		
		
		//using property editor instead of formatter
		CreditcardEditor editor3=new CreditcardEditor();
		binder.registerCustomEditor(CreditCard.class, "creditCard", editor3);
		
		

	}
}
