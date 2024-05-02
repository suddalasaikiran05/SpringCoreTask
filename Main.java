package ch16.Application1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main (String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("ch16/Application1/config.xml");
		University s=context.getBean("university1",University.class);
		System.out.println(s);
		
		AbstractApplicationContext anno=new AnnotationConfigApplicationContext(Config.class);
		University u=anno.getBean("university2",University.class);
		System.out.println(u);
	}
}
