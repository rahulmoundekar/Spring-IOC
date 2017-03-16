package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Object object = beanFactory.getBean("addrID");
		System.out.println(object);
		Address address = (Address) object;
		System.out.println("Empoloyee object"+address);

		
String [] c=address.getCity();
	
		for (int j = 0; j < c.length; j++) {
			
				System.out.println(c[j]);
		}
	}
}
