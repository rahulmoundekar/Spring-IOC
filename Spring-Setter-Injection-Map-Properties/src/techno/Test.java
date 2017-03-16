package techno;
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
		Object object = beanFactory.getBean("c");
		Connection connection=(Connection)object;
		System.out.println(connection.getPropertiesDatabase());
	}
}
