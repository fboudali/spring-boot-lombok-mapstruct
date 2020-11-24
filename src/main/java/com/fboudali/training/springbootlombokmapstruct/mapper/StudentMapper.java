package com.fboudali.training.springbootlombokmapstruct.mapper;

import com.fboudali.training.springbootlombokmapstruct.domain.Student;
import com.fboudali.training.springbootlombokmapstruct.dto.StudentDto;
import org.mapstruct.Mapper;


/**
 * componentModel = spring: the generated mapper is a Spring bean and can be retrieved via @Autowired
 */
@Mapper(componentModel = "spring")
public interface StudentMapper {

	StudentDto toDto(Student student);

}