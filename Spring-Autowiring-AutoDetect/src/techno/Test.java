package techno;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("beans.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		Object object=	beanFactory.getBean("employeeID");
		Employee employee=(Employee)object;
		System.out.println("Employee object casting"+employee );
		System.out.println(employee.getEmpid());
		System.out.println(employee.getEmpname());		
		System.out.println(employee.getAddress().getAreaname());		
		System.out.println(employee.getAddress().getCityname());
	}
}
