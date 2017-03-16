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
		Object object = beanFactory.getBean("employeeID");
		System.out.println(object);
		Employee employee = (Employee) object;
		System.out.println("Empoloyee object" + employee);

		
	Address ad[]=employee.getAddress();
	
	System.out.println(ad[0]);

	System.out.println(ad[1]);
		for (int j = 0; j <= ad.length; j++) {
			
				System.out.println(ad[j].getCity());
		}
	}
}
