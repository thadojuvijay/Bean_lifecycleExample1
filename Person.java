package com.ecil.core;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
@Scope(scopeName=ConfigurableBeanFactory.SCOPE_SINGLETON)

public class Person implements InitializingBean 
{
	
		private Integer pid;
		private String name;

		private Address address;
		
		
		
		public void display()
		{
			System.out.println(address.getStreet());
			System.out.println(address.getCity());
		}
		
		
		
		public Person() {
			System.out.println("person object");
		}

		public Integer getPid() {
			return pid;
		}

		public void setPid(Integer pid) {
			this.pid = pid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}



		public void afterPropertiesSet() throws Exception {
	if(address==null){
		throw new Exception();
	}
			
		}
	}

