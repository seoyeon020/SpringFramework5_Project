package myspring.di.xml;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloBeanJunitTest {
	@Test
	void helloBean() {
		ApplicationContext context = new GenericXmlApplicationContext("classpath:hello-bean.xml");
	}

}
