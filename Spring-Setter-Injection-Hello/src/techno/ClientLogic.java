package techno;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientLogic {

	public ClientLogic() {
		
	}
	public static void main(String[] args) {
	
		Resource resource=new ClassPathResource("beans.xml");
		BeanFactory beanFactory= new XmlBeanFactory(resource);
		
		Object object=beanFactory.getBean("welBean");
		WelcomeBean welcomeBean=(WelcomeBean)object;
		welcomeBean.show();
				
	}
}
