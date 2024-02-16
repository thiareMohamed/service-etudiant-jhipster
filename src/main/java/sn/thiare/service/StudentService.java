package sn.thiare.service;

import sn.thiare.service.dto.StudentDTO;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    StudentDTO save(StudentDTO dto);

    Optional<StudentDTO> findOne(Long id);

    List<StudentDTO> findAll();

    void delete(Long id);
}
