package sn.thiare.service.mapper;

import org.mapstruct.Mapper;
import sn.thiare.domain.Student;
import sn.thiare.service.dto.StudentDTO;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    StudentDTO toDto(Student entity);

    Student toEntity(StudentDTO dto);
}
