package com.seleniumexpress.lc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.seleniumexpress.lc.Converter.CreditCardConverter;
import com.seleniumexpress.lc.Converter.CreditCardConverterObjtoString;
import com.seleniumexpress.lc.formatter.CreditCardFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.seleniumexpress"})
//@PropertySource("classpath:messages.properties")
public class TestConfig implements WebMvcConfigurer {

	@Bean
	public InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		//System.out.println("inside add formater method..");
		//registry.addFormatter(new CreditCardFormatter());
		
		registry.addConverter(new CreditCardConverter());
		registry.addConverter(new CreditCardConverterObjtoString());
		
	}


}
