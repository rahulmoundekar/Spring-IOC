package techno;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
	Object object=beanFactory.getBean("employeeID");
	Employee employee=(Employee)object;
System.out.println(employee);
}	
}
