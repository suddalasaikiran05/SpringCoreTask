package ch16.Application1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {
	@Bean
	@Primary
	public Student student2() {
		
		return new Student("sunil","65","C");
	}
	@Bean
	public Student student3() {
		
		return new Student("anil","25","A");
	}
	@Bean
	public University university2() {
		University u=new University();
		u.setName("ku");
		u.setAddres("knr");
		u.setPhone("955644");
		u.setStudent(student2());
		return u;
	}
}
