package com.ecil.core;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;




@Configuration
@Scope(scopeName=ConfigurableListableBeanFactory.SCOPE_SINGLETON)
public class Address 

{
	
	
	
	
	public Address() {
		System.out.println("Adress");
	}
	

private String Street;
private String city;

public String getStreet() {
	return Street;
}
public void setStreet(String street) {
	Street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

}
