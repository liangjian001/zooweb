package jobtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWordTest {
	public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/spring_quartz.xml");
	}
}
