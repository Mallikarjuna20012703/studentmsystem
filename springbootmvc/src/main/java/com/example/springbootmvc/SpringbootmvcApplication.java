package com.example.springbootmvc;

import com.example.springbootmvc.entity.Student;
import com.example.springbootmvc.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootmvcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootmvcApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {

//		Student student=new Student("Yampalaku","Mallikarjuna","ymallikarjuna2002@gmail.com");
//		studentRepository.save(student);
//		Student student1=new Student("paluru","Balaji","balaji@gmail.com");
//		studentRepository.save(student1);
//		Student student2= new Student("uppara","Shiva Shankar","shiva@gmail.com");
//		studentRepository.save(student2);

	}
}
