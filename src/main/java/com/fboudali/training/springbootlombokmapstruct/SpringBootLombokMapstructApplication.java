package com.fboudali.training.springbootlombokmapstruct;

import com.fboudali.training.springbootlombokmapstruct.domain.Student;
import com.fboudali.training.springbootlombokmapstruct.dto.StudentDto;
import com.fboudali.training.springbootlombokmapstruct.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootLombokMapstructApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLombokMapstructApplication.class, args);
	}

	@Autowired
	StudentMapper studentMapper;

	//To fire it at the start of the app
	@Bean
	public void testingMapper() {

		final Student student =
				Student
						.builder()
						.id(1L)
						.firstname("Fahd")
						.lastname("BOUDALI")
						.build();
		final StudentDto studentDto = studentMapper.toDto(student);

		System.out.println("\n");
		System.out.println("\n");

		System.out.println(studentDto.getFirstname());
		System.out.println(studentDto.getLastname());

		System.out.println("\n");
		System.out.println("\n");
	}


}
