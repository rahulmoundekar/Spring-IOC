package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
	System.out.println("Main method");
	Resource resource=new ClassPathResource("beans.xml");
	BeanFactory beanFactory=new XmlBeanFactory(resource);
    Object object=beanFactory.getBean("customerID");
    Customer customer=(Customer)object;
    System.out.println(customer);
    System.out.println(customer.getSrno());
    System.out.println(customer.getName());
    System.out.println(customer.getAddress().getAreaname());
    System.out.println(customer.getAddress().getCity());

    
	
	}
}
