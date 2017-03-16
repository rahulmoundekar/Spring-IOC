package techno;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
		System.out.println("Test----Constructor");

	}

	public static void main(String[] args) {
		System.out.println("Main Method");
		Resource res = new ClassPathResource("beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(res);
		Object object = beanFactory.getBean("employeeID");
		Employee employee = (Employee) object;

		System.out.println(object);
		System.out.println("-------Employee Information-----");
		System.out.println("Emp Id -- " + employee.getEmpid());
		System.out.println("Emp Name -- " + employee.getEmpname());
		System.out.println("Emp Company Name -- "
				+ employee.getCompany().getCompanyname());
		System.out.println("Company Address -- "
				+ employee.getCompany().getCompanyaddress());
		System.out.println("-------Technologies List Getting------------");
		List technologies = employee.getTechKnown();
		Iterator<String> itr = technologies.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		System.out.println("------Salary Getting set---------");
		Set<Integer> set = employee.getSalary();
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {

			System.out.println(iterator.next());
		}
	}
}
