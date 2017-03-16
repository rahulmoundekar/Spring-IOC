package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	
System.out.println("main Method");
Resource resource = new ClassPathResource("beans.xml");
BeanFactory beanFactory = new XmlBeanFactory(resource);
	System.out.println("xml Validated Successfully");
	Object o=beanFactory.getBean("empid");
	Employee emp=(Employee)o;
	System.out.println(emp);
	System.out.println("Overriden by setter");
	System.out.println("EmpName--"+emp.getEmpname());	
	System.out.println("EmpCity--"+emp.getAddress().getCityname());


}
	
}
