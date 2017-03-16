package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public Test() {
		
	}
	public static void main(String[] args) {
	System.out.println("Main method");
	System.out.println("----------Resources Creating----------");
	Resource resource=new ClassPathResource("beans.xml");
	
	//Resources is an Interface and ClassPathResource is an implemented class
	
	System.out.println("Resources Created"+resource);
	System.out.println("----------Bean Factory Creating--------");
	BeanFactory beanFactory=new XmlBeanFactory(resource);
	System.out.println("Bean factory "+beanFactory);
	//When we pass configuration file in Bean Factory Uses it to read the configurations of  beans
		//ex--org.springframework.beans.factory.xml.XmlBeanFactory@17e5fde: 
		//defining beans [addressID,customerID]; root of factory hierarchy
	
//immidiately object of beans instantiated created 
	//Customer===Constructor
	// Address====Constructor
    Object object=beanFactory.getBean("customerID");
    System.out.println("Object Returned by Get Bean "+object);
    //Object Returned by Get Bean method com.Customer@10fe215
   
    //then just type caste it into our class
    Customer customer=(Customer)object;
    
    
    System.out.println("Type casted object "+customer);
    System.out.println("---------------Getting Data -----------------");
    System.out.println("Sr.No == "+customer.getSrno());
    System.out.println("Name == "+customer.getName());
    System.out.println("AreaName == "+customer.getAddress().getAreaname());
    System.out.println("City == "+customer.getAddress().getCity());
    
	
	}
}
