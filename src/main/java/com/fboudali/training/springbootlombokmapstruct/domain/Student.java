package com.fboudali.training.springbootlombokmapstruct.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter  //Generates getters
@Setter  //Generates setters
@Builder  //Generates A Builder so you can call it as following : Student.Builder().firstname(firstname). ... .build()
@NoArgsConstructor // Generates an empty constructor Student {}
@AllArgsConstructor  // Generates a constructor with all the class fields
public class Student {

	private Long id;

	private String firstname;

	private String lastname;
}